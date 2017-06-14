package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.ActivityService;
import com.application.model.Activity;

@RestController
@RequestMapping("/activity")
public class ActivityRestController {
	@Autowired
	private ActivityService aService;
	
	@RequestMapping(value = "/all" , method = RequestMethod.POST , headers="Accept=application/json")
	public List<Activity> getAllActivity(){
		return aService.getAllActivity();
	}
}
