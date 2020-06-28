package com.studenthome.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.studenthome.entity.dao.ILandlord;
import com.studenthome.entity.dao.IProperty;
import com.studenthome.entity.models.Landlord;
import com.studenthome.entity.models.Property;

public class LandlordService implements ILandlordService {
	@Autowired
	public ILandlord data;

	@Override
	public Landlord listId(long id) {
		return data.findById(id).get();
	}

	@Override
	public List<Landlord> list() {
		return (List<Landlord>) data.findAll();
	}

	@Override
	public void post(Landlord p) {
		data.save(p);
		
	}

	@Override
	public void put(Landlord p, long id) {
		data.findById(id).ifPresent((x)->{
			p.setId(id);
			data.save(p);
		});
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	
}
