package com.studenthome.entity.services;

import java.util.List;
import java.util.Optional;

import com.studenthome.entity.models.Property;
import com.studenthome.entity.models.Student;

public interface IStudentService {
	public Student listId(long id);
	public List<Student>list();
	public void post(Student s);
	public void put(Student s, long id);
	public void delete(long id);
	public Student buscarPorEmail(String email, String password);
}
