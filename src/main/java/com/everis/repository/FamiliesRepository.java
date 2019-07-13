package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Families;


//the repository is connected to the model through the jpa
public interface FamiliesRepository extends JpaRepository<Families, Integer> {

}
