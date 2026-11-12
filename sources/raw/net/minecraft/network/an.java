/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.network;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import net.minecraft.network.ab;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class an
extends ChannelInboundHandlerAdapter {
    private static final Logger daw = LogManager.getLogger();
    private final ab dax;

    public an(ab ab2) {
        this.dax = ab2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        ByteBuf byteBuf = (ByteBuf)object;
        byteBuf.markReaderIndex();
        boolean bl2 = true;
        try {
            if (byteBuf.readUnsignedByte() == 254) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress)channelHandlerContext.channel().remoteAddress();
                MinecraftServer minecraftServer = this.dax.afs();
                int n2 = byteBuf.readableBytes();
                switch (n2) {
                    case 0: {
                        daw.debug("Ping: (<1.3.x) from {}:{}", new Object[]{inetSocketAddress.getAddress(), inetSocketAddress.getPort()});
                        String string = String.format("%s\u00a7%d\u00a7%d", minecraftServer.alB(), minecraftServer.ale(), minecraftServer.getMaxPlayers());
                        this.c(channelHandlerContext, this.eT(string));
                        break;
                    }
                    case 1: {
                        if (byteBuf.readUnsignedByte() != 1) {
                            return;
                        }
                        daw.debug("Ping: (1.4-1.5.x) from {}:{}", new Object[]{inetSocketAddress.getAddress(), inetSocketAddress.getPort()});
                        String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, minecraftServer.ald(), minecraftServer.alB(), minecraftServer.ale(), minecraftServer.getMaxPlayers());
                        this.c(channelHandlerContext, this.eT(string));
                        break;
                    }
                    default: {
                        boolean bl3 = byteBuf.readUnsignedByte() == 1;
                        bl3 &= byteBuf.readUnsignedByte() == 250;
                        bl3 &= "MC|PingHost".equals(new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE));
                        int n3 = byteBuf.readUnsignedShort();
                        bl3 &= byteBuf.readUnsignedByte() >= 73;
                        bl3 &= 3 + byteBuf.readBytes(byteBuf.readShort() * 2).array().length + 4 == n3;
                        bl3 &= byteBuf.readInt() <= 65535;
                        if (!(bl3 &= byteBuf.readableBytes() == 0)) {
                            return;
                        }
                        daw.debug("Ping: (1.6) from {}:{}", new Object[]{inetSocketAddress.getAddress(), inetSocketAddress.getPort()});
                        String string = String.format("\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, minecraftServer.ald(), minecraftServer.alB(), minecraftServer.ale(), minecraftServer.getMaxPlayers());
                        ByteBuf byteBuf2 = this.eT(string);
                        try {
                            this.c(channelHandlerContext, byteBuf2);
                            break;
                        }
                        finally {
                            byteBuf2.release();
                        }
                    }
                }
                byteBuf.release();
                bl2 = false;
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        finally {
            if (bl2) {
                byteBuf.resetReaderIndex();
                channelHandlerContext.channel().pipeline().remove("legacy_query");
                channelHandlerContext.fireChannelRead(object);
            }
        }
    }

    private void c(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        channelHandlerContext.pipeline().firstContext().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE);
    }

    private ByteBuf eT(String string) {
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeByte(255);
        char[] cArray = string.toCharArray();
        byteBuf.writeShort(cArray.length);
        for (char c2 : cArray) {
            byteBuf.writeChar((int)c2);
        }
        return byteBuf;
    }
}

