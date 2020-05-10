package com.studenthome.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.studenthome.entity.models.Bicycle;

public interface IBicycleDao extends CrudRepository<Bicycle, Long> {
	
}
