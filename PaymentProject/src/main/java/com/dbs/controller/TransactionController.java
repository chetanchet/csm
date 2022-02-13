package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Transaction;
import com.dbs.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	TransactionService ts;
	 
	public TransactionService getTs() {
		return ts;
	}

	@Autowired
	public void setTs(TransactionService ts) {
		this.ts = ts;
	}

	@PostMapping
	public void save(@RequestBody Transaction transaction) {
		ts.save(transaction);
	}
	@GetMapping
	public List<Transaction> findall() {
		System.out.println(ts.findAll());
		return ts.findAll();
	}
}
