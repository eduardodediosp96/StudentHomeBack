package com.studenthome.entity.services;
import com.studenthome.entity.models.Service;

import java.util.List;

public interface IServiceService {
    Service listId(long id);
    List<Service> list();
    void post(Service s);
    void put(Service s, long id);
    void delete(long id);
}
