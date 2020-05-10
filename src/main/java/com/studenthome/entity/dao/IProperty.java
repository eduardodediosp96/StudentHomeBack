package com.studenthome.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.studenthome.entity.models.Property;

public interface IProperty extends CrudRepository<Property, Long> {

}
