package com.studenthome.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.studenthome.entity.models.Region;

public interface IRegion extends CrudRepository<Region, Long> {

}
