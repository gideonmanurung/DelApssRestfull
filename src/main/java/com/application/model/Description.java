package com.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="description")
public class Description {
	@Id
	@Column(name="id_description")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDescription;
	
	@Column(name="name_description")
	private String nameDescription;
	
	@Column(name="explanation")
	private String explanation;
	
	@Column(name="image")
	private String image;
	
	public Description(){}

	public Description(int idDescription, String nameDescription, String explanation, String image) {
		super();
		this.idDescription = idDescription;
		this.nameDescription = nameDescription;
		this.explanation = explanation;
		this.image = image;
	}

	public int getIdDescription() {
		return idDescription;
	}

	public void setIdDescription(int idDescription) {
		this.idDescription = idDescription;
	}

	public String getNameDescription() {
		return nameDescription;
	}

	public void setNameDescription(String nameDescription) {
		this.nameDescription = nameDescription;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
