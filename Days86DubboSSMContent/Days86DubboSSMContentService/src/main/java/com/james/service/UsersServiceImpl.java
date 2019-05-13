package com.james.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.mapper.IUserMapper;
import com.james.pojo.Users;

@Service
public class UsersServiceImpl implements IUsersService {
	
	@Autowired
	private IUserMapper userMapper;

	@Override
	public List<Users> getAllUsers() {
		return userMapper.getAllUsers();
	}
}
