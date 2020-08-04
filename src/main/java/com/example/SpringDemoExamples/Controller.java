package com.example.SpringDemoExamples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    ContinentDatabase db = new ContinentDatabase();
    @GetMapping("/hello")
    public String greetings() {
        return "Hello! Welcome";
    }

    //api to convert centimeters to feet
   // http://localhost:8080/calculate_inches?cm=2.45
    @GetMapping("/calculate_inches")
    public double getInches(@RequestParam double cm) {
        return cm/30.48;
    }

    //implementing search api
    //http://localhost:8080/search_continent?c=India
    @GetMapping("/search_continent")
    public String getContinent(@RequestParam String c) {
       return db.getContinent(c);
    }
}
