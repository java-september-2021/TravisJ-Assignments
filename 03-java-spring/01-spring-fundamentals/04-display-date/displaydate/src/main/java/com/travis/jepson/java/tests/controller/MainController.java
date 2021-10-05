package com.travis.jepson.java.tests.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController
	{
	@RequestMapping("/")
	public String index()
	{
	return "index.jsp";
	}
	
	@PostMapping("/date")
	public String findGold(@RequestParam("building") String building, HttpSession session) 
	{
		// setup the variables for gold
		// specifically the RANDOM
		Random goldVarRandom = new Random();
		
		
		// setup the DATE and time FUNCTION *******
		// activityDateTime holes the info
		// MAKE SURE THE LocalDateTime.now is used
		LocalDateTime activityDateTime = LocalDateTime.now();
		System.out.println(activityDateTime);
		
		// THIS FORMATS THE DATE AND TIME
		// look up Java dateTimeFormatter for more info
		DateTimeFormatter dateCleanup = DateTimeFormatter.ofPattern("MM / dd / YYYY");
		System.out.println(dateCleanup);
		return "Date.jsp";
	}
	
	@PostMapping("/time")
	public String findGold(@RequestParam("building") String building, HttpSession session) 
	{
		// setup the variables for gold
		// specifically the RANDOM
		Random goldVarRandom = new Random();
		
		
		// setup the DATE and time FUNCTION *******
		// activityDateTime holes the info
		// MAKE SURE THE LocalDateTime.now is used
		LocalDateTime activityDateTime = LocalDateTime.now();
		System.out.println(activityDateTime);
		
		// THIS FORMATS THE DATE AND TIME
		// look up Java dateTimeFormatter for more info
		DateTimeFormatter dateCleanup = DateTimeFormatter.ofPattern("MM / dd / YYYY");
		System.out.println(dateCleanup);
		return "Time.jsp";
	}
}
