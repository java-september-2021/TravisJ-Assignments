package com.travis.jepson.java.tests.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travis.jepson.java.tests.models.Song;
import com.travis.jepson.java.tests.repositories.SongRepository;

//
// CREATE THIS AS A => new Class
//
// THIS CONNECTS TO OUR Repository

@Service
public class SongService 
{
	@Autowired
	private SongRepository sRepo; 
	
	// ALWAYS use Java.Util
	// CHECK WHAT WENT WRONG
	//
//	public List<Song> getAllSongs()
//	{
//		return this.sRepo.findAll();	// uses the aRepo to connect
//	}
	
	// Get one album from the database and return as an array list
		//
		// ALWAYS connects by our LONG declared id var
	public Song getOneSong(Long id)
	{
		// This is called an "optional" it either exists or not.
		// so you must add .orElse(null)
		return this.sRepo.findById(id).orElse(null);	// uses the aRepo to connect
	}
	
	public Song createSong(Song song)
	{
		//CREATE a NEW song
		return this.sRepo.save(song);	// uses the aRepo to connect
	}
	
	public Song editSong(Song song)
	{
		// UPDATE a song just like creating :))
		// edit on the front end
		return this.sRepo.save(song);	// uses the aRepo to connect
	}
	
	// Can use: public void deleteAlbum(Long id)
	// Then return nothing: this.aRepo.deleteById(id);	 OR VV
	public String deleteSong(Long id)
	{
		// UPDATE a album just like creating :))
		// edit on the front end
		this.sRepo.deleteById(id);	// uses the aRepo to connect
		return "Song has been deleted. FOREVER";
	}
	
	
}
