Here is the tutorial of how to integrate keycloak with spring boot.

1. Pull docker image of keycloak server: https://quay.io/repository/keycloak/keycloak
2. Setup the server by type:
   docker run --name kc -p 8180:8080 \
    -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin \
    quay.io/keycloak/keycloak:latest \
    start-dev
3. Open http://localhost:8180/
4. Create realm. Name: springapp
5. Create client:
   - Client ID: springapp-client
   - redirect_uri: http://localhost:8080/\* {here we will set the URI with server and port of our spring boot application}
6. Create roles: Role name: standard
7. Create user: Username: alpha
8. Credentials -> Set password: alpha
9. Role mapping -> Assign standard role that we have made before
