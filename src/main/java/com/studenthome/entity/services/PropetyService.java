package com.studenthome.entity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studenthome.entity.dao.IProperty;
import com.studenthome.entity.models.Bicycle;
import com.studenthome.entity.models.Property;

@Service
public class PropetyService implements IPropertyService {
	@Autowired
	public IProperty data;

	@Override
	public Property listId(long id) {
		return data.findById(id).get();

	}

	@Override
	public List<Property> list() {
		return (List<Property>) data.findAll();
	}

	@Override
	public void post(Property property) {
		data.save(property);
		
	}

	@Override
	public void put(Property property, long id) {
		data.findById(id).ifPresent((x)->{
			property.setId(id);
			data.save(property);
		});
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	

}


