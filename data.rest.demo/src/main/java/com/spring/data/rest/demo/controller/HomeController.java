package com.spring.data.rest.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @RequestMapping("/")
    public String HomePage(){
        return "Hellow world";
    }

}
