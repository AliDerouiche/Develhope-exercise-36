package com.example.demodep.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/developer")
public class Controller {

    @GetMapping("/name")
    public String getName() {
        return "Mario";
    }
}