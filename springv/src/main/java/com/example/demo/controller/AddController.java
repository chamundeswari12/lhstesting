package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.Serviceclass;

@RestController
//@RequestMapping("/")
public class AddController {
	
	
	
	
	
    @Autowired
    Serviceclass  service;
    
    //Adding account
    @PostMapping("/add")
	public void addingaccount(@RequestBody User user) {
	service.AddingRoles(user);
		
	}
    
    
    //for Getting all Accounts
    @GetMapping("/getall")
   	public List<User> getall(){
   		return service.findall();
   		}
       
      //for Deleting by id
       @DeleteMapping("/del/{id}")
       public String delete(@PathVariable("id")Long id)
       {
       	service.delete(id);
       			return "delete Successfulyy";
       }
       
       // for geeting account based on the lastname
       
    @GetMapping("/getting/{lastname}")
    public  User findingAll(@PathVariable("lastname") String lastname)
    {
    	 User users=service.findBylastname(lastname);
    	return  users;
    }
//   @PutMapping("/up")
//    public String updateall(@RequestBody User lastname)
//   {
//    service.update(lastname);
//     return "update successfully";
//    }
  
	

}
