package com.docode.helpme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docode.helpme.model.User;
import com.docode.helpme.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/save")
	public void save(User user) {
		userService.saveUser(user);
	}
}
