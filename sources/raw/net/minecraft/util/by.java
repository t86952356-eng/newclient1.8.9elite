/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package net.minecraft.util;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import net.minecraft.network.ak;

public class by
extends MessageToByteEncoder<ByteBuf> {
    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n2 = byteBuf.readableBytes();
        int n3 = ak.gq(n2);
        if (n3 > 3) {
            throw new IllegalArgumentException("unable to fit " + n2 + " into 3");
        }
        ak ak2 = new ak(byteBuf2);
        ak2.ensureWritable(n3 + n2);
        ak2.gr(n2);
        ak2.writeBytes(byteBuf, byteBuf.readerIndex(), n2);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

