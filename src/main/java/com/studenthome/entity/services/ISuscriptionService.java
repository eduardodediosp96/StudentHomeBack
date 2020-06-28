package com.studenthome.entity.services;

import com.studenthome.entity.models.Suscription;

import java.util.List;

public interface ISuscriptionService {
	public Suscription listId(long id);
	public List<Suscription> list();
	public void post(Suscription suscription);
	public void put(Suscription suscription, long id);
	public void delete(long id);
}
