package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Parents;

//the repository is connected to the model through the jpa
public interface ParentsRepository extends JpaRepository<Parents, Integer>{

}
