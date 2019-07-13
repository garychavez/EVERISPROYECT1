package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.model.Parents;

public interface ParentsService {

//the CRUD methods are created	
	
	Parents save(Parents model);

	Parents update(Parents model);

	void delete(Integer id);
	
	Optional<Parents> get(Integer id);

	List<Parents> findAll(Parents model);
}
