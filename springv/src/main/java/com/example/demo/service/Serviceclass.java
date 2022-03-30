package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
@Service
public class Serviceclass implements ServiceImpl {
	@Autowired
	UserRepository repo;

	@Override
	public void addaccount(User user) {
         repo.save(user);
		
		
	}
	@Override
	public List<User> findall()
   {
	 return	repo.findAll();
	
		
		
	}
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
	   
	public void AddingRoles(User user)
	{
		//User us=repo.findByRolename(user.getRolename());
	
		
		   Roles r= new Roles();
		  r.setRole(user.getRolename());
		  user.setRole(new ArrayList<>());
		  user.getRole().add(r);
		  repo.save(user);
		   
	}
	
	
	
	
  
	@Override
	public User findBylastname(String lastname) {
		User u=repo.findBylastname(lastname);
		return u;
		
	}
//	@Override
//	public User update(User user) {
//		User Existinguser=repo.findById(user.getId()).orElse(null);
//		Existinguser.setAddress(user.getAddress());
//		Existinguser.setFirstname(user.getFirstname());
//		Existinguser.setLastname(user.getLastname());
//	     return	repo.save(Existinguser);
//	}
	
	
}

	