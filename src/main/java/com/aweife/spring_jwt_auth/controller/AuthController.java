package com.aweife.spring_jwt_auth.controller;

import com.aweife.spring_jwt_auth.service.JwtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class AuthController {
    private final JwtService jwtService;

    @PostMapping("/token")
    public String getJwt(Authentication authentication) {
        log.debug("Token requested from user: '{}'", authentication.getName());
        String token = jwtService.generateJwt(authentication);
        log.debug("Token created: {}", token);
        return token;
    }
}
