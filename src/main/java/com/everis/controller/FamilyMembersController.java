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

import com.everis.model.FamilyMembers;
import com.everis.service.FamilyMembersService;

@RestController
@RequestMapping("/FamilyMembers")


public class FamilyMembersController {
	
	
//our service is instantiated
	
	@Autowired
	FamilyMembersService familyMembersService;

	
//Annotations are used for CRUD methods
	
	@PostMapping("/Save")
	public FamilyMembers save(@RequestBody FamilyMembers familyMembers) throws Exception {
		return familyMembersService.save(familyMembers);
	}

	
	@PutMapping("/Update")
	public FamilyMembers update(@RequestBody FamilyMembers familyMembers) throws Exception {
		return familyMembersService.update(familyMembers);
	}

	
	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable("id") Integer id) throws Exception {
		familyMembersService.delete(id);
	}

	
	@GetMapping("/Get/{id}")
	public Optional<FamilyMembers> get(@PathVariable("id") Integer id) throws Exception {
		return familyMembersService.get(id);
	}

	
	@GetMapping("/Get")
	public List<FamilyMembers> findAll() throws Exception {
		return familyMembersService.findAll(null);

	}
}
