package com.validate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.validate.entities.LoginData;

@Controller
public class MyController {
	@GetMapping("/form")
	public String openForm() {
		System.out.println("openForm() method get called");
		return "form";
	}
	
	// Handler for processing form-->
	@PostMapping("/process")
	public String processForm(@Validated @ModelAttribute("LoginData") 
	LoginData loginData ,  BindingResult result) {
		System.out.println(loginData);
		if(result.hasErrors()) {
			System.out.println(result);
			// return "form";
			
		}
		System.out.println(result);
		// model.addAttribute("md", loginData); // this is for sending loginData to view
		return "success";
	}

}
