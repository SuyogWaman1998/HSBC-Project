package com.cg.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hsbc.entity.User;
import com.cg.hsbc.exceptions.UserException;
import com.cg.hsbc.service.UserService;

@RestController
@RequestMapping("/hsbc-user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/usersList")
	public List<User> getAllUsers() throws UserException{
		return userService.getAllUsers();
		
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) throws UserException {
	    return userService.addUser(user);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) throws UserException{
		return userService.updateUser(user);
	}

	
	
	
}
