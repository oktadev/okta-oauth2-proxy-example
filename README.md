# OAuth2 Proxy Example
 
This example app shows how to use OAuth2 Proxy with Okta.

Please read [Add Auth to Any App with OAuth2 Proxy](https://developer.okta.com/blog/2022/07/14/add-auth-to-any-app-with-oauth2-proxy) to see how this app was created.

**Prerequisites:** 
* [Docker](https://docs.docker.com/get-docker/)
* [Docker Compose](https://docs.docker.com/compose/install/)
* [Httpie](https://httpie.io/cli) (A user friendly HTTP client)
* [Okta CLI](https://cli.okta.com/) (Configures applications in Okta)
* [Java 17](https://sdkman.io/) (optional)

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage, and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadev/okta-oauth2-proxy-example.git
cd sokta-oauth2-proxy-example
```



### Create an Application in Okta

Before you begin, you’ll need a free Okta developer account. Install the [Okta CLI](https://cli.okta.com/) and run `okta register` to sign up for a new account. If you already have an account, run `okta login`.

Then, run `okta start` to configure the application, and write the OAuth configuration to a `.env` file.

### Start the Application

To start the applciatin run `docker compose up`.  This will build and run the application in containers.

## Links

This example uses the following libraries provided by Okta:

* [OAuth2 Proxy](https://oauth2-proxy.github.io/oauth2-proxy/docs/)

## Help

Please post any questions as comments on [this repo's blog post](https://developer.okta.com/blog/2022/07/14/add-auth-to-any-app-with-oauth2-proxy), or visit our [Okta Developer Forums](https://devforum.okta.com/). You can also email developers@okta.com if you would like to create a support ticket.

## License

Apache 2.0, see [LICENSE](LICENSE).
