package com.dbs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Sender")
public class Customer {
	@Column(name="Customer_id")
	@Id
	Long id;
	@Column(name="AccountHolderName")
	String name;
	@Column(name="Clear_Balance")
	Long balance;
	@Column(name="Over_Draft")
	Boolean overdraft;
	
	@OneToMany(mappedBy="customer",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JsonIgnore
	List<Transaction> transactions;

	public Customer(Long id, String name, Long balance, Boolean overdraft) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.overdraft = overdraft;
	}

	public Customer() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Boolean getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(Boolean overdraft) {
		this.overdraft = overdraft;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + ", overdraft=" + overdraft + "]";
	}
	
	
	
}
