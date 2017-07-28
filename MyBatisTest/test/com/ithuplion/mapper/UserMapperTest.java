package com.ithuplion.mapper;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.ithuplion.pojo.Items;
import com.ithuplion.pojo.Orderdetail;
import com.ithuplion.pojo.Orders;
import com.ithuplion.pojo.User;
import com.ithuplion.pojo.UserQueryVO;
import com.ithuplion.utils.MybatisUtils;

public class UserMapperTest {
	private SqlSessionFactory sqlSessionFactory ;
	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		// 创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		UserMapper userMapper = openSession.getMapper(UserMapper.class);
		//第一次查询
		User user = userMapper.findUserById(1);
		System.out.println(user);
		//第二次查询
		User user2 = userMapper.findUserById(1);
		System.out.println(user2);
		openSession.close();
	}

	@Test
	public void testFindUserByName() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		UserMapper userMapper = openSession.getMapper(UserMapper.class);
		List<User> list = userMapper.findUserByName("明");
		for (User user : list) {
			System.out.println(user);
		}
		openSession.close();
	}

	@Test
	public void testAddUser() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		UserMapper userMapper = openSession.getMapper(UserMapper.class);
		User user=new User();
//		user.setId(2);
		user.setUsername("tom");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("贵阳");
		int num = userMapper.addUser(user);
		System.out.println(num);
		openSession.commit();
		openSession.close();
	}
	@Test
	public void testFindUser() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		UserMapper userMapper = openSession.getMapper(UserMapper.class);
		UserQueryVO users=new UserQueryVO();
		User user=new User();
//		user.setUsername("明");
		user.setSex("1");
		users.setUser(user);
		List<User> list = userMapper.findUserByVO(users);
		for (User user2 : list) {
			System.out.println(user2);
		}
		openSession.close();
	}
	@Test
	public void testFindUser1() throws Exception {
		SqlSession openSession = sqlSessionFactory.openSession();
		UserMapper userMapper = openSession.getMapper(UserMapper.class);
		UserQueryVO ids=new UserQueryVO();
		List<Integer> id=new ArrayList<Integer>();
//		id.add(32);
//		id.add(22);
//		id.add(24);
		ids.setIds(id);
		List<User> list = userMapper.findUserByIn(ids);
		for (User user : list) {
			System.out.println(user);
		}
		openSession.close();
	}
	@Test
	public void testFindUserAndItems() throws Exception {
		SqlSession session = MybatisUtils.getSqlSessionConn();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<User> list = userMapper.findUserAndItems();
		for (User user : list) {
			System.out.println(user.getUsername());
			List<Orders> ordersList = user.getOrdersList();
			for (Orders orders : ordersList) {
				System.out.println(orders.getNumber()+":"+orders.getCreatetime());
				List<Orderdetail> orderdetailList = orders.getOrderdetailList();
				for (Orderdetail orderdetail : orderdetailList) {
					System.out.println(orderdetail.getOrders_id()+orderdetail.getItems_num());
					Items items = orderdetail.getItems();
					System.out.println(items.getName()+":"+items.getPrice());
				}
			}
		}
		session.commit();
		session.close();
	}
	@Test
	public void testTwoCacheFindUserById() throws Exception {
		SqlSession openSession1 = sqlSessionFactory.openSession();
		SqlSession openSession2 = sqlSessionFactory.openSession();
		SqlSession openSession3 = sqlSessionFactory.openSession();
		UserMapper userMapper1 = openSession1.getMapper(UserMapper.class);
		UserMapper userMapper2 = openSession2.getMapper(UserMapper.class);
		UserMapper userMapper3 = openSession3.getMapper(UserMapper.class);
		//第一次查询
		User user1 = userMapper1.findUserById(1);
		System.out.println(user1);
		openSession1.close();
		//添加用户
		// userMapper3.addUser(user1);
		// openSession3.commit();
		User user2 = userMapper2.findUserById(1);
		System.out.println(user2);
		openSession2.close();
	}
}
