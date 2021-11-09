package com.travis.jepson.java.tests.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travis.jepson.java.tests.models.Album;
import com.travis.jepson.java.tests.models.Miniature;
import com.travis.jepson.java.tests.repositories.MiniatureRepository;

@Service
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
	
	public List<Miniature> getAllMiniatures()
	{
		return this.mRepo.findAll();	// uses the mRepo to connect
	}
	
	public List<Miniature> albumMiniatures(Album album)
	{
		return this.mRepo.findAllByAlbum(album);
	}
	
	// Get one album from the database and return as an array list
	//
	// ALWAYS connects by our LONG declared id var
public Miniature getOneMiniature(Long id)
{
	// This is called an "optional" it either exists or not.
	// so you must add .orElse(null)
	return this.mRepo.findById(id).orElse(null);	// uses the aRepo to connect
}

public Miniature createMiniature(Miniature miniature)
{
	//CREATE a NEW Miniature
	return this.mRepo.save(miniature);	// uses the aRepo to connect
}

public Miniature editMiniature(Miniature miniature)
{
	// UPDATE a Miniature just like creating :))
	// edit on the front end
	return this.mRepo.save(miniature);	// uses the aRepo to connect
}

// Can use: public void deleteAlbum(Long id)
// Then return nothing: this.aRepo.deleteById(id);	 OR VV
public String deleteMiniature(Long id)
{
	// UPDATE a album just like creating :))
	// edit on the front end
	this.mRepo.deleteById(id);	// uses the aRepo to connect
	return "Miniature has been deleted. FOREVER";
}
	
}