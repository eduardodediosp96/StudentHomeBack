package com.studenthome.entity.services;

import com.studenthome.entity.dao.IService;
import com.studenthome.entity.models.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService implements IServiceService {

    @Autowired
    public IService data;

    @Override
    public Service listId(long id) {
        return data.findById(id).get();
    }

    @Override
    public List<Service> list() {
        return (List<Service>) data.findAll();
    }

    @Override
    public void post(Service s) {
        data.save(s);
    }

    @Override
    public void put(Service s, long id) {
        data.findById(id).ifPresent((x)->{
            s.setId(id);
            data.save(s);
        });
    }

    @Override
    public void delete(long id) {

    }
}
