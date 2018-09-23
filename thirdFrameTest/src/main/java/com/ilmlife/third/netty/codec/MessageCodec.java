package com.ilmlife.third.netty.codec;

import java.util.List;

import com.ilmlife.third.netty.message.Message;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version1.0 创建时间：2018年9月21日 下午8:45:34
 */
public class MessageCodec extends MessageToMessageCodec<ByteBuf, Message> {

	@Override
	protected void encode(ChannelHandlerContext ctx, Message msg, List<Object> out) throws Exception {
		ByteBuf byteBuf = ByteBufAllocator.DEFAULT.buffer();
		byteBuf.writeInt(msg.getLength());
		byteBuf.writeBytes(msg.serialization());
		out.add(byteBuf);
	}

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
		Message message = new Message();
		int length = msg.readInt();
		message.setLength(length);
		byte[] dst = new byte[length - Message.HEAD_LENGTH];
		msg.readBytes(dst);
		message.setMsg(new String(dst));
		out.add(message);
	}

}
