package com.travis.jepson.java.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.travis.jepson.java.tests.models.Album;
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
	// IE private final String albumName = "l33ts";  this would make the 
	// album name 133ts never be able to be changed
	
	
	// use MODEL to get from back end to front end!
	// this goes through repo, model, database to get and show on index.jsp
	//
	//  THIS IS WHAT WE LOOP THROUGH FOR THE DISPLAY
	//  allAlbums is what we use to access all ATTRIBUTES
	//
	@GetMapping("/")
	public String index(Model viewModel)
		{
			viewModel.addAttribute("allAlbums", this.aService.getAllAlbums());
			return "index.jsp";
		}
	
	// This is how you add an album
	// add.jsp
	@GetMapping("/newalbum")
	public String add()
		{
			return "add.jsp";
		}
								// albumName is the connection on the front end
								// String album is the back end connection
	@PostMapping("/newalbum")  
	public String addNew(@RequestParam("albumName") String album,
						@RequestParam("artistName") String artist,
						@RequestParam("year") Integer year)
		// THIS NEEDS A CONSTRUCTOR IN Album.java to take in this
		//
		Album album = new Album(album, artist, year);
		{
			return "add.jsp";
		}
	
}
