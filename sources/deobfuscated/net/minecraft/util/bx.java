/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package net.minecraft.util;

import de.florianmichael.vialoadingbase.netty.handler.VLBViaEncodeHandler;
import hackclient.rise.ahp;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import net.minecraft.network.a;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.f;
import net.minecraft.network.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class bx
extends MessageToByteEncoder<aj> {
    private static final Logger dzj = LogManager.getLogger();
    private static final Marker dzk = MarkerManager.getMarker((String)"PACKET_SENT", (Marker)r.cZB);
    private final f dzl;

    public bx(f f2) {
        this.dzl = f2;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, aj aj2, ByteBuf byteBuf) {
        a a2 = (a)((Object)channelHandlerContext.channel().attr(r.cZC).get());
        if (aj2 instanceof ahp) {
            Integer n2 = ((ahp)aj2).va();
            ak ak2 = new ak(Unpooled.buffer());
            ak2.gr(n2);
            aj2.b(ak2);
            channelHandlerContext.channel().pipeline().context(VLBViaEncodeHandler.class).writeAndFlush((Object)ak2);
            return;
        }
        Integer n3 = a2.a(this.dzl, aj2);
        if (dzj.isDebugEnabled()) {
            dzj.debug(dzk, "OUT: [{}:{}] {}", new Object[]{channelHandlerContext.channel().attr(r.cZC).get(), n3, aj2.getClass().getName()});
        }
        if (n3 == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        ak ak3 = new ak(byteBuf);
        ak3.gr(n3);
        try {
            aj2.b(ak3);
        }
        catch (Throwable throwable) {
            dzj.error(throwable);
        }
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (aj)object, byteBuf);
    }
}

