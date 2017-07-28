package com.ithuplion.dao;

import cn.ithuplion.pojo.User;


/**
 * �û���ز����ĳ־ò�ӿ�
 * @author zhy
 *
 */
public interface IUserDao {
	
	/**
	 * �����û����Ʋ�ѯ�û�
	 * @param username
	 * @return
	 */
	User selectUserByUsername(String username);
	
	/**
	 * �����û���Ϣ
	 * @param user
	 * @return
	 */
	int addUser(User user);

}
