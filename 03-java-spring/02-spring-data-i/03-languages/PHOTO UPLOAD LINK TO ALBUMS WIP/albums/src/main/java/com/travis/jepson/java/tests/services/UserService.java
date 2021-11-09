package com.travis.jepson.java.tests.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// MAKE SURE TO IMPORT THE USERS MODEL User.java
import com.travis.jepson.java.tests.models.User;
import com.travis.jepson.java.tests.repositories.UserRepository;

// Add new class to make this file here
// allows to get all users and get one
@Service
public class UserService 
{
	@Autowired
	private UserRepository uRepo;
	
	public List<User> getAllUsers()
	{
		return this.uRepo.findAll();
	}
	
	public User getOneUser(Long id)
	{
		return this.uRepo.findById(id).orElse(null);
	}
	
	// This uses the bcrypt setup
	// This will HASH the password
	// Takes in user object and scrambles the user's password!
	// his example is registerUser
	public User registerNewUser(User user) 
	{	//		V our var   bcrypts method V                        scrambles V  // can do multiple times
		String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashedPassword);
		return this.uRepo.save(user);
	}
	
	// Take in two Strings
	public boolean authenticateUser(String email, String password)
	{
		User user = this.uRepo.findByEmail(email);  // check the userRepo by email
		if(user == null)    // check if user email exists
		{
			return false;
		}		// check password vs 
		return BCrypt.checkpw(password, user.getPassword());
	}
	
	public User getUserByEmailCheck(String email)  // gets approved user
	{
		return this.uRepo.findByEmail(email);
	}
	
}
