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
import java.util.zip.Deflater;
import net.minecraft.network.ak;

public class n
extends MessageToByteEncoder<ByteBuf> {
    private final byte[] cZs = new byte[8192];
    private final Deflater cZt;
    private int cZr;

    public n(int n2) {
        this.cZr = n2;
        this.cZt = new Deflater();
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n2 = byteBuf.readableBytes();
        ak ak2 = new ak(byteBuf2);
        if (n2 < this.cZr) {
            ak2.gr(0);
            ak2.writeBytes(byteBuf);
        } else {
            byte[] byArray = new byte[n2];
            byteBuf.readBytes(byArray);
            ak2.gr(byArray.length);
            this.cZt.setInput(byArray, 0, n2);
            this.cZt.finish();
            while (!this.cZt.finished()) {
                int n3 = this.cZt.deflate(this.cZs);
                ak2.writeBytes(this.cZs, 0, n3);
            }
            this.cZt.reset();
        }
    }

    public void gp(int n2) {
        this.cZr = n2;
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

