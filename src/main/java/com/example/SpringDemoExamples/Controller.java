package com.example.SpringDemoExamples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String greetings() {
        return "Hello! Welcome";
    }
}
