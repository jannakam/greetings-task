package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    // greet GET method
    @GetMapping("/greet")
    String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // farewell POST method
    @PostMapping("/farewell")
    public String farewell(@RequestBody Person person) {
        return "Goodbye, " + person.name;
    }
}
