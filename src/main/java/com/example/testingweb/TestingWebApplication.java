package com.example.testingweb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@EnableWebMvc
//@ComponentScan

public class TestingWebApplication {

    public static void main(String[]  args) {
        SpringApplication.run(TestingWebApplication.class, args);
    }
}
