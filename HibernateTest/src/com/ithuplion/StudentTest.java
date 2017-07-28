package com.ithuplion;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ithuplion.pojo.Cource;
import com.ithuplion.pojo.Student;
import com.ithuplion.utils.HibernateUtils;

public class StudentTest {
	@Test
	public void test1(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		Student stu1=new Student();
			stu1.setS_name("tom");
		Student stu2=new Student();
			stu2.setS_name("rose");
		Cource c1=new Cource();
			c1.setC_name("Hibernate");
		Cource c2=new Cource();
			c2.setC_name("Spring");
		Cource c3=new Cource();
			c3.setC_name("Sturts");
		stu1.getCource().add(c1);
		stu1.getCource().add(c2);
		stu1.getCource().add(c3);
		stu2.getCource().add(c1);
		stu2.getCource().add(c2);
		stu2.getCource().add(c3);
		session.save(stu1);
		session.save(stu2);
		transaction.commit();
		session.close();
	}
}
