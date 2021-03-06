package com.travis.jepson.java.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// FOR EACH OF THESE CLICK ON THE LEFT SIDE THERMOMETER AND HIT:
// > IMPORT REST CONTROLLER

@Controller
public class MainController
	{
	@RequestMapping("/")
	public String index()
	{
	return "index.jsp";
	}
	
	// The /tellJoke comes from the index and /tell joke trigger form action
	 @RequestMapping(value="/tellJoke", method=RequestMethod.POST)
	 					// LOOK for 	name and for 					joke                  ADD MODEL OBJECT
	 public String joke(@RequestParam("name") String name, @RequestParam("joke") String joke, @RequestParam("location") String location, @RequestParam("language") String language, Model viewModel)
	 {
		 viewModel.addAttribute("name", name);  // input name 
		 viewModel.addAttribute("joke", joke);  // joke added in text area
		 										// "key", value
		 										// THis gives Joke.jsp access to both items
		 viewModel.addAttribute("location", location);  // input name 
		 viewModel.addAttribute("language", language); 
		 
		 return "Joke.jsp";
	 }
}
