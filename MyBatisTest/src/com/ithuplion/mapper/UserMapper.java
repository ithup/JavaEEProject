package com.ithuplion.mapper;

import java.util.List;

import com.ithuplion.pojo.User;
import com.ithuplion.pojo.UserQueryVO;

public interface UserMapper {
	/**
	 * �����û�ID��ѯ�û���Ϣ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findUserById(int id) throws Exception;
	/**
	 * �����û���ģ����ѯ
	 * @param username
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserByName(String username) throws Exception;
	/**
	 * ����û�
	 * @param user
	 * @throws Exception
	 */
	public int addUser(User user) throws Exception;
	public List<User> findUserByVO(UserQueryVO users) throws Exception;
	public List<User> findUserByIn(UserQueryVO ids) throws Exception;
	/**
	 * ��ѯ�û���Ϣ���û��������Ʒ��Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserAndItems()throws Exception;
}
