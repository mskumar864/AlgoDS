package com.example.demo.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Address;
import com.example.demo.Models.User;
import com.example.demo.service.UserService;
	
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/user/add")
	public java.util.List<User> getUers() {
		java.util.List<User> users=userService.getUsers();

		return users;
	}
	
	@RequestMapping("/user/list")
	public String addNewUser() {
		
		String userID="test";
		 User user = new User();
		 user.setUserID(userID);
		 user.setEmail("mskumar864@gmail.com");
		
		Address address=new Address();
		
		address.setUserID(userID);
		address.setAddressType("home");
		address.setState("andhra pradesh");
		address.setDistrict("nellore");
		address.setMandal("vkpadu");
		address.setPin("500050");
		
	//	 user.setAddress(address);
		userService.addService(user);
		 
		return "sucess";
	}
	@RequestMapping("/authenicate")
	public String authenicateUser(@RequestParam(name="name", required=true, defaultValue="World") String name) {
		
	
		 
		return "login sucess "+ name;
	}
	
	
	@GetMapping("/welcome")
	public String welcome(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
	
		return "welcome";
	}
}
