package com.studenthome.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable{
private static final long serialVersionUID = 1L;
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String firstName;
 private String lastName;
 private String dni;
 private String phone;
 private String email;
 private double totalScore;	
 private long roomieId;
 private long adressId;
 private String hoobyes; //json preferible
 
 
 	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}
	public long getRommieId() {
		return roomieId;
	}
	public void setRommieId(long roomieId) {
		this.roomieId = roomieId;
	}
	public long getAdressId() {
		return adressId;
	}
	public void setAdressId(long adressId) {
		this.adressId = adressId;
	}
	public String getHoobyes() {
		return hoobyes;
	}
	public void setHoobyes(String hoobyes) {
		this.hoobyes = hoobyes;
	}
 
}
