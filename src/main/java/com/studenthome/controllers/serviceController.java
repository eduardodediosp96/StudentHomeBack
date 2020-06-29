package com.studenthome.controllers;

import com.studenthome.entity.models.Service;
import com.studenthome.entity.services.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class serviceController {


    @Autowired
    IServiceService service;

    @GetMapping("service/list")
    public List<Service> getAllServices(){
        return service.list();
    }

    @GetMapping("/service/{id}")
    public Service getOne(@PathVariable(value = "id") long id) {
        return service.listId(id);
    }

    @PostMapping("/service/")
    public void add(Service s) {
        service.post(s);
    }

    @PutMapping("/service/{id}")
    public void update(Service s, @PathVariable(value = "id") long id) {
        service.put(s, id);
    }
}
