package com.ilmlife.base.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件流测试类
 * 
 * @author ilmlife E-Mail：ilmlife@126.com 
 * @version1.0 创建时间：2017年4月12日 上午9:43:38
 */
public class FileStreamTest {
	public static void main(String[] args) {
//		fileInputStream();
//		fileOutputStream();
		
		fileReader();
		fileWriter();
	}

	/**
	 * 以字节流读取文件
	 */
	public static void fileInputStream() {
		String str = "";
		int b = 0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(IoConst.txtReadPath));
			while ((b = fis.read()) != -1) {
				str += (char) b;
			}
			System.out.println(new String(str.getBytes("ISO-8859-1")));// 需要从通用编码做转化
			System.out.println("============fileInputStream method down===============");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 使用字节流写入
	 */
	public static void fileOutputStream() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(IoConst.txtReadPath);
			fos = new FileOutputStream(IoConst.txtWritePath);
			
			int len = 0;
			byte[] bytes = new byte[10];
			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
			fos.flush();
			System.out.println("============fileOutputStream method down===============");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 以字符流读取文件
	 */
	public static void fileReader() {
		int b = 0;
		String str = "";
		FileReader fr = null;
		try {
			fr = new FileReader(new File(IoConst.txtReadPath));
			while ((b = fr.read()) != -1) {
				str += (char) b;
			}
			System.out.println(str);
			System.out.println("============fileReader method down===============");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 以字符流写入文件
	 */
	public static void fileWriter() {
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader(new File(IoConst.txtReadPath));
			fw = new FileWriter(new File(IoConst.txtWritePath));
			int len = 0;
			char[] chars = new char[10];
			while ((len = fr.read(chars)) != -1) {
				fw.write(chars, 0, len);
			}
			fw.flush();
			System.out.println("============fileWriter method down===============");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
