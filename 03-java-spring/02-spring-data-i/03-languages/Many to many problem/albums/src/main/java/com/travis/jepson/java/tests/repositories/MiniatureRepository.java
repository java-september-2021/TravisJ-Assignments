package com.travis.jepson.java.tests.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travis.jepson.java.tests.models.Miniature;
import com.travis.jepson.java.tests.models.Album;

// MAKE SURE ITS THIS IMPORT TYPE

@Repository
public interface MiniatureRepository extends CrudRepository<Miniature, Long>
{
	List<Miniature> findAllByAlbum(Album album);
	
	// ENABLE FIND ALL
	List<Miniature> findAll();
}
