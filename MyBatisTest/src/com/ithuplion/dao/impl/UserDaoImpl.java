package com.ithuplion.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ithuplion.dao.UserDao;
import com.ithuplion.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	public User findUserById(int id) throws Exception {
		return this.getSqlSession().selectOne("test.findUserById", id);
	}
}
