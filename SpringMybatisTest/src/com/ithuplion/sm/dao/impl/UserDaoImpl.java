package com.ithuplion.sm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ithuplion.sm.dao.UserDao;
import com.ithuplion.sm.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	public User findUserById(int id) throws Exception {
		SqlSession session = this.getSqlSession();
		User user = session.selectOne("test.findUserById",id);
		return user;
	}

}
