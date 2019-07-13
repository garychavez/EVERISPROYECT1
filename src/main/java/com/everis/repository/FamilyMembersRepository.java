package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.FamilyMembers;

//the repository is connected to the model through the jpa
public interface FamilyMembersRepository extends JpaRepository<FamilyMembers, Integer> {

}
