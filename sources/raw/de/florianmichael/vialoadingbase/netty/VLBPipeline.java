/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
package de.florianmichael.vialoadingbase.netty;

import com.viaversion.viaversion.api.connection.UserConnection;
import de.florianmichael.vialoadingbase.netty.event.CompressionReorderEvent;
import de.florianmichael.vialoadingbase.netty.handler.VLBViaDecodeHandler;
import de.florianmichael.vialoadingbase.netty.handler.VLBViaEncodeHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public abstract class VLBPipeline
extends ChannelInboundHandlerAdapter {
    public static final String VIA_DECODER_HANDLER_NAME = "via-decoder";
    public static final String VIA_ENCODER_HANDLER_NAME = "via-encoder";
    private final UserConnection user;

    public VLBPipeline(UserConnection userConnection) {
        this.user = userConnection;
    }

    public void handlerAdded(ChannelHandlerContext channelHandlerContext) {
        super.handlerAdded(channelHandlerContext);
        channelHandlerContext.pipeline().addBefore(this.getDecoderHandlerName(), VIA_DECODER_HANDLER_NAME, (ChannelHandler)this.createVLBViaDecodeHandler());
        channelHandlerContext.pipeline().addBefore(this.getEncoderHandlerName(), VIA_ENCODER_HANDLER_NAME, (ChannelHandler)this.createVLBViaEncodeHandler());
    }

    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) {
        super.userEventTriggered(channelHandlerContext, object);
        if (object instanceof CompressionReorderEvent) {
            int n2 = channelHandlerContext.pipeline().names().indexOf(this.getDecompressionHandlerName());
            if (n2 == -1) {
                return;
            }
            if (n2 > channelHandlerContext.pipeline().names().indexOf(VIA_DECODER_HANDLER_NAME)) {
                ChannelHandler channelHandler = channelHandlerContext.pipeline().get(VIA_DECODER_HANDLER_NAME);
                ChannelHandler channelHandler2 = channelHandlerContext.pipeline().get(VIA_ENCODER_HANDLER_NAME);
                channelHandlerContext.pipeline().remove(channelHandler);
                channelHandlerContext.pipeline().remove(channelHandler2);
                channelHandlerContext.pipeline().addAfter(this.getDecompressionHandlerName(), VIA_DECODER_HANDLER_NAME, channelHandler);
                channelHandlerContext.pipeline().addAfter(this.getCompressionHandlerName(), VIA_ENCODER_HANDLER_NAME, channelHandler2);
            }
        }
    }

    public VLBViaDecodeHandler createVLBViaDecodeHandler() {
        return new VLBViaDecodeHandler(this.user);
    }

    public VLBViaEncodeHandler createVLBViaEncodeHandler() {
        return new VLBViaEncodeHandler(this.user);
    }

    public abstract String getDecoderHandlerName();

    public abstract String getEncoderHandlerName();

    public abstract String getDecompressionHandlerName();

    public abstract String getCompressionHandlerName();

    public UserConnection getUser() {
        return this.user;
    }
}

