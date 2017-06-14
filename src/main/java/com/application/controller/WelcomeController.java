package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.service.DescriptionService;

@Controller
public class WelcomeController {
	@Autowired
	private DescriptionService dService;
	@RequestMapping("/")
	public String welcom(Model model){
		model.addAttribute("descriptions", dService.getAllDescription());
		return "Welcome";
	}
}
