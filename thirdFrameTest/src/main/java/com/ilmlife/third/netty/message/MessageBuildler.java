package com.ilmlife.third.netty.message;
/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2018年9月24日 上午3:22:23
 */
public class MessageBuildler {
	private String msg;
	private MessageBuildler(){}
	
	public static MessageBuildler newMessage() {
		return new MessageBuildler();
	}
	
	public MessageBuildler withMsg(String msg) {
		this.msg = msg;
		return this;
	}
	
	public Message build() {
		Message message = new Message();
		message.setMsg(this.msg);
		message.setLength(Message.HEAD_LENGTH + this.msg.getBytes().length);
		return message;
	}
	
}
