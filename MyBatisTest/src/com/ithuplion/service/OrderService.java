package com.ithuplion.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ithuplion.mapper.OrdersMapper;
import com.ithuplion.pojo.Orderdetail;
import com.ithuplion.pojo.Orders;
import com.ithuplion.utils.MybatisUtils;

public class OrderService {
	/**
	 * ��ѯ������Ϣ�������û���Ϣ�Ͷ�����ϸ��Ϣ
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
	 * ���ݶ���id��ѯ������ϸ��Ϣ
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
