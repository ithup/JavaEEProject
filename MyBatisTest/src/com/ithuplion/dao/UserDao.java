package com.ithuplion.dao;

import com.ithuplion.pojo.User;

public interface UserDao {
	//����id��ѯ�û���Ϣ
	public User findUserById(int id)throws Exception;
}
