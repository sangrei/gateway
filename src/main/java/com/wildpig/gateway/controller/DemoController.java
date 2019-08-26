package com.wildpig.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    @GetMapping("/get")
    public String getProduct() {
        return new Date().toString();
    }
}

