package com.ilmlife.third.netty.message;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com 
 * @version1.0 创建时间：2018年9月21日 下午8:46:54
 */
public class Message {
	public static final int HEAD_LENGTH = Integer.SIZE / 8;
	private int length;
	private String msg;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public byte[] serialization() {
		return this.msg.getBytes();
	}

	@Override
	public String toString() {
		return this.getMsg();
	}
	
}
