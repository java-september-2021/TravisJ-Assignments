package com.travis.jepson.java.tests.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
// IMPORT THESE ^^ FROM PERSISTENCE!!
// validation for USERS

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="users")

// Long id
// String firstName
// String lastName
// String email
// String password
// String confirmPassword
// Integer age //** OPTIONAL

public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Please enter your first name!")
	// @Size(min=2, message="Please keep your first name more than two characters") try
	@Size(max=50, message="Please keep your first name less than 50 characters!")
	private String firstName;

	@NotBlank(message="Please don't forget your last name!")
	@Size(max=50, message="Please keep your last name less than 50 characters!")
	private String lastName;
	
	@NotBlank(message="Please enter your email address!")
	@Email
	private String email;

	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	//
	//@Regex()  // USE LATER TO SET SPECIAL CHARACTERS
	// password validation is confirmed on backend
	// setup min
	@Size(min=6, message="Please make your password longer than six characters!")
	private String password;
	
	// Make sure this is javax.persistence
	@Transient  // THIS MAKES SURE NOT TO GO INTO THE DATABASE
	@Size(min=6, message="Please make your password longer than six characters!")
	private String confirmPassword;
	
	// This comes into play in UserService.java
	//
	// Validation occurs in the UserValidator.java
	// for fancy password goodness.
	//
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	
	@Column(nullable=true)  
	@Max(value=199, message="Please enter an age less than 199!")
	@Min(value=17, message="Please enter an age over 17.")
	private Integer age;
	
	@Column(updatable=false)  // ENABLE WITH JAVA.UTIL.date
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") // you  can format this
	private Date createdAt;
	
	// USER WILL NOT SEE THIS
	@DateTimeFormat(pattern="yyyy,MM,DD HH:mm:ss") // you  can format this
	private Date updatedAt;
	
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	// eventually add song likes similarly etc
//	@ManyToMany(fetch=FetchType.LAZY)
//	@JoinTable(names="likes", joinColumns = @JoinColumn(name="user_id"),
//	inverseJoinColumns = @JoinColumn(name="album_id"));
//	{
//		
//	}
	
	
}
