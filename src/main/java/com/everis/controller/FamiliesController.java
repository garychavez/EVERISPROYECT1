package com.everis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.Families;
import com.everis.service.FamiliesService;

@RestController
@RequestMapping("/Families")


public class FamiliesController {
	

//our service is instantiated
	
	@Autowired
	FamiliesService familiesService;
	

//Annotations are used for CRUD methods
	
	@PostMapping("/Save")
	public Families save(@RequestBody Families families) {
		return familiesService.save(families);		
	}
	
	
	@PutMapping("/Update")
	public Families update(@RequestBody Families families) {
		return familiesService.update(families);
	}
	
	
	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable("id") Integer id ){
		familiesService.delete(id);;
	}
	
	
	@GetMapping("/Get/{id}")
	public Optional<Families> get(@PathVariable("id") Integer id ){
		return familiesService.get(id);
	}
	
	
	@GetMapping("/Get")
	public List<Families> findAll(){
		return familiesService.findAll(null);
		
	}

	
}
