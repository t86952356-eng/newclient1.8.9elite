/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 */
package net.minecraft.client.network;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.multiplayer.e;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.network.s;
import net.minecraft.client.network.t;
import net.minecraft.network.handshake.client.a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r {
    private static final Splitter bFw = Splitter.on((char)'\u0000').limit(6);
    private static final Logger bFx = LogManager.getLogger();
    private final List<net.minecraft.network.r> bFy = Collections.synchronizedList(Lists.newArrayList());

    public void a(f f2, int n2) {
        e e2 = e.da(f2.bDH);
        net.minecraft.network.r r2 = net.minecraft.network.r.a(InetAddress.getByName(e2.HC()), e2.getPort(), false, n2);
        this.bFy.add(r2);
        f2.bDJ = "Pinging...";
        f2.bDK = -1L;
        f2.bDO = null;
        r2.b(new s(this, r2, f2));
        try {
            r2.B(new a(47, e2.HC(), e2.getPort(), net.minecraft.network.a.cYH));
            r2.B(new net.minecraft.network.status.client.a());
        }
        catch (Throwable throwable) {
            bFx.error(throwable);
        }
    }

    private void g(f f2) {
        e e2 = e.da(f2.bDH);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)net.minecraft.network.r.cZD.wD())).handler((ChannelHandler)new t(this, e2, f2))).channel(NioSocketChannel.class)).connect(e2.HC(), e2.getPort());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Ip() {
        List<net.minecraft.network.r> list = this.bFy;
        synchronized (list) {
            Iterator<net.minecraft.network.r> iterator = this.bFy.iterator();
            while (iterator.hasNext()) {
                net.minecraft.network.r r2 = iterator.next();
                if (r2.afe()) {
                    r2.afa();
                    continue;
                }
                iterator.remove();
                r2.afj();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Iq() {
        List<net.minecraft.network.r> list = this.bFy;
        synchronized (list) {
            Iterator<net.minecraft.network.r> iterator = this.bFy.iterator();
            while (iterator.hasNext()) {
                net.minecraft.network.r r2 = iterator.next();
                if (!r2.afe()) continue;
                iterator.remove();
                r2.i(new net.minecraft.util.s("Cancelled"));
            }
        }
    }
}

