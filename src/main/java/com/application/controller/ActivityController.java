package com.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.model.Activity;
import com.application.service.ActivityService;

@Controller
@RequestMapping("/activity")
public class ActivityController {
	@Autowired
	private ActivityService aService;
	
	
	@RequestMapping(value="/all" , method = RequestMethod.GET)
	public String allActivity(Model model){
		List<Activity> activities = new ArrayList<Activity>();
		activities = aService.getAllActivity();
		model.addAttribute("activities", activities);
		return "AllActivity";
	}
	
	@RequestMapping(value="/addActivity", method = RequestMethod.GET)
	public String addFormActivity(Model model){
		model.addAttribute("activity", new Activity());
		return "AddActivity";
	}
	
	@RequestMapping(value="/createNewActivity", method = RequestMethod.POST)
	public String addActivity(Model model, Activity activity){
		model.addAttribute("activity", aService.saveOrUpdateActivity(activity));
		return "redirect:/activity/all";
	}
	
	@RequestMapping(value="/delete/{idActivity}", method = RequestMethod.GET)
	public String deleteActivity(Model model, @PathVariable int idActivity){
		aService.deleteActivity(idActivity);
		return "redirect:/activity/all";
	}
	
	@RequestMapping(value="/edit/{idActivity}", method = RequestMethod.GET)
	public String formEditActivity(Model model, @PathVariable int idActivity){
		model.addAttribute("activity", aService.getAcitvity(idActivity));
		return "EditActivity";
	}
	
	@RequestMapping(value="/edit/{idActivity}", method = RequestMethod.POST)
	public String editActivity(Model model, Activity activity){
		model.addAttribute("activity", aService.saveOrUpdateActivity(activity));
		return "redirect:/activity/all";
	}
}
