package com.lhs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lhs.entity.SlotBooking;

public interface SlotRepo extends JpaRepository<SlotBooking, Integer> {

}
