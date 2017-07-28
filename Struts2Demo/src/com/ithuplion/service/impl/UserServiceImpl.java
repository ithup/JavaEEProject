package com.ithuplion.service.impl;

import cn.ithuplion.pojo.User;

import com.ithuplion.dao.IUserDao;
import com.ithuplion.dao.impl.UserDaoImpl;
import com.ithuplion.service.IUserService;


public class UserServiceImpl implements IUserService {

	private IUserDao dao = new UserDaoImpl();
	
	public User findUserByUsername(String username) {
		return dao.selectUserByUsername(username);
	}

	public int register(User user) {
		return dao.addUser(user);
	}

}
