package com.ithuplion.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private static SqlSessionFactory sessionFactory;
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			sessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSession getSqlSessionConn(){
		return sessionFactory.openSession();
	}
}
