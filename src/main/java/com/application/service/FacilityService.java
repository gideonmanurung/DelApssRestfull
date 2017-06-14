package com.application.service;

import java.util.List;

import com.application.model.Facility;

public interface FacilityService {
	public Facility getFacility(int idFacility);
	public void deleteFacility(int idFacility);
	public Facility saveOrUpdateFacility(Facility facility);
	public List<Facility> getFacilities();
}
