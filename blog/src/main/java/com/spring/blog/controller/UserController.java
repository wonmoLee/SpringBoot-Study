package com.spring.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.blog.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
}
