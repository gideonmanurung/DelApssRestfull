package com.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="activity")
public class Activity {
	@Id
	@Column(name="id_activity")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idActivity;
	
	@Column(name="name_activity")
	private String nameActivity;
	
	@Column(name="date_activity")
	private String dateActivity;
	
	@Column(name="place_activity")
	private String placeActivity;
	
	@Column(name="description_activity")
	private String descriptionActivity;
	
	@Column(name="image")
	private String image;
	
	public Activity(){}

	public Activity(int idActivity, String nameActivity, String dateActivity, String placeActivity,
			String descriptionActivity, String image) {
		super();
		this.idActivity = idActivity;
		this.nameActivity = nameActivity;
		this.dateActivity = dateActivity;
		this.placeActivity = placeActivity;
		this.descriptionActivity = descriptionActivity;
		this.image = image;
	}

	public int getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(int idActivity) {
		this.idActivity = idActivity;
	}

	public String getNameActivity() {
		return nameActivity;
	}

	public void setNameActivity(String nameActivity) {
		this.nameActivity = nameActivity;
	}

	public String getDateActivity() {
		return dateActivity;
	}

	public void setDateActivity(String dateActivity) {
		this.dateActivity = dateActivity;
	}

	public String getPlaceActivity() {
		return placeActivity;
	}

	public void setPlaceActivity(String placeActivity) {
		this.placeActivity = placeActivity;
	}

	public String getDescriptionActivity() {
		return descriptionActivity;
	}

	public void setDescriptionActivity(String descriptionActivity) {
		this.descriptionActivity = descriptionActivity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
