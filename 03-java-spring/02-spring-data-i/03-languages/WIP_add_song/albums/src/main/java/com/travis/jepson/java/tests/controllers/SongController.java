package com.travis.jepson.java.tests.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travis.jepson.java.tests.models.Song;
import com.travis.jepson.java.tests.services.AlbumService;
import com.travis.jepson.java.tests.services.SongService;

@Controller
@RequestMapping("/song")  // THIS ADDS THE SONG PREFIX SO NO MIX UPS
public class SongController 
{
	@Autowired
	private SongService sService;
	
	@Autowired
	private AlbumService aService;
	
	// displays as localhost:8080/song/new
	// call in constructor for the song model from Song.java
	@GetMapping("/createnewsong")
	public String create(@ModelAttribute("song") Song song, Model viewModel)
	{
		viewModel.addAttribute("albums", this.aService.getAllAlbums());
		// REFERENCES the songs FOLDER in WEB-INF
		return "/songs/newsong.jsp";
	}
	// case changed to make it stand out
	@PostMapping("/newsongPosted")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result)
	{
		// CONNECT TO ALBUM ID through the ADDED SONG through the child class connector
		Long idAlbum = song.getAlbumSongIsOn().getId();
		if(result.hasErrors())
		{
			return "songs/newsong.jsp";
		}
		this.sService.createSong(song);
		return "redirect:/" + idAlbum;
	}
}
