package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HealthCheck")
public class HealthCheck {

    @GetMapping("/get")
    public String get(){
        return "GET is working.";
    }

}
