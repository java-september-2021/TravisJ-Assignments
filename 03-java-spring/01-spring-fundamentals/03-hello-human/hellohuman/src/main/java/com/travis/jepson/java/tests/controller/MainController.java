package com.travis.jepson.java.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController
	{
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="name", required= false, defaultValue="Human")  String name)
	{
	model.addAttribute("name",name);
	return "index.jsp";
	}
	
	@RequestMapping("/{name}")
	public String index2(Model model, @RequestParam(value="name")  String name)
	{
	model.addAttribute("name",name);
	return "index.jsp";
	}
}
