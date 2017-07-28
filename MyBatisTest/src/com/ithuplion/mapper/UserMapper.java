package com.ithuplion.mapper;

import java.util.List;

import com.ithuplion.pojo.User;
import com.ithuplion.pojo.UserQueryVO;

public interface UserMapper {
	/**
	 * 根据用户ID查询用户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findUserById(int id) throws Exception;
	/**
	 * 根据用户名模糊查询
	 * @param username
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserByName(String username) throws Exception;
	/**
	 * 添加用户
	 * @param user
	 * @throws Exception
	 */
	public int addUser(User user) throws Exception;
	public List<User> findUserByVO(UserQueryVO users) throws Exception;
	public List<User> findUserByIn(UserQueryVO ids) throws Exception;
	/**
	 * 查询用户信息及用户购买的商品信息
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserAndItems()throws Exception;
}
