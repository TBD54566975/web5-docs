// @ts-check
// Note: type annotations allow type checking and IDEs autocompletion

import dotenv from 'dotenv';
import { themes } from 'prism-react-renderer';
import { dependencies } from './package.json';
import SDK_VERSIONS from './sdk-versions.json';

const lightCodeTheme = themes.github;
const darkCodeTheme = themes.dracula;

dotenv.config();

const WEB5_VERSION = dependencies['@web5/api'];

const algoliaApiKey = process.env.DOC_SEARCH_API_KEY;
const algoliaIndexName = process.env.DOC_SEARCH_INDEX_NAME;
const algoliaAppId = process.env.DOC_SEARCH_APP_ID;

const feedbackWidgetApiUrl = process.env.FEEDBACK_WIDGET_API_URL;

let algoliaConfig = null;
if (algoliaApiKey && algoliaIndexName && algoliaAppId) {
  algoliaConfig = {
    appId: algoliaAppId,
    apiKey: algoliaApiKey,
    indexName: algoliaIndexName,
    contextualSearch: true,
    searchParameters: {},
  };
}

/** @type {import('@docusaurus/types').Config} */
let config = {
  title: `Website`,
  tagline: '',
  organizationName: '54566975',
  projectName: 'developer..website',
  baseUrl: '/',
  url: 'https://developer..website',
  onBrokenLinks: 'warn',
  onBrokenMarkdownLinks: 'warn',
  favicon: '/img/favicon.ico',
  markdown: {
    mermaid: true,
  },
  themes: ['@docusaurus/theme-mermaid'],
  customFields: {
    WEB5_VERSION,
    feedbackWidgetApiUrl,
    SDK_VERSIONS,
  },
  plugins: ['docusaurus-tailwindcss', './webpackPlugin.js'],
  scripts: [
    {
      src: 'https://www.datadoghq-browser-agent.com/us1/v4/datadog-rum.js',
      async: true,
    },
    {
      src: '/scripts/dd-analytics.js',
      async: true,
    },
    {
      src: '/scripts/custom.js',
      async: true,
    },
  ],
  presets: [
    [
      'classic',
      {
        docs: {
          sidebarPath: './sidebars.js',
          breadcrumbs: false,
          routeBasePath: '/',
        },
        theme: {
          customCss: './src/css/custom.css',
        },
      },
    ],
    [
      'redocusaurus',
      {
        specs: [],
        theme: {
          primaryColor: '#1890ff',
        },
      },
    ],
  ],

  themeConfig: {
    colorMode: {
      defaultMode: 'dark',
      disableSwitch: true,
      respectPrefersColorScheme: false,
    },
    navbar: {
      style: 'dark',

      items: [
        {
          type: 'doc',
          docId: 'index',
          to: '/docs',
          label: 'Docs',
          position: 'left',
          
        },
        {
          to: '#ask',
          label: 'Ask 🤖',
        },
      ],
    },
    footer: {
      style: 'dark',
      links: [
        {
          title: 'Docs',
          items: [
            {
              label: 'Tutorial',
              to: '/docs/',
            },
          ],
        },
        {
          title: 'Community',
          items: [
            {
              label: 'Stack Overflow',
              href: 'https://stackoverflow.com/questions/tagged/docusaurus',
            },
            {
              label: 'Discord',
              href: 'https://discordapp.com/invite/docusaurus',
            },
            {
              label: 'Twitter',
              href: 'https://twitter.com/docusaurus',
            },
          ],
        },
        {
          title: 'More',
          items: [
            {
              label: 'Blog',
              to: '/blog',
            },
            {
              label: 'GitHub',
              href: 'https://github.com/facebook/docusaurus',
            },
          ],
        },
      ],
      copyright: `Copyright © ${new Date().getFullYear()} My Project, Inc. Built with Docusaurus.`,
    },
    prism: {
      theme: lightCodeTheme,
      darkTheme: {
        ...darkCodeTheme,
        styles: [
          ...darkCodeTheme.styles,
          {
            types: ['keyword', 'variable'],
            style: {
              color: 'rgb(189, 147, 249)',
            },
          },
        ],
      },
      additionalLanguages: [
        'kotlin',
        'swift',
        'dart',
        'rust',
        'bash',
        'gradle',
      ],
    },
  },
};

if (algoliaConfig) {
  config.themeConfig = {
    ...config.themeConfig,
    algolia: algoliaConfig,
  };
}

export default config;
