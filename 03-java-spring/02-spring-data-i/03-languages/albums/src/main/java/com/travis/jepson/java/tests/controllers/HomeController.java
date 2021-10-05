package com.travis.jepson.java.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController 
{

	@Autowired
	private AlbumService aService;
	
	// USE THE MODEL TO MAKE THE CONNECTION!
	@GetMapping("/")
	public String index(Model viewModel)
	{
		
	}
	
	@GetMapping("/newAlbum")
	public String index(Model viewModel)
	{
		
	}
	
}
