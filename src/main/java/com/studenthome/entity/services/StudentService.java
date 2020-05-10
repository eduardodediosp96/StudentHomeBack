package com.studenthome.entity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studenthome.entity.dao.IStudent;
import com.studenthome.entity.models.Property;
import com.studenthome.entity.models.Student;


@Service
public class StudentService implements IStudentService {

	@Autowired
	public IStudent data;

	@Override
	public Student listId(long id) {
		return data.findById(id).get();
	}

	@Override
	public List<Student> list() {
		return (List<Student>) data.findAll();
	}

	@Override
	public void post(Student s) {
		data.save(s);
		
	}

	@Override
	public void put(Student s, long id) {
		data.findById(id).ifPresent((x)->{
			s.setId(id);
			data.save(s);
		});
		
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
