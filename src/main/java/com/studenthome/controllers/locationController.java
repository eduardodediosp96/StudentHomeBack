package com.studenthome.controllers;

import com.studenthome.entity.models.Location;
import com.studenthome.entity.services.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class locationController {
    @Autowired
    ILocationService service;

    @GetMapping("location/list")
    public List<Location> getAllLocations(){
        return service.list();
    }

    @GetMapping("/location/{id}")
    public Location getOne(@PathVariable(value = "id") long id) {
        return service.listId(id);
    }

    @PostMapping("/location")
    public void add(Location location) {
        service.post(location);
    }

    @PutMapping("/location/{id}")
    public void update(Location location, @PathVariable(value = "id") long id) {
        service.put(location, id);
    }
}
