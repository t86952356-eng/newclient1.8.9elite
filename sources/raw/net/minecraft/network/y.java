/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.connection.UserConnectionImpl
 *  com.viaversion.viaversion.protocol.ProtocolPipelineImpl
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package net.minecraft.network;

import com.viaversion.viaversion.connection.UserConnectionImpl;
import com.viaversion.viaversion.protocol.ProtocolPipelineImpl;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.MCPVLBPipeline;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import net.minecraft.network.f;
import net.minecraft.network.r;
import net.minecraft.util.bv;
import net.minecraft.util.bw;
import net.minecraft.util.bx;
import net.minecraft.util.by;

class y
extends ChannelInitializer<Channel> {
    final /* synthetic */ r dab;

    y(r r2) {
        this.dab = r2;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() != 47) {
            channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("splitter", (ChannelHandler)new bw()).addLast("decoder", (ChannelHandler)new bv(f.cYR)).addLast("prepender", (ChannelHandler)new by()).addLast("encoder", (ChannelHandler)new bx(f.cYQ)).addLast("packet_handler", (ChannelHandler)this.dab);
        } else {
            channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("splitter", (ChannelHandler)new bw()).addLast("decoder", (ChannelHandler)new bv(f.cYR)).addLast("prepender", (ChannelHandler)new by()).addLast("encoder", (ChannelHandler)new bx(f.cYQ)).addLast("packet_handler", (ChannelHandler)this.dab);
        }
        if (channel instanceof SocketChannel && ViaLoadingBase.getInstance().getTargetVersion().getVersion() != 47) {
            r.user = new UserConnectionImpl(channel, true);
            new ProtocolPipelineImpl(r.user);
            channel.pipeline().addLast(new ChannelHandler[]{new MCPVLBPipeline(r.user)});
        }
    }
}

