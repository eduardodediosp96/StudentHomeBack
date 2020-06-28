package com.studenthome.controllers;

import com.studenthome.entity.models.Landlord;
import com.studenthome.entity.services.ILandlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class landlordController {
    @Autowired
    ILandlordService service;

    @GetMapping("landlord/list")
    public List<Landlord> getAllLocations(){
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
