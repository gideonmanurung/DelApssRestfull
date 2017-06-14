package com.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facility")
public class Facility {
	@Id
	@Column(name="id_facility")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFacility;
	
	@Column(name="name_facility")
	private String nameFacility;
	
	@Column(name="description_facility")
	private String descriptionFacility;
	
	@Column(name="image")
	private String image;

	public Facility(){}

	public Facility(int idFacility, String nameFacility, String descriptionFacility, String image) {
		super();
		this.idFacility = idFacility;
		this.nameFacility = nameFacility;
		this.descriptionFacility = descriptionFacility;
		this.image = image;
	}



	public int getIdFacility() {
		return idFacility;
	}

	public void setIdFacility(int idFacility) {
		this.idFacility = idFacility;
	}

	public String getNameFacility() {
		return nameFacility;
	}

	public void setNameFacility(String nameFacility) {
		this.nameFacility = nameFacility;
	}

	public String getDescriptionFacility() {
		return descriptionFacility;
	}

	public void setDescriptionFacility(String descriptionFacility) {
		this.descriptionFacility = descriptionFacility;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
