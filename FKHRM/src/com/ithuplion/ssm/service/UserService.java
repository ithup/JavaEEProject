package com.ithuplion.ssm.service;

import java.util.List;

import com.ithuplion.ssm.pojo.User;

public interface UserService {
	public List<User> findUserById()throws Exception;
}
