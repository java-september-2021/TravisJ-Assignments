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
	// this goes through repo, model, database to get and show on index.jsp
	//
	//  THIS IS WHAT WE LOOP THROUGH FOR THE DISPLAY
	//
	@GetMapping("/")
	public String index(Model viewModel)
	{
		viewModel.addAttribute("allAlbums", this.aService.getAllAlbums());
		return "index.jsp";
	}
}
