package com.studenthome.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="property")
public class Property implements Serializable{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private long adressId;
private long landlordId;
private int nRoom;
private double size;
private boolean active;
private int totalScore;

public long getId()  {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getAdressId() {
	return adressId;
}
public void setAdressId(long adressId) {
	this.adressId = adressId;
}
public long getLandlordId() {
	return landlordId;
}
public void setLandlordId(long lanLDLordId) {
	this.landlordId = lanLDLordId;
}
public int getnRoom() {
	return nRoom;
}
public void setnRoom(int nRoom) {
	this.nRoom = nRoom;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public int getTotalScore() {
	return totalScore;
}
public void setTotalScore(int totalscore) {
	this.totalScore = totalscore;
}
}
