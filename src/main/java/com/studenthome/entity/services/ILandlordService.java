package com.studenthome.entity.services;
import com.studenthome.entity.models.Landlord;
import java.util.List;

public interface ILandlordService {
	public Landlord listId(long id);
	public List<Landlord> list();
	public void post(Landlord landlord);
	public void put(Landlord landlord, long id);
	public void delete(long id);
}
