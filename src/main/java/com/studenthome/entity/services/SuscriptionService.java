package com.studenthome.entity.services;

import com.studenthome.entity.dao.ISuscription;
import com.studenthome.entity.models.Suscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuscriptionService implements ISuscriptionService {

    @Autowired
    public ISuscription data;

    @Override
    public Suscription listId(long id) {
        return data.findById(id).get();
    }

    @Override
    public List<Suscription> list() {
        return (List<Suscription>) data.findAll();
    }

    @Override
    public void post(Suscription suscription) {
        data.save(suscription);
    }

    @Override
    public void put(Suscription suscription, long id) {
        data.findById(id).ifPresent((x)->{
            suscription.setId(id);
            data.save(suscription);
        });
    }

    @Override
    public void delete(long id) {
// TODO Auto-generated method stub
    }
}
