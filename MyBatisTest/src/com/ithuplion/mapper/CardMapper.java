package com.ithuplion.mapper;

import com.ithuplion.pojo.Card;

public interface CardMapper {
	/**
	 * ����id��ѯCard������Card����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Card selectCardById(int id) throws Exception;
}
