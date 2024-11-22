import React from 'react';
import HeroCard from '@site/src/components/HeroCard';
import ExploreCard from '../src/components/ExploreCard';
import Community from '../src/components/Community';
import Head from '@docusaurus/Head';

function DocsIndex() {
  return (
    <div>
      <Head title="Developer Docs | TBD">
        <meta property="og:title" />
      </Head>
      <h1>
        Give your customers control of their identity, data, and finances.
      </h1>
      <p className="mb-8">
        Our toolkits bring decentralized identity, messaging, and data storage
        to your applications. They let developers focus on creating delightful
        user experiences, while returning ownership to individuals.
      </p>
      <div className="grid grid-cols-1 desktop:grid-cols-2 gap-4">
        <HeroCard
          heroText="Web5"
          buttonUrl="/docs/web5/quickstart"
          buttonText="Quickstart 🚀"
          bodyText="An interactive guide to create an app with decentralized identity and storage"
          imgSrc="/img/did-vc.svg"
          imgClass="w-32 flip"
          themeColor="purple"
        />

      </div>

      <div className="padding-top--xl" />

      <h2 className="mb-4">Learn More</h2>
      <p className="mb-8">
        Learn more about the components that enable decentralized applications.
      </p>

      <div className="grid grid-cols-1 desktop:grid-cols-2 gap-4">
        <HeroCard
          heroText="Decentralized Identifiers"
          buttonUrl="/docs/web5/decentralized-identifiers/what-are-dids"
          buttonText="Learn"
          imgSrc="/img/id-blue-purple.svg"
          imgClass="w-32 beat-fade"
          bodyText="Learn how digital IDs work across the web"
          themeColor="cyan"
        />
        <HeroCard
          heroText="Verifiable Credentials"
          buttonUrl="/docs/web5/verifiable-credentials/what-are-vcs"
          buttonText="Learn"
          imgSrc="/img/credential-yellow.svg"
          imgClass="w-32 beat-fade"
          bodyText="Learn how digital credentials can be used to prove claims online"
          themeColor="purple"
        />
        <HeroCard
          heroText="Wallet App Example"
          buttonUrl="https://github.com/TBD54566975/tbd-examples/tree/main/swift/tbdex-example-ios"
          buttonText="Learn"
          imgSrc="/img/wallet-blue-yellow.svg"
          imgClass="w-32 beat-fade"
          bodyText="Explore an example iOS wallet app that uses tbDEX to find liquidity"
          themeColor="purple"
        />
        <HeroCard
          heroText="Financial Institution Example"
          buttonUrl="https://github.com/TBD54566975/tbdex-pfi-exemplar"
          buttonText="Learn"
          imgSrc="/img/bank-purple-yellow.svg"
          imgClass="w-36 beat-fade"
          bodyText="Explore an example liquidity provider that uses tbDEX to reach new markets"
          themeColor="cyan"
        />
      </div>
    </div>
  );
}

export default DocsIndex;
