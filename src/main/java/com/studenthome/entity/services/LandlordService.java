package com.studenthome.entity.services;

import com.studenthome.entity.dao.ILandlord;
import com.studenthome.entity.dao.ILocation;
import com.studenthome.entity.models.Landlord;
import com.studenthome.entity.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandlordService implements ILandlordService {
    @Autowired
    public ILandlord data;
    
    @Override
    public Landlord listId(long id) {
        return data.findById(id).get();
    }

    @Override
    public List<Landlord> list() {
        return (List<Landlord>) data.findAll();
    }

    @Override
    public void post(Landlord landlord) {
        data.save(landlord);
    }

    @Override
    public void put(Landlord landlord, long id) {
        data.findById(id).ifPresent((x)->{
            landlord.setId(id);
            data.save(landlord);
        });
    }

    @Override
    public void delete(long id) {
    // TODO Auto-generated method stub
    }
}
