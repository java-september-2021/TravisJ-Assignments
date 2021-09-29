package com.travis.jepson.java.tests.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// THIS IS FOR NINJA GOLD

@Controller
public class MainController
	{
		@RequestMapping("/")
		public String index()
		{
		return "index.jsp";
		}
		// INDEX is our GOLD.jsp
		
		// THIS IS MUCH FASRER THAN THE REQUEST MAPPING VARs
		@GetMapping("/")
		{
			public String gold() 
			{
				return "gold.jsp"
			}
		}
		
		
		// Your post will harly ever redirect to /
		@PostMapping("/findGold")
		{
			public String findGold() 
			{
				return "redirect:/"
			}
		}
	}
