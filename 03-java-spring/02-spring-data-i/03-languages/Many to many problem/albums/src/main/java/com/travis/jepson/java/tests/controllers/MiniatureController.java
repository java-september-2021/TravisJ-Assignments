package com.travis.jepson.java.tests.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travis.jepson.java.tests.models.Album;
import com.travis.jepson.java.tests.models.Miniature;
import com.travis.jepson.java.tests.services.AlbumService;
import com.travis.jepson.java.tests.services.MiniatureService;

@Controller
@RequestMapping("/miniatures")  // THIS ADDS THE miniature PREFIX SO NO MIX UPS
public class MiniatureController 
{
	@Autowired
	private MiniatureService mService;

	@Autowired
	private AlbumService aService;
	
	// displays as localhost:8080/miniature/new
	// call in constructor for the miniature model from Miniature.java
	//  REMEMBER ANYTHING HERE HAS THE PREFIX /miniature always add it
	
	@GetMapping("/createnewminiature")  // +/miniature
	public String create(@ModelAttribute("miniature") Miniature miniature, Model viewModel)
	{
		viewModel.addAttribute("albums", this.aService.getAllAlbums());  //allows albums to be accessed for the list
		// REFERENCES the miniatures FOLDER in WEB-INF
		return "/miniatures/newminiature.jsp";
	}
	// case changed to make it stand out
	@PostMapping("/newminiaturePosted")  // +/miniatures
	// ADDING VIEW MODEL IN CASE OF ERROR!?!?
	public String addMiniature(@Valid @ModelAttribute("miniature") Miniature miniature, BindingResult result, Model viewModel)
	{
		// CONNECT TO ALBUM ID through the ADDED MINIATURE through the child class connector
		Long idAlbum = miniature.getAlbumMiniatureIsOn().getId();
		if(result.hasErrors())
		{
			viewModel.addAttribute("miniatures", this.aService.getAllAlbums());
			return "/miniatures/newminiature.jsp";    //is this the issue/?  ^^
		}
		this.mService.createMiniature(miniature);
		return "redirect:/album_details/" + idAlbum;
	}
	
	// ADDED
	@GetMapping("/edit/{id}")
	public String editMiniature(@PathVariable("id") Long id, @ModelAttribute("miniature") Miniature miniature, Model viewModel)
	{
		viewModel.addAttribute("miniature", this.mService.getOneMiniature(id));
		return "/miniatures/editminiature.jsp";
	}
	
	
	@PostMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("miniature") Miniature miniature, BindingResult result, @PathVariable("id") Long id, Model viewModel)
	{
		if(result.hasErrors())
		{
			return "/miniatures/editminiature.jsp";
		}
		this.mService.editMiniature(miniature);
		return "redirect:/homepage";
	}
}
