package com.ithuplion.mapper;

import com.ithuplion.pojo.Person;

public interface PersonMapper {
	/**
	 * ����id��ѯPerson
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Person selectPersonById(Integer id) throws Exception;
}
