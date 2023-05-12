package com.spring.data.rest.demo.service;


import com.spring.data.rest.demo.entity.Customer;
import com.spring.data.rest.demo.jpa.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ResponseEntity<Iterable<Customer>> getAllCustomer(){
        return ResponseEntity.ok(customerRepository.findAll());
    }

    public ResponseEntity<Customer>  saveCustomer(Customer customer){
        return ResponseEntity.ok(customerRepository.save(customer));

    }

}
