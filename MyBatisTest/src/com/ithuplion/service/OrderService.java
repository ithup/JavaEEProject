package com.ithuplion.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ithuplion.mapper.OrdersMapper;
import com.ithuplion.pojo.Orderdetail;
import com.ithuplion.pojo.Orders;
import com.ithuplion.utils.MybatisUtils;

public class OrderService {
	/**
	 * 查询订单信息及关联用户信息和订单详细信息
	 * @return
	 * @throws Exception 
	 */
	public List<Orders> findOrdersInfo(){
		SqlSession session = MybatisUtils.getSqlSessionConn();
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		List<Orders> list=null;
		try {
			 list = mapper.findOrdersAndOrderdetailResultMap();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 根据订单id查询订单详细信息
	 * @param id
	 */
	public List<Orderdetail> findOrderdetailById(Integer id) {
		SqlSession session = MybatisUtils.getSqlSessionConn();
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		List<Orderdetail> orderdetail=null;
		try {
			orderdetail = mapper.selectOrderdetailById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderdetail;
	}
}
