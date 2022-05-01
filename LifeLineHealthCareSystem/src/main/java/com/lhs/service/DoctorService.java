package com.lhs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.dao.DoctorRepo;
import com.lhs.dao.SlotRepo;
import com.lhs.entity.Doctor;
import com.lhs.entity.SlotBooking;

@Service
public class DoctorService {
	

	Doctor doc;
	@Autowired
	DoctorRepo doctorRepo;
	@Autowired
	SlotRepo slotRepo;
	
	public void addingDoc(Doctor doctor)
	{
		
			this.doc=doctorRepo.save(doctor);
		System.out.println(this.doc);
			
		
	}
	public void Addingslot(SlotBooking slot) {
		
		
       System.out.println(this.doc);
    	
    	slot.setDoctor(this.doc);
    	System.out.println(doc);
    	slotRepo.save(slot);
    
	}
	
	
//	public List<Doctor> gettingdoctor(Doctor doc)
//	{
//		
//		 List g=doctorRepo.findBySpecialityAndLocationAndAvailableTime(doc.getSpeciality(),doc.getLocation(),doc.getAvailableTime());
//		
//		return g;
//	}
//	
//	////
//	
//	public void settingSlot(SlotBooking slot)
//	{
//		
//		slot.setDoctor(doctor.getId());
//		slotRepo.save(slot);
//	}
//	
//	
//	
//
//}
}