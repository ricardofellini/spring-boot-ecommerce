package com.ricardofellini.ecommerceproject.controllers;

import com.ricardofellini.ecommerceproject.model.Customer;
import com.ricardofellini.ecommerceproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
