package com.casestudy.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Flight")
public class AdminModel {

	@Id
	private String id;
	@Field
	private String Flight_no;
	@Field
	private String Name;
	@Field
	private String Travelling_from;
	@Field
	private String Travelling_to;
	@Field
	private String Fare;
	@Field
	private String Date;
	@Field
	private String Seat_available;
	
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFlight_no() {
		return Flight_no;
	}
	public void setFlight_no(String flight_no) {
		Flight_no = flight_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTravelling_from() {
		return Travelling_from;
	}
	public void setTravelling_from(String travelling_from) {
		Travelling_from = travelling_from;
	}
	public String getTravelling_to() {
		return Travelling_to;
	}
	public void setTravelling_to(String travelling_to) {
		Travelling_to = travelling_to;
	}
	public String getFare() {
		return Fare;
	}
	public void setFare(String fare) {
		Fare = fare;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getSeat_available() {
		return Seat_available;
	}
	public void setSeat_available(String seat_available) {
		Seat_available = seat_available;
	}

	
	
	
	
	
}
