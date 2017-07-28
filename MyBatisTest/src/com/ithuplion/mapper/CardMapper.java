package com.ithuplion.mapper;

import com.ithuplion.pojo.Card;

public interface CardMapper {
	/**
	 * 根据id查询Card，返回Card对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Card selectCardById(int id) throws Exception;
}
