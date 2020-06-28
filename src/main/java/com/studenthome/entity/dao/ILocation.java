package com.studenthome.entity.dao;

import com.studenthome.entity.models.Location;
import org.springframework.data.repository.CrudRepository;

public interface ILocation extends CrudRepository<Location, Long> {

}
