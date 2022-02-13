package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Receiver;
import com.dbs.service.ReceiverService;

@RestController
@RequestMapping("/receiver")
public class ReceiverController {

	ReceiverService rs;
	
	public ReceiverService getRs() {
		return rs;
	}
	
	@Autowired
	public void setRs(ReceiverService rs) {
		this.rs = rs;
	}
	@GetMapping
	public List<Receiver> getAll() {
		return  rs.getAll();
	}
	@GetMapping("/{id}")
	public Receiver getId(@PathVariable("id") int id) {
		return  rs.getId(id);
	}
}
