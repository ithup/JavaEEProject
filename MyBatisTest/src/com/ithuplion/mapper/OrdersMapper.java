package com.ithuplion.mapper;

import java.util.List;

import com.ithuplion.pojo.OrderExt;
import com.ithuplion.pojo.Orderdetail;
import com.ithuplion.pojo.Orders;
import com.ithuplion.pojo.User;

public interface OrdersMapper {
	/**
	 * ��ѯ������Ϣ��������ѯ�û���Ϣ��һ��һ��
	 * @return
	 * @throws Exception
	 */
	public List<OrderExt> findOrdersAndUser()throws Exception;
	public List<Orders> findOrdersAndUserMap() throws Exception;
	/**
	 * ��ѯ������Ϣ��������ѯ�û���Ϣ��һ��һ����������ϸ��Ϣ��һ�Զࣩ
	 * @return
	 * @throws Exception
	 */
	public List<Orders> findOrdersAndOrderdetailResultMap()throws Exception;
	/**
	 * ���ݶ���ID��ѯ������ϸ��Ϣ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Orderdetail> selectOrderdetailById(int id)throws Exception;
	/**
	 * ��ѯ������Ϣ�����û���Ϣ���û���Ϣʹ���ӳټ���
	 * @return
	 * @throws Exception
	 */
	public List<Orders> findOrderAndUserLazyLoading() throws Exception;
	/**
	 * ���ݶ���ID��ѯ������ϸ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Orderdetail> findOrderdetailByOrdersid(int id)throws Exception;
}
