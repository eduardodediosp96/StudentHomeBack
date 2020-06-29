package com.studenthome.entity.dao;

import com.studenthome.entity.models.Service;
import org.springframework.data.repository.CrudRepository;

public interface IService extends CrudRepository<Service,Long> {

}
