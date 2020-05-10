package com.studenthome.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.studenthome.entity.models.Hobby;

public interface IHobby extends CrudRepository<Hobby, Long> {

}
