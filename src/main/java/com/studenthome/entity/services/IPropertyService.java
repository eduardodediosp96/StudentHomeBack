package com.studenthome.entity.services;
import java.util.List;
import java.util.Optional;

import com.studenthome.entity.models.Bicycle;
import com.studenthome.entity.models.Property;



public interface IPropertyService {
	public Property listId(long id);
	public List<Property>list();
	public void post(Property p);
	public void put(Property p, long id);
	public void delete(long id);
}
