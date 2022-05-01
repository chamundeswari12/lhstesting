package com.lhs.entity;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class SlotBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date availableTime;
	private LocalTime slot1;
	private LocalTime slot2;
	private LocalTime slot3;
	@OneToOne
	private Doctor doctor;
	
	public Doctor getDoctor() {
		return doctor;
	}




	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}




	public SlotBooking()
	{
		
	}
	
	
	
	
	public SlotBooking(int id, Date availableTime, LocalTime slot1, LocalTime slot2, LocalTime slot3) {
		super();
		this.id = id;
		this.availableTime = availableTime;
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getavailableTime() {
		return availableTime;
	}
	public void setavailableTime(Date davailableTimeay) {
		this.availableTime = availableTime;
	}
	public LocalTime getSlot1() {
		return slot1;
	}
	public void setSlot1(LocalTime slot1) {
		this.slot1 = slot1;
	}
	public LocalTime getSlot2() {
		return slot2;
	}
	public void setSlot2(LocalTime slot2) {
		this.slot2 = slot2;
	}
	public LocalTime getSlot3() {
		return slot3;
	}
	public void setSlot3(LocalTime slot3) {
		this.slot3 = slot3;
	}
	
	
	

}
