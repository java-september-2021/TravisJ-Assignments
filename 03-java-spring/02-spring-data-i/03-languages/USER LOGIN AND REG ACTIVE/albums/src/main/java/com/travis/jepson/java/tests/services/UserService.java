package com.travis.jepson.java.tests.services;

import java.util.List;

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
	
}
