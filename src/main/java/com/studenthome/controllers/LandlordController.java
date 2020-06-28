package com.studenthome.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.studenthome.entity.models.Landlord;
import com.studenthome.entity.services.ILandlordService;

public class LandlordController {
	@Autowired
	ILandlordService service;
	
	@GetMapping("landlord/list")
	public List<Landlord> getAllLandlords(){
		return service.list();
	}
	
	@GetMapping("/landlord/{id}")
	public Landlord getOne(@PathVariable(value = "id") long id) {
		return service.listId(id);
	}
	
	@PostMapping("/landlord")
	public void add(Landlord landlord) {
		service.post(landlord);
	}
	
	@PutMapping("/landlord/{id}")
	public void update(Landlord landlord, @PathVariable(value = "id") long id) {
		service.put(landlord, id);
	}
}
