package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.model.FamilyMembers;

public interface FamilyMembersService {

//the CRUD methods are created	
	
	FamilyMembers save(FamilyMembers model);

	FamilyMembers update(FamilyMembers model);

	void delete(Integer id);

	Optional<FamilyMembers> get(Integer id);

	List<FamilyMembers> findAll(FamilyMembers model);
}
