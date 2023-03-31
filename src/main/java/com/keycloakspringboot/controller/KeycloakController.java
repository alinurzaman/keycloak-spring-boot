package com.keycloakspringboot.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

// import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
// import org.keycloak.representations.AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeycloakController {

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/";
    }

    @GetMapping("/homepage")
    public String homepage(Principal principal) {
        // KeycloakAuthenticationToken token = (KeycloakAuthenticationToken) principal;
        // AccessToken accessToken =
        // token.getAccount().getKeycloakSecurityContext().getToken();

        return "Welcome to homepage, " + principal.getName() + " successfully logged in";
    }
}
