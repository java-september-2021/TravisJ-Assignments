package com.travis.jepson.java.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
	{
	@RequestMapping("/")
	public String index()
	{
	return "index.jsp";
	}
	
	// CHECK CHECK!!!!!!
	
	 @RequestMapping(value="tellJoke", method=RequestMethod.POST)
	 public String joke(@RequestParam("name") String name, @RequestParam("joke") String joke, Model viewModel)
	 {
		 viewModel.addAttribute("name", name);
		 viewModel.addAttribute("joke", joke);
		 return "joke.jsp";
	 }
	 
	 
	
	// RETYPE ALL QUOTATIONS TO INSURE CODE WORKS
//	@RequestMapping(“/aboutUs”)
//	public String aboutUs()
//	{
//	return “aboutUs.jsp”;
//	}
	
}
