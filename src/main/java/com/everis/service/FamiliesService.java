package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.model.Families;

public interface FamiliesService {

//the CRUD methods are created	
	
	Families save(Families model) throws Exception;

	Families update(Families model)throws Exception ;

	void delete(Integer id) throws Exception;

	Optional<Families> get(Integer id) throws Exception;

	List<Families> findAll(Families model) throws Exception;
}
