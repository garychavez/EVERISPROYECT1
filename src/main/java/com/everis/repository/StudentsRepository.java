package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Students;

//the repository is connected to the model through the jpa
public interface StudentsRepository extends JpaRepository<Students, Integer>{

}
