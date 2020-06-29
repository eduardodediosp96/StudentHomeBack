package com.studenthome.controllers;

import java.util.List;

import com.studenthome.entity.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studenthome.entity.models.Property;
import com.studenthome.entity.services.IPropertyService;

@RestController
public class propertyController{
	
	@Autowired
	IPropertyService service;
	
	@Autowired
	IStudentService serv;
	
	@GetMapping("property/list")
	public List<Property> getAllPropertys(){
		return service.list();
	}
	
	
	@GetMapping("/property/{id}")
	public Property getOne(@PathVariable(value = "id") long id) {
		return service.listId(id);
	}
	
	@PostMapping("/property")
	public void add(Property property) {
		service.post(property);
	}
	
	@PutMapping("/property/{id}")
	public void update(Property property, @PathVariable(value = "id") long id) {
		service.put(property, id);
	}
	
}