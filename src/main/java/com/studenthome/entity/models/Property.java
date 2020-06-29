package com.studenthome.entity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="property")
public class Property implements Serializable{
private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int nRoom;
	private Double size;
	private Double cost;
	private boolean active;
	private	String description;
	private String imageurl;
	private int cant_shading;
	private int cant_beds;
	private int cant_bath;
	private int score;



	public long getId()  {
		return id;
	}
	public void setId(long id) {this.id = id;}
	public int getnRoom() {
		return nRoom;
	}
	public void setnRoom(int nRoom) {
		this.nRoom = nRoom;
	}
	public Double getSize() {return size;}
	public void setSize(Double size) {
		this.size = size;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public boolean getActive() {return active;}
	public void setActive(boolean active) {this.active = active; }
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description; }
	public String getImageurl() {return imageurl;}
	public void setImageurl(String imageurl) {this.imageurl = imageurl; }
	public int getCant_shading() {
		return cant_shading;
	}
	public void setCant_shading(int cant_shading) {
		this.cant_shading = cant_shading;
	}
	public int getCant_beds() {
		return cant_beds;
	}
	public void setCant_beds(int cant_beds) {
		this.cant_beds = cant_beds;
	}
	public int getCant_bath() {
		return cant_bath;
	}
	public void setCant_bath(int cant_bath) {
		this.nRoom = cant_bath;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.nRoom = score;
	}


	/*
	public long getSuscriptionId() {
		return suscriptionId;
	}
	public void setAdressId(long suscriptionId) {
		this.suscriptionId = suscriptionId;
	}

	public long getSuscriptionId() {
		return suscriptionId;
	}
	public void setAdressId(long suscriptionId) {
		this.suscriptionId = suscriptionId;
	}
	*/

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "landlord_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Landlord landlord;
	//private long landlordId;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "location_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Location location;
	//private long locationId;

	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {CascadeType.PERSIST, CascadeType.MERGE},
			mappedBy = "properties")
	@JsonIgnore
	private List<service> services;
}
