package com.travis.jepson.java.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.travis.jepson.java.tests.services.AlbumService;

//
// Made through adding a new => CLASS
// HomeController
//

@Controller
public class HomeController 
{
	@Autowired
	private AlbumService aService;  // dependancy injected with aService
	
	//
	// set as private final if you want a declaration to NEVER be changed
	// IE private final String albumName = "l33ts";
	
	
	// use MODEL to get from back end to front end!
	@GetMapping("/")
	public String index(Model viewModel)
	{
		return "index.jsp";
	}
}
