package com.ithuplion;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ithuplion.pojo.Customer;
import com.ithuplion.pojo.Order;
import com.ithuplion.utils.HibernateUtils;

public class OrderTest {
	@Test
	public void test1(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		Order o1=new Order();
		o1.setO_name("打印机");
		Order o2=new Order();
		o2.setO_name("相机");
//		o1.setCustomer(c1);
//		o2.setCustomer(c1);
//		c1.getOrder().add(o1);
//		c1.getOrder().add(o2);
		session.save(o1);
		session.save(o2);
		transaction.commit();
		session.close();
	}
}
