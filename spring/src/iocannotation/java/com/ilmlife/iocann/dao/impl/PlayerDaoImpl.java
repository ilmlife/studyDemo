package com.ilmlife.iocann.dao.impl;

import org.springframework.stereotype.Component;

import com.ilmlife.iocann.dao.IPlayerDao;
import com.ilmlife.iocann.model.Player;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年3月31日 下午10:09:14
 */
@Component(value="playerDao1")
public class PlayerDaoImpl implements IPlayerDao {

	@Override
	public void save(Player player) {
		System.out.println("player saving");
	}

}
