package com.spring.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String homeController(){
        return "Open s<a href='/swagger-ui/index.html#/' > swagger doc </a>";
    }
}
