package com.natsukashiiz.springbootjwtrsa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeApi {
    @GetMapping
    public String home(Principal principal) {
        return String.format("Hello, %s!", principal.getName());
    }
}
