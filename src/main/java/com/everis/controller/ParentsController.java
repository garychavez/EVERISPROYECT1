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

import com.everis.model.Parents;
import com.everis.service.ParentsService;

@RestController
@RequestMapping("/Parents")


public class ParentsController {

	
//our service is instantiated
	
	@Autowired
	ParentsService parentsService;
	
	
//Annotations are used for CRUD methods
	
	@PostMapping("/Save")
	public Parents Save(@RequestBody Parents parent) throws Exception {		
		return parentsService.save(parent);
	}
	
	
	@PutMapping("/Update")
	public Parents Update(@RequestBody Parents parent) throws Exception {
		return parentsService.update(parent);		
	}
	
	
	@DeleteMapping("/Delete/{id}")
	public void Delete(@PathVariable("id") Integer id) throws Exception {
		 parentsService.delete(id);	
	}
	
	
	@GetMapping("/Get/{id}")
	public Optional<Parents> Get(@PathVariable("id") Integer id) throws Exception {
		return parentsService.get(id);		
	}
	
	
	@GetMapping("/Get")
	public List<Parents> findAll() throws Exception {
		return parentsService.findAll(null);		
	}
	
}
