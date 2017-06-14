package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Description;
import com.application.service.DescriptionService;

@RestController
@RequestMapping("/description")
public class DescriptionRestController {
	@Autowired
	private DescriptionService dService;
	
	@RequestMapping(value = "/all" , method = RequestMethod.POST , headers="Accept=application/json")
	public List<Description> getAllDescription(){
		return dService.getAllDescription();
	}
}
