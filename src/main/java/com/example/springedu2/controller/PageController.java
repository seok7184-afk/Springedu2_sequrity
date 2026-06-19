package com.example.springedu2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // login 주소 처리할 필요 x
    // @PostMapping("/login") 은 security fillter 가 처리하므로

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }
}
