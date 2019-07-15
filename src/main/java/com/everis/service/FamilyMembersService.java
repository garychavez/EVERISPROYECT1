package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.model.FamilyMembers;

public interface FamilyMembersService {

//the CRUD methods are created	
	
	FamilyMembers save(FamilyMembers model) throws Exception;

	FamilyMembers update(FamilyMembers model) throws Exception;

	void delete(Integer id) throws Exception;

	Optional<FamilyMembers> get(Integer id) throws Exception;

	List<FamilyMembers> findAll(FamilyMembers model)throws Exception ;
}
