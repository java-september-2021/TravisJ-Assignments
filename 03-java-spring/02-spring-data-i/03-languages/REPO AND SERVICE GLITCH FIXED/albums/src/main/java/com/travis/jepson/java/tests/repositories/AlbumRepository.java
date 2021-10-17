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
	// JPA translates this into SQL queries, its super good at filtering
	
	List<Album> findAll(); // Just like SELECT * FROM albums in SQL
	
	
	
	// HIDDEN HERE AND IN ALBUM SERVICE HOW TO FIX AND IMPLIMENT!?
	//
	// in lecture he does not have this linked but this ruined my whole app?!
	//
	// ** HOLD ** UP **
	//
	//
	//  Add search functionallity Just like in JPA queries => DAY 9 LEC 1:15
	//
	// THIS IS SUPER POWERFUL.  check the jpa.query methods
	//
	// connects with albumName => in Album.java
	// super helpful searching for a TEXT field!
	//List<Album> findByAlbumNameContaining(String containing);
	
	// HOW TO SEARCH FOR ALBUMS with NUMBER
	// connects with year => in Album.java
	//List<Album> findByYearContaining(Integer containing);
	
	//
	// Organize Albums
	//
	// findByOrderBy // Desc or Asc
	//List<Album> findByOderByYearDesc(Integer containing);
	
	//
	// Check albumName if an entry exists
	//
	//boolean existsByAlbumName(String albumName);
	//
	//
	//  RETREVAL DOES NOT HAPPEN HERE => thats in .services
	
}
