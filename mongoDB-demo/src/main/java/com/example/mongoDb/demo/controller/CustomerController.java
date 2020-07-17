package com.example.mongoDb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoDb.demo.model.Customer;
import com.example.mongoDb.demo.service.CustomerService;

@RestController
@RequestMapping(value = "/demo")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value = "/customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

}
