package com.wolken.wolkenapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.entity.GroceryEntity;
import com.wolken.wolkenapp.service.GroceryService;

@RestController
@RequestMapping("/")
public class GroceryResource {
	
	@Autowired
	GroceryService groceryService;
	
	@GetMapping("/getAll")
	public List<GroceryEntity> getAll(){
		return groceryService.getAll();
	}
	
	@PostMapping("/saveAll")
	public String save(@RequestBody GroceryEntity groceryEntity) {
		return groceryService.save(groceryEntity);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody GroceryEntity groceryEntity) {
		return groceryService.ValidateAndUpdate(groceryEntity);
		
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody GroceryEntity groceryEntity) {
		return groceryService.ValidateAndDelete(groceryEntity);
	}

}
