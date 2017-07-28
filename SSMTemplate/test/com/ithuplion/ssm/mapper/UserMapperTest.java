package com.ithuplion.ssm.mapper;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ithuplion.ssm.pojo.User;

public class UserMapperTest {
	private ApplicationContext ac;
	@Before
	public void setUp() throws Exception {
		ac=new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
		List<User> list = userMapper.findUserById();
		for (User user : list) {
			System.out.println(user.getUsername()+user.getPassword());
		}
		 
	}

}
