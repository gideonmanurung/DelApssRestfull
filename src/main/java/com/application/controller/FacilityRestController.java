package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.FacilityService;
import com.application.model.Facility;

@RestController
@RequestMapping("/facility")
public class FacilityRestController {
	@Autowired
	private FacilityService fService;
	
	@RequestMapping(value = "/all" , method = RequestMethod.POST ,headers="Accept=application/json")
	public List<Facility> getAllFacility(){
		return fService.getFacilities();
	}
}
