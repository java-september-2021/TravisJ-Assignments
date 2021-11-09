// ** GRAB FOR USER_MERN_JAVA

package com.travis.jepson.java.tests.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travis.jepson.java.tests.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>

//** GRAB FOR USER_MERN_JAVA
//** public interface UserRepository extends JpaRepository<User, Long>   // DONT NEED @Repository
{
	// TEMP USER LOGIN FIX
	List<User> findAll();
	
	boolean existsByEmail(String email);  // checks if email exists in the user DB
										// then used in UserValidator
	
	User findByEmail(String email);   // can also find by username depending on site etc
									// then link in UserService
}
