package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Facility;
import com.application.repository.FacilityRepository;
import com.application.service.FacilityService;

@Service
public class FacilityServiceImpl implements FacilityService{
	@Autowired
	private FacilityRepository fRepository;

	@Override
	public Facility getFacility(int idFacility) {
		return fRepository.findOne(idFacility);
	}

	@Override
	public void deleteFacility(int idFacility) {
		fRepository.delete(idFacility);
	}

	@Override
	public Facility saveOrUpdateFacility(Facility facility) {
		return fRepository.save(facility);
	}

	@Override
	public List<Facility> getFacilities() {
		return fRepository.findAll();
	}
	
	
}
