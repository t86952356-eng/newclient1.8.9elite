/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;

public class q {
    private final Cipher cZw;
    private byte[] cZx = new byte[0];
    private byte[] cZy = new byte[0];

    protected q(Cipher cipher) {
        this.cZw = cipher;
    }

    private byte[] c(ByteBuf byteBuf) {
        int n2 = byteBuf.readableBytes();
        if (this.cZx.length < n2) {
            this.cZx = new byte[n2];
        }
        byteBuf.readBytes(this.cZx, 0, n2);
        return this.cZx;
    }

    protected ByteBuf b(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        int n2 = byteBuf.readableBytes();
        byte[] byArray = this.c(byteBuf);
        ByteBuf byteBuf2 = channelHandlerContext.alloc().heapBuffer(this.cZw.getOutputSize(n2));
        byteBuf2.writerIndex(this.cZw.update(byArray, 0, n2, byteBuf2.array(), byteBuf2.arrayOffset()));
        return byteBuf2;
    }

    protected void a(ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n2 = byteBuf.readableBytes();
        byte[] byArray = this.c(byteBuf);
        int n3 = this.cZw.getOutputSize(n2);
        if (this.cZy.length < n3) {
            this.cZy = new byte[n3];
        }
        byteBuf2.writeBytes(this.cZy, 0, this.cZw.update(byArray, 0, n2, this.cZy));
    }
}

