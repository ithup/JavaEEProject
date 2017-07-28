package com.ithuplion.mapper;


import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.ithuplion.pojo.Person;

public class PersonMapperTest {
	private SqlSessionFactory sessionFactory;
	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testSelectPersonById() throws Exception {
		SqlSession session = sessionFactory.openSession();
		PersonMapper personMapper = session.getMapper(PersonMapper.class);
		Person person = personMapper.selectPersonById(1);
		System.out.println(person);
		session.commit();
		session.close();
	}

}
