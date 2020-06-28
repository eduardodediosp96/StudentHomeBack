package com.studenthome.entity.services;
import java.util.List;
import com.studenthome.entity.models.Landlord;




public interface ILandlordService {
	public Landlord listId(long id);
	public List<Landlord>list();
	public void post(Landlord p);
	public void put(Landlord p, long id);
	public void delete(long id);
}
