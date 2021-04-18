package com.wolken.wolkenapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.entity.GroceryEntity;
import com.wolken.wolkenapp.repository.GroceryRepo;

@Service
public class GroceryServiceImpl implements GroceryService{
	
	@Autowired
	GroceryRepo groceryRepo;

	@Override
	public List<GroceryEntity> getAll() {
		List<GroceryEntity> groceryList = groceryRepo.findAll(); 
		return groceryList;
	
	}

	@Override
	public String save(GroceryEntity groceryEntity) {
		if(groceryEntity!=null) {
		 groceryRepo.save(groceryEntity);
		 return "data saved";
	}
		return "data is null";
	}

	@Override
	public String ValidateAndUpdate(GroceryEntity groceryEntity) {
		
		GroceryEntity newgroceryEntity= groceryRepo.findByName(groceryEntity.getName());
		//newgroceryEntity.setId(groceryEntity.getId());
		//newgroceryEntity.setName(groceryEntity.getName());
		newgroceryEntity.setPrice(groceryEntity.getPrice());
		newgroceryEntity.setQuantity(groceryEntity.getQuantity());
		if(newgroceryEntity!=null) {
			groceryRepo.save(newgroceryEntity);
			return "update sucessfull";
		}
			return "update unsucessfull";
		
	}

	@Override
	public String ValidateAndDelete(GroceryEntity groceryEntity) {
		if(groceryEntity.getPrice()>1000) {
			groceryRepo.delete(groceryEntity);
			return "deleted";		}
		return "not deleted";
	}

}
