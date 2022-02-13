package com.dbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Receiver;
import com.dbs.repo.ReceiverRepo;

@Service
public class ReceiverService {
	ReceiverRepo rp;
	
	public ReceiverRepo getRp() {
		return rp;
	}

	@Autowired
	public void setRp(ReceiverRepo rp) {
		this.rp = rp;
	}

	public List<Receiver> getAll() {
		// TODO Auto-generated method stub
		return rp.findAll();
	}

	public Receiver getId(int id) {
		// TODO Auto-generated method stub
		return rp.findById(id).get();
	}

}
