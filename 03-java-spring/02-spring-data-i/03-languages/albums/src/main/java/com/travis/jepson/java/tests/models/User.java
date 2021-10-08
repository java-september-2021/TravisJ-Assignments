package com.travis.jepson.java.tests.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
// IMPORT FROM PERSISTENCE!!
// validation for USERS

@Entity
@Table(name ="users")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max=15)
	private String firstName;

	@NotBlank
	@Size(max=15)
	private String lastName;

	@Email  // super inclusive
	private String email;
	
	// password validation is confirmed on backend
	// setup min
	private String password;
	
	// THIS MAKES SURE NOT TO GO INTO THE DATABASE
	@Transient
	private String confirmPassword;
	
//	@ManyToMany(fetch=FetchType.LAZY)
//	@JoinTable(names="likes", joinColumns = @JoinColumn(name="user_id"),
//	inverseJoinColumns = @JoinColumn(name="album_id"));
//	{
//		
//	}
	
	
}
