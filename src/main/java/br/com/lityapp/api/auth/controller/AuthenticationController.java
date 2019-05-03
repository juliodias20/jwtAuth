package br.com.lityapp.api.auth.controller;

import br.com.lityapp.api.auth.dto.CurrentUserDto;
import br.com.lityapp.api.auth.dto.UserCredentialsDto;
import br.com.lityapp.api.auth.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/auth")
    public CurrentUserDto authenticate(@Valid @RequestBody UserCredentialsDto userCredentialsDto) {
        return this.authenticationService.authenticate(userCredentialsDto);
    }
}
