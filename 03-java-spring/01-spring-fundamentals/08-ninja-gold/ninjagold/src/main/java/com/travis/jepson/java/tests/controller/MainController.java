package com.travis.jepson.java.tests.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// THIS IS FOR NINJA GOLD
// THIS IS A CONTROLLER CLASS
// CONTROL + SHIFT + O to add the annotations

@Controller
public class MainController
	{
		@RequestMapping("/")
		public String index()
		{
		return "index.jsp";
		}
		
		@GetMapping("/")		
		public String gold() 
			{
				return "gold.jsp";
			}
		
		// Your post will hardly ever redirect to /
		// its much more secure to put them on another page
		// after redirecting in database
		@PostMapping("/findGold")
			// THIS CHECKS WHAT building is selected name, then the value is specified
			// takes in "building" THEN YOU MUST SAVE IT LOCALLY IN THIS FILE, call it
			// a String building
			public String findGold(@RequestParam("building") String building) 
			{
				return "redirect:/";
			}
		
	}
