package com.travis.jepson.java.tests.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travis.jepson.java.tests.models.Song;

// CREATE this file as New => Interface


// This area CREATES, READES, UPDATES and DELETES.
// This fetches all data requests ** ALL you need to do is get the JAVA import CRUD REPO...
// ALL you need is the below interface to write to the database
@Repository
public interface SongRepository  extends CrudRepository< Song , Long>   // THIS TAKES IN THE TYPE Class => Album, and the PRIMARY KEY TYPE => Long
{
	// REMEMBER TO IMPORT THIS AS => java.util.List
	// JPA translates this into SQL queries, its super good at filtering
	
//	DONT NEED THIS *** 
//	List<Song> findAll(); // Just like SELECT * FROM albums in SQL
	
	//
	//
	//  RETREVAL DOES NOT HAPPEN HERE => thats in .services
	
}
