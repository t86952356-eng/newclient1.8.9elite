/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 */
package net.minecraft.util;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
import net.minecraft.network.ak;

public class bw
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        byteBuf.markReaderIndex();
        byte[] byArray = new byte[3];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return;
            }
            byArray[i2] = byteBuf.readByte();
            if (byArray[i2] < 0) continue;
            ak ak2 = new ak(Unpooled.wrappedBuffer((byte[])byArray));
            try {
                int n2 = ak2.afw();
                if (byteBuf.readableBytes() >= n2) {
                    list.add(byteBuf.readBytes(n2));
                    return;
                }
                byteBuf.resetReaderIndex();
            }
            finally {
                ak2.release();
            }
            return;
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}

