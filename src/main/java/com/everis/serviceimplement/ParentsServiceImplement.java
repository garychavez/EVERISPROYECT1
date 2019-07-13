package com.everis.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.model.Parents;
import com.everis.repository.ParentsRepository;
import com.everis.service.ParentsService;

@Service
public class ParentsServiceImplement implements ParentsService {
	
//the repository is instantiated
	@Autowired
	private ParentsRepository parentsRepository;

	
//the logic to the CRUD methods is implemented
	// Method save
	@Override
	public Parents save(Parents model) {
		return parentsRepository.save(model);
	}

	// Method Update
	@Override
	public Parents update(Parents model) {
		return parentsRepository.save(model);
	}

	// Method Delete
	@Override
	public void delete(Integer id) {
		parentsRepository.deleteById(id);
	}

	// Method Get
	// for Id
	@Override
	public Optional<Parents> get(Integer id) {
		return parentsRepository.findById(id);
	}

	// For All
	@Override
	public List<Parents> findAll(Parents model) {
		return parentsRepository.findAll();
	}


}
