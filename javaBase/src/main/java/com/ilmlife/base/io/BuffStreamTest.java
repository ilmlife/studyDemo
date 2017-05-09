package com.ilmlife.base.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2017年4月18日 下午7:21:28
 */
public class BuffStreamTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try{
			br = new BufferedReader(new FileReader(new File(IoConst.txtReadPath)));
			bw = new BufferedWriter(new FileWriter(new File(IoConst.txtWritePath)));
			
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line);
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
