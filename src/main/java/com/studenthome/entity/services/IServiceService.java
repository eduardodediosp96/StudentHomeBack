package com.studenthome.entity.services;
import com.studenthome.entity.models.service;

import java.util.List;

public interface IServiceService {
    public service listId(long id);
    public List<service> list();
    public void post(service s);
    public void put(service s, long id);
    public void delete(long id);
}
