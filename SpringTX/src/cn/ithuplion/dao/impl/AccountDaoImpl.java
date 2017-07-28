package cn.ithuplion.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import cn.ithuplion.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	public void out(String outer, Integer money) {
		this.getJdbcTemplate().update("update account set money=money-? where username=?",money, outer);
	}

	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account set money=money+? where username=?", money,inner);
	}
}
