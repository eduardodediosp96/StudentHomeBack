package com.studenthome.controllers;

import com.studenthome.entity.models.Suscription;
import com.studenthome.entity.services.ISuscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class suscriptionController {
    @Autowired
    ISuscriptionService service;

    @GetMapping("suscription/list")
    public List<Suscription> getAllSuscriptions(){
        return service.list();
    }

    @GetMapping("/suscription/{id}")
    public Suscription getOne(@PathVariable(value = "id") long id) {
        return service.listId(id);
    }

    @PostMapping("/suscription")
    public void add(Suscription suscription) {
        service.post(suscription);
    }

    @PutMapping("/suscription/{id}")
    public void update(Suscription suscription, @PathVariable(value = "id") long id) {
        service.put(suscription, id);
    }
}
