package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Customer;
import com.dbs.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	CustomerService cs;
	
	public CustomerService getCs() {
		return cs;
	}

	@Autowired
	public void setCs(CustomerService cs) {
		this.cs = cs;
	}

	@GetMapping
	public List<Customer> getAll() {
		return  cs.getAll();
	}
	@GetMapping("/{id}")
	public Customer getId(@PathVariable("id") Long id) {
		return  cs.getId(id);
	}
}
