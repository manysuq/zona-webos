/**
 * Fullscreen TV Player Module for LG WebOS 4
 */
const PlayerApp = (function () {
  let playerContainer = null;
  let videoElement = null;
  let controlsOverlay = null;
  let progressBar = null;
  let progressFilled = null;
  let timeCurrentEl = null;
  let timeTotalEl = null;
  let titleEl = null;
  let playPauseBtn = null;
  let controlsTimer = null;
  let activeStreamUrl = null;
  let isPlaying = false;
  let isPlayerActive = false;

  function init() {
    playerContainer = document.getElementById('player-container');
    videoElement = document.getElementById('main-video-player');
    controlsOverlay = document.getElementById('player-controls');
    progressBar = document.getElementById('player-progress-bar');
    progressFilled = document.getElementById('player-progress-filled');
    timeCurrentEl = document.getElementById('player-time-current');
    timeTotalEl = document.getElementById('player-time-total');
    titleEl = document.getElementById('player-video-title');
    playPauseBtn = document.getElementById('player-btn-play');

    if (videoElement) {
      videoElement.addEventListener('timeupdate', updateProgress);
      videoElement.addEventListener('play', () => setPlayState(true));
      videoElement.addEventListener('pause', () => setPlayState(false));
      videoElement.addEventListener('ended', onEnded);
      videoElement.addEventListener('error', onError);
    }
  }

  function playStream(streamUrl, videoTitle = 'Zona Video') {
    if (!playerContainer || !videoElement) init();
    activeStreamUrl = streamUrl;
    isPlayerActive = true;

    titleEl.textContent = videoTitle;
    playerContainer.classList.remove('hidden');
    videoElement.src = streamUrl;
    videoElement.load();
    videoElement.play().then(() => {
      setPlayState(true);
    }).catch(err => {
      console.error('[PlayerApp] Play error:', err);
    });

    showControls();
    if (window.SpatialNav && playPauseBtn) {
      window.SpatialNav.focus(playPauseBtn);
    }
  }

  function togglePlay() {
    if (!videoElement) return;
    if (videoElement.paused) {
      videoElement.play();
    } else {
      videoElement.pause();
    }
    showControls();
  }

  function setPlayState(playing) {
    isPlaying = playing;
    if (playPauseBtn) {
      playPauseBtn.innerHTML = playing ? '&#10074;&#10074;' : '&#9654;';
    }
  }

  function seek(seconds) {
    if (!videoElement) return;
    let newTime = videoElement.currentTime + seconds;
    newTime = Math.max(0, Math.min(videoElement.duration || 0, newTime));
    videoElement.currentTime = newTime;
    showControls();
  }

  function updateProgress() {
    if (!videoElement || !videoElement.duration) return;
    const current = videoElement.currentTime;
    const duration = videoElement.duration;
    const pct = (current / duration) * 100;

    if (progressFilled) progressFilled.style.width = `${pct}%`;
    if (timeCurrentEl) timeCurrentEl.textContent = formatTime(current);
    if (timeTotalEl) timeTotalEl.textContent = formatTime(duration);
  }

  function formatTime(sec) {
    if (isNaN(sec)) return '00:00';
    sec = Math.floor(sec);
    const h = Math.floor(sec / 3600);
    const m = Math.floor((sec % 3600) / 60);
    const s = sec % 60;
    const pad = n => (n < 10 ? '0' + n : n);
    return h > 0 ? `${h}:${pad(m)}:${pad(s)}` : `${pad(m)}:${pad(s)}`;
  }

  function showControls() {
    if (!controlsOverlay) return;
    controlsOverlay.classList.remove('hidden');
    clearTimeout(controlsTimer);
    controlsTimer = setTimeout(() => {
      if (isPlaying) {
        controlsOverlay.classList.add('hidden');
      }
    }, 4000);
  }

  function handleKey(keyCode) {
    showControls();
    switch (keyCode) {
      case 13: // ENTER
        togglePlay();
        break;
      case 37: // LEFT
        seek(-10);
        break;
      case 39: // RIGHT
        seek(10);
        break;
      case 415: // PLAY
        videoElement && videoElement.play();
        break;
      case 19: // PAUSE
        videoElement && videoElement.pause();
        break;
      case 412: // RW
        seek(-30);
        break;
      case 417: // FF
        seek(30);
        break;
      case 413: // STOP
        close();
        break;
    }
  }

  function onEnded() {
    setPlayState(false);
    showControls();
  }

  function onError(e) {
    console.error('[PlayerApp] Video element playback error', e);
    alert('Ошибка воспроизведения видеопотока. Попробуйте другой источник.');
    close();
  }

  function close() {
    if (!videoElement) return;
    videoElement.pause();
    videoElement.src = '';
    isPlayerActive = false;
    if (playerContainer) playerContainer.classList.add('hidden');
    clearTimeout(controlsTimer);

    // Return focus to catalog or modal
    if (window.App && window.App.onPlayerClosed) {
      window.App.onPlayerClosed();
    }
  }

  return {
    init,
    playStream,
    togglePlay,
    seek,
    close,
    handleKey,
    isOpen: () => isPlayerActive
  };
})();
