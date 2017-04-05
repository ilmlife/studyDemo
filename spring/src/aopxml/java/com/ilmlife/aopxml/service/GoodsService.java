package com.ilmlife.aopxml.service;

import com.ilmlife.aopxml.dao.IGoodsDao;
import com.ilmlife.aopxml.model.Goods;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月3日 下午3:18:45
 */
public class GoodsService {
	private IGoodsDao goodsDao;

	public void save(Goods goods) {
		goodsDao.save(goods);
	}
	
	public IGoodsDao getGoodsDao() {
		return goodsDao;
	}
	public void setGoodsDao(IGoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
}
