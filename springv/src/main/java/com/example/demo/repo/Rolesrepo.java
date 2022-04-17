package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Roles;

public interface Rolesrepo extends JpaRepository<Roles, Integer> {
	
	//Roles FindByRole(String role);


}
