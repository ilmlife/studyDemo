package com.ilmlife.base.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月12日 上午10:38:45
 */
public class DBConfig extends Properties {
	private static final long serialVersionUID = 1L;
	private static DBConfig dbConfig = null;
	
	private DBConfig() {
		try{
			InputStream inStream = DBConfig.class.getResourceAsStream("dbConfig.properties");
			this.load(inStream);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static DBConfig getInstance() {
		if(dbConfig == null){
			synchronized (DBConfig.class) {
				if(dbConfig == null){
					dbConfig  = new DBConfig();
				}
			}
		}
		return dbConfig;
	}
}