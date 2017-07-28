package com.ithuplion.mapper;


import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.ithuplion.pojo.OrderExt;
import com.ithuplion.pojo.Orderdetail;
import com.ithuplion.pojo.Orders;
import com.ithuplion.pojo.User;
import com.ithuplion.utils.MybatisUtils;

public class OrdersMapperTest {
	private SqlSessionFactory sessionFactory ;
	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		//´´½¨SQLSessionFactory
		sessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindOrdersAndUser() throws Exception {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<OrderExt> list = ordersMapper.findOrdersAndUser();
		for (OrderExt o : list) {
			System.out.println(o);
		}
		session.commit();
		session.close();
	}
	@Test
	public void testFindOrdersAndUserMap() throws Exception {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<Orders> list = ordersMapper.findOrdersAndUserMap();
		for (Orders orders : list) {
			System.out.println(orders);
		}
		session.commit();
		session.close();
	}
	@Test
	public void testFindOrdersAndUserMap1() throws Exception {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<Orders> list = ordersMapper.findOrdersAndUserMap();
		for (Orders orders : list) {
			System.out.println(orders.getNumber());
			System.out.println(orders.getCreatetime());
		}
		session.commit();
		session.close();
	}
	@Test
	public void testFindOrdersAndOrderdetailResultMap() throws Exception {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<Orders> list = ordersMapper.findOrdersAndOrderdetailResultMap();
		for (int i = 0; i < list.size(); i++) {
			Orders orders = list.get(1);
			System.out.println(orders.toString());
		}
		session.commit();
		session.close();
	}
	@Test
	public void testFindOrdersAndOrderdetailResultMap1() throws Exception {
		SqlSession session = MybatisUtils.getSqlSessionConn();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<Orders> list = ordersMapper.findOrdersAndOrderdetailResultMap();
		for (Orders orders : list) {
			System.out.println(orders.getOrderdetailList().toString());
		}
		session.commit();
		session.close();
	}
	@Test
	public void testFindOrderAndUserLazyLoading() throws Exception {
		SqlSession session = MybatisUtils.getSqlSessionConn();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<Orders> list = ordersMapper.findOrderAndUserLazyLoading();
		for (Orders orders : list) {
			Integer id = orders.getId();
			System.out.println(id);
			User user = orders.getUser();
			System.out.println(user.toString());
		}
		session.commit();
		session.close();
	}
	@Test
	public void testFindOrderdetailByOrdersid() throws Exception {
		SqlSession session = MybatisUtils.getSqlSessionConn();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<Orderdetail> list = ordersMapper.findOrderdetailByOrdersid(3);
		for (Orderdetail orderdetail : list) {
			System.out.println(orderdetail.getItems_num());
		}
		session.commit();
		session.close();
	}
	@Test
	public void testFindOrderAndUserLazyLoadingOrderdetail() throws Exception {
		SqlSession session = MybatisUtils.getSqlSessionConn();
		OrdersMapper ordersMapper = session.getMapper(OrdersMapper.class);
		List<Orders> list = ordersMapper.findOrderAndUserLazyLoading();
		for (Orders orders : list) {
			List<Orderdetail> list2 = orders.getOrderdetailList();
			for (Orderdetail orderdetail : list2) {
				System.out.println(orderdetail.toString());
			}
		}
		session.commit();
		session.close();
	}
}
