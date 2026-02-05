package com.grupo01.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WikiController {

    @GetMapping("/wiki")
    public String wiki() {
        return "index"; 
    }
}
