package com.wolken.wolkenapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenapp.entity.GroceryEntity;

public interface GroceryRepo extends JpaRepository<GroceryEntity, Integer> {

	public GroceryEntity findByName(String name);
	
}
