package com.travis.jepson.java.tests.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.travis.jepson.java.tests.models.User;
import com.travis.jepson.java.tests.repositories.UserRepository;

// the timeout for guessing lives here
// use time util, grab attempts that fail
// starts as value of zero


@Component
public class UserValidator 
{
	@Autowired
	private UserRepository uRepo; // gets users DB
	
	public boolean supports(Class<?> checkUsersDatabase)  
	{
		return User.class.equals(checkUsersDatabase);  // checks users DB
	}
	
	public void validateUser(Object target, Errors errors)  // links to form errors
	{
		User user = (User) target;
		
		if(!user.getPassword().equals(user.getConfirmPassword()))  // if password does not equal confirm password...
		{
			errors.rejectValue("password", "PasswordsMatchCheck", "Passwords Must Match!");  // rejectValue takes in 3 different parameters
			//				path ^^   var name for error  ^^		message ^^
		}
		if(user.getPassword().equals(""))  // if empty
		{
			errors.rejectValue("password", "PasswordIsBlank", "You must make a password!");  // rejectValue takes in 3 different parameters
			//				path ^^   var name for error  ^^		message ^^
		}
		if(user.getPassword().equals(""))  // if empty
		{
			errors.rejectValue("confirmPassword", "ConfirmPasswordIsBlank", "You must repeat your full password!");  // rejectValue takes in 3 different parameters
			//				path ^^   var name for error  ^^		message ^^
		}
		// CHECK IF USER IS IN DATABASE ALREADY => in UserRepository.java
		// similar check can be used for a user or account name
		if(this.uRepo.existsByEmail(user.getEmail()))
		{
			errors.rejectValue("email", "EmailAddressIsTaken", "This email is already taken!");
		}
		
		if(user.getFirstName().equals("1337H@X0r9001"))  // if this name
		{
			errors.rejectValue("firstName", "No", "Ooops. Sworry. You know what you did.");  // rejectValue takes in 3 different parameters
			//				path ^^   var name for error  ^^		message ^^
		}
		
	}
}
