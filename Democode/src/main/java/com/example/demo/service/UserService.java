package com.example.demo.service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void addService(User user) {
		
		userRepository.save(user);
	}
	
	public java.util.List<User> getUsers() {
		
		Iterable<User> iterable;
		java.util.List<User> list = new ArrayList<User>();
		
		iterable=userRepository.findAll();
		for (User user : iterable) {
			list.add(user);
			
		}
		
		
		return list;
	}
	
	public String authenticateUser() {
		
		
		
		return "sucess";
	}

}
