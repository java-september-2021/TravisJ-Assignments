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
	private AlbumService aService;  // dependancy injected with aService USE OFTEN
	
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
	
	//
	// This is how you add an album * * * HTML forum * * *
	// add.jsp
	// formerlly newalbum => changed to this for HTML linking
	@GetMapping("/newalbumHTMLadd")
	public String add()
		{
			return "add.jsp";
		}
	
	// THIS WORKED UNTIL ADDING THE JSTL linking
	
	
								// albumName is the connection on the front end
								// String album is the back end connection
								// * * * This is HTML forum!  More effort * * *
								//
				// FORMERLY newalbum
	@PostMapping("/newalbumHTMLadd")  
	public String newalbumHTMLadd(@RequestParam("albumName") String album,  // all params must be added
						@RequestParam("artistName") String artist,
						@RequestParam("year") Integer year)
		// THIS NEEDS A CONSTRUCTOR IN Album.java to take in this
		// See the first one setup after the java bean
		{
		Album albumToSave = new Album(album, artist, year);   // constructor template
		this.aService.createAlbum(albumToSave);
		return "redirect:/";
		}
	
	
	// CHECK IS THIS FOR HTML LINKING OR.... ONLY JVC
	// start of EDITING!
	@GetMapping("/edit/{id}")
	public String editRecord(@PathVariable("id") Long id, @ModelAttribute("album") Album album, Model viewModel)
	{
		viewModel.addAttribute("album", this.aService.getOneAlbum(id));
		return "albumedit.jsp";
	}
	
	// edit continuted....
	// The @Valid and @model then Album MUST BE THE FIRST three ATTRIBUTES
	// THEY MUST BE ORDERED LIKE THIS
	@PostMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("album") Album album, BindingResult result, @PathVariable("id") Long id, Model viewModel)
	{
		if(result.hasErrors())
		{
//			viewModel.addAttribute("album", this.aService.getOneAlbum(id));  DONT NEED THIS
			return "albumedit.jsp";
		}
		this.aService.editAlbum(album);
		return "redirect:/";
	}
	
	
	
	//
	// JSTL forum FORMATTING  => SPRING MVC FORUM
	//
	// Album.java asks whats in it, and this @ModelAttribute just asks for object
	//
	// ModelAttribute name MUST BE DECLARED AND MATCHED as "album"
	
		@GetMapping("/newalbum")
							//     front end--V  type-V    V---back end
		public String add(@ModelAttribute("album") Album album)
			{
				return "add.jsp";
			}
		
		// JSTL Posting 
		@PostMapping("/newalbum")  
		public String newalbum(@Valid  //checks errors
								@ModelAttribute("album")
								Album album,
								BindingResult result)  // this reports errors
			{
				if(result.hasErrors())
				{
					return "add.jsp";
				}
				// IF NO ERRORS THEN THIS IS MADE!
				this.aService.createAlbum(album);
				return "redirect:/";
			}
	
	
}
