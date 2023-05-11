package com.spring.data.rest.demo.service;

import com.spring.data.rest.demo.entity.Customer;
import com.spring.data.rest.demo.jpa.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer){
        customer.setId(String.valueOf(Math.random()*100));
        return customerRepository.save(customer);
    }



}
