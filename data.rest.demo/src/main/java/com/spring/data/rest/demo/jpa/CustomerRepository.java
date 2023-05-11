package com.spring.data.rest.demo.jpa;

import com.spring.data.rest.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, String> {
}
