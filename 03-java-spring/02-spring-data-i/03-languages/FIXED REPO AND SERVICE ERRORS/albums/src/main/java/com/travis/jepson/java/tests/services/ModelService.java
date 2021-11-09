package com.travis.jepson.java.tests.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.travis.jepson.java.tests.models.Album;
import com.travis.jepson.java.tests.models.Model;
import com.travis.jepson.java.tests.repositories.ModelRepository;

public class ModelService 
{

	@Autowired
	private ModelRepository mRepo;
	
	// since this is HTML forums we need to create this
	// object manually
	// THIS MUST BE IN THE SAME ORDER AS THE CONSTRUCTOR
	public void uploadModel(String url, String name, String desc, Album album)
	{
		Model newModel = new Model(url, name, desc, album);
		this.mRepo.save(newModel);
	}
	
	public List<Model> albumModels(Album album)
	{
		return this.mRepo.findAllByAlbum(album);
		
	}
}
