package com.travis.jepson.java.tests.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travis.jepson.java.tests.models.Album;
import com.travis.jepson.java.tests.services.AlbumService;


//
// Create a new CLASS for this file
//
//
// The RestController makes this an API
//
// You must connect to your .services files
//
@RestController
public class HomeController 
{
	// Naming convention to link to the .services file
	@Autowired
	private AlbumService aService;
	
	// USE THE MODEL TO MAKE THE CONNECTION!
	// THIS IS AN API so this returns a *** LIST NOT A STRING ***
	//
	//  This is a rest controller setup recieves info from the server
	@GetMapping("/")
	public List<Album> index()
	{
		// THIS IS HOW WE LINK TO THE FRONT END as * * JSON * *
		return this.aService.getAllAlbums();
	}
	
	@GetMapping("/newAlbum")
	public String index(Model viewModel)
	{
		
	}
	
}
