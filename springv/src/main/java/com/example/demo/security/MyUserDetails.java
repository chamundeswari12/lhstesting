//package com.example.demo.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.User;
//@Service
//public class MyUserDetails implements UserDetailsService {
//	
//	@Autowired
//	UserRepo repository;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		User user=repository.findByusername(username);
//		if(username==null)
//			throw new UsernameNotFoundException("404");
//	
//		return  new UserPrincipal(user);
//	}
//
//}
//	