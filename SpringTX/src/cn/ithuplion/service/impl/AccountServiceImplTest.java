package cn.ithuplion.service.impl;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ithuplion.dao.AccountDao;
import cn.ithuplion.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceImplTest {
	@Autowired
	private AccountService accountService;
	@Test
	public void testTransfer() {
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//		AccountService accountServie = (AccountService) applicationContext.getBean("accountService");
		accountService.transfer("rose", "tom", 1000);
	}

}
