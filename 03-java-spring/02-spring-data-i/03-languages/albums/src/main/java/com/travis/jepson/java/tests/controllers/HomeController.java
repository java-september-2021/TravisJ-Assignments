package com.travis.jepson.java.tests.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		// GRABES ALL ALBUMS
		return this.aService.getAllAlbums();
	}
	
	// GETS ONE by the id
	// automatically call in the URL typing in the ID
	@GetMapping("/{id}")
	public Album getOne(@PathVariable("id") Long id)
	{
		return this.aService.getOneAlbum(id);
	}
	
	// CREATE ONE
	//
	//
	//  YOu can test this in POSTMAN!
	// click on APIs => GET HTTP request
	// set Local host http://localhost:8080/ then hit => GET with body tab
	// See the data populate
	// Select x-www-form-urlencoded
	// enter all the correct mandatory keys
	// change to => POST and set path to: set Local host http://localhost:8080/create
	// MAKE SURE NAMING CONVENTION MATCHES THIS CASE!!!!! Ex: albumName
	//
	@PostMapping("/create")
//	public Album create(@ModelAttribute("id") Long id)
	//
	//  THIS packages this into an OBJECT and saves to database
	//
	public Album create(Album album)
	{
		return this.aService.createAlbum(album);
	}
	
	@DeleteMapping("/delete/{id}")
	//
	// This is a string because the service returns text on whats deleted
	public String delete(@PathVariable("id") Long id)
	{
		return this.aService.deleteAlbum(id);
	}
	
}
