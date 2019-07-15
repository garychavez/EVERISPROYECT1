package com.everis.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;

//Create my table
@Entity
@Table  (name = "Parents")


public class Parents  implements Serializable{
	

//The identifier is generated
	private static final long serialVersionUID = 1L;
	
	
//Atributes
		//	primary key	
		
		
		@Column(name = "parent_Id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private int parent_id;
		
		 @ManyToMany(cascade = { CascadeType.ALL })
		    @JoinTable(
		        name = "Student_Parents", 
		        joinColumns = { @JoinColumn(name = "parent_id", referencedColumnName = "parent_id") }, 
		        inverseJoinColumns = { @JoinColumn(name = "student_id", referencedColumnName = "student_id") }
		    )
		private Set<Students> students = new HashSet<>();
		
		
		
		
		
		@Column(name = "gender",nullable=false, length = 20)
		@NotBlank
		private String gender;
		
		@Column(name = "first_name")
		@NotBlank
		private String first_name;
		
		@Column(name = "middle_name" )
		@NotBlank
		private String middle_name;
		
		@Column(name = "last_name"  )
		@NotBlank
		private String last_name;
		
		@Column(name = "other_parent_details" )
	@NotBlank
		private String other_parent_details;
	

//		Generate Getters and Setters		
	public int getParent_id() {
			return parent_id;
		}
		public void setParent_id(int i) {
			this.parent_id = i;
		}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getOther_parent_details() {
		return other_parent_details;
	}
	public void setOther_parent_details(String other_parent_details) {
		this.other_parent_details = other_parent_details;
	}
	
	
}
