package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.model.Families;
import com.everis.repository.FamiliesRepository;
import com.everis.service.FamiliesService;

@Service
public class FamiliesServiceImplement implements FamiliesService {
	
	
//the repository is instantiated
	@Autowired
	private FamiliesRepository familiesRepository;

	
//the logic to the CRUD methods is implemented	
	// Method save
	@Override
	public Families save(Families model) {
		return familiesRepository.save(model);
	}

	// Method Update
	@Override
	public Families update(Families model) {
		return familiesRepository.save(model);
	}

	// Method Delete
	@Override
	public void delete(Integer id) {
	familiesRepository.deleteById(id);

	}

	// Method Get
	// for Id
	@Override
	public Optional<Families> get(Integer id) {
		return familiesRepository.findById(id);
	}

	// For All
	@Override
	public List<Families> findAll(Families model) {
		return familiesRepository.findAll();
	}

}
