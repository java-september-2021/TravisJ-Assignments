package com.travis.jepson.java.tests.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travis.jepson.java.tests.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
	// TEMP USER LOGIN FIX
	List<User> findAll();
}
