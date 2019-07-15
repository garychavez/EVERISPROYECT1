package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.model.Parents;

public interface ParentsService {

//the CRUD methods are created	
	
	Parents save(Parents model)throws Exception ;

	Parents update(Parents model)throws Exception ;

	void delete(Integer id) throws Exception;
	
	Optional<Parents> get(Integer id)throws Exception ;

	List<Parents> findAll(Parents model)throws Exception ;
}
