export default {

    oidc: {
        clientId: 'Bookstore-Web-App',
        issuer: 'https://bookstore/oauth2/default',
        redirectUri: 'https://localhost:4200/login/callback',
        scopes: ['openid', 'profile', 'email']
    }

}
