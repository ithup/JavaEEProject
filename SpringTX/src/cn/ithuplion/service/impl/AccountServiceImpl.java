package cn.ithuplion.service.impl;


import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.ithuplion.dao.AccountDao;
import cn.ithuplion.service.AccountService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
//		int i=10/0;
		accountDao.in(inner, money);
	}
}
