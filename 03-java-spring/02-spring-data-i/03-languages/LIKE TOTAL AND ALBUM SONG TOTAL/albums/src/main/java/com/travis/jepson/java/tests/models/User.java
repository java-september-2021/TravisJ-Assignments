package com.travis.jepson.java.tests.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
// IMPORT FROM PERSISTENCE!!
// validation for USERS

@Entity
@Table(name ="users")

// Long id
// String firstName
// String lastName
// String email
// String password
// String confirmPassword

public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max=50)
	private String firstName;

	@NotBlank
	@Size(max=50)
	private String lastName;
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// SQL manual add: INSERT INTO album_likes (user_id, album_id) VALUES (1, 1);
	//
	// LIKES => SETUP FOR ALBUMS
	// paste below into Album.java * *  * THEN FLIP THE columns and joinColumns
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="album_likes",  // ref link name => SQL CALL
			joinColumns = @JoinColumn(name="user_id"), // connects to the user_id
			inverseJoinColumns = @JoinColumn(name="album_id") // connects to the album_id
			)
	private List<Album> albumsUserLiked;  // this makes the whole list of albums the user likes
	
	// DONT FORGET TO GENERATE THE GETTERS AND SETTERS FOR THIS
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

	// ABOVE IS TEMPORARY SETUP !!! FIX LATER
	
	// @Email  // super inclusive
	// private String email;
	
	// password validation is confirmed on backend
	// setup min
	// private String password;
	
	// THIS MAKES SURE NOT TO GO INTO THE DATABASE
	// @Transient
	// private String confirmPassword;
	
	public User() {
		// BEANNNNNN
	}

	public List<Album> getAlbumsUserLiked() {
		return albumsUserLiked;
	}

	public void setAlbumsUserLiked(List<Album> albumsUserLiked) {
		this.albumsUserLiked = albumsUserLiked;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
//	@ManyToMany(fetch=FetchType.LAZY)
//	@JoinTable(names="likes", joinColumns = @JoinColumn(name="user_id"),
//	inverseJoinColumns = @JoinColumn(name="album_id"));
//	{
//		
//	}
	
	
}
