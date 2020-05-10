package com.studenthome.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studenthome.entity.models.Property;
import com.studenthome.entity.models.Student;
import com.studenthome.entity.services.IPropertyService;
import com.studenthome.entity.services.IStudentService;

@RestController
public class studentController{
	
	@Autowired
	IStudentService service;
	

	
	@GetMapping("student/list")
	public List<Student> getAllBicycles(){
		return service.list();
	}
	
	
	@GetMapping("/student/{id}")
	public Student getOne(@PathVariable(value = "id") long id) {
		return service.listId(id);
	}
	
	@PostMapping("/student")
	public void add(Student s) {
		service.post(s);
	}
	
	@PutMapping("/student/{id}")
	public void update(Student s, @PathVariable(value = "id") long id) {
		service.put(s, id);
	}
}