/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollServerSocketChannel
 *  io.netty.channel.local.LocalAddress
 *  io.netty.channel.local.LocalEventLoopGroup
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.network;

import com.google.common.collect.Lists;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.crash.a;
import net.minecraft.crash.i;
import net.minecraft.network.ac;
import net.minecraft.network.ad;
import net.minecraft.network.ae;
import net.minecraft.network.af;
import net.minecraft.network.ag;
import net.minecraft.network.ah;
import net.minecraft.network.ai;
import net.minecraft.network.play.server.bt;
import net.minecraft.network.r;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ba;
import net.minecraft.util.bo;
import net.minecraft.util.cl;
import net.minecraft.util.s;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ab {
    private static final Logger daf = LogManager.getLogger();
    public static final bo<NioEventLoopGroup> dag = new ac();
    public static final bo<EpollEventLoopGroup> dah = new ad();
    public static final bo<LocalEventLoopGroup> dai = new ae();
    private final MinecraftServer daj;
    public volatile boolean dak;
    private final List<ChannelFuture> dal = Collections.synchronizedList(Lists.newArrayList());
    private final List<r> dam = Collections.synchronizedList(Lists.newArrayList());

    public ab(MinecraftServer minecraftServer) {
        this.daj = minecraftServer;
        this.dak = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(InetAddress inetAddress, int n2) {
        List<ChannelFuture> list = this.dal;
        synchronized (list) {
            bo<NioEventLoopGroup> bo2;
            Class<NioServerSocketChannel> clazz;
            if (Epoll.isAvailable() && this.daj.alx()) {
                clazz = EpollServerSocketChannel.class;
                bo2 = dah;
                daf.info("Using epoll channel type");
            } else {
                clazz = NioServerSocketChannel.class;
                bo2 = dag;
                daf.info("Using default channel type");
            }
            this.dal.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(clazz)).childHandler((ChannelHandler)new af(this)).group((EventLoopGroup)bo2.wD()).localAddress(inetAddress, n2)).bind().syncUninterruptibly());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress afp() {
        ChannelFuture channelFuture;
        List<ChannelFuture> list = this.dal;
        synchronized (list) {
            channelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler((ChannelHandler)new ag(this)).group((EventLoopGroup)dag.wD()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.dal.add(channelFuture);
        }
        return channelFuture.channel().localAddress();
    }

    public void afq() {
        this.dak = false;
        for (ChannelFuture channelFuture : this.dal) {
            try {
                channelFuture.channel().close().sync();
            }
            catch (InterruptedException interruptedException) {
                daf.error("Interrupted whilst closing channel");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void afr() {
        List<r> list = this.dam;
        synchronized (list) {
            Iterator<r> iterator = this.dam.iterator();
            while (iterator.hasNext()) {
                r r2 = iterator.next();
                if (r2.aff()) continue;
                if (!r2.afe()) {
                    iterator.remove();
                    r2.afj();
                    continue;
                }
                try {
                    r2.afa();
                }
                catch (Exception exception) {
                    Object object;
                    if (r2.afc()) {
                        object = a.a(exception, "Ticking memory connection");
                        i i2 = ((a)object).dY("Ticking connection");
                        i2.a("Connection", new ah(this, r2));
                        throw new cl((a)object);
                    }
                    daf.warn("Failed to handle packet for " + String.valueOf(r2.afb()), (Throwable)exception);
                    object = new s("Internal server error");
                    r2.a(new bt((ba)object), new ai(this, r2, (s)object), new GenericFutureListener[0]);
                    r2.afi();
                }
            }
        }
    }

    public MinecraftServer afs() {
        return this.daj;
    }
}

