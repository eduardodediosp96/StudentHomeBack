package com.studenthome.entity.dao;

import com.studenthome.entity.models.service;
import org.springframework.data.repository.CrudRepository;

public interface IService extends CrudRepository<service,Long> {

}
