package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

public interface ServiceImpl  {
	 public void addaccount(User user);
	 public List<User> findall();
	 public User findBylastname(String lastname);
		// public User update(User user);

}
