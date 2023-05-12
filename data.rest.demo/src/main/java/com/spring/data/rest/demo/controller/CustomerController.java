package com.spring.data.rest.demo.controller;


import com.spring.data.rest.demo.entity.Customer;
import com.spring.data.rest.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("")
    public ResponseEntity<Iterable<Customer>> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping ("")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }





}
