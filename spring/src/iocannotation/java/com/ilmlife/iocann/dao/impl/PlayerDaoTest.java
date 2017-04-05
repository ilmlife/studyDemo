package com.ilmlife.iocann.dao.impl;


import org.springframework.stereotype.Component;

import com.ilmlife.iocann.dao.IPlayerDao;
import com.ilmlife.iocann.model.Player;

/**
 * 如果有两个相同类型的bean(实现了IPlayerDao接口),在使用resources注入时可以使用name指定
 * 如果不使用name指定,注解在字段时用字段名,注解在方法的时候根据bean名字命名参数名
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年3月31日 下午10:36:52
 */
@Component(value="playerDao2")
public class PlayerDaoTest implements IPlayerDao {

	@Override
	public void save(Player player) {
		System.out.println("PlayerDaoTest saveing");
	}

}
