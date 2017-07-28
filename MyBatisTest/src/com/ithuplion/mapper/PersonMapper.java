package com.ithuplion.mapper;

import com.ithuplion.pojo.Person;

public interface PersonMapper {
	/**
	 * ¸ù¾Ýid²éÑ¯Person
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Person selectPersonById(Integer id) throws Exception;
}
