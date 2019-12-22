package com.nalin.beingLive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nalin.beingLive.pojo.User;
import com.nalin.beingLive.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveOrUpdateUser(User user) {
		
		return userRepository.save(user);
	}

}
