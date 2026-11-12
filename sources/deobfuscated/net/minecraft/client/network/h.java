/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.mojang.authlib.GameProfile
 *  com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 *  io.netty.buffer.Unpooled
 */
package net.minecraft.client.network;

import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfile;
import com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.client.gui.am;
import hackclient.rise.afm;
import hackclient.rise.fd;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.GuardianSound;
import net.minecraft.client.b;
import net.minecraft.client.entity.c;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.bs;
import net.minecraft.client.gui.bx;
import net.minecraft.client.gui.ca;
import net.minecraft.client.gui.cw;
import net.minecraft.client.gui.q;
import net.minecraft.client.gui.r;
import net.minecraft.client.network.i;
import net.minecraft.client.network.j;
import net.minecraft.client.network.k;
import net.minecraft.client.network.o;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.ae;
import net.minecraft.entity.ai;
import net.minecraft.entity.item.d;
import net.minecraft.entity.item.e;
import net.minecraft.entity.item.f;
import net.minecraft.entity.item.g;
import net.minecraft.entity.item.m;
import net.minecraft.entity.item.t;
import net.minecraft.entity.item.v;
import net.minecraft.entity.item.w;
import net.minecraft.entity.n;
import net.minecraft.entity.p;
import net.minecraft.init.Items;
import net.minecraft.item.bo;
import net.minecraft.item.co;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.a;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.ab;
import net.minecraft.network.play.server.ac;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.af;
import net.minecraft.network.play.server.ag;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.aj;
import net.minecraft.network.play.server.al;
import net.minecraft.network.play.server.am;
import net.minecraft.network.play.server.ap;
import net.minecraft.network.play.server.aq;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.at;
import net.minecraft.network.play.server.au;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.aw;
import net.minecraft.network.play.server.ax;
import net.minecraft.network.play.server.ay;
import net.minecraft.network.play.server.az;
import net.minecraft.network.play.server.bb;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.bd;
import net.minecraft.network.play.server.be;
import net.minecraft.network.play.server.bf;
import net.minecraft.network.play.server.bg;
import net.minecraft.network.play.server.bh;
import net.minecraft.network.play.server.bi;
import net.minecraft.network.play.server.bj;
import net.minecraft.network.play.server.bk;
import net.minecraft.network.play.server.bl;
import net.minecraft.network.play.server.bm;
import net.minecraft.network.play.server.bn;
import net.minecraft.network.play.server.bp;
import net.minecraft.network.play.server.bq;
import net.minecraft.network.play.server.br;
import net.minecraft.network.play.server.bu;
import net.minecraft.network.play.server.bv;
import net.minecraft.network.play.server.by;
import net.minecraft.network.play.server.cb;
import net.minecraft.network.play.server.cc;
import net.minecraft.network.play.server.cd;
import net.minecraft.network.play.server.ce;
import net.minecraft.network.play.server.cf;
import net.minecraft.network.play.server.l;
import net.minecraft.network.play.server.u;
import net.minecraft.network.play.server.z;
import net.minecraft.tileentity.x;
import net.minecraft.util.an;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.ct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rise.Client;
import rise.module.impl.exploit.Disabler;
import rise.module.impl.exploit.disabler.KqMode;

public class h
implements Cloneable,
net.minecraft.network.play.a {
    private static final Logger bEK = LogManager.getLogger();
    private final net.minecraft.network.r bEL;
    private final GameProfile bEM;
    private final GuiScreen bEN;
    private Minecraft bEO;
    private net.minecraft.client.multiplayer.j bEP;
    public boolean bEQ;
    private final Map<UUID, o> bER = Maps.newHashMap();
    public int bES = 20;
    private boolean bET = false;
    private final Random bEU = new Random();
    private final Disabler bEV = Client.a.g().c(Disabler.class);

    public h(Minecraft minecraft, GuiScreen guiScreen, net.minecraft.network.r r2, GameProfile gameProfile) {
        this.bEO = minecraft;
        this.bEN = guiScreen;
        this.bEL = r2;
        this.bEM = gameProfile;
    }

    public h Ic() {
        try {
            return (h)super.clone();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public void hu() {
        this.bEP = null;
    }

    @Override
    public void a(net.minecraft.network.play.server.b b2) {
        Object object;
        net.minecraft.network.al.a(b2, this, this.bEO);
        this.bEO.bgu = new net.minecraft.client.multiplayer.d(this.bEO, this);
        this.bEP = new net.minecraft.client.multiplayer.j(this, new net.minecraft.world.an(0L, b2.If(), false, b2.isHardcoreMode(), b2.agn()), b2.getDimension(), b2.agm(), this.bEO.bhw);
        this.bEO.aIY.chN = b2.agm();
        this.bEO.a(this.bEP);
        this.bEO.bgK.csP = b2.getDimension();
        this.bEO.a(new r(this));
        this.bEO.bgK.eu(b2.getEntityId());
        this.bES = b2.getMaxPlayers();
        this.bEO.bgK.bK(b2.isReducedDebugInfo());
        this.bEO.bgu.a(b2.If());
        this.bEO.aIY.QL();
        try {
            Object object2;
            object = null;
            try {
                object2 = this.bEO.Be();
                if (object2 != null && ((net.minecraft.client.multiplayer.f)object2).bDH != null) {
                    object = ((net.minecraft.client.multiplayer.f)object2).bDH;
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if (object == null) {
                try {
                    String string;
                    object2 = this.bEL.afb();
                    if (object2 != null && (string = object2.toString()) != null) {
                        if ((string = string.trim()).startsWith("/")) {
                            string = string.substring(1);
                        }
                        object = string;
                    }
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            afm.sY().bB((String)object);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (this.bEV.isEnabled() && ((Boolean)this.bEV.ws.wD()).booleanValue()) {
            object = (KqMode)this.bEV.ws.wJ();
            if (((Boolean)((KqMode)object).zx.wD()).booleanValue()) {
                return;
            }
        }
        this.bEL.B(new net.minecraft.network.play.client.ab("MC|Brand", new ak(Unpooled.buffer()).eS(b.An())));
    }

    @Override
    public void a(net.minecraft.network.play.server.p p2) {
        net.minecraft.entity.c[] cArray;
        net.minecraft.network.al.a(p2, this, this.bEO);
        double d2 = (double)p2.wt() / 32.0;
        double d3 = (double)p2.wu() / 32.0;
        double d4 = (double)p2.wx() / 32.0;
        net.minecraft.entity.c c2 = null;
        if (p2.agG() == 10) {
            c2 = net.minecraft.entity.item.k.a(this.bEP, d2, d3, d4, m.fh(p2.agH()));
        } else if (p2.agG() == 90) {
            cArray = this.bEP.cn(p2.agH());
            if (cArray instanceof net.minecraft.entity.player.a) {
                c2 = new net.minecraft.entity.projectile.d(this.bEP, d2, d3, d4, (net.minecraft.entity.player.a)cArray);
            }
            p2.gz(0);
        } else if (p2.agG() == 60) {
            c2 = new net.minecraft.entity.projectile.a(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 61) {
            c2 = new net.minecraft.entity.projectile.h(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 71) {
            c2 = new net.minecraft.entity.item.j(this.bEP, new net.minecraft.util.b(bt.aF(d2), bt.aF(d3), bt.aF(d4)), ao.hz(p2.agH()));
            p2.gz(0);
        } else if (p2.agG() == 77) {
            c2 = new net.minecraft.entity.m(this.bEP, new net.minecraft.util.b(bt.aF(d2), bt.aF(d3), bt.aF(d4)));
            p2.gz(0);
        } else if (p2.agG() == 65) {
            c2 = new e(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 72) {
            c2 = new d(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 76) {
            c2 = new net.minecraft.entity.item.h(this.bEP, d2, d3, d4, null);
        } else if (p2.agG() == 63) {
            c2 = new net.minecraft.entity.projectile.e(this.bEP, d2, d3, d4, (double)p2.agB() / 8000.0, (double)p2.agC() / 8000.0, (double)p2.agD() / 8000.0);
            p2.gz(0);
        } else if (p2.agG() == 64) {
            c2 = new net.minecraft.entity.projectile.g(this.bEP, d2, d3, d4, (double)p2.agB() / 8000.0, (double)p2.agC() / 8000.0, (double)p2.agD() / 8000.0);
            p2.gz(0);
        } else if (p2.agG() == 66) {
            c2 = new net.minecraft.entity.projectile.j(this.bEP, d2, d3, d4, (double)p2.agB() / 8000.0, (double)p2.agC() / 8000.0, (double)p2.agD() / 8000.0);
            p2.gz(0);
        } else if (p2.agG() == 62) {
            c2 = new net.minecraft.entity.projectile.b(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 73) {
            c2 = new net.minecraft.entity.projectile.f((net.minecraft.world.w)this.bEP, d2, d3, d4, p2.agH());
            p2.gz(0);
        } else if (p2.agG() == 75) {
            c2 = new f(this.bEP, d2, d3, d4);
            p2.gz(0);
        } else if (p2.agG() == 1) {
            c2 = new net.minecraft.entity.item.b(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 50) {
            c2 = new v(this.bEP, d2, d3, d4, null);
        } else if (p2.agG() == 78) {
            c2 = new net.minecraft.entity.item.a(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 51) {
            c2 = new net.minecraft.entity.item.c(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 2) {
            c2 = new net.minecraft.entity.item.i(this.bEP, d2, d3, d4);
        } else if (p2.agG() == 70) {
            c2 = new g(this.bEP, d2, d3, d4, Block.aL(p2.agH() & 0xFFFF));
            p2.gz(0);
        }
        if (c2 != null) {
            c2.ao = p2.wt();
            c2.ap = p2.wu();
            c2.aq = p2.wx();
            c2.pm = (float)(p2.agE() * 360) / 256.0f;
            c2.pl = (float)(p2.agF() * 360) / 256.0f;
            cArray = c2.Ue();
            if (cArray != null) {
                int n2 = p2.getEntityID() - c2.getEntityId();
                for (int i2 = 0; i2 < cArray.length; ++i2) {
                    cArray[i2].eu(cArray[i2].getEntityId() + n2);
                }
            }
            c2.eu(p2.getEntityID());
            this.bEP.a(p2.getEntityID(), c2);
            if (p2.agH() > 0) {
                net.minecraft.entity.c c3;
                if (p2.agG() == 60 && (c3 = this.bEP.cn(p2.agH())) instanceof net.minecraft.entity.r && c2 instanceof net.minecraft.entity.projectile.a) {
                    ((net.minecraft.entity.projectile.a)c2).cJY = c3;
                }
                c2.P((double)p2.agB() / 8000.0, (double)p2.agC() / 8000.0, (double)p2.agD() / 8000.0);
            }
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.s s2) {
        net.minecraft.network.al.a(s2, this, this.bEO);
        w w2 = new w(this.bEP, (double)s2.wt() / 32.0, (double)s2.wu() / 32.0, (double)s2.wx() / 32.0, s2.getXPValue());
        w2.ao = s2.wt();
        w2.ap = s2.wu();
        w2.aq = s2.wx();
        w2.pl = 0.0f;
        w2.pm = 0.0f;
        w2.eu(s2.getEntityID());
        this.bEP.a(s2.getEntityID(), (net.minecraft.entity.c)w2);
    }

    @Override
    public void a(aw aw2) {
        net.minecraft.network.al.a(aw2, this, this.bEO);
        double d2 = (double)aw2.ahx() / 32.0;
        double d3 = (double)aw2.ahy() / 32.0;
        double d4 = (double)aw2.ahz() / 32.0;
        net.minecraft.entity.effect.a a2 = null;
        if (aw2.ahA() == 1) {
            a2 = new net.minecraft.entity.effect.a(this.bEP, d2, d3, d4);
        }
        if (a2 != null) {
            a2.ao = aw2.ahx();
            a2.ap = aw2.ahy();
            a2.aq = aw2.ahz();
            a2.pl = 0.0f;
            a2.pm = 0.0f;
            a2.eu(aw2.ahw());
            this.bEP.ay(a2);
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.r r2) {
        net.minecraft.network.al.a(r2, this, this.bEO);
        t t2 = new t(this.bEP, r2.yl(), r2.yx(), r2.getTitle());
        this.bEP.a(r2.getEntityID(), (net.minecraft.entity.c)t2);
    }

    @Override
    public void a(net.minecraft.network.play.server.t t2) {
        net.minecraft.network.al.a(t2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(t2.getEntityID());
        if (c2 != null) {
            c2.P((double)t2.agN() / 8000.0, (double)t2.agO() / 8000.0, (double)t2.agP() / 8000.0);
        }
    }

    @Override
    public void a(ad ad2) {
        net.minecraft.network.al.a(ad2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(ad2.getEntityId());
        if (c2 != null && ad2.agX() != null) {
            c2.Tp().B(ad2.agX());
        }
    }

    @Override
    public void b(net.minecraft.network.play.server.n n2) {
        net.minecraft.network.al.a(n2, this, this.bEO);
        double d2 = (double)n2.wt() / 32.0;
        double d3 = (double)n2.wu() / 32.0;
        double d4 = (double)n2.wx() / 32.0;
        float f2 = (float)(n2.agx() * 360) / 256.0f;
        float f3 = (float)(n2.agy() * 360) / 256.0f;
        net.minecraft.client.entity.b b2 = new net.minecraft.client.entity.b(this.bEO.bgF, this.d(n2.agw()).Ie());
        b2.ao = n2.wt();
        b2.crF = b2.csh = (double)b2.ao;
        b2.ap = n2.wu();
        b2.crG = b2.csi = (double)b2.ap;
        b2.aq = n2.wx();
        b2.crH = b2.csj = (double)b2.aq;
        int n3 = n2.agz();
        Client.a.n().H().b(b2);
        b2.cHV.cJC[b2.cHV.cJE] = n3 == 0 ? null : new co(net.minecraft.item.d.fT(n3), 1, 0);
        b2.a(d2, d3, d4, f2, f3);
        this.bEP.a(n2.getEntityID(), (net.minecraft.entity.c)b2);
        List<net.minecraft.entity.b> list = n2.agv();
        if (list != null) {
            b2.Tp().B(list);
        }
    }

    @Override
    public void a(z z2) {
        net.minecraft.network.al.a(z2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(z2.getEntityId());
        if (c2 != null) {
            c2.ao = z2.wt();
            c2.ap = z2.wu();
            c2.aq = z2.wx();
            double d2 = (double)c2.ao / 32.0;
            double d3 = (double)c2.ap / 32.0;
            double d4 = (double)c2.aq / 32.0;
            float f2 = (float)(z2.agx() * 360) / 256.0f;
            float f3 = (float)(z2.agy() * 360) / 256.0f;
            if (Math.abs(c2.gW - d2) < 0.03125 && Math.abs(c2.gX - d3) < 0.015625 && Math.abs(c2.gY - d4) < 0.03125) {
                c2.a(c2.gW, c2.gX, c2.gY, f2, f3, 3, true);
            } else {
                c2.a(d2, d3, d4, f2, f3, 3, true);
            }
            c2.aO = z2.agV();
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.k k2) {
        net.minecraft.network.al.a(k2, this, this.bEO);
        if (k2.getHeldItemHotbarIndex() >= 0 && k2.getHeldItemHotbarIndex() < net.minecraft.entity.player.g.acG()) {
            this.bEO.bgK.cHV.cJE = k2.getHeldItemHotbarIndex();
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.v v2) {
        net.minecraft.network.al.a(v2, this, this.bEO);
        net.minecraft.entity.c c2 = v2.l(this.bEP);
        if (c2 != null) {
            c2.ao += v2.agR();
            c2.ap += v2.agS();
            c2.aq += v2.agT();
            double d2 = (double)c2.ao / 32.0;
            double d3 = (double)c2.ap / 32.0;
            double d4 = (double)c2.aq / 32.0;
            float f2 = v2.agU() ? (float)(v2.agx() * 360) / 256.0f : c2.pl;
            float f3 = v2.agU() ? (float)(v2.agy() * 360) / 256.0f : c2.pm;
            c2.a(d2, d3, d4, f2, f3, 3, false);
            c2.aO = v2.agV();
        }
    }

    @Override
    public void a(aa aa2) {
        net.minecraft.network.al.a(aa2, this, this.bEO);
        net.minecraft.entity.c c2 = aa2.l(this.bEP);
        if (c2 != null) {
            float f2 = (float)(aa2.agx() * 360) / 256.0f;
            c2.aR(f2);
        }
    }

    @Override
    public void a(u u2) {
        net.minecraft.network.al.a(u2, this, this.bEO);
        for (int i2 = 0; i2 < u2.agQ().length; ++i2) {
            this.bEP.co(u2.agQ()[i2]);
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.i i2) {
        net.minecraft.network.al.a(i2, this, this.bEO);
        c c2 = this.bEO.bgK;
        double d2 = i2.getX();
        double d3 = i2.getY();
        double d4 = i2.getZ();
        float f2 = i2.getYaw();
        float f3 = i2.getPitch();
        fd fd2 = new fd(new net.minecraft.network.play.client.h(c2.gW, c2.gX, c2.gY, c2.pl, c2.pm, false), d2, d3, d4, f2, f3);
        Client.a.e().d(fd2);
        if (fd2.isCancelled()) {
            return;
        }
        d2 = fd2.getPosX();
        d3 = fd2.getPosY();
        d4 = fd2.getPosZ();
        f2 = fd2.getYaw();
        f3 = fd2.getPitch();
        if (i2.agr().contains((Object)net.minecraft.network.play.server.j.dcn)) {
            d2 += c2.gW;
        } else {
            c2.ud = 0.0;
        }
        if (i2.agr().contains((Object)net.minecraft.network.play.server.j.dco)) {
            d3 += c2.gX;
        } else {
            c2.ue = 0.0;
        }
        if (i2.agr().contains((Object)net.minecraft.network.play.server.j.dcp)) {
            d4 += c2.gY;
        } else {
            c2.uf = 0.0;
        }
        if (i2.agr().contains((Object)net.minecraft.network.play.server.j.dcr)) {
            f3 += c2.pm;
        }
        if (i2.agr().contains((Object)net.minecraft.network.play.server.j.dcq)) {
            f2 += c2.pl;
        }
        c2.a(d2, d3, d4, f2, f3);
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.ACCEPT_TELEPORTATION, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.VAR_INT, (Object)i2.dcm);
            packetWrapper.sendToServer(Protocol1_9To1_8.class);
        }
        this.bEL.B(new net.minecraft.network.play.client.h(d2, d3, d4, f2, f3, false));
        if (!this.bEQ) {
            this.bEO.bgK.crF = this.bEO.bgK.gW;
            this.bEO.bgK.crG = this.bEO.bgK.gX;
            this.bEO.bgK.crH = this.bEO.bgK.gY;
            this.bEQ = true;
            this.bEO.a((GuiScreen)null);
        }
    }

    @Override
    public void a(al al2) {
        net.minecraft.network.al.a(al2, this, this.bEO);
        for (am am2 : al2.ahi()) {
            this.bEP.a(am2.Ab(), am2.yU());
        }
    }

    @Override
    public void a(aj aj2) {
        net.minecraft.network.al.a(aj2, this, this.bEO);
        if (aj2.ahh()) {
            if (aj2.ahg() == 0) {
                this.bEP.b(aj2.getChunkX(), aj2.getChunkZ(), false);
                return;
            }
            this.bEP.b(aj2.getChunkX(), aj2.getChunkZ(), true);
        }
        this.bEP.d(aj2.getChunkX() << 4, 0, aj2.getChunkZ() << 4, (aj2.getChunkX() << 4) + 15, 256, (aj2.getChunkZ() << 4) + 15);
        net.minecraft.world.chunk.a a2 = this.bEP.aL(aj2.getChunkX(), aj2.getChunkZ());
        a2.a(aj2.ahf(), aj2.ahg(), aj2.ahh());
        this.bEP.f(aj2.getChunkX() << 4, 0, aj2.getChunkZ() << 4, (aj2.getChunkX() << 4) + 15, 256, (aj2.getChunkZ() << 4) + 15);
        if (!aj2.ahh() || !(this.bEP.dDl instanceof net.minecraft.world.ag)) {
            a2.axE();
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.an an2) {
        net.minecraft.network.al.a(an2, this, this.bEO);
        this.bEP.a(an2.ahk(), an2.yU());
    }

    @Override
    public void a(net.minecraft.network.play.server.bt bt2) {
        this.bEL.i(bt2.aim());
    }

    @Override
    public void f(ba ba2) {
        this.bEO.a((net.minecraft.client.multiplayer.j)null);
        if (this.bEN != null) {
            if (this.bEN instanceof ca) {
                this.bEO.a(new net.minecraft.realms.a(((ca)this.bEN).FH(), "disconnect.lost", ba2).getProxy());
            } else {
                this.bEO.a(new q(this.bEN, "disconnect.lost", ba2));
            }
        } else {
            this.bEO.a(new q(new net.minecraft.client.gui.aq(new am()), "disconnect.lost", ba2));
        }
    }

    public void u(net.minecraft.network.aj aj2) {
        this.bEL.B(aj2);
    }

    public void v(net.minecraft.network.aj aj2) {
        this.bEL.E(aj2);
    }

    public void w(net.minecraft.network.aj aj2) {
        this.bEL.C(aj2);
    }

    public void x(net.minecraft.network.aj aj2) {
        this.bEL.D(aj2);
    }

    @Override
    public void a(net.minecraft.network.play.server.o o2) {
        net.minecraft.network.al.a(o2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(o2.agA());
        net.minecraft.entity.r r2 = (net.minecraft.entity.r)this.bEP.cn(o2.getEntityID());
        if (r2 == null) {
            r2 = this.bEO.bgK;
        }
        if (c2 != null) {
            if (c2 instanceof w) {
                this.bEP.a(c2, "random.orb", 0.2f, ((this.bEU.nextFloat() - this.bEU.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            } else {
                this.bEP.a(c2, "random.pop", 0.2f, ((this.bEU.nextFloat() - this.bEU.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            this.bEO.bgN.a(new net.minecraft.client.particle.bc((net.minecraft.world.w)this.bEP, c2, r2, 0.5f));
            this.bEP.co(o2.agA());
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.c c2) {
        net.minecraft.network.al.a(c2, this, this.bEO);
        if (c2.ago() == 2) {
            this.bEO.bha.a(c2.DM(), false);
        } else {
            this.bEO.bha.Ey().c(c2.DM());
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.m m2) {
        net.minecraft.network.al.a(m2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(m2.getEntityID());
        if (c2 != null) {
            if (m2.getAnimationType() == 0) {
                net.minecraft.entity.r r2 = (net.minecraft.entity.r)c2;
                r2.swingItem();
            } else if (m2.getAnimationType() == 1) {
                c2.Ua();
            } else if (m2.getAnimationType() == 2) {
                net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)c2;
                a2.a(false, false, false);
            } else if (m2.getAnimationType() == 4) {
                this.bEO.bgN.a(c2, as.dxf);
            } else if (m2.getAnimationType() == 5) {
                this.bEO.bgN.a(c2, as.dxg);
            }
        }
    }

    @Override
    public void a(l l2) {
        net.minecraft.network.al.a(l2, this, this.bEO);
        l2.k(this.bEP).aj(l2.agu());
    }

    @Override
    public void a(net.minecraft.network.play.server.q q2) {
        net.minecraft.network.al.a(q2, this, this.bEO);
        double d2 = (double)q2.wt() / 32.0;
        double d3 = (double)q2.wu() / 32.0;
        double d4 = (double)q2.wx() / 32.0;
        float f2 = (float)(q2.agx() * 360) / 256.0f;
        float f3 = (float)(q2.agy() * 360) / 256.0f;
        net.minecraft.entity.r r2 = (net.minecraft.entity.r)n.a(q2.getEntityType(), (net.minecraft.world.w)this.bEO.bgF);
        r2.ao = q2.wt();
        r2.ap = q2.wu();
        r2.aq = q2.wx();
        r2.cuF = r2.pn = (float)(q2.agM() * 360) / 256.0f;
        net.minecraft.entity.c[] cArray = r2.Ue();
        if (cArray != null) {
            int n2 = q2.getEntityID() - r2.getEntityId();
            for (net.minecraft.entity.c c2 : cArray) {
                c2.eu(c2.getEntityId() + n2);
            }
        }
        r2.eu(q2.getEntityID());
        r2.a(d2, d3, d4, f2, f3);
        r2.ud = (float)q2.agJ() / 8000.0f;
        r2.ue = (float)q2.agK() / 8000.0f;
        r2.uf = (float)q2.agL() / 8000.0f;
        this.bEP.a(q2.getEntityID(), (net.minecraft.entity.c)r2);
        List<net.minecraft.entity.b> list = q2.agI();
        if (list != null) {
            r2.Tp().B(list);
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.d d2) {
        net.minecraft.network.al.a(d2, this, this.bEO);
        this.bEO.bgF.I(d2.getTotalWorldTime());
        this.bEO.bgF.o(d2.getWorldTime());
    }

    @Override
    public void a(net.minecraft.network.play.server.f f2) {
        net.minecraft.network.al.a(f2, this, this.bEO);
        this.bEO.bgK.a(f2.agp(), true);
        this.bEO.bgF.avH().bx(f2.agp());
    }

    @Override
    public void a(ac ac2) {
        net.minecraft.network.al.a(ac2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(ac2.getEntityId());
        net.minecraft.entity.c c3 = this.bEP.cn(ac2.getVehicleEntityId());
        if (ac2.getLeash() == 0) {
            boolean bl2 = false;
            if (ac2.getEntityId() == this.bEO.bgK.getEntityId()) {
                c2 = this.bEO.bgK;
                if (c3 instanceof net.minecraft.entity.item.b) {
                    ((net.minecraft.entity.item.b)c3).aU(false);
                }
                bl2 = c2.crC == null && c3 != null;
            } else if (c3 instanceof net.minecraft.entity.item.b) {
                ((net.minecraft.entity.item.b)c3).aU(true);
            }
            if (c2 == null) {
                return;
            }
            c2.D(c3);
            if (bl2) {
                net.minecraft.client.settings.a a2 = this.bEO.aIY;
                this.bEO.bha.g(I18n.a("mount.onboard", net.minecraft.client.settings.a.dY(a2.chr.cO())), false);
            }
        } else if (ac2.getLeash() == 1 && c2 instanceof p) {
            if (c3 != null) {
                ((p)c2).a(c3, false);
            } else {
                ((p)c2).h(false, false);
            }
        }
    }

    @Override
    public void a(ab ab2) {
        net.minecraft.network.al.a(ab2, this, this.bEO);
        net.minecraft.entity.c c2 = ab2.l(this.bEP);
        if (c2 != null) {
            if (ab2.getOpCode() == 21) {
                this.bEO.Bx().a(new GuardianSound((net.minecraft.entity.monster.r)c2));
            } else {
                c2.a(ab2.getOpCode());
            }
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.g g2) {
        net.minecraft.network.al.a(g2, this, this.bEO);
        this.bEO.bgK.Q(g2.getHealth());
        this.bEO.bgK.abY().hB(g2.getFoodLevel());
        this.bEO.bgK.abY().bJ(g2.getSaturationLevel());
    }

    @Override
    public void a(ag ag2) {
        net.minecraft.network.al.a(ag2, this, this.bEO);
        this.bEO.bgK.a(ag2.aha(), ag2.getTotalExperience(), ag2.getLevel());
    }

    @Override
    public void a(net.minecraft.network.play.server.h h2) {
        net.minecraft.network.al.a(h2, this, this.bEO);
        if (h2.agq() != this.bEO.bgK.csP) {
            this.bEQ = false;
            net.minecraft.scoreboard.i i2 = this.bEP.SD();
            this.bEP = new net.minecraft.client.multiplayer.j(this, new net.minecraft.world.an(0L, h2.If(), false, this.bEO.bgF.avH().azv(), h2.agn()), h2.agq(), h2.agm(), this.bEO.bhw);
            this.bEP.b(i2);
            this.bEO.a(this.bEP);
            this.bEO.bgK.csP = h2.agq();
            this.bEO.a(new r(this));
        }
        this.bEO.bx(h2.agq());
        this.bEO.bgu.a(h2.If());
    }

    @Override
    public void a(ar ar2) {
        net.minecraft.network.al.a(ar2, this, this.bEO);
        net.minecraft.world.h h2 = new net.minecraft.world.h(this.bEO.bgF, null, ar2.getX(), ar2.getY(), ar2.getZ(), ar2.getStrength(), ar2.ahp());
        h2.cs(true);
        this.bEO.bgK.ud += (double)ar2.ahm();
        this.bEO.bgK.ue += (double)ar2.ahn();
        this.bEO.bgK.uf += (double)ar2.aho();
        if (ar2.ahm() != 0.0f && ar2.ahn() != 0.0f && ar2.aho() != 0.0f) {
            this.bEO.bgK.ae = 0;
        }
    }

    @Override
    public void a(ax ax2) {
        net.minecraft.network.al.a(ax2, this, this.bEO);
        c c2 = this.bEO.bgK;
        if ("minecraft:container".equals(ax2.getGuiId())) {
            c2.a(new net.minecraft.inventory.ad(ax2.ahB(), ax2.getSlotCount()));
            c2.cHY.cSL = ax2.getWindowId();
        } else if ("minecraft:villager".equals(ax2.getGuiId())) {
            c2.a(new ai(c2, ax2.ahB()));
            c2.cHY.cSL = ax2.getWindowId();
        } else if ("EntityHorse".equals(ax2.getGuiId())) {
            net.minecraft.entity.c c3 = this.bEP.cn(ax2.getEntityId());
            if (c3 instanceof net.minecraft.entity.passive.f) {
                c2.a((net.minecraft.entity.passive.f)c3, new net.minecraft.inventory.a(ax2.ahB(), ax2.getSlotCount()));
                c2.cHY.cSL = ax2.getWindowId();
            }
        } else if (!ax2.hasSlots()) {
            c2.a(new net.minecraft.client.player.inventory.b(ax2.getGuiId(), ax2.ahB()));
            c2.cHY.cSL = ax2.getWindowId();
        } else {
            net.minecraft.client.player.inventory.a a2 = new net.minecraft.client.player.inventory.a(ax2.getGuiId(), ax2.ahB(), ax2.getSlotCount());
            c2.a(a2);
            c2.cHY.cSL = ax2.getWindowId();
        }
    }

    @Override
    public void a(az az2) {
        net.minecraft.network.al.a(az2, this, this.bEO);
        c c2 = this.bEO.bgK;
        if (az2.ahC() == -1) {
            c2.cHV.e(az2.ahE());
        } else {
            Object object;
            boolean bl2 = false;
            if (this.bEO.bgR instanceof net.minecraft.client.gui.inventory.j) {
                object = (net.minecraft.client.gui.inventory.j)this.bEO.bgR;
                boolean bl3 = bl2 = ((net.minecraft.client.gui.inventory.j)object).GH() != net.minecraft.creativetab.a.cpI.SO();
            }
            if (az2.ahC() == 0 && az2.ahD() >= 36 && az2.ahD() < 45) {
                object = c2.cHX.fM(az2.ahD()).ls();
                if (az2.ahE() != null && (object == null || ((co)object).cWZ < az2.ahE().cWZ)) {
                    az2.ahE().cXc = 5;
                }
                try {
                    az2.ahE().cXa = c2.cHV.cJC[az2.ahD() - 36].cXa;
                    c2.cHX.i(az2.ahD(), az2.ahE());
                }
                catch (Exception exception) {
                    c2.cHX.i(az2.ahD(), az2.ahE());
                }
            } else if (!(az2.ahC() != c2.cHY.cSL || az2.ahC() == 0 && bl2)) {
                c2.cHY.i(az2.ahD(), az2.ahE());
            }
        }
    }

    @Override
    public void a(bc bc2) {
        net.minecraft.network.al.a(bc2, this, this.bEO);
        net.minecraft.inventory.b b2 = null;
        c c2 = this.bEO.bgK;
        if (bc2.getWindowId() == 0) {
            b2 = c2.cHX;
        } else if (bc2.getWindowId() == c2.cHY.cSL) {
            b2 = c2.cHY;
        }
        if (b2 != null && !bc2.ahJ()) {
            this.u(new s(bc2.getWindowId(), bc2.getActionNumber(), true));
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            this.u(new s(bc2.getWindowId(), 0, false));
            return;
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.ba ba2) {
        net.minecraft.network.al.a(ba2, this, this.bEO);
        c c2 = this.bEO.bgK;
        if (ba2.ahF() == 0) {
            c2.cHX.a(ba2.ahG());
        } else if (ba2.ahF() == c2.cHY.cSL) {
            c2.cHY.a(ba2.ahG());
        }
    }

    @Override
    public void a(bg bg2) {
        net.minecraft.network.al.a(bg2, this, this.bEO);
        net.minecraft.tileentity.d d2 = this.bEP.K(bg2.ahL());
        if (!(d2 instanceof net.minecraft.tileentity.ag)) {
            d2 = new net.minecraft.tileentity.ag();
            d2.n(this.bEP);
            d2.ap(bg2.ahL());
        }
        this.bEO.bgK.a((net.minecraft.tileentity.ag)d2);
    }

    @Override
    public void a(bd bd2) {
        net.minecraft.tileentity.d d2;
        net.minecraft.network.al.a(bd2, this, this.bEO);
        boolean bl2 = false;
        if (this.bEO.bgF.aJ(bd2.Ab()) && (d2 = this.bEO.bgF.K(bd2.Ab())) instanceof net.minecraft.tileentity.ag) {
            net.minecraft.tileentity.ag ag2 = (net.minecraft.tileentity.ag)d2;
            if (ag2.aqO()) {
                System.arraycopy(bd2.age(), 0, ag2.dtx, 0, 4);
                ag2.Lw();
            }
            bl2 = true;
        }
        if (!bl2 && this.bEO.bgK != null) {
            this.bEO.bgK.a(new net.minecraft.util.s("Unable to locate sign at " + bd2.Ab().wt() + ", " + bd2.Ab().wu() + ", " + bd2.Ab().wx()));
        }
    }

    @Override
    public void a(bf bf2) {
        net.minecraft.network.al.a(bf2, this, this.bEO);
        if (this.bEO.bgF.aJ(bf2.Ab())) {
            net.minecraft.tileentity.d d2 = this.bEO.bgF.K(bf2.Ab());
            int n2 = bf2.getTileEntityType();
            if (n2 == 1 && d2 instanceof net.minecraft.tileentity.ab || n2 == 2 && d2 instanceof net.minecraft.tileentity.o || n2 == 3 && d2 instanceof net.minecraft.tileentity.j || n2 == 4 && d2 instanceof net.minecraft.tileentity.aj || n2 == 5 && d2 instanceof x || n2 == 6 && d2 instanceof net.minecraft.tileentity.h) {
                d2.a(bf2.ahK());
            }
        }
    }

    @Override
    public void a(bb bb2) {
        net.minecraft.network.al.a(bb2, this, this.bEO);
        c c2 = this.bEO.bgK;
        if (c2.cHY != null && c2.cHY.cSL == bb2.getWindowId()) {
            c2.cHY.aq(bb2.ahH(), bb2.ahI());
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.e e2) {
        net.minecraft.network.al.a(e2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(e2.getEntityID());
        if (c2 != null) {
            c2.c(e2.getEquipmentSlot(), e2.bO());
        }
    }

    @Override
    public void a(ay ay2) {
        net.minecraft.network.al.a(ay2, this, this.bEO);
        this.bEO.bgK.Dr();
    }

    @Override
    public void a(net.minecraft.network.play.server.ao ao2) {
        net.minecraft.network.al.a(ao2, this, this.bEO);
        this.bEO.bgF.c(ao2.ahk(), ao2.ahl(), ao2.getData1(), ao2.getData2());
    }

    @Override
    public void a(ap ap2) {
        net.minecraft.network.al.a(ap2, this, this.bEO);
        this.bEO.bgF.b(ap2.getBreakerId(), ap2.yl(), ap2.getProgress());
    }

    @Override
    public void a(aq aq2) {
        net.minecraft.network.al.a(aq2, this, this.bEO);
        for (int i2 = 0; i2 < aq2.getChunkCount(); ++i2) {
            int n2 = aq2.gA(i2);
            int n3 = aq2.gB(i2);
            this.bEP.b(n2, n3, true);
            this.bEP.d(n2 << 4, 0, n3 << 4, (n2 << 4) + 15, 256, (n3 << 4) + 15);
            net.minecraft.world.chunk.a a2 = this.bEP.aL(n2, n3);
            a2.a(aq2.gC(i2), aq2.gD(i2), true);
            this.bEP.f(n2 << 4, 0, n3 << 4, (n2 << 4) + 15, 256, (n3 << 4) + 15);
            if (this.bEP.dDl instanceof net.minecraft.world.ag) continue;
            a2.axE();
        }
    }

    @Override
    public void a(av av2) {
        net.minecraft.network.al.a(av2, this, this.bEO);
        c c2 = this.bEO.bgK;
        int n2 = av2.getGameState();
        float f2 = av2.ahv();
        int n3 = bt.bL(f2 + 0.5f);
        if (n2 >= 0 && n2 < av.deb.length && av.deb[n2] != null) {
            ((net.minecraft.entity.player.a)c2).b(new net.minecraft.util.t(av.deb[n2], new Object[0]));
        }
        if (n2 == 1) {
            this.bEP.avH().cG(true);
            this.bEP.cb(0.0f);
        } else if (n2 == 2) {
            this.bEP.avH().cG(false);
            this.bEP.cb(1.0f);
        } else if (n2 == 3) {
            this.bEO.bgu.a(net.minecraft.world.ao.ii(n3));
        } else if (n2 == 4) {
            this.bEO.a(new net.minecraft.client.gui.ct());
        } else if (n2 == 5) {
            net.minecraft.client.settings.a a2 = this.bEO.aIY;
            if (f2 == 0.0f) {
                this.bEO.a(new bx());
            } else if (f2 == 101.0f) {
                this.bEO.bha.Ey().c(new net.minecraft.util.t("demo.help.movement", net.minecraft.client.settings.a.dY(a2.chm.cO()), net.minecraft.client.settings.a.dY(a2.chn.cO()), net.minecraft.client.settings.a.dY(a2.cho.cO()), net.minecraft.client.settings.a.dY(a2.chp.cO())));
            } else if (f2 == 102.0f) {
                this.bEO.bha.Ey().c(new net.minecraft.util.t("demo.help.jump", net.minecraft.client.settings.a.dY(a2.chq.cO())));
            } else if (f2 == 103.0f) {
                this.bEO.bha.Ey().c(new net.minecraft.util.t("demo.help.inventory", net.minecraft.client.settings.a.dY(a2.cht.cO())));
            }
        } else if (n2 == 6) {
            this.bEP.a(c2.gW, c2.gX + (double)c2.getEyeHeight(), c2.gY, "random.successful_hit", 0.18f, 0.45f, false);
        } else if (n2 == 7) {
            this.bEP.cb(f2);
        } else if (n2 == 8) {
            this.bEP.bZ(f2);
        } else if (n2 == 10) {
            this.bEP.a(as.dxL, c2.gW, c2.gX, c2.gY, 0.0, 0.0, 0.0, new int[0]);
            this.bEP.a(c2.gW, c2.gX, c2.gY, "mob.guardian.curse", 1.0f, 1.0f, false);
        }
    }

    @Override
    public void a(be be2) {
        net.minecraft.network.al.a(be2, this, this.bEO);
        net.minecraft.world.storage.f f2 = bo.b(be2.getMapId(), this.bEO.bgF);
        be2.c(f2);
        this.bEO.bgT.Jp().a(f2);
    }

    @Override
    public void a(net.minecraft.network.play.server.as as2) {
        net.minecraft.network.al.a(as2, this, this.bEO);
        if (as2.isSoundServerwide()) {
            this.bEO.bgF.d(as2.getSoundType(), as2.ahq(), as2.getSoundData());
        } else {
            this.bEO.bgF.e(as2.getSoundType(), as2.ahq(), as2.getSoundData());
        }
    }

    @Override
    public void a(bh bh2) {
        net.minecraft.network.al.a(bh2, this, this.bEO);
        boolean bl2 = false;
        for (Map.Entry<net.minecraft.stats.f, Integer> entry : bh2.ahM().entrySet()) {
            net.minecraft.stats.f f2 = entry.getKey();
            int n2 = entry.getValue();
            if (f2.apo() && n2 > 0) {
                if (this.bET && this.bEO.bgK.Dx().c(f2) == 0) {
                    net.minecraft.stats.a a2 = (net.minecraft.stats.a)f2;
                    this.bEO.bgZ.a(a2);
                    if (f2 == net.minecraft.stats.b.doE) {
                        this.bEO.aIY.cgW = false;
                        this.bEO.aIY.QK();
                    }
                }
                bl2 = true;
            }
            this.bEO.bgK.Dx().b(this.bEO.bgK, f2, n2);
        }
        if (!this.bET && !bl2 && this.bEO.aIY.cgW) {
            this.bEO.bgZ.b(net.minecraft.stats.b.doE);
        }
        this.bET = true;
        if (this.bEO.bgR instanceof cw) {
            ((cw)((Object)this.bEO.bgR)).Gn();
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.ae ae2) {
        net.minecraft.network.al.a(ae2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(ae2.getEntityId());
        if (c2 instanceof net.minecraft.entity.r) {
            net.minecraft.potion.d d2 = new net.minecraft.potion.d(ae2.getEffectId(), ae2.getDuration(), ae2.getAmplifier(), false, ae2.agZ());
            d2.bW(ae2.agY());
            ((net.minecraft.entity.r)c2).b(d2);
        }
    }

    @Override
    public void a(bv bv2) {
        net.minecraft.network.al.a(bv2, this, this.bEO);
    }

    @Override
    public void a(bu bu2) {
        net.minecraft.network.al.a(bu2, this, this.bEO);
        this.bEO.bgF.avH().c(bu2.agm());
        this.bEO.bgF.avH().cJ(bu2.isDifficultyLocked());
    }

    @Override
    public void a(net.minecraft.network.play.server.bx bx2) {
        net.minecraft.network.al.a(bx2, this, this.bEO);
        net.minecraft.entity.c c2 = bx2.l(this.bEP);
        if (c2 != null) {
            this.bEO.C(c2);
        }
    }

    @Override
    public void a(by by2) {
        net.minecraft.network.al.a(by2, this, this.bEO);
        by2.a(this.bEP.Sv());
    }

    @Override
    public void a(net.minecraft.network.play.server.ca ca2) {
        net.minecraft.network.al.a(ca2, this, this.bEO);
        cb cb2 = ca2.aip();
        String string = null;
        String string2 = null;
        String string3 = ca2.aiq() != null ? ca2.aiq().getFormattedText() : "";
        switch (cb2) {
            case dfG: {
                string = string3;
                break;
            }
            case dfH: {
                string2 = string3;
                break;
            }
            case dfK: {
                this.bEO.bha.a("", "", -1, -1, -1);
                this.bEO.bha.Eu();
                return;
            }
        }
        this.bEO.bha.a(string, string2, ca2.getFadeInTime(), ca2.getDisplayTime(), ca2.getFadeOutTime());
    }

    @Override
    public void a(cc cc2) {
        if (!this.bEL.afc()) {
            this.bEL.gp(cc2.ait());
        }
    }

    @Override
    public void a(cd cd2) {
        this.bEO.bha.EC().e(cd2.aiu().getFormattedText().length() == 0 ? null : cd2.aiu());
        this.bEO.bha.EC().d(cd2.aiv().getFormattedText().length() == 0 ? null : cd2.aiv());
    }

    @Override
    public void a(af af2) {
        net.minecraft.network.al.a(af2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(af2.getEntityId());
        if (c2 instanceof net.minecraft.entity.r) {
            ((net.minecraft.entity.r)c2).eK(af2.getEffectId());
        }
    }

    @Override
    public void b(bi bi2) {
        net.minecraft.network.al.a(bi2, this, this.bEO);
        for (bk bk2 : bi2.ahN()) {
            if (bi2.ahO() == bj.deC) {
                this.bER.remove(bk2.afK().getId());
                continue;
            }
            o o2 = this.bER.get(bk2.afK().getId());
            if (bi2.ahO() == bj.dey) {
                o2 = new o(bk2);
                this.bER.put(o2.Ie().getId(), o2);
            }
            if (o2 == null) continue;
            switch (bi2.ahO()) {
                case dey: {
                    o2.a(bk2.ahQ());
                    o2.cp(bk2.aG());
                    break;
                }
                case dez: {
                    o2.a(bk2.ahQ());
                    break;
                }
                case deA: {
                    o2.cp(bk2.aG());
                    break;
                }
                case deB: {
                    o2.g(bk2.xW());
                }
            }
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.a a2) {
        this.u(new a(a2.agl()));
    }

    @Override
    public void a(bl bl2) {
        net.minecraft.network.al.a(bl2, this, this.bEO);
        c c2 = this.bEO.bgK;
        c2.cIt.cJK = bl2.isFlying();
        c2.cIt.cJM = bl2.isCreativeMode();
        c2.cIt.cJJ = bl2.isInvulnerable();
        c2.cIt.cJL = bl2.isAllowFlying();
        c2.cIt.bt(bl2.getFlySpeed());
        c2.cIt.bu(bl2.getWalkSpeed());
    }

    @Override
    public void a(bm bm2) {
        net.minecraft.network.al.a(bm2, this, this.bEO);
        String[] stringArray = bm2.ahR();
        if (this.bEO.bgR instanceof net.minecraft.client.gui.f) {
            net.minecraft.client.gui.f f2 = (net.minecraft.client.gui.f)this.bEO.bgR;
            f2.h(stringArray);
        }
    }

    @Override
    public void a(at at2) {
        net.minecraft.network.al.a(at2, this, this.bEO);
        this.bEO.bgF.a(at2.getX(), at2.getY(), at2.getZ(), at2.getSoundName(), at2.getVolume(), at2.getPitch(), false);
    }

    @Override
    public void a(ce ce2) {
        String string = ce2.getURL();
        String string2 = ce2.getHash();
        if (string.startsWith("level://")) {
            File file = new File(this.bEO.bhf, "saves");
            String string3 = string.substring("level://".length());
            File file2 = new File(file, string3);
            if (file2.isFile()) {
                this.bEL.B(new net.minecraft.network.play.client.ad(string2, net.minecraft.network.play.client.ae.dbZ));
                Futures.addCallback(this.bEO.Bs().f(file2), (FutureCallback)new i(this, string2));
            } else {
                this.bEL.B(new net.minecraft.network.play.client.ad(string2, net.minecraft.network.play.client.ae.dbY));
            }
        } else if (this.bEO.Be() != null && this.bEO.Be().HE() == net.minecraft.client.multiplayer.g.bDS) {
            this.bEL.B(new net.minecraft.network.play.client.ad(string2, net.minecraft.network.play.client.ae.dbZ));
            Futures.addCallback(this.bEO.Bs().L(string, string2), (FutureCallback)new j(this, string2));
        } else if (this.bEO.Be() != null && this.bEO.Be().HE() != net.minecraft.client.multiplayer.g.bDU) {
            this.bEL.B(new net.minecraft.network.play.client.ad(string2, net.minecraft.network.play.client.ae.dbX));
        } else {
            this.bEO.f(new k(this, string2, string));
        }
    }

    @Override
    public void a(cf cf2) {
        net.minecraft.network.al.a(cf2, this, this.bEO);
        net.minecraft.entity.c c2 = cf2.l(this.bEP);
        if (c2 != null) {
            c2.l(cf2.aek());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.network.play.server.bs bs2) {
        net.minecraft.network.al.a(bs2, this, this.bEO);
        if ("MC|TrList".equals(bs2.getChannelName())) {
            ak ak2 = bs2.agj();
            try {
                int n2 = ak2.readInt();
                GuiScreen guiScreen = this.bEO.bgR;
                if (guiScreen == null || !(guiScreen instanceof net.minecraft.client.gui.ao) || n2 != this.bEO.bgK.cHY.cSL) return;
                ae ae2 = ((net.minecraft.client.gui.ao)guiScreen).EL();
                net.minecraft.village.b b2 = net.minecraft.village.b.g(ak2);
                ae2.a(b2);
                return;
            }
            catch (IOException iOException) {
                bEK.error("Couldn't load trade info", (Throwable)iOException);
                return;
            }
            finally {
                ak2.release();
            }
        } else if ("MC|Brand".equals(bs2.getChannelName())) {
            this.bEO.bgK.cF(bs2.agj().gs(Short.MAX_VALUE));
            return;
        } else {
            co co2;
            if (!"MC|BOpen".equals(bs2.getChannelName()) || (co2 = this.bEO.bgK.abO()) == null || co2.bP() != Items.cRR) return;
            this.bEO.a(new bs(this.bEO.bgK, co2, false));
        }
    }

    @Override
    public void a(bn bn2) {
        net.minecraft.network.al.a(bn2, this, this.bEO);
        net.minecraft.scoreboard.i i2 = this.bEP.SD();
        if (bn2.ahS() == 0) {
            net.minecraft.scoreboard.g g2 = i2.a(bn2.getObjectiveName(), net.minecraft.scoreboard.b.djq);
            g2.ap(bn2.getObjectiveValue());
            g2.a(bn2.ahT());
        } else {
            net.minecraft.scoreboard.g g3 = i2.fo(bn2.getObjectiveName());
            if (bn2.ahS() == 1) {
                i2.c(g3);
            } else if (bn2.ahS() == 2) {
                g3.ap(bn2.getObjectiveValue());
                g3.a(bn2.ahT());
            }
        }
    }

    @Override
    public void a(net.minecraft.network.play.server.bo bo2) {
        net.minecraft.network.al.a(bo2, this, this.bEO);
        net.minecraft.scoreboard.i i2 = this.bEP.SD();
        net.minecraft.scoreboard.g g2 = i2.fo(bo2.getObjectiveName());
        if (bo2.ahU() == bp.deP) {
            net.minecraft.scoreboard.d d2 = i2.b(bo2.getPlayerName(), g2);
            d2.gW(bo2.getScoreValue());
        } else if (bo2.ahU() == bp.deQ) {
            if (ct.cU(bo2.getObjectiveName())) {
                i2.c(bo2.getPlayerName(), null);
            } else if (g2 != null) {
                i2.c(bo2.getPlayerName(), g2);
            }
        }
    }

    @Override
    public void a(bq bq2) {
        net.minecraft.network.al.a(bq2, this, this.bEO);
        net.minecraft.scoreboard.i i2 = this.bEP.SD();
        if (bq2.getScoreName().length() == 0) {
            i2.a(bq2.getPosition(), null);
        } else {
            net.minecraft.scoreboard.g g2 = i2.fo(bq2.getScoreName());
            i2.a(bq2.getPosition(), g2);
        }
    }

    @Override
    public void a(br br2) {
        net.minecraft.network.al.a(br2, this, this.bEO);
        net.minecraft.scoreboard.i i2 = this.bEP.SD();
        net.minecraft.scoreboard.h h2 = br2.aii() == 0 ? i2.fq(br2.aid()) : i2.dX(br2.aid());
        if (br2.aii() == 0 || br2.aii() == 2) {
            h2.fl(br2.aie());
            h2.fm(br2.aif());
            h2.fn(br2.aig());
            h2.a(an.hx(br2.aik()));
            h2.gX(br2.aij());
            Object object = net.minecraft.scoreboard.m.fv(br2.ail());
            if (object != null) {
                h2.a((net.minecraft.scoreboard.m)((Object)object));
            }
        }
        if (br2.aii() == 0 || br2.aii() == 3) {
            for (String string : br2.aih()) {
                i2.T(string, br2.aid());
            }
        }
        if (br2.aii() == 4) {
            for (String string : br2.aih()) {
                i2.a(string, h2);
            }
        }
        if (br2.aii() == 1) {
            i2.a(h2);
        }
    }

    @Override
    public void a(au au2) {
        net.minecraft.network.al.a(au2, this, this.bEO);
        if (au2.getParticleCount() == 0) {
            double d2 = au2.getParticleSpeed() * au2.getXOffset();
            double d3 = au2.getParticleSpeed() * au2.getYOffset();
            double d4 = au2.getParticleSpeed() * au2.getZOffset();
            try {
                this.bEP.a(au2.Zw(), au2.isLongDistance(), au2.ahr(), au2.ahs(), au2.aht(), d2, d3, d4, au2.ahu());
            }
            catch (Throwable throwable) {
                bEK.warn("Could not spawn particle effect " + String.valueOf((Object)au2.Zw()));
            }
        } else {
            for (int i2 = 0; i2 < au2.getParticleCount(); ++i2) {
                double d5 = this.bEU.nextGaussian() * (double)au2.getXOffset();
                double d6 = this.bEU.nextGaussian() * (double)au2.getYOffset();
                double d7 = this.bEU.nextGaussian() * (double)au2.getZOffset();
                double d8 = this.bEU.nextGaussian() * (double)au2.getParticleSpeed();
                double d9 = this.bEU.nextGaussian() * (double)au2.getParticleSpeed();
                double d10 = this.bEU.nextGaussian() * (double)au2.getParticleSpeed();
                try {
                    this.bEP.a(au2.Zw(), au2.isLongDistance(), au2.ahr() + d5, au2.ahs() + d6, au2.aht() + d7, d8, d9, d10, au2.ahu());
                    continue;
                }
                catch (Throwable throwable) {
                    bEK.warn("Could not spawn particle effect " + String.valueOf((Object)au2.Zw()));
                    return;
                }
            }
        }
    }

    @Override
    public void a(ah ah2) {
        net.minecraft.network.al.a(ah2, this, this.bEO);
        net.minecraft.entity.c c2 = this.bEP.cn(ah2.getEntityId());
        if (c2 != null) {
            if (!(c2 instanceof net.minecraft.entity.r)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + String.valueOf(c2) + ")");
            }
            net.minecraft.entity.ai.attributes.c c3 = ((net.minecraft.entity.r)c2).VX();
            for (net.minecraft.network.play.server.ai ai2 : ah2.ahb()) {
                net.minecraft.entity.ai.attributes.e e2 = c3.ef(ai2.ahc());
                if (e2 == null) {
                    e2 = c3.c(new net.minecraft.entity.ai.attributes.g(null, ai2.ahc(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
                }
                e2.ap(ai2.ahd());
                e2.XA();
                for (net.minecraft.entity.ai.attributes.a a2 : ai2.ahe()) {
                    e2.c(a2);
                }
            }
        }
    }

    public net.minecraft.network.r dr() {
        return this.bEL;
    }

    public Collection<o> Id() {
        return this.bER.values();
    }

    public o d(UUID uUID) {
        return this.bER.get(uUID);
    }

    public o df(String string) {
        for (o o2 : this.bER.values()) {
            if (!o2.Ie().getName().equals(string)) continue;
            return o2;
        }
        return null;
    }

    public GameProfile Ie() {
        return this.bEM;
    }

    public /* synthetic */ Object clone() {
        return this.Ic();
    }
}

