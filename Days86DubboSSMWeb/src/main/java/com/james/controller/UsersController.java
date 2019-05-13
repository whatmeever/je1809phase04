package com.james.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.pojo.Users;
import com.james.service.IUsersService;
import com.james.util.LayUIUtil;

@RestController
public class UsersController {

	@Resource
	private IUsersService userService;
	
	@GetMapping("/Users")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/UsersLayUI")
	public LayUIUtil<Users> getUsersLayUI(){
		LayUIUtil<Users> util = new LayUIUtil<>();
		
		util.setMsg("");
		util.setCode(0);
		
		List<Users> list = userService.getAllUsers();
		util.setData(list);
		
		util.setCount(list.size());
		
		return util;
	}
}
