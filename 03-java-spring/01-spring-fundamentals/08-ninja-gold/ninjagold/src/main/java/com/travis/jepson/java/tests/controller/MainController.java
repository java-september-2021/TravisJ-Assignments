package com.travis.jepson.java.tests.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		// USE viewModel to get from back end to front end
		// KEY and VALUE
		// THIS MODEL ONLY WORKS FOR gold.jsp
		//
		// SESSION stores info on users computer its a Global Hashmap
		@GetMapping("/")		
		public String gold(Model viewModel) 
			{
				// USED in c tag h2 => REFERENCED as USER
				viewModel.addAttribute("user", "Sir Matt");
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
