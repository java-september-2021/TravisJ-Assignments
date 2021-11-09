package com.travis.jepson.java.tests.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.travis.jepson.java.tests.models.Album;
import com.travis.jepson.java.tests.models.Miniature;
import com.travis.jepson.java.tests.repositories.MiniatureRepository;

public class MiniatureService 
{
	@Autowired
	private MiniatureRepository mRepo;
	
	// since this is HTML forums we need to create this
	// object manually
	// THIS MUST BE IN THE SAME ORDER AS THE CONSTRUCTOR
	public void uploadMiniature(String url, String name, String desc, Album album)
	{
		Miniature newMiniature = new Miniature(url, name, desc, album);
		this.mRepo.save(newMiniature);
	}
	
	public List<Miniature> albumMiniatures(Album album)
	{
		return this.mRepo.findAllByAlbum(album);
	}
}
