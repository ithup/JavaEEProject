package com.ithuplion.sm.dao;

import com.ithuplion.sm.pojo.User;

public interface UserDao {
	public User findUserById(int id)throws Exception;
}
