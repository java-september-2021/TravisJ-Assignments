package com.travis.jepson.java.tests.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travis.jepson.java.tests.models.Album;
import com.travis.jepson.java.tests.models.User;
import com.travis.jepson.java.tests.repositories.AlbumRepository;

//
// CREATE THIS AS A => new Class
//
// THIS CONNECTS TO OUR Repository

@Service
public class AlbumService 
{
	// ADD Autowired to AUTOMATICALLY LINK
	@Autowired
	private AlbumRepository aRepo; 
	
	// The manual declare all parts way VV
	//
	// WE MUST CONNECT the repository with the service
	// this is called a DEPENDANCY INJECTION this gives all access
	
	// the naming convention is typically the first letter lower case followed by Repo
	// hence aRepo (This is the ** DESCRIPTOR **)
	//		private AlbumRepository aRepo;  // THEN ADD A CONSTRUCTOR BELOW
	//		public AlbumService(AlbumRepository repository)
	//		{
	//			this.aRepo = repository;  // THIS GIVES ACCESS TO ANYTHING IN AlbumRepository
	//		}
	
	// METHODS
	//
	// Get all albums from the database and return as an array list
	//
	// ALWAYS use Java.Util
	public List<Album> getAllAlbums()
	{
		return this.aRepo.findAll();	// uses the aRepo to connect
	}
	
	// Get one album from the database and return as an array list
		//
		// ALWAYS connects by our LONG declared id var
	public Album getOneAlbum(Long id)
	{
		// This is called an "optional" it either exists or not.
		// so you must add .orElse(null)
		return this.aRepo.findById(id).orElse(null);	// uses the aRepo to connect
	}
	
	public Album createAlbum(Album album)
	{
		//CREATE a NEW album
		return this.aRepo.save(album);	// uses the aRepo to connect
	}
	
	public Album editAlbum(Album album)
	{
		// UPDATE a album just like creating :))
		// edit on the front end
		return this.aRepo.save(album);	// uses the aRepo to connect
	}
	
	// Can use: public void deleteAlbum(Long id)
	// Then return nothing: this.aRepo.deleteById(id);	 OR VV
	public String deleteAlbum(Long id)
	{
		// UPDATE a album just like creating :))
		// edit on the front end
		this.aRepo.deleteById(id);	// uses the aRepo to connect
		return "Album has been deleted. FOREVER";
	}
	
	// LIKE an ALBUM
	// THIS WILL BE CALLED IN THE HOME CONTROLLER
	public void likeAlbum(User user, Album album)
	{
		List<User> usersThatLikedAlbum = album.getLikers();
		usersThatLikedAlbum.add(user); //ADD USER
		this.aRepo.save(album);  //SAVE TO ALBUM
	}
	
	// UNLIKE an ALBUM
		// THIS WILL BE CALLED IN THE HOME CONTROLLER
		public void unlikeAlbum(User user, Album album)
		{
			List<User> usersThatLikedAlbum = album.getLikers();
			usersThatLikedAlbum.remove(user); //remove USER  // use .remove
			this.aRepo.save(album);  //SAVE TO ALBUM
		}
	
	
//	public List<Album> findByAlbumNameContaining()
//	{
//		return this.aRepo.findAll();
//	}
//	public List<Album> findByYearContaining()
//	{
//		return this.aRepo.findAll();
		
	public List<Album> findByOrderByYearDesc()
	{
		return this.aRepo.findByOrderByYearDesc();
	}
	
	
	public List<Album> findByOrderByYearAsc()
	{
		return this.aRepo.findByOrderByYearAsc();
	}
	
	
	//LIKES
	public List<Album> findByOrderByLikersDesc()
	{
		return this.aRepo.findByOrderByLikersDesc();
	}
	
	
	
	
	
//	public List<Album> existsByAlbumName()
//	{
//		return this.aRepo.findAll();
//	}
//	
	
	
	
	
	
	
	
	
}
