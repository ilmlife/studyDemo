package com.ilmlife.third.netty.handler;

import com.ilmlife.third.netty.message.Message;
import com.ilmlife.third.netty.message.MessageBuildler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2018年9月8日 上午12:19:38
 */
public class HelloServerHandler extends SimpleChannelInboundHandler<Message> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Message msg) throws Exception {
		System.out.println("服务器接收消息:" + msg);
		ctx.writeAndFlush(MessageBuildler.newMessage().withMsg("Hello, client! I got you!").build());
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}


}
