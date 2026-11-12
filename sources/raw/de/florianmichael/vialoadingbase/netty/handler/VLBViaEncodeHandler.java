/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.type.types.VarIntType
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelEncoderException
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
package de.florianmichael.vialoadingbase.netty.handler;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.type.types.VarIntType;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelEncoderException;
import com.viaversion.viaversion.util.PipelineUtil;
import hackclient.rise.a;
import hackclient.rise.fj;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

@ChannelHandler.Sharable
public class VLBViaEncodeHandler
extends MessageToMessageEncoder<ByteBuf> {
    private final UserConnection user;
    private int lastTick = -1;
    private boolean actionPerformedThisTick = false;

    public VLBViaEncodeHandler(UserConnection userConnection) {
        this.user = userConnection;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        if (!this.user.checkOutgoingPacket()) {
            throw CancelEncoderException.generate(null);
        }
        if (!this.user.shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        int n2 = new VarIntType().readPrimitive(byteBuf);
        byteBuf = byteBuf.readerIndex(0);
        fj fj2 = new fj(byteBuf, n2);
        a.a.e().d(fj2);
        if (fj2.isCancelled()) {
            return;
        }
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        try {
            if (n2 == 10) {
                // empty if block
            }
            this.user.transformOutgoing(byteBuf2, CancelEncoderException::generate);
            list.add(byteBuf2.retain());
        }
        finally {
            byteBuf2.release();
        }
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        if (PipelineUtil.containsCause((Throwable)throwable, CancelCodecException.class)) {
            return;
        }
        super.exceptionCaught(channelHandlerContext, throwable);
    }
}

