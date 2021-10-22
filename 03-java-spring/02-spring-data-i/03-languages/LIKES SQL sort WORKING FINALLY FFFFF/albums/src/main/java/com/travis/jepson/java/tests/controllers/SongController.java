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
import com.travis.jepson.java.tests.models.Song;
import com.travis.jepson.java.tests.services.AlbumService;
import com.travis.jepson.java.tests.services.SongService;

@Controller
@RequestMapping("/songs")  // THIS ADDS THE SONG PREFIX SO NO MIX UPS
public class SongController 
{
	@Autowired
	private SongService sService;
	//Needs access here too
	@Autowired
	private AlbumService aService;
	
	// displays as localhost:8080/song/new
	// call in constructor for the song model from Song.java
	//  REMEMBER ANYTHING HERE HAS THE PREFIX /song always add it
	
	@GetMapping("/createnewsong")  // +/songs
	public String create(@ModelAttribute("song") Song song, Model viewModel)
	{
		viewModel.addAttribute("albums", this.aService.getAllAlbums());
		// REFERENCES the songs FOLDER in WEB-INF
		return "/songs/newsong.jsp";
	}
	// case changed to make it stand out
	@PostMapping("/newsongPosted")  // +/songs
	// ADDING VIEW MODEL IN CASE OF ERROR!?!?
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result, Model viewModel)
	{
		// CONNECT TO ALBUM ID through the ADDED SONG through the child class connector
		Long idAlbum = song.getAlbumSongIsOn().getId();
		if(result.hasErrors())
		{
			viewModel.addAttribute("albums", this.aService.getAllAlbums());
			return "/songs/newsong.jsp";    //is this the issue/?  ^^
		}
		this.sService.createSong(song);
		return "redirect:/album_details/" + idAlbum;
	}
	
	// ADDED
	@GetMapping("/edit/{id}")
	public String editSong(@PathVariable("id") Long id, @ModelAttribute("song") Song song, Model viewModel)
	{
		viewModel.addAttribute("song", this.sService.getOneSong(id));
		return "/songs/editsong.jsp";
	}
	
	
	@PostMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("song") Song song, BindingResult result, @PathVariable("id") Long id, Model viewModel)
	{
		if(result.hasErrors())
		{
			return "/songs/editsong.jsp";
		}
		this.sService.editSong(song);
		return "redirect:/homepage";
	}
}
