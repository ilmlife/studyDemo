package com.ilmlife.base.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com @version1.0 创建时间：2019年6月18日 下午6:52:52
 */
public class FileChannelTest {
	static String txtReadPath = FileChannelTest.class.getResource("file.1").getPath();
	static String txtWritePath = System.getProperty("user.dir") + "/src/main/java/com/ilmlife/base/nio/file.2";

	public static void main(String[] args) {
		readTest();
		writeTest();
	}
	
	protected static void readTest() {
		try (FileInputStream fis = new FileInputStream(new File(txtReadPath));
				FileChannel fileChannel = fis.getChannel()) {
			ByteBuffer buffer = ByteBuffer.allocate(1024);// 超出时,可能会出现乱码,这里不关注该问题
			
			while(fileChannel.read(buffer) != -1) {
				int readSize = buffer.position();
				byte[] readBytes = new byte[readSize];
				buffer.flip();
				buffer.get(readBytes);
				
				String content = new String(readBytes);
				System.out.println(content);
				buffer.clear();
			}
		} catch (Exception e) {

		}
	}
	
	
	protected static void writeTest() {
		try (FileInputStream fis = new FileInputStream(new File(txtReadPath));
				FileOutputStream fos = new FileOutputStream(new File(txtWritePath));
				FileChannel readChannel = fis.getChannel();
				FileChannel writeChannel = fos.getChannel()) {
			ByteBuffer buffer = ByteBuffer.allocate(1024);// 超出时,可能会出现乱码,这里不关注该问题
			
			while(readChannel.read(buffer) != -1) {
				buffer.flip();
				writeChannel.write(buffer);
				buffer.clear();
			}
		} catch (Exception e) {

		}
	}
}
