package com.everis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

//Create my table
@Entity
@Table(name = "Family_Members")


public class FamilyMembers implements Serializable {

	
//The identifier is generated
	private static final long serialVersionUID = 1L;
	
	
//Atributes
	//	primary key	
	@Column(name = "family_members_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public int family_members_id;
	
	@NotBlank
	@Column(name = "parent_or_student_member")
	public String parent_or_student_member;
	
	
	// foreign key
	@ManyToOne
	@JoinColumn(name = "families_id" , referencedColumnName = "families_id")
	private Families families_id;

	// foreign key
	@ManyToOne
	@JoinColumn(name = "parent_id",referencedColumnName = "parent_id")
	private Parents parent_id;
	
	// foreign key
	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private Students student_id;
	
	
//	Generate Getters and Setters
	public int getFamily_members_id() {
		return family_members_id;
	}

	public void setFamily_members_id(int family_members_id) {
		this.family_members_id = family_members_id;
	}

	public String getParent_or_student_member() {
		return parent_or_student_member;
	}

	public void setParent_or_student_member(String parent_or_student_member) {
		this.parent_or_student_member = parent_or_student_member;
	}

	public Families getFamilies_id() {
		return families_id;
	}

	public void setFamilies_id(Families families_id) {
		this.families_id = families_id;
	}

	public Parents getParent_id() {
		return parent_id;
	}

	public void setParent_id(Parents parent_id) {
		this.parent_id = parent_id;
	}

	public Students getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Students student_id) {
		this.student_id = student_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
