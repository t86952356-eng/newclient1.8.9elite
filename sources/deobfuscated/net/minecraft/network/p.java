/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;
import net.minecraft.network.q;

public class p
extends MessageToByteEncoder<ByteBuf> {
    private final q cZv;

    public p(Cipher cipher) {
        this.cZv = new q(cipher);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        this.cZv.a(byteBuf, byteBuf2);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

