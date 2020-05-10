package com.studenthome.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.studenthome.entity.models.Student;

public interface IStudent extends CrudRepository<Student, Long> {

}
