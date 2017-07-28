package com.ithuplion.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ithuplion.ssm.mapper.UserMapper;
import com.ithuplion.ssm.pojo.User;
import com.ithuplion.ssm.service.UserService;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	public List<User> findUserById() throws Exception {
		return userMapper.findUserById();
	}
}
