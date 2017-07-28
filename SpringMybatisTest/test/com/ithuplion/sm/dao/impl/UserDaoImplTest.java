package com.ithuplion.sm.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ithuplion.sm.dao.UserDao;
import com.ithuplion.sm.mapper.UserMapper;
import com.ithuplion.sm.pojo.User;

public class UserDaoImplTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void testFindUserById1() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("UserMapper");
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}
}
