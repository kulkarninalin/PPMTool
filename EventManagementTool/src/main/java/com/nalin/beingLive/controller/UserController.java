package com.nalin.beingLive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nalin.beingLive.pojo.User;
import com.nalin.beingLive.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService usrService;
	
	@RequestMapping("/addUser")
	public ResponseEntity<User> addUSer(@RequestBody User user){
		User usr=usrService.saveOrUpdateUser(user);
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	} 

}
