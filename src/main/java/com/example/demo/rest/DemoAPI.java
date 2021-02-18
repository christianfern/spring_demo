package com.example.demo.rest;
import com.example.demo.service.NoDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/DemoAPI")
public class DemoAPI {

    private final NoDBService noDBService;

    @GetMapping("/generateName")
    public String asyncDemo(){
        return noDBService.generateName();
    }

}
