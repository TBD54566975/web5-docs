## Prerequisites

Before you begin, ensure that you have the following installed on your local machine:

- [Node.js](https://nodejs.org/) (version 18.16.0 or later)
- [pnpm](https://pnpm.io/) (version 7.29.1 or later)
- [Java Development Kit](https://en.wikipedia.org/wiki/Java_Development_Kit) (version 17, recommended via [SDKMan](https://sdkman.io/install), as described below)
- [Xcode](https://developer.apple.com/xcode/) (Version 15, **optional**, needed to run Swift tests locally)
- [Rust](https://www.rust-lang.org/tools/install) (Version 1.75.0, **optional**, needed to run Rust tests locally)

### Node Installation

We recommend installing Node via the `nvm` [Node Version Manager](https://github.com/nvm-sh/nvm). Once installed on your system, you can get Node:

```shell
$ nvm install v18.16.0
...
$ nvm use v18.16.0
Now using node v18.16.0 (npm v9.5.1)
```

You should now see both `node` and `npm` available from your `$PATH`:

```
$ node --version
v18.16.0
$ npm --version
9.5.1
```

Note: if you already have `node` `v18.16.0` installed, you can switch to use it using `nvm use`; this will automatically set your `node` version to the one defined in `.nvmrc` in the root of this repo.

### PNPM Installation

To install `pnpm` globally on your local machine, follow these steps:

1. Open a terminal or command prompt.
2. Run the following command:

```shell
npm install -g pnpm
```

3. Wait for the installation process to complete.

> Note: If you already have `pnpm` installed globally, you can skip this step.

### Java Development Kit

This project has components written in [Kotlin](https://kotlinlang.org/), a concise programming language from JetBrains that runs on the Java Virtual Machine.

To build the site including its test suites, you must have a Java Development Kit installed on your `$PATH`.

You may verify your `java` installation via the terminal by running `java -version`.

If you do not have Java, we recommend installing it via [SDKMan](https://sdkman.io/install). This project allows you to easily install the Java Development Kit (JDK), runtime (JRE), and related frameworks, build tools, and runtimes.

After you've installed SDKMan, you may install Java:

#### SDKMan (cross-platform instructions)

```shell
$ sdk install java 17.0.10-oracle
...
Do you want java 17.0.10-oracle to be set as default? (Y/n): Y
Setting java 17.0.10-oracle as default.
```

You may test your installation:

```shell
$ java -version
java version "17.0.10" 2024-01-16 LTS
Java(TM) SE Runtime Environment (build 17.0.10+11-LTS-240)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.10+11-LTS-240, mixed mode, sharing)
```

### Playwright Installation

[Playwright](https://playwright.dev/) is the test harness we use for browser-based examples. It can be installed from the `site` directory:

```shell
$ pnpm playwright install --with-deps
```

Note: Running `pnpm install` is required before running the Playwright install command above.

This is required when running the tests, for instance via `pnpm test`.

Note: At the time of this writing, Playwright is [not supported on Fedora systems](https://github.com/microsoft/playwright/issues/29559).

### Xcode Installation

[Xcode](https://developer.apple.com/xcode/) is Apple's development toolkit, used both as an IDE and runtime for Swift examples. Install via the site link for your platform.

You can test your installation:

```shell
$ swift --version
swift-driver version: 1.87.3 Apple Swift version 5.9.2 (swiftlang-5.9.2.2.56 clang-1500.1.0.2.5)
Target: arm64-apple-macosx14.0
```

This optional prerequisite is required only when running the `pnpm test:swift` command. Once Swift tests are in place, we'll add the Swift environment to the `pnpm test` lifecycle, and this will become a required prerequisite.

### Rust Installation

[Rust](https://www.rust-lang.org/tools/install) is a modern, type-safe, compiled, performant language. Install via the site link for your platform.

You may test your installation:

```shell
$ rustc --version
rustc 1.75.0 (82e1608df 2023-12-21)
```

This optional prerequisite is required only when running the `pnpm test:rust` command. Once Rust tests are in place, we'll add the Rust environment to the `pnpm test` lifecycle, and this will become a required prerequisite.

## Getting Started

To get started with the project and run the available scripts, follow these instructions:

1. Fork the repository

2. Clone into your local workspace. Replace `$yourUsernameOrOrg` with your GitHub username or organization.

````shell
$ git clone

3. Navigate to the project directory:

```shell
$ cd website/site
````

4. Install project dependencies using `pnpm`:

```shell
$ pnpm install
```

5. Once the installation is complete, you are ready to run the available scripts.

## Scripts

The following scripts are available for running specific tasks within the project. Run these scripts from the `site` directory.

- `pnpm start`: Runs the site in development mode with auto-refresh.
- `pnpm build`: Builds the production version of the site. The completed build will be in the `build` folder.
- `pnpm clear`: Clears the Docusaurus build cache.
- `pnpm serve`: Serves the production build locally.
- `pnpm deploy`: Deploys the site (configure deployment settings as needed).
- `pnpm swizzle`: Customizes Docusaurus theme components.
- `pnpm write-translations`: Extracts strings for translation.
- `pnpm write-heading-ids`: Generates heading IDs for content.
- `pnpm snippets`: Runs `shnip` to extract code snippets (requires configuration).
- `pnpm test`: Runs the test suites for the site in JavaScript, Kotlin, and Swift, including browser tests. Requires Playwright, Java Development Kit, and Swift, per installation instructions above.
  - `pnpm test:js`: Runs the JavaScript test suite only.
  - `pnpm test:js myFile.test.js`: Runs the tests within `myFile.test.js` only.
  - `pnpm test:kotlin`: Runs the Kotlin test suite only.
  - `pnpm test:rust`: Runs the Rust test suite (not included in the `pnpm test` lifecycle yet).
  - `pnpm test:swift`: Runs the Swift test suite (not included in the `pnpm test` lifecycle yet).
  - `pnpm test:watch`: Runs tests in watch mode.

## Extra Features

We have implemented extra features in the website that don't come enabled by default. For example, we have the Feedback Widget feature, which allows a user to upvote or downvote a docs page.

These features are enabled via environment variables set in the `.env` file inside the `site` folder. To enable them, copy the example `.env` file:

```shell
cp .env.example .env
```

Then modify the parameters according to the feature you want to use. Check their instructions below:

- `FEEDBACK_WIDGET_API_URL`: Enables the feedback widget API URL; see [Feedback server app instructions](./apps/feedback-server/README.md)
- `DOC_SEARCH_*`: Enables the search bar powered by Algolia; see [Algolia connecting instructions](https://docusaurus.io/docs/search#connecting-algolia)

Remember, when these environment variables are not set, these features are disabled by default.

## Note on Package Manager

This project uses `pnpm` as the package manager. If you have previously used `npm` or `yarn` in this project, you may encounter build failures. To fix this, remove any existing `node_modules` directories and reinstall dependencies using `pnpm`:

```shell
$ rm -rf node_modules
$ pnpm install
```

Alternatively, you can use `npkill` to remove all `node_modules` directories:

```shell
$ npx npkill
[Follow prompts to delete all node_modules folders]
[Ctrl-C to exit]
$ pnpm install
```

## Contributing

If you wish to contribute to this project, please follow the guidelines outlined in the [CONTRIBUTING.md](CONTRIBUTING.md) file.

## License

This project is licensed under the [MIT License](LICENSE).

## Breaking Files

You'll notice that there's a directory at the root level labelled "breaking-files"

Just a heads up that for some reason docusaurus is throwing an error when those docs are included in the docs directory. Might have something to do with conflicting dependencies between react/docusaurus versions.
