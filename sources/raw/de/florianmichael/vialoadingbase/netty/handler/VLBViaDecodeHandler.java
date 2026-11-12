/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.type.types.VarIntType
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelDecoderException
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package de.florianmichael.vialoadingbase.netty.handler;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.type.types.VarIntType;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelDecoderException;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.util.PipelineUtil;
import hackclient.rise.afl;
import hackclient.rise.bi;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

@ChannelHandler.Sharable
public class VLBViaDecodeHandler
extends MessageToMessageDecoder<ByteBuf> {
    private final UserConnection user;
    public static int stateId;

    public VLBViaDecodeHandler(UserConnection userConnection) {
        this.user = userConnection;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        if (!this.user.checkIncomingPacket()) {
            throw CancelDecoderException.generate(null);
        }
        if (!this.user.shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        ByteBuf byteBuf3 = byteBuf2.copy();
        try {
            byteBuf3.markReaderIndex();
            int n2 = new VarIntType().readPrimitive(byteBuf3);
            this.user.transformIncoming(byteBuf2, CancelDecoderException::generate);
            list.add(byteBuf2.retain());
            if (n2 == 20 || n2 == 22) {
                short s2 = byteBuf3.readUnsignedByte();
                stateId = new VarIntType().readPrimitive(byteBuf3);
            }
        }
        finally {
            byteBuf2.release();
        }
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        if (PipelineUtil.containsCause((Throwable)throwable, CancelCodecException.class)) {
            return;
        }
        if (PipelineUtil.containsCause((Throwable)throwable, InformativeException.class)) {
            String string;
            Throwable throwable2 = throwable;
            while (throwable2.getCause() != null) {
                throwable2 = throwable2.getCause();
            }
            if (throwable2 instanceof NullPointerException && (string = throwable2.getMessage()) != null && (string.contains("dimensions") || string.contains("ConfigurationPacketStorage") || string.contains("EntityTracker") || string.contains("size()") || string.contains("setEnabledFeatures") || string.contains("setDimensions"))) {
                return;
            }
            if (this.user.getProtocolInfo().getServerState() != State.HANDSHAKE || Via.getManager().debugHandler().enabled()) {
                throwable.printStackTrace();
                afl.c("exception", new Object[0]);
                if (bi.dx != null && bi.dx.contains("hypixel")) {
                    channelHandlerContext.close();
                }
            }
        }
    }
}

