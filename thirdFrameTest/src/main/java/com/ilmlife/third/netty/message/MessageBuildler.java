package com.ilmlife.third.netty.message;
/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2018年9月24日 上午3:22:23
 */
public class MessageBuildler {
	private int requestId;
	private String msg;
	private MessageBuildler(){}
	
	public static MessageBuildler newMessage() {
		return new MessageBuildler();
	}
	
	public MessageBuildler withRequestId(int requestId) {
		this.requestId = requestId;
		return this;
	}
	public MessageBuildler withMsg(String msg) {
		this.msg = msg;
		return this;
	}
	
	public Message build() {
		Message message = new Message();
		message.setRequestId(this.requestId);
		message.setVersion(1);
		message.setLength(Message.HEAD_LENGTH + this.msg.getBytes().length);
		message.setMsg(this.msg);
		return message;
	}
	
}
