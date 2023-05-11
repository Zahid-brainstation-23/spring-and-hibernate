package com.spring.data.rest.demo.controller;

import com.spring.data.rest.demo.entity.Customer;
import com.spring.data.rest.demo.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private CustomerService customerService;

    public HomeController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public String homePage(){
        return "Hellow world";
    }

    @PostMapping ("/customer")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customer")
    public String test(){
        return "hehe";
    }
}
