package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Transaction;
import com.dbs.repo.TransactionRepo;

@Service
public class TransactionService {

	TransactionRepo tr;

	public TransactionRepo getTr() {
		return tr;
	}
	
	@Autowired
	public void setTr(TransactionRepo tr) {
		this.tr = tr;
	}
	public void save(Transaction transaction) {
		tr.save(transaction);
	}

	public List<Transaction> findAll() {
		return tr.findAll();
		
	}
	
}
