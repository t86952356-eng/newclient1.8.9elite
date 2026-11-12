/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterables
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.client.network;

import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.client.network.r;
import net.minecraft.client.network.t;
import net.minecraft.util.an;
import net.minecraft.util.bt;

class u
extends SimpleChannelInboundHandler<ByteBuf> {
    final /* synthetic */ t bFH;

    u(t t2) {
        this.bFH = t2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        super.channelActive(channelHandlerContext);
        ByteBuf byteBuf = Unpooled.buffer();
        try {
            byteBuf.writeByte(254);
            byteBuf.writeByte(1);
            byteBuf.writeByte(250);
            char[] cArray = "MC|PingHost".toCharArray();
            byteBuf.writeShort(cArray.length);
            for (char c2 : cArray) {
                byteBuf.writeChar((int)c2);
            }
            byteBuf.writeShort(7 + 2 * this.bFH.bFF.HC().length());
            byteBuf.writeByte(127);
            cArray = this.bFH.bFF.HC().toCharArray();
            byteBuf.writeShort(cArray.length);
            for (char c2 : cArray) {
                byteBuf.writeChar((int)c2);
            }
            byteBuf.writeInt(this.bFH.bFF.getPort());
            channelHandlerContext.channel().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
        }
        finally {
            byteBuf.release();
        }
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        String string;
        String[] stringArray;
        short s2 = byteBuf.readUnsignedByte();
        if (s2 == 255 && "\u00a71".equals((stringArray = (String[])Iterables.toArray((Iterable)r.bFw.split((CharSequence)(string = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE))), String.class))[0])) {
            int n2 = bt.w(stringArray[1], 0);
            String string2 = stringArray[2];
            String string3 = stringArray[3];
            int n3 = bt.w(stringArray[4], -1);
            int n4 = bt.w(stringArray[5], -1);
            this.bFH.bFG.bDL = -1;
            this.bFH.bFG.bDM = string2;
            this.bFH.bFG.bDJ = string3;
            this.bFH.bFG.bDI = String.valueOf((Object)an.dvS) + n3 + String.valueOf((Object)an.dvT) + "/" + String.valueOf((Object)an.dvS) + n4;
        }
        channelHandlerContext.close();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        channelHandlerContext.close();
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (ByteBuf)object);
    }
}

