package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.model.FamilyMembers;
import com.everis.repository.FamilyMembersRepository;
import com.everis.service.FamilyMembersService;

@Service
public class FamiliesMembersServiceImplement implements FamilyMembersService{
	
	
//the repository is instantiated
	@Autowired
	private FamilyMembersRepository familyMembersRepository;

	
//the logic to the CRUD methods is implemented
	// Method save
	@Override
	public FamilyMembers save(FamilyMembers model) {
		return familyMembersRepository.save(model);
	}
	
	// Method Update
	@Override
	public FamilyMembers update(FamilyMembers model) {
		return familyMembersRepository.save(model);
	}

	// Method Delete
	@Override
	public void delete(Integer id) {
		familyMembersRepository.deleteById(id);
		
	}

	// Method Get
	// for Id
	@Override
	public Optional<FamilyMembers> get(Integer id) {
		return familyMembersRepository.findById(id);
	}
	
	// For All
	@Override
	public List<FamilyMembers> findAll(FamilyMembers model) {
		return familyMembersRepository.findAll();
	}

}
