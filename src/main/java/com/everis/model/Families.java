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
@Table(name = "Families")


public class Families implements Serializable {

	
//The identifier is generated
	private static final long serialVersionUID = 1L;

	
//Atributes
//	primary key
	@Column(name = "families_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int families_id;

	// foreign key
	@ManyToOne
	@JoinColumn(name = "head_of_family_parents_id", referencedColumnName = "parent_id")
	private Parents parent_id;

	@Column(name = "family_name")
	@NotBlank
	private String family_name;

	
//	Generate Getters and Setters
	public int getFamilies_id() {
		return families_id;
	}

	public void setFamilies_id(int families_id) {
		this.families_id = families_id;
	}

	public Parents getParent_id() {
		return parent_id;
	}

	public void setParent_id(Parents parent_id) {
		this.parent_id = parent_id;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
