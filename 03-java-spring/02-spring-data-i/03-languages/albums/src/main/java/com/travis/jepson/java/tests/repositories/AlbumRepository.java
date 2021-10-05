package com.travis.jepson.java.tests.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travis.jepson.java.tests.models.Album;

// CREATE this file as New => Interface


// This area CREATES, READES, UPDATES and DELETES.
// This fetches all data requests ** ALL you need to do is get the JAVA import CRUD REPO...
// ALL you need is the below interface to write to the database
@Repository
public interface AlbumRepository  extends CrudRepository< Album , Long>   // THIS TAKES IN THE TYPE Class => Album, and the PRIMARY KEY TYPE => Long
{
	// REMEMBER TO IMPORT THIS AS => java.util.List
	List<Album> findAll(); // Just like SELECT * FROM albums
}
