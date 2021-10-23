package com.travis.jepson.java.tests.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
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
	
	List<Album> findByOrderByYearDesc();
	
	List<Album> findByOrderByYearAsc();
	
	// LIKES?! agghghggh
//	@Query("SELECT a FROM album a ORDER BY a.likers.size ASC")   **** ORG
	
//	WORKS IN SQL
//	USE java_albums_project;
//	SELECT album_name, COUNT(album_likes.user_id) 
//	AS liked_users FROM albums JOIN album_likes on albums.id = 
//	album_likes.album_id GROUP BY album_name 
//	ORDER BY liked_users DESC;
	
	
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// THIS WORKS => not list of albums but LIST OBJECTS
	// MUST BE SET LIKE THIS WITH THIS QUERY SET PROVEN IN SQL
	@Query(value= "SELECT id, album_name, COUNT(album_likes.user_id) AS liked_users FROM albums LEFT JOIN album_likes "
			+ "on albums.id = album_likes.album_id GROUP BY id, album_name ORDER BY liked_users DESC;", nativeQuery=true)
	List<Object[]> likesTotalDescendingFilter();
	
	
	
	
// suggestion but doest not work with QUERY
//	@Query("SELECT a FROM album a ORDER BY a.likers.size ASC")
			// jsut this works ---VV
	
//	List<Album> findByOrderByLikersDesc();
	
//	
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *	
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	
	// WIP  
	//
//	@Query(value = "SELECT *, "
//			+ "("
//			+ "SELECT COUNT(id) "
//			+ "FROM album_likes "
//			+ "WHERE album_likes.album_id = albums.id "
//			+ "GROUP BY album_likes.album_id "
//			+ ") count_total_likes_order "
//			+ "FROM albums "
//			+ "ORDER BY count_total_likes_order DESC;",
//			nativeQuery = true)
//	List<Album> orderByLikers();
	
	
	//List<Album> findByLikers(List<User> likers);
	
	
	//
	// Check albumName if an entry exists
	//
	//boolean existsByAlbumName(String albumName);
	//
	//
	//  RETREVAL DOES NOT HAPPEN HERE => thats in .services
	
}
