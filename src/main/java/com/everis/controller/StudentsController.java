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


import com.everis.model.Students;
import com.everis.service.StudentsService;

@RestController
@RequestMapping("/Students")


public class StudentsController {
	
	
//our service is instantiated
	@Autowired
	StudentsService studentsService;

	
//Annotations are used for CRUD methods
	
	@PostMapping("/Save")
	public Students save(@RequestBody Students students) {
		return studentsService.save(students);
	}

	
	@PutMapping("/Update")
	public Students update(@RequestBody Students students) {
		return studentsService.update(students);
	}

	
	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		studentsService.delete(id);
	}

	
	@GetMapping("/Get/{id}")
	public Optional<Students> get(@PathVariable("id") Integer id) {
		return studentsService.get(id);
	}

	
	@GetMapping("/Get")
	public List<Students> findAll() {
		return studentsService.findAll(null);

	}
}
