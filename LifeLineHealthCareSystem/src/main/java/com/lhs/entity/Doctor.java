package com.lhs.entity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String doctorName;
	private String speciality;
	private Date availableTime;
	private String feedback;
	private int rating;
	private String location;
	private String state;
	
	
	@Enumerated(EnumType.STRING)
	private DoctorAvailableStatus status; 


	
	
	
	
	
	
	
	
	
	public Doctor() {
		super();
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", speciality=" + speciality + ", availableTime="
				+ availableTime + ", feedback=" + feedback + ", rating=" + rating + ", location=" + location
				+ ", state=" + state + ", status=" + status + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getSpeciality() {
		return speciality;
	}


	public Doctor(String doctorName, String speciality, Date availableTime, String feedback, int rating,
			String location, String state, DoctorAvailableStatus status) {
		super();
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.availableTime = availableTime;
		this.feedback = feedback;
		this.rating = rating;
		this.location = location;
		this.state = state;
		this.status = status;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public Date getAvailableTime() {
		return availableTime;
	}


	public void setAvailableTime(Date availableTime) {
		this.availableTime = availableTime;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public DoctorAvailableStatus getStatus() {
		return status;
	}


	public void setStatus(DoctorAvailableStatus status) {
		this.status = status;
	}
	
	
	
	

}
