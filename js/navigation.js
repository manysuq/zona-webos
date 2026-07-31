/**
 * Spatial Navigation Engine for LG WebOS 4 Smart TV
 */
const SpatialNav = (function () {
  let activeSection = null;
  let focusedElement = null;
  let historyStack = [];

  const KEY_CODES = {
    LEFT: 37,
    UP: 38,
    RIGHT: 39,
    DOWN: 40,
    ENTER: 13,
    BACK: 461,     // WebOS Back Button
    BACK_ALT1: 27, // ESC
    BACK_ALT2: 8,  // Backspace
    RED: 403,
    GREEN: 404,
    YELLOW: 405,
    BLUE: 406,
    PLAY: 415,
    PAUSE: 19,
    STOP: 413,
    FF: 417,
    RW: 412
  };

  function init() {
    window.addEventListener('keydown', handleKeyDown);
    window.addEventListener('mousemove', handleMouseMove);
  }

  function getFocusableElements(container = document) {
    return Array.from(container.querySelectorAll('.focusable:not([disabled]):not(.hidden):not(.disabled)'))
      .filter(el => {
        const rect = el.getBoundingClientRect();
        return rect.width > 0 && rect.height > 0 && getComputedStyle(el).display !== 'none' && getComputedStyle(el).visibility !== 'hidden';
      });
  }

  function focus(el) {
    if (!el) return;
    if (focusedElement) {
      focusedElement.classList.remove('focused');
      focusedElement.blur();
    }
    focusedElement = el;
    focusedElement.classList.add('focused');
    focusedElement.focus({ preventScroll: true });

    // Scroll into view smoothly
    focusedElement.scrollIntoView({
      behavior: 'smooth',
      block: 'nearest',
      inline: 'center'
    });

    // Trigger custom focus callback if attached
    if (typeof el.onFocusCallback === 'function') {
      el.onFocusCallback(el);
    }
  }

  function move(direction) {
    const focusables = getFocusableElements();
    if (focusables.length === 0) return;

    if (!focusedElement || !document.body.contains(focusedElement)) {
      focus(focusables[0]);
      return;
    }

    const currentRect = focusedElement.getBoundingClientRect();
    const currentCenter = {
      x: currentRect.left + currentRect.width / 2,
      y: currentRect.top + currentRect.height / 2
    };

    let bestCandidate = null;
    let minDistance = Infinity;

    focusables.forEach(candidate => {
      if (candidate === focusedElement) return;

      const rect = candidate.getBoundingClientRect();
      const center = {
        x: rect.left + rect.width / 2,
        y: rect.top + rect.height / 2
      };

      const dx = center.x - currentCenter.x;
      const dy = center.y - currentCenter.y;

      let isDirectionValid = false;

      switch (direction) {
        case 'left':
          isDirectionValid = dx < -5 && Math.abs(dy) <= Math.abs(dx) * 1.5;
          break;
        case 'right':
          isDirectionValid = dx > 5 && Math.abs(dy) <= Math.abs(dx) * 1.5;
          break;
        case 'up':
          isDirectionValid = dy < -5 && Math.abs(dx) <= Math.abs(dy) * 1.5;
          break;
        case 'down':
          isDirectionValid = dy > 5 && Math.abs(dx) <= Math.abs(dy) * 1.5;
          break;
      }

      if (isDirectionValid) {
        // Distance calculation with weight towards movement axis
        let distance;
        if (direction === 'left' || direction === 'right') {
          distance = Math.abs(dx) + Math.abs(dy) * 2;
        } else {
          distance = Math.abs(dy) + Math.abs(dx) * 2;
        }

        if (distance < minDistance) {
          minDistance = distance;
          bestCandidate = candidate;
        }
      }
    });

    if (bestCandidate) {
      focus(bestCandidate);
    }
  }

  function handleKeyDown(e) {
    const keyCode = e.keyCode;

    // Handle Player Controls if player modal is open
    if (window.PlayerApp && window.PlayerApp.isOpen()) {
      window.PlayerApp.handleKey(keyCode);
      if (keyCode === KEY_CODES.BACK || keyCode === KEY_CODES.BACK_ALT1 || keyCode === KEY_CODES.BACK_ALT2) {
        e.preventDefault();
        window.PlayerApp.close();
      }
      return;
    }

    switch (keyCode) {
      case KEY_CODES.LEFT:
        e.preventDefault();
        move('left');
        break;
      case KEY_CODES.RIGHT:
        e.preventDefault();
        move('right');
        break;
      case KEY_CODES.UP:
        e.preventDefault();
        move('up');
        break;
      case KEY_CODES.DOWN:
        e.preventDefault();
        move('down');
        break;
      case KEY_CODES.ENTER:
        e.preventDefault();
        if (focusedElement) {
          focusedElement.click();
        }
        break;
      case KEY_CODES.BACK:
      case KEY_CODES.BACK_ALT1:
      case KEY_CODES.BACK_ALT2:
        e.preventDefault();
        handleBackKey();
        break;
    }
  }

  function handleMouseMove(e) {
    // Enable WebOS Magic Remote pointer hover focus
    const target = e.target.closest('.focusable');
    if (target && target !== focusedElement) {
      focus(target);
    }
  }

  function handleBackKey() {
    // If detail modal is open, close it
    const modal = document.getElementById('detail-modal');
    if (modal && !modal.classList.contains('hidden')) {
      window.App.closeModal();
      return;
    }

    // Exit app on WebOS if on home screen
    if (window.webOS && window.webOS.platformBack) {
      window.webOS.platformBack();
    } else {
      console.log('[SpatialNav] Back button pressed on main screen.');
    }
  }

  return {
    init,
    focus,
    move,
    getFocusableElements,
    getCurrentFocused: () => focusedElement
  };
})();
