package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@RestController
@RequestMapping("/api/")
public class UserController {
	 @Autowired
	  private UserRepository userRepository;
	 
	 @PostMapping("/user/add")
	  public User createUser(HttpServletRequest request,@RequestBody User user) {
	    return userRepository.save(user);
	  }
	
}

