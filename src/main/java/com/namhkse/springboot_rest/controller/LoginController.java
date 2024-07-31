package com.namhkse.springboot_rest.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @GetMapping("/user")
    public String testUser() {
        return "You are user";
    }

    @GetMapping("/admin")
    public String testAdmin() {
        return "You are admin";
    }
}
