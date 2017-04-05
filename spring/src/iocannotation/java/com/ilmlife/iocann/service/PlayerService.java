package com.ilmlife.iocann.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ilmlife.iocann.dao.IPlayerDao;
import com.ilmlife.iocann.model.Player;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年3月31日 下午10:09:42
 */
@Component(value="playerService")
public class PlayerService {
	private IPlayerDao playerDao;

	public void save(Player player) {
		playerDao.save(player);
	}
	
	public IPlayerDao getPlayerDao() {
		return playerDao;
	}
	
	@Resource
	public void setPlayerDao(IPlayerDao playerDao1) {
		this.playerDao = playerDao1;
	}
//	@Resource
//	public void setPlayerDao(IPlayerDao playerDao2) {
//		this.playerDao = playerDao2;
//	}
	
}
