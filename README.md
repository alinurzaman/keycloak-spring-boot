Here is the tutorial of how to integrate keycloak with spring boot.

1. Download keycloak version 20.0.3: https://www.keycloak.org/archive/downloads-20.0.3.html
2. Open http://localhost:8080/
3. Create admin; password: admin
4. Go to administration console. Create realm. Name: SpringBootKeycloak
5. Create client:
   - Client ID: login-app
   - redirect_uri: http://localhost:8081/'\*' {remove '\'. here we will set the URI with server and port of our spring boot application}
6. Create roles: Role name: user
7. Create user: Username: user1
8. Credentials -> Set password: user1
9. Role mapping -> Assign standard role that we have made before
10. Download this source code
