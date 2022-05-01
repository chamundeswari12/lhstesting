package com.lhs.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lhs.entity.Doctor;

public interface DoctorRepo  extends JpaRepository<Doctor, Integer>{
	
	
	List<Doctor> findBySpecialityAndLocationAndAvailableTime(String doctorName,String Location,Date availableTime);

}
