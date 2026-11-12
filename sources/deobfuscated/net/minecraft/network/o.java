/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;
import net.minecraft.network.q;

public class o
extends MessageToMessageDecoder<ByteBuf> {
    private final q cZu;

    public o(Cipher cipher) {
        this.cZu = new q(cipher);
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        list.add(this.cZu.b(channelHandlerContext, byteBuf));
    }
}

