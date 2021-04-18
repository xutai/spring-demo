package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @RequestMapping("/")
//    @RequestMapping(path = "/a", method = GET)
//    @GetMapping("/a")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }
}
