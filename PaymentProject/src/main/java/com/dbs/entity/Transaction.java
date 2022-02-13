package com.dbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Transaction_Details")
public class Transaction {
	
	@Id
	@Column(name="Transaction_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long tid;
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="customer_id",nullable=false)
	Customer customer;
	
	@Column(name="Transfer_Type")
	String type;
	
	@Column(name="Message_Code")
	String code;
	
	@Column(name="Amount")
	Long amount;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Transaction(String type, String code, Long amount) {
		super();
		this.type = type;
		this.code = code;
		this.amount = amount;
	}
	public Transaction() {
		super();
	}
	@Override
	public String toString() {
		return "Transaction [id=" + tid + ",type=" + type + ", code=" + code + ", amount=" + amount + "]";
	}
	
	
	

}
