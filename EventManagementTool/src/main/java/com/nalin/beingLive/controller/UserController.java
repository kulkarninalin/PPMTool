package com.nalin.beingLive.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nalin.beingLive.pojo.User;
import com.nalin.beingLive.services.MapValidationErrorService;
import com.nalin.beingLive.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService usrService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@RequestMapping("/addUser")
	public ResponseEntity<?> addUSer(@Valid @RequestBody User user,BindingResult result){
		ResponseEntity<?> errorMap=mapValidationErrorService.MapValidationService(result);
		if(errorMap != null) return errorMap;
		
		User usr=usrService.saveOrUpdateUser(user);
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	} 

}
