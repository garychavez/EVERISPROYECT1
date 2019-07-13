package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.model.Families;

public interface FamiliesService {

//the CRUD methods are created	
	
	Families save(Families model);

	Families update(Families model);

	void delete(Integer id);

	Optional<Families> get(Integer id);

	List<Families> findAll(Families model);
}
