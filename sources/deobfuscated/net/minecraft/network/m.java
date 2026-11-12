/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.DecoderException
 */
package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;
import net.minecraft.network.ak;

public class m
extends ByteToMessageDecoder {
    private final Inflater cZq;
    private int cZr;

    public m(int n2) {
        this.cZr = n2;
        this.cZq = new Inflater();
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        if (byteBuf.readableBytes() != 0) {
            ak ak2 = new ak(byteBuf);
            int n2 = ak2.afw();
            if (n2 == 0) {
                list.add(ak2.readBytes(ak2.readableBytes()));
            } else {
                if (n2 < this.cZr) {
                    throw new DecoderException("Badly compressed packet - size of " + n2 + " is below server threshold of " + this.cZr);
                }
                if (n2 > 0x200000) {
                    throw new DecoderException("Badly compressed packet - size of " + n2 + " is larger than protocol maximum of 2097152");
                }
                byte[] byArray = new byte[ak2.readableBytes()];
                ak2.readBytes(byArray);
                this.cZq.setInput(byArray);
                byte[] byArray2 = new byte[n2];
                this.cZq.inflate(byArray2);
                list.add(Unpooled.wrappedBuffer((byte[])byArray2));
                this.cZq.reset();
            }
        }
    }

    public void gp(int n2) {
        this.cZr = n2;
    }
}

