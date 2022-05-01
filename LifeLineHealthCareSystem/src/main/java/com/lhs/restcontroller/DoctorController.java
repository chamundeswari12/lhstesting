package com.lhs.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lhs.entity.Doctor;
import com.lhs.entity.SlotBooking;
import com.lhs.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	//Adding the doctors
	@PostMapping("/addingdoctor")
	public ResponseEntity<String> addingDoctor(@RequestBody Doctor doc)
	{
		
		
		
		  doctorService.addingDoc(doc);
		return  new ResponseEntity<String>(" doctor added successfuly with the name"+doc.getDoctorName(),HttpStatus.OK);
		
		
	}
	

	
	@PostMapping("/addingslot")
	public ResponseEntity<String> addingDoctor(@RequestBody SlotBooking slot)
	{
		  doctorService.Addingslot(slot);
	
	     return new ResponseEntity<String>(HttpStatus.OK);
	
	}
	
	
//	//getting all doctors based on the speciality and location and availabletime
//		@GetMapping("/geetingdoctors")
//		
//		public List gettingDoctorBasedonspeciality(@RequestBody Doctor doc){
//			
//		 List f=doctorService.gettingdoctor(doc);	
//		 return f;	
//		}
	
//	
//	
//	
//	
//	

}
