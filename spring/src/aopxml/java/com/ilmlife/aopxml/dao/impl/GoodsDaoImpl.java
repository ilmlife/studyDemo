package com.ilmlife.aopxml.dao.impl;

import com.ilmlife.aopxml.dao.IGoodsDao;
import com.ilmlife.aopxml.model.Goods;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月3日 下午3:17:17
 */
public class GoodsDaoImpl implements IGoodsDao {

	@Override
	public void save(Goods goods) {
		System.out.println("goods saving");
	}
	
}