package com.studenthome.entity.services;

import com.studenthome.entity.dao.IService;
import com.studenthome.entity.dao.IStudent;
import com.studenthome.entity.models.Student;
import com.studenthome.entity.models.service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceService implements IServiceService {
    @Autowired
    public IService data;
    @Override
    public service listId(long id) {
        return data.findById(id).get();
    }

    @Override
    public List<service> list() {
        return (List<service>) data.findAll();
    }

    @Override
    public void post(service s) {
        data.save(s);
    }

    @Override
    public void put(service s, long id) {
        data.findById(id).ifPresent((x)->{
            s.setId(id);
            data.save(s);
        });
    }

    @Override
    public void delete(long id) {

    }
}
