package com.ithuplion.mapper;

import java.util.List;

import com.ithuplion.pojo.OrderExt;
import com.ithuplion.pojo.Orderdetail;
import com.ithuplion.pojo.Orders;
import com.ithuplion.pojo.User;

public interface OrdersMapper {
	/**
	 * 查询订单信息，关联查询用户信息（一对一）
	 * @return
	 * @throws Exception
	 */
	public List<OrderExt> findOrdersAndUser()throws Exception;
	public List<Orders> findOrdersAndUserMap() throws Exception;
	/**
	 * 查询订单信息，关联查询用户信息（一对一）及订单详细信息（一对多）
	 * @return
	 * @throws Exception
	 */
	public List<Orders> findOrdersAndOrderdetailResultMap()throws Exception;
	/**
	 * 根据订单ID查询订单详细信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Orderdetail> selectOrderdetailById(int id)throws Exception;
	/**
	 * 查询订单信息关联用户信息，用户信息使用延迟加载
	 * @return
	 * @throws Exception
	 */
	public List<Orders> findOrderAndUserLazyLoading() throws Exception;
	/**
	 * 根据订单ID查询订单详细
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Orderdetail> findOrderdetailByOrdersid(int id)throws Exception;
}
