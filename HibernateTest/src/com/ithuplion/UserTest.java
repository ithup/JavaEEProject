package com.ithuplion;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.ithuplion.pojo.User;
import com.ithuplion.utils.HibernateUtils;

public class UserTest {
	@Test
	public void test1() {
		User user = new User();
		user.setUsername("tom");
		user.setPassword("123");
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test2() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test3() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = (User) session.get(User.class, 1);
		user.setUsername("¹ù¾¸");
		user.setPassword("12345");
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test4() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = (User) session.get(User.class, 1);
		session.delete(user);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test5() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		List<User> list = criteria.list();
		for (User user : list) {
			System.out.println(user);
		}
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test6() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery sqlQuery = session.createSQLQuery("select * from user");
		SQLQuery query = sqlQuery.addEntity(User.class);
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test7() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User where username='roes'");
		User uniqueResult = (User) query.uniqueResult();
		System.out.println(uniqueResult);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test8() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User");
		int index = 0;
		int page = 2;
		Query setFirstResult = query.setFirstResult(index + page);
		Query setMaxResults = query.setMaxResults(page);
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void test9() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria createCriteria = session.createCriteria(User.class);
		createCriteria.add(Restrictions.like("username", "%s%"));
		// createCriteria.add(Restrictions.eq("username", "tom"));
		 List<User> list = createCriteria.list(); 
		 for (User user : list) {
		 System.out.println(user);
		 }
		Object uniqueResult = createCriteria.uniqueResult();
		System.out.println(uniqueResult);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	@Test
	public void test10() {
		org.hibernate.Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		for (User user : list) {
			System.out.println(user);
		}
		transaction.commit();
		session.close();
	}
}
