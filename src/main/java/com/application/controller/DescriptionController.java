package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.model.Description;
import com.application.service.DescriptionService;

@Controller
@RequestMapping("/description")
public class DescriptionController {
	@Autowired
	private DescriptionService dService;
	
	@RequestMapping(value="/all" , method = RequestMethod.GET)
	public String allDescription(Model model){
		List<Description> descriptions = dService.getAllDescription();
		model.addAttribute("descriptions", descriptions);
		return "AllDescription";
	}
	
	@RequestMapping(value="/addDescription" , method = RequestMethod.GET)
	public String addFormDescription(Model model){
		model.addAttribute("description", new Description());
		return "AddDescription";
	}
	
	@RequestMapping(value="/createNewDescription" , method = RequestMethod.POST)
	public String addDescription(Model model , Description description){
		model.addAttribute("description", dService.saveOrUpdateDescription(description));
		return "redirect:/description/all";
	}
	
	@RequestMapping(value="/edit/{idDescription}", method = RequestMethod.GET)
	public String formEditActivity(Model model, @PathVariable int idDescription){
		model.addAttribute("description", dService.getDescription(idDescription));
		return "EditDescription";
	}
	
	@RequestMapping(value="/edit/{idDescription}", method = RequestMethod.POST)
	public String editActivity(Model model, Description description){
		model.addAttribute("description", dService.saveOrUpdateDescription(description));
		return "redirect:/description/all";
	}
	
	@RequestMapping(value="/delete/{idDescription}", method = RequestMethod.GET)
	public String deleteDescription(Model model, @PathVariable int idDescription){
		dService.deleteDescription(idDescription);
		return "redirect:/description/all";
	}
}
