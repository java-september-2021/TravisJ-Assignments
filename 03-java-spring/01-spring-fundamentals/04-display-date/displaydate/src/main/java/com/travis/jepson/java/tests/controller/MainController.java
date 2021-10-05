package com.travis.jepson.java.tests.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String date(@RequestParam("building") String building, HttpSession session, Model model) 
	{
		
		LocalDateTime activityDateTime = LocalDateTime.now();
		System.out.println(activityDateTime);
		
		DateTimeFormatter dateCleanup = DateTimeFormatter.ofPattern("MM / dd / YYYY");
		System.out.println(dateCleanup);
		
		model.addAttribute("building",building); // toggles date or time
		model.addAttribute(dateCleanup.format(activityDateTime));
		model.addAttribute("activityDateTime", activityDateTime);
		model.addAttribute("dateCleanup", dateCleanup);
		
		return "Date.jsp"; 
	}
	
	@PostMapping("/time")
	public String time(@RequestParam("building") String building, HttpSession session, Model model) 
	{
		
		LocalDateTime activityDateTime = LocalDateTime.now();
		System.out.println(activityDateTime);
		
		DateTimeFormatter dateCleanup = DateTimeFormatter.ofPattern(" h:mma ");
		
		model.addAttribute("building",building); // toggles date or time
		model.addAttribute(dateCleanup.format(activityDateTime));
		model.addAttribute("activityDateTime", activityDateTime);
		model.addAttribute("dateCleanup", dateCleanup);
		return "Time.jsp";
	}
}
