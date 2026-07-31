/**
 * Main Application Logic & UI Controller for Zona WebOS TV
 */
const App = (function () {
  let currentTab = 'movies';
  let activeMovies = [];
  let activeSerials = [];
  let activeChannels = [];
  let selectedEntity = null;

  async function init() {
    console.log('[Zona TV] Initializing WebOS App...');
    SpatialNav.init();
    PlayerApp.init();

    setupTabNavigation();
    setupSearchInput();
    setupModalButtons();

    // Load initial movies catalog
    await loadTabContent('movies');
  }

  function setupTabNavigation() {
    const tabs = document.querySelectorAll('.nav-tab');
    tabs.forEach(tab => {
      tab.addEventListener('click', async () => {
        tabs.forEach(t => t.classList.remove('active'));
        tab.classList.add('active');
        const tabName = tab.getAttribute('data-tab');
        currentTab = tabName;
        await loadTabContent(tabName);
      });
    });
  }

  function setupSearchInput() {
    const searchInput = document.getElementById('search-input');
    const searchBtn = document.getElementById('search-btn');

    if (searchBtn && searchInput) {
      searchBtn.addEventListener('click', () => doSearch());
      searchInput.addEventListener('keydown', (e) => {
        if (e.keyCode === 13) {
          doSearch();
        }
      });
    }
  }

  async function doSearch() {
    const searchInput = document.getElementById('search-input');
    const query = searchInput ? searchInput.value.trim() : '';
    if (!query) return;

    showLoading(true);
    try {
      const res = await ZonaAPI.search(query, 0, 30);
      const ids = (res && res.data) ? res.data : [];
      if (ids.length > 0) {
        const entityRes = await ZonaAPI.getEntityByLink(ids.slice(0, 15).join(','));
        const entities = (entityRes && entityRes.data) ? entityRes.data : [];
        renderCatalogGrid('Результаты поиска: ' + query, entities);
      } else {
        renderEmptyState('Ничего не найдено по запросу "' + query + '"');
      }
    } catch (e) {
      console.error('[Zona TV] Search error:', e);
      renderEmptyState('Ошибка поиска. Проверьте интернет соединение.');
    } finally {
      showLoading(false);
    }
  }

  function setupModalButtons() {
    const closeBtn = document.getElementById('modal-close-btn');
    if (closeBtn) {
      closeBtn.addEventListener('click', closeModal);
    }
  }

  async function loadTabContent(tabName) {
    showLoading(true);
    document.getElementById('search-bar').classList.toggle('hidden', tabName !== 'search');

    try {
      if (tabName === 'movies') {
        const res = await ZonaAPI.getMovieIds(0, 24);
        const ids = (res && res.data) ? res.data : [];

        // Sample fallback movies if offline/cors fallback
        let movies = [];
        if (ids.length > 0) {
          const detailRes = await ZonaAPI.getEntityByLink(ids.slice(0, 18).join(','));
          movies = (detailRes && detailRes.data) ? detailRes.data : [];
        }

        if (movies.length === 0) {
          movies = getMockMovies();
        }

        activeMovies = movies;
        updateHeroBanner(movies[0]);
        renderCatalogGrid('Популярные Фильмы', movies);

      } else if (tabName === 'series') {
        const res = await ZonaAPI.getSerialIds(0, 24);
        const ids = (res && res.data) ? res.data : [];

        let serials = [];
        if (ids.length > 0) {
          const detailRes = await ZonaAPI.getEntityByLink(ids.slice(0, 18).join(','));
          serials = (detailRes && detailRes.data) ? detailRes.data : [];
        }

        if (serials.length === 0) {
          serials = getMockSerials();
        }

        activeSerials = serials;
        updateHeroBanner(serials[0]);
        renderCatalogGrid('Популярные Сериалы', serials);

      } else if (tabName === 'tv') {
        let channels = [];
        try {
          const res = await ZonaAPI.getTvChannels();
          channels = (res && res.data) ? res.data : [];
        } catch (e) {}

        if (channels.length === 0) {
          channels = getMockChannels();
        }
        activeChannels = channels;
        renderTvChannelsGrid('Прямой эфир ТВ', channels);

      } else if (tabName === 'favorites') {
        const favs = getFavorites();
        if (favs.length > 0) {
          updateHeroBanner(favs[0]);
          renderCatalogGrid('Мои Избранные', favs);
        } else {
          renderEmptyState('В Избранном пока ничего нет.');
        }
      } else if (tabName === 'search') {
        document.getElementById('catalog-grid').innerHTML = '';
        document.getElementById('catalog-title').textContent = 'Поиск фильмов и сериалов';
        const input = document.getElementById('search-input');
        if (input) SpatialNav.focus(input);
      }
    } catch (e) {
      console.error(`[Zona TV] Error loading tab ${tabName}:`, e);
      renderCatalogGrid('Фильмы', getMockMovies());
    } finally {
      showLoading(false);
    }
  }

  function updateHeroBanner(entity) {
    if (!entity) return;
    const heroTitle = document.getElementById('hero-title');
    const heroMeta = document.getElementById('hero-meta');
    const heroDesc = document.getElementById('hero-desc');
    const heroBg = document.getElementById('hero-backdrop');
    const playBtn = document.getElementById('hero-play-btn');
    const favBtn = document.getElementById('hero-fav-btn');

    if (heroTitle) heroTitle.textContent = entity.name || entity.title || 'Zona Movie';
    if (heroMeta) {
      const year = entity.year || '2024';
      const rating = entity.ratings ? (entity.ratings.kinopoisk || entity.ratings.imdb || '8.2') : '8.0';
      const quality = entity.quality ? `1080p ${entity.quality}` : 'HD 1080p';
      heroMeta.innerHTML = `<span class="rating-badge">&#9733; ${rating}</span> <span>${year}</span> <span>${quality}</span>`;
    }
    if (heroDesc) {
      heroDesc.textContent = entity.description || 'Отличный фильм высокой четкости для семейного просмотра на большом экране Smart TV.';
    }

    if (heroBg) {
      const bgUrl = ZonaAPI.getBackdropUrl(entity);
      heroBg.style.backgroundImage = `linear-gradient(to right, rgba(15,16,22,0.95) 20%, rgba(15,16,22,0.4) 60%, rgba(15,16,22,0.95) 100%), url('${bgUrl}')`;
    }

    if (playBtn) {
      playBtn.onclick = () => openMovieDetail(entity);
    }

    if (favBtn) {
      favBtn.onclick = () => toggleFavorite(entity);
    }
  }

  function renderCatalogGrid(title, items) {
    const titleEl = document.getElementById('catalog-title');
    const gridEl = document.getElementById('catalog-grid');
    if (titleEl) titleEl.textContent = title;
    if (!gridEl) return;

    gridEl.innerHTML = '';
    items.forEach((item, idx) => {
      const card = document.createElement('div');
      card.className = 'poster-card focusable';
      card.setAttribute('tabindex', '0');

      const posterUrl = ZonaAPI.getPosterUrl(item);
      const rating = item.ratings ? (item.ratings.kinopoisk || '7.9') : '8.0';
      const year = item.year || '2024';

      card.innerHTML = `
        <div class="poster-img-wrapper">
          <img src="${posterUrl}" alt="${item.name || item.title}" onerror="this.src='assets/poster_placeholder.png'">
          <div class="card-badge">&#9733; ${rating}</div>
        </div>
        <div class="card-info">
          <div class="card-title">${item.name || item.title || 'Фильм'}</div>
          <div class="card-sub">${year} • ${item.type === 'SERIAL' ? 'Сериал' : 'Фильм'}</div>
        </div>
      `;

      card.onFocusCallback = () => updateHeroBanner(item);
      card.addEventListener('click', () => openMovieDetail(item));

      gridEl.appendChild(card);
    });

    // Auto focus first card
    const firstCard = gridEl.querySelector('.focusable');
    if (firstCard && currentTab !== 'search') {
      SpatialNav.focus(firstCard);
    }
  }

  function renderTvChannelsGrid(title, channels) {
    const titleEl = document.getElementById('catalog-title');
    const gridEl = document.getElementById('catalog-grid');
    if (titleEl) titleEl.textContent = title;
    if (!gridEl) return;

    gridEl.innerHTML = '';
    channels.forEach(ch => {
      const card = document.createElement('div');
      card.className = 'channel-card focusable';
      card.setAttribute('tabindex', '0');

      card.innerHTML = `
        <div class="channel-logo">
          <img src="${ch.iconUrl || 'assets/poster_placeholder.png'}" alt="${ch.name}" onerror="this.src='assets/poster_placeholder.png'">
        </div>
        <div class="channel-name">${ch.name}</div>
        <div class="channel-live-badge">&#9679; ЭФИР</div>
      `;

      card.addEventListener('click', () => {
        PlayerApp.playStream(ch.streamUrl || 'https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8', ch.name);
      });

      gridEl.appendChild(card);
    });

    const firstCard = gridEl.querySelector('.focusable');
    if (firstCard) SpatialNav.focus(firstCard);
  }

  async function openMovieDetail(entity) {
    selectedEntity = entity;
    const modal = document.getElementById('detail-modal');
    if (!modal) return;

    document.getElementById('modal-title').textContent = entity.name || entity.title || 'Movie';
    document.getElementById('modal-year').textContent = entity.year || '2024';
    document.getElementById('modal-rating').textContent = '★ ' + (entity.ratings ? (entity.ratings.kinopoisk || '8.0') : '8.0');
    document.getElementById('modal-desc').textContent = entity.description || 'Подробное описание фильма, информация о сюжете и актерском составе.';
    document.getElementById('modal-poster').src = ZonaAPI.getPosterUrl(entity);

    // Fetch video sources
    const sourcesContainer = document.getElementById('modal-sources-list');
    sourcesContainer.innerHTML = '<div class="loading-spinner">Загрузка видеопотоков...</div>';

    modal.classList.remove('hidden');

    try {
      const kinopoiskId = entity.kinopoiskId || entity.id || '1000';
      const res = await ZonaAPI.getVideoSources(kinopoiskId);
      const sources = (res && res.data) ? res.data : [];

      sourcesContainer.innerHTML = '';

      if (sources.length > 0) {
        sources.forEach((src, index) => {
          const btn = document.createElement('button');
          btn.className = 'btn-source focusable';
          btn.setAttribute('tabindex', '0');
          const qualityStr = src.info || `Вариант ${index + 1} (Full HD)`;
          btn.innerHTML = `&#9654; Смотреть: ${qualityStr}`;

          btn.addEventListener('click', () => {
            const streamUrl = src.download_link_key || 'https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8';
            PlayerApp.playStream(streamUrl, entity.name || entity.title);
          });
          sourcesContainer.appendChild(btn);
        });
      } else {
        // Fallback default playback stream
        const btn = document.createElement('button');
        btn.className = 'btn-source focusable';
        btn.setAttribute('tabindex', '0');
        btn.innerHTML = `&#9654; Смотреть в HD 1080p`;
        btn.addEventListener('click', () => {
          PlayerApp.playStream('https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8', entity.name || entity.title);
        });
        sourcesContainer.appendChild(btn);
      }

      const firstBtn = sourcesContainer.querySelector('.focusable');
      if (firstBtn) SpatialNav.focus(firstBtn);

    } catch (e) {
      console.warn('[Zona TV] Error fetching video sources, using fallback stream', e);
      sourcesContainer.innerHTML = '';
      const btn = document.createElement('button');
      btn.className = 'btn-source focusable';
      btn.setAttribute('tabindex', '0');
      btn.innerHTML = `&#9654; Смотреть по умолчанию (Full HD)`;
      btn.addEventListener('click', () => {
        PlayerApp.playStream('https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8', entity.name || entity.title);
      });
      sourcesContainer.appendChild(btn);
      SpatialNav.focus(btn);
    }
  }

  function closeModal() {
    const modal = document.getElementById('detail-modal');
    if (modal) modal.classList.add('hidden');
    // Return focus to catalog
    const currentFocused = SpatialNav.getCurrentFocused();
    if (!currentFocused || !document.body.contains(currentFocused)) {
      const firstCard = document.querySelector('#catalog-grid .focusable');
      if (firstCard) SpatialNav.focus(firstCard);
    }
  }

  function toggleFavorite(entity) {
    let favs = getFavorites();
    const idx = favs.findIndex(f => f.id === entity.id);
    if (idx >= 0) {
      favs.splice(idx, 1);
      alert('Удалено из Избранного');
    } else {
      favs.push(entity);
      alert('Добавлено в Избранное');
    }
    localStorage.setItem('zona_favs', JSON.stringify(favs));
  }

  function getFavorites() {
    try {
      return JSON.parse(localStorage.getItem('zona_favs') || '[]');
    } catch (e) {
      return [];
    }
  }

  function renderEmptyState(msg) {
    const gridEl = document.getElementById('catalog-grid');
    if (gridEl) {
      gridEl.innerHTML = `<div class="empty-state">${msg}</div>`;
    }
  }

  function showLoading(visible) {
    const spinner = document.getElementById('main-loading-spinner');
    if (spinner) spinner.classList.toggle('hidden', !visible);
  }

  // Mock catalog fallback data
  function getMockMovies() {
    return [
      { id: 'm1', name: 'Дюна: Часть вторая', year: 2024, ratings: { kinopoisk: '8.5' }, quality: '4K HDR', description: 'Герцог Пол Атрейдес объединяется с чани и фременами, чтобы отомстить заговорщикам, уничтожившим его семью.', backdropId: 'dune2' },
      { id: 'm2', name: 'Оппенгеймер', year: 2023, ratings: { kinopoisk: '8.2' }, quality: '1080p', description: 'История жизни американского физика Роберта Оппенгеймера, который стоял во главе первых разработок ядерного оружия.', backdropId: 'oppenheimer' },
      { id: 'm3', name: 'Интерстеллар', year: 2014, ratings: { kinopoisk: '8.6' }, quality: '4K', description: 'Когда засуха приводит человечество к продовольственному кризису, коллектив исследователей отправляется сквозь червоточину.', backdropId: 'interstellar' },
      { id: 'm4', name: 'Аватар: Путь воды', year: 2022, ratings: { kinopoisk: '7.9' }, quality: '4K 3D', description: 'После принятия образа аватар Джейк Салли становится вождем клана оматикайя и берет на себя ответственность защищать семью.', backdropId: 'avatar2' },
      { id: 'm5', name: 'Бэтмен', year: 2022, ratings: { kinopoisk: '7.8' }, quality: '1080p', description: 'После двух лет поисков преступников Бэтмен отправляется в самые мрачные уголки Готэм-сити.', backdropId: 'batman' }
    ];
  }

  function getMockSerials() {
    return [
      { id: 's1', name: 'Игра Престолов', year: 2019, ratings: { kinopoisk: '9.0' }, quality: '1080p', type: 'SERIAL', description: 'К концу подходит время благоденствия, и лето, длившееся почти десятилетие, уступает место зиме.', backdropId: 'got' },
      { id: 's2', name: 'Очень странные дела', year: 2022, ratings: { kinopoisk: '8.4' }, quality: '4K', type: 'SERIAL', description: '1980-е годы, тихий провинциальный американский городок. Благоприятное течение местной жизни нарушает загадочное исчезновение подростка.', backdropId: 'stranger_things' },
      { id: 's3', name: 'Во все тяжкие', year: 2013, ratings: { kinopoisk: '8.9' }, quality: '1080p', type: 'SERIAL', description: 'Школьный учитель химии Уолтер Уайт узнает, что болен раком легких.', backdropId: 'breaking_bad' }
    ];
  }

  function getMockChannels() {
    return [
      { id: 'ch1', name: 'Первый Канал HD', streamUrl: 'https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8' },
      { id: 'ch2', name: 'Россия 1 HD', streamUrl: 'https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8' },
      { id: 'ch3', name: 'СТС HD', streamUrl: 'https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8' },
      { id: 'ch4', name: 'ТНТ HD', streamUrl: 'https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8' }
    ];
  }

  return {
    init,
    closeModal,
    onPlayerClosed: () => {
      console.log('[Zona TV] Player closed, focus restored.');
    }
  };
})();

document.addEventListener('DOMContentLoaded', () => {
  App.init();
});
