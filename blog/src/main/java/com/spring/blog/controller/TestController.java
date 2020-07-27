package com.spring.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.blog.model.User;
import com.spring.blog.service.UserService;

@Controller
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"","/"})
	public String findUser(Model model) {
		
		List<User> users = userService.유저정보보기();
		model.addAttribute("users",  users);
		return "index";
	}
}
