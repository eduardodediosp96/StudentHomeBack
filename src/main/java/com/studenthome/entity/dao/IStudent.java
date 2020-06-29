package com.studenthome.entity.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.studenthome.entity.models.Student;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudent extends CrudRepository<Student, Long> {
    @Query("select a from Student a where a.email = :pass_email and a.password = :pass_password")
    Student buscarPorEmail(@Param("pass_email") String pass_email, @Param("pass_password") String pass_password);
}
