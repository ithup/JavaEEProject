package com.ithuplion.sm.mapper;

import com.ithuplion.sm.pojo.User;

public interface UserMapper {
	public User findUserById(int id)throws Exception;
}
