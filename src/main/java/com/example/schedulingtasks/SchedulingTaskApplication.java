package com.example.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

@EnableScheduling

public class SchedulingTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingTaskApplication.class, args);
    }
}
