package com.studenthome.entity.services;
import com.studenthome.entity.models.Location;
import java.util.List;

public interface ILocationService {
	public Location listId(long id);
	public List<Location> list();
	public void post(Location location);
	public void put(Location location, long id);
	public void delete(long id);
}
