package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Customer;
import com.dbs.repo.CustomerRepo;

@Service
public class CustomerService {

	CustomerRepo cr;
	public CustomerRepo getCr() {
		return cr;
	}

	@Autowired
	public void setCr(CustomerRepo cr) {
		this.cr = cr;
	}

	public List<Customer> getAll(){
		return cr.findAll();
	}

	public Customer getId(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}
	
}
