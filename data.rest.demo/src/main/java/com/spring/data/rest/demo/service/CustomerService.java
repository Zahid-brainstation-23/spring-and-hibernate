package com.spring.data.rest.demo.service;

import com.spring.data.rest.demo.jpa.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {


    private CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }



}
