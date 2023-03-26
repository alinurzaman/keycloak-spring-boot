Here is the tutorial of how to integrate keycloak with spring boot.

1. Pull docker image of keycloak server: https://quay.io/repository/keycloak/keycloak
2. Setup the server by type:
   docker run --name kc -p 8180:8080 \
    -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin \
    quay.io/keycloak/keycloak:latest \
    start-dev
