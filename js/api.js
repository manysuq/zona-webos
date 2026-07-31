/**
 * Zona API Engine for WebOS 4 Smart TV
 */
const ZonaAPI = (function () {
  const API_HOSTS = [
    'https://apir0.mzona.net',
    'https://apir1.mzona.net',
    'https://apiw1.mzona.net',
    'https://sync.zonasearch.com'
  ];

  const IMAGE_HOSTS = [
    'https://imgr1.imgzona.video',
    'https://imgw1.imgzona.video',
    'http://bimg1.zonapic.com'
  ];

  let currentApiHost = API_HOSTS[0];
  let currentImgHost = IMAGE_HOSTS[0];
  let isInitialized = false;

  async function pingHost(host) {
    try {
      const controller = new AbortController();
      const timeoutId = setTimeout(() => controller.abort(), 3000);
      const res = await fetch(`${host}/getTime`, {
        method: 'GET',
        signal: controller.signal
      });
      clearTimeout(timeoutId);
      return res.ok;
    } catch (e) {
      return false;
    }
  }

  async function init() {
    if (isInitialized) return;
    for (const host of API_HOSTS) {
      if (await pingHost(host)) {
        currentApiHost = host;
        break;
      }
    }
    isInitialized = true;
    console.log(`[ZonaAPI] Selected active API Host: ${currentApiHost}`);
  }

  async function apiRequest(endpoint, paramsObj = {}) {
    await init();
    const timestamp = Date.now();
    const paramsJson = JSON.stringify(paramsObj);
    const url = `${currentApiHost}${endpoint}?params=${encodeURIComponent(paramsJson)}&client_time=${timestamp}`;

    try {
      const response = await fetch(url, {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'User-Agent': 'Mozilla/5.0 (SmartTV; SmartTV; Linux) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36'
        }
      });
      if (!response.ok) {
        throw new Error(`HTTP Error ${response.status}`);
      }
      return await response.json();
    } catch (err) {
      console.warn(`[ZonaAPI] Request to ${endpoint} failed on ${currentApiHost}, attempting failover...`, err);
      // Try next host
      for (const fallbackHost of API_HOSTS) {
        if (fallbackHost === currentApiHost) continue;
        try {
          const fallbackUrl = `${fallbackHost}${endpoint}?params=${encodeURIComponent(paramsJson)}&client_time=${timestamp}`;
          const res = await fetch(fallbackUrl, {
            headers: { 'Accept': 'application/json' }
          });
          if (res.ok) {
            currentApiHost = fallbackHost;
            return await res.json();
          }
        } catch (e) {}
      }
      throw err;
    }
  }

  // Formatting Poster and Backdrop Images
  function getPosterUrl(entity) {
    if (!entity) return 'assets/poster_placeholder.png';
    if (entity.posterUrl) return entity.posterUrl;
    if (entity.backdropId) {
      return `${currentImgHost}/img/backdrop/${entity.backdropId}.jpg`;
    }
    if (entity.id) {
      const numId = entity.id.replace(/[^0-9]/g, '');
      if (numId) {
        const bucket = (Math.abs(parseInt(numId)) % 4) + 1;
        return `http://bimg${bucket}.zonapic.com/broadcast/tv/img/${numId}.jpg`;
      }
    }
    return 'assets/poster_placeholder.png';
  }

  function getBackdropUrl(entity) {
    if (!entity) return '';
    if (entity.backdropUrl) return entity.backdropUrl;
    if (entity.backdropId) {
      return `${currentImgHost}/img/backdrop/bg_${entity.backdropId}.jpg`;
    }
    return getPosterUrl(entity);
  }

  return {
    init,

    /**
     * Get list of movie IDs
     */
    async getMovieIds(offset = 0, size = 20, filter = {}) {
      const params = {
        page: { offset, size },
        filter: filter
      };
      return await apiRequest('/getMovieIds', params);
    },

    /**
     * Get list of TV serial IDs
     */
    async getSerialIds(offset = 0, size = 20, filter = {}) {
      const params = {
        page: { offset, size },
        filter: filter
      };
      return await apiRequest('/getSerialIds', params);
    },

    /**
     * Get detailed metadata for movies/serials by ID list or link
     */
    async getEntityByLink(link) {
      const params = { link };
      return await apiRequest('/getEntityByLink', params);
    },

    /**
     * Get video sources (playback streams) for movie/episode
     */
    async getVideoSources(kinopoiskId, episodeKey = null, movieSourceTypes = ['HLS', 'MP4', 'DIRECT', 'STREAM']) {
      const params = {
        kinopoiskId: parseInt(kinopoiskId) || 0,
        episodeKey: episodeKey || '',
        movieSourceTypes: movieSourceTypes,
        trailer: false
      };
      return await apiRequest('/getVideoSources', params);
    },

    /**
     * Get TV Channels list
     */
    async getTvChannels() {
      return await apiRequest('/getTvChannels', {});
    },

    /**
     * Search movies/serials by title
     */
    async search(query, offset = 0, size = 20) {
      const params = {
        page: { offset, size },
        filter: { query: query }
      };
      return await apiRequest('/getMovieIds', params);
    },

    getPosterUrl,
    getBackdropUrl
  };
})();
