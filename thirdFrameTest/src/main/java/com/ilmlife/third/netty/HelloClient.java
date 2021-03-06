package com.ilmlife.third.netty;

import com.ilmlife.third.netty.codec.MessageCodec;
import com.ilmlife.third.netty.handler.HelloClientHandler;
import com.ilmlife.third.netty.message.MessageBuildler;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * 
 * @author ilmlife E-Mail：ilmlife@126.com @version1.0 创建时间：2018年9月8日 上午12:19:06
 */
public class HelloClient {
	private static String	serverIp	= "127.0.0.1";
	private static int		serverPort	= 7777;

	public static void main(String[] args) throws Exception {

		EventLoopGroup workgroup = new NioEventLoopGroup();
		Bootstrap b = new Bootstrap();
		b.group(workgroup).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
			@Override
			protected void initChannel(SocketChannel sc) throws Exception {
				sc.pipeline().addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, Integer.SIZE / 8, - Integer.SIZE / 8, 0));
				sc.pipeline().addLast(new MessageCodec());
				sc.pipeline().addLast(new HelloClientHandler());
			}
		});

		ChannelFuture channelFuture = b.connect(serverIp, serverPort).sync();

		channelFuture.channel()
				.writeAndFlush(MessageBuildler.newMessage().withRequestId(1000).withMsg("hello world! 111").build());
//		Thread.sleep(3000);
		channelFuture.channel()
				.writeAndFlush(MessageBuildler.newMessage().withRequestId(1001).withMsg("hello world! 222").build());
//		Thread.sleep(3000);
		channelFuture.channel()
				.writeAndFlush(MessageBuildler.newMessage().withRequestId(1002).withMsg("hello world! 333").build());
		channelFuture.channel().closeFuture().sync();
//		Thread.sleep(3000);
		// workgroup.shutdownGracefully();
	}

}
