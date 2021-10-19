package com.travis.jepson.java.tests.controllers;

import javax.servlet.http.HttpSession;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.travis.jepson.java.tests.models.Album;
import com.travis.jepson.java.tests.models.User;
import com.travis.jepson.java.tests.services.AlbumService;
import com.travis.jepson.java.tests.services.SongService;
import com.travis.jepson.java.tests.services.UserService;
import com.travis.jepson.java.tests.validators.UserValidator;

//
// Made through adding a new => CLASS
// HomeController
//

@Controller
public class HomeController 
{
	@Autowired
	private AlbumService aService;  // dependancy injected with aService USE OFTEN
	
	// Allow for login and REG
	@Autowired
	private UserService uService;
	
	@Autowired
	private SongService sService;
	
	@Autowired
	private UserValidator userAccountValidator;
	//
	// set as private final if you want a declaration to NEVER be changed
	// IE private final String albumName = "l33ts";  this would make the 
	// album name 133ts never be able to be changed
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	// INITIAL LOGIN - WEBSITE LOGIN
		// needs all available users to allow them to log in
		// connects to uService and gets all the users
		// NOW THIS PAGE TAKES IN MODEL ATTRIBUTE
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user)
		{							
			return "landing.jsp";
		}
	
	// connects to the JSTL form on landing
	// works with the UserService bcrypt
	@PostMapping("/registerNewUser")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session)
	{
		userAccountValidator.validateUser(user, result);  // checks UserValidator.java
		if(result.hasErrors())
		{
			return "landing.jsp";
		}					// in UserService VV
		User newUserSigningUp = this.uService.registerNewUser(user);  // saves in DB, now has primary key
		session.setAttribute("user__id", newUserSigningUp.getId());
		return "redirect:/homepage"; 
	}
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	
	
	// use MODEL to get from back end to front end!
	// this goes through repo, model, database to get and show on index.jsp
	//
	//  THIS IS WHAT WE LOOP THROUGH FOR THE DISPLAY
	//  allAlbums is what we use to access all ATTRIBUTES
	//	
	//  THIS IS THE NEW HOMEPAGE
	//
	//	THE POSTMAPPING ALLOWS FOR THE LOGIN AND SESSION TO BE LINKED
	//
	@PostMapping("/userLogin")		// THIS IS DEFINED ON THE landing.jsp VV then same as the Long id attribute
	public String login(HttpSession session, 
			@RequestParam("login_email") String email,
			@RequestParam("login_password") String password,
			RedirectAttributes redirectAtter)
	{
		if(!this.uService.authenticateUser(email, password))
		{
			redirectAtter.addFlashAttribute("loginError", "Invalid Credentials.");
			return "redirect:/";
		}
		// THIS CHECKS CREDS => error loginError is defined on the <p> tag
		User userToBeLoggedIn = this.uService.getUserByEmailCheck(email);
		session.setAttribute("user__id", userToBeLoggedIn.getId());  // ***  REMEMBER SESSION ID is different then user.id  ***
		return "redirect:/homepage";  //ONCE CHECK IS COMPLETE THROUGH @PostMapping User login call out the /homepage to actually take them there
	}
	
	// Log user out
	@GetMapping("/userlogoff")
	public String logout(HttpSession session)
		{					
			session.invalidate();
			//     Make a logout page eventually, "You have logged off successfully."         
			return "redirect:/";
		}
	
	// THis is now primarially called through redirects
	// only real change is from / to /homepage and it gets the all albums part
	//
	// THIS STATE IS THE USER LOGGED IN => THIS IS CALLED userLoggedIn
	@GetMapping("/homepage")
	public String landing(Model viewModel, HttpSession session)
		{					
			// NOW WE MUST PROTECT THE LOGIN PAGE FROM UNWANTED PPL
			// this protects from unregistered users
			if(session.getAttribute("user__id") == null)
			{
				return "redirect:/";  // if cred fails return to main page *** ALL THROUGH SESSION ***
			}
			//                         V userLoggedIn.attribute from User.java  V-- Dont forget long         
			viewModel.addAttribute("userLoggedIn", this.uService.getOneUser((Long)session.getAttribute("user__id")));   // THIS WILL HELP UI display logged in User.java class attributes
			viewModel.addAttribute("allAlbums", this.aService.getAllAlbums());
			viewModel.addAttribute("allSongs", this.sService.getAllSongs());  // ADD SO YOU CAN HAVE TOTAL SONGS
			return "index.jsp";
		}
	
	
	// Add a LIKE => USER => LIKES => Album
	@GetMapping("/like/{id}")
	public String albumLike(@PathVariable("id") Long id, HttpSession session)
	{															//	user session id V
		User userToLikeAlbum = this.uService.getOneUser((Long)session.getAttribute("user__id"));
		Album albumToLike = this.aService.getOneAlbum(id);
		// ADD THIS IN ALBUM SERVICE
		// check album service for these variables
		this.aService.likeAlbum(userToLikeAlbum, albumToLike);
		return "redirect:/homepage";
	}
	
	// Removes a LIKE => USER => UNLIKE => Album
	@GetMapping("/unlike/{id}")
	public String albumUnlike(@PathVariable("id") Long id, HttpSession session)
	{															//	user session id V
		User userToLikeAlbum = this.uService.getOneUser((Long)session.getAttribute("user__id"));
		Album albumToUnlike = this.aService.getOneAlbum(id);
		// ADD THIS IN ALBUM SERVICE
		// check album service for these variables
		this.aService.unlikeAlbum(userToLikeAlbum, albumToUnlike);   //THis removes
		return "redirect:/homepage";
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
		return "redirect:/homepage";
		}
	
	
	// CHECK IS THIS FOR HTML LINKING OR.... ONLY JVC
	// start of EDITING!
	@GetMapping("/edit/{id}")
	public String editRecord(@PathVariable("id") Long id, @ModelAttribute("album") Album album, Model viewModel)
	{
		viewModel.addAttribute("album", this.aService.getOneAlbum(id));
		return "albumedit.jsp";
	}
	
	// EDIT ALBUMS continuted....  
	// The @Valid and @model then Album MUST BE THE FIRST three ATTRIBUTES
	// THEY MUST BE ORDERED LIKE THIS
	//
	// IS THIS PUT OR POST MAPPING?!
	
	@PostMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("album") Album album, BindingResult result, @PathVariable("id") Long id, Model viewModel)
	{
		if(result.hasErrors())
		{
//			viewModel.addAttribute("album", this.aService.getOneAlbum(id));  DONT NEED THIS
			return "albumedit.jsp";
		}
		this.aService.editAlbum(album);
		return "redirect:/homepage";
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
				return "redirect:/homepage";
			}
		
		// THIS LINKS THE DETAIL PAGE FOR ALBUMS
		// ALSO ALLOWS FOR SONGS TO BE LINKED!!!!
		//
		//  albumDetails.albumName FOR EXAMPLE
		//
		//
		// album details = KEY  //  value = ID
		// this shows the album details
		// remember the aService links => getOneAlbum => connects us
		// takes in ID => stores in Long id,
		@GetMapping("/album_details/{id}")
		public String show(@PathVariable("id") Long id, Model viewModel)
		{
			// albumDetails.VAR is how you call this on the albumdetails.jsp
			viewModel.addAttribute("albumDetails", this.aService.getOneAlbum(id));
			return "albumdetails.jsp";
		}
	
}
