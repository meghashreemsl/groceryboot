package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.entity.GroceryEntity;


public interface GroceryService {
	public List<GroceryEntity> getAll();

	public String save(GroceryEntity groceryEntity);

	public String ValidateAndUpdate(GroceryEntity groceryEntity);

	public String ValidateAndDelete(GroceryEntity groceryEntity);
}
