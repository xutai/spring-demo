package com.example.restservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


@RestController
//@Controller
//@ResponseBody

public class GreetingController {

    public static void main(String[] args) {
        
        SpringApplication.run(GreetingController.class, args);
    }

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "xutai") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name)
        );
    }
}