package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.model.Facility;
import com.application.service.FacilityService;

@Controller
@RequestMapping("/facility")
public class FacilityController {
	@Autowired
	private FacilityService fService;
	
	@RequestMapping(value="/all" , method = RequestMethod.GET)
	public String allFacility(Model model){
		List<Facility> facilities = fService.getFacilities();
		model.addAttribute("facilities", facilities);
		return "AllFacility";
	}
	
	@RequestMapping(value="/addFacility", method = RequestMethod.GET)
	public String addFormFacility(Model model){
		model.addAttribute("facility", new Facility());
		return "AddFacility";
	}
	
	@RequestMapping(value="/createNewFacility", method = RequestMethod.POST)
	public String addFacility(Model model, Facility facility){
		model.addAttribute("facility", fService.saveOrUpdateFacility(facility));
		return "redirect:/facility/all";
	}
	
	@RequestMapping(value="/delete/{idFacility}", method = RequestMethod.GET)
	public String deleteFacility(Model model , @PathVariable int idFacility){
		fService.deleteFacility(idFacility);
		return "redirect:/facility/all";
	}
	
	@RequestMapping(value="/edit/{idFacility}", method = RequestMethod.GET)
	public String formEditFacility(Model model , @PathVariable int idFacility){
		model.addAttribute("facility", fService.getFacility(idFacility));
		return "EditFacility";
	}
	
	@RequestMapping(value="/edit/{idFacility}", method = RequestMethod.POST)
	public String editFacility(Model model , Facility facility){
		model.addAttribute("facility", fService.saveOrUpdateFacility(facility));
		return "redirect:/facility/all";
	}
}
