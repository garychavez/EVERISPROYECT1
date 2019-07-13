package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.model.Students;

public interface StudentsService {

//the CRUD methods are created	
	
	Students save(Students model);

	Students update(Students model);
	
	void delete(Integer id);

	Optional<Students> get(Integer id);

	List<Students> findAll(Students model);
}
