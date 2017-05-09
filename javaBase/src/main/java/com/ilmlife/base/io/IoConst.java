package com.ilmlife.base.io;
/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月18日 下午3:27:36
 */
public final class IoConst {
	// 两个文件已经存在
	static String txtReadPath = FileStreamTest.class.getResource("test.txt").getPath();
	static String txtWritePath = System.getProperty("user.dir") + "/src/main/java/com/ilmlife/base/io/testCopy.txt";
}
