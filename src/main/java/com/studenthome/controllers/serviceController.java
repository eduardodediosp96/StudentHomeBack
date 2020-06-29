package com.studenthome.controllers;

import com.studenthome.entity.models.Student;
import com.studenthome.entity.models.service;
import com.studenthome.entity.services.IServiceService;
import com.studenthome.entity.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class serviceController {
    @Autowired
    IServiceService service;

    @GetMapping("service/list")
    public List<com.studenthome.entity.models.service> getAllServices(){
        return service.list();
    }

    @GetMapping("/service/{id}")
    public service getOne(@PathVariable(value = "id") long id) {
        return service.listId(id);
    }

    @PostMapping("/service/")
    public void add(service s) {
        service.post(s);
    }

    @PutMapping("/service/{id}")
    public void update(service s, @PathVariable(value = "id") long id) {
        service.put(s, id);
    }
}
