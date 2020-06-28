package com.studenthome.entity.services;

import com.studenthome.entity.dao.ILocation;
import com.studenthome.entity.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService implements ILocationService {

    @Autowired
    public ILocation data;

    @Override
    public Location listId(long id) { return data.findById(id).get(); }

    @Override
    public List<Location> list() { return (List<Location>) data.findAll(); }

    @Override
    public void post(Location location) {data.save(location); }

    @Override
    public void put(Location location, long id) {
        data.findById(id).ifPresent((x)->{
            location.setId(id);
            data.save(location);
        });
    }

    @Override
    public void delete(long id) {
    // TODO Auto-generated method stub
    }
}
