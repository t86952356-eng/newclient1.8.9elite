/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 *  com.google.common.primitives.Floats
 *  com.google.common.util.concurrent.Futures
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.network;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.f;
import net.minecraft.init.Items;
import net.minecraft.item.as;
import net.minecraft.item.co;
import net.minecraft.item.cr;
import net.minecraft.nbt.g;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.al;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.a;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.ab;
import net.minecraft.network.play.client.ac;
import net.minecraft.network.play.client.ad;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.l;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.p;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.client.t;
import net.minecraft.network.play.client.u;
import net.minecraft.network.play.client.v;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.client.x;
import net.minecraft.network.play.client.y;
import net.minecraft.network.play.client.z;
import net.minecraft.network.play.server.an;
import net.minecraft.network.play.server.az;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.bm;
import net.minecraft.network.play.server.bt;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.UserListBansEntry;
import net.minecraft.tileentity.ag;
import net.minecraft.tileentity.o;
import net.minecraft.util.ao;
import net.minecraft.util.ba;
import net.minecraft.util.bi;
import net.minecraft.util.bj;
import net.minecraft.util.cl;
import net.minecraft.world.ai;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h
implements b,
bi {
    private static final Logger cYT = LogManager.getLogger();
    public final net.minecraft.network.r cYU;
    private final MinecraftServer cYV;
    public net.minecraft.entity.player.e cYW;
    private int cYX;
    private int cYY;
    private int cYZ;
    private boolean cZa;
    private int cZb;
    private long cZc;
    private long cZd;
    private int cZe;
    private int cZf;
    private final bj<Short> cZg = new bj();
    private double OZ;
    private double cZh;
    private double Pa;
    private boolean cZi = true;

    public h(MinecraftServer minecraftServer, net.minecraft.network.r r2, net.minecraft.entity.player.e e2) {
        this.cYV = minecraftServer;
        this.cYU = r2;
        r2.b(this);
        this.cYW = e2;
        e2.cIX = this;
    }

    @Override
    public void jA() {
        this.cZa = false;
        ++this.cYX;
        this.cYV.dkB.eY("keepAlive");
        if ((long)this.cYX - this.cZd > 40L) {
            this.cZd = this.cYX;
            this.cZc = this.aeY();
            this.cZb = (int)this.cZc;
            this.B(new net.minecraft.network.play.server.a(this.cZb));
        }
        this.cYV.dkB.ajv();
        if (this.cZe > 0) {
            --this.cZe;
        }
        if (this.cZf > 0) {
            --this.cZf;
        }
        if (this.cYW.acx() > 0L && this.cYV.alO() > 0 && MinecraftServer.alN() - this.cYW.acx() > (long)(this.cYV.alO() * 1000 * 60)) {
            this.eQ("You have been idle for too long!");
        }
    }

    public net.minecraft.network.r dr() {
        return this.cYU;
    }

    public void eQ(String string) {
        net.minecraft.util.s s2 = new net.minecraft.util.s(string);
        this.cYU.a(new bt(s2), new net.minecraft.network.i(this, s2), new GenericFutureListener[0]);
        this.cYU.afi();
        Futures.getUnchecked(this.cYV.f(new net.minecraft.network.j(this)));
    }

    @Override
    public void a(p p2) {
        al.a(p2, this, this.cYW.acr());
        this.cYW.b(p2.getStrafeSpeed(), p2.getForwardSpeed(), p2.isJumping(), p2.isSneaking());
    }

    private boolean b(e e2) {
        return !Doubles.isFinite((double)e2.afS()) || !Doubles.isFinite((double)e2.afT()) || !Doubles.isFinite((double)e2.afU()) || !Floats.isFinite((float)e2.getPitch()) || !Floats.isFinite((float)e2.getYaw());
    }

    @Override
    public void c(e e2) {
        al.a(e2, this, this.cYW.acr());
        if (this.b(e2)) {
            this.eQ("Invalid move packet received");
        } else {
            ai ai2 = this.cYV.ha(this.cYW.csP);
            this.cZa = true;
            if (!this.cYW.cJp) {
                double d2 = this.cYW.gW;
                double d3 = this.cYW.gX;
                double d4 = this.cYW.gY;
                double d5 = 0.0;
                double d6 = e2.afS() - this.OZ;
                double d7 = e2.afT() - this.cZh;
                double d8 = e2.afU() - this.Pa;
                if (e2.isMoving()) {
                    d5 = d6 * d6 + d7 * d7 + d8 * d8;
                    if (!this.cZi && d5 < 0.25) {
                        this.cZi = true;
                    }
                }
                if (this.cZi) {
                    this.cYY = this.cYX;
                    if (this.cYW.crC != null) {
                        float f2 = this.cYW.pl;
                        float f3 = this.cYW.pm;
                        this.cYW.crC.TV();
                        double d9 = this.cYW.gW;
                        double d10 = this.cYW.gX;
                        double d11 = this.cYW.gY;
                        if (e2.afV()) {
                            f2 = e2.getYaw();
                            f3 = e2.getPitch();
                        }
                        this.cYW.aO = e2.isOnGround();
                        this.cYW.acj();
                        this.cYW.a(d9, d10, d11, f2, f3);
                        if (this.cYW.crC != null) {
                            this.cYW.crC.TV();
                        }
                        this.cYV.alE().r(this.cYW);
                        if (this.cYW.crC != null) {
                            if (d5 > 4.0) {
                                net.minecraft.entity.c c2 = this.cYW.crC;
                                this.cYW.cIX.B(new net.minecraft.network.play.server.z(c2));
                                this.f(this.cYW.gW, this.cYW.gX, this.cYW.gY, this.cYW.pl, this.cYW.pm);
                            }
                            this.cYW.crC.csL = true;
                        }
                        if (this.cZi) {
                            this.OZ = this.cYW.gW;
                            this.cZh = this.cYW.gX;
                            this.Pa = this.cYW.gY;
                        }
                        ai2.aA(this.cYW);
                        return;
                    }
                    if (this.cYW.Wg()) {
                        this.cYW.acj();
                        this.cYW.a(this.OZ, this.cZh, this.Pa, this.cYW.pl, this.cYW.pm);
                        ai2.aA(this.cYW);
                        return;
                    }
                    double d12 = this.cYW.gX;
                    this.OZ = this.cYW.gW;
                    this.cZh = this.cYW.gX;
                    this.Pa = this.cYW.gY;
                    double d13 = this.cYW.gW;
                    double d14 = this.cYW.gX;
                    double d15 = this.cYW.gY;
                    float f4 = this.cYW.pl;
                    float f5 = this.cYW.pm;
                    if (e2.isMoving() && e2.afT() == -999.0) {
                        e2.bO(false);
                    }
                    if (e2.isMoving()) {
                        d13 = e2.afS();
                        d14 = e2.afT();
                        d15 = e2.afU();
                        if (Math.abs(e2.afS()) > 3.0E7 || Math.abs(e2.afU()) > 3.0E7) {
                            this.eQ("Illegal position");
                            return;
                        }
                    }
                    if (e2.afV()) {
                        f4 = e2.getYaw();
                        f5 = e2.getPitch();
                    }
                    this.cYW.acj();
                    this.cYW.a(this.OZ, this.cZh, this.Pa, f4, f5);
                    if (!this.cZi) {
                        return;
                    }
                    double d16 = d13 - this.cYW.gW;
                    double d17 = d14 - this.cYW.gX;
                    double d18 = d15 - this.cYW.gY;
                    double d19 = d16 * d16 + d17 * d17 + d18 * d18;
                    double d20 = this.cYW.ud * this.cYW.ud + this.cYW.ue * this.cYW.ue + this.cYW.uf * this.cYW.uf;
                    if (!(!(d19 - d20 > 100.0) || this.cYV.all() && this.cYV.alk().equals(this.cYW.xU()))) {
                        cYT.warn(this.cYW.xU() + " moved too quickly! " + d16 + "," + d17 + "," + d18 + " (" + d16 + ", " + d17 + ", " + d18 + ")");
                        this.f(this.OZ, this.cZh, this.Pa, this.cYW.pl, this.cYW.pm);
                        return;
                    }
                    float f6 = 0.0625f;
                    boolean bl2 = ai2.a((net.minecraft.entity.c)this.cYW, this.cYW.Us().af(0.0625, 0.0625, 0.0625)).isEmpty();
                    if (this.cYW.aO && !e2.isOnGround() && d17 > 0.0) {
                        this.cYW.jump();
                    }
                    this.cYW.y(d16, d17, d18);
                    this.cYW.aO = e2.isOnGround();
                    d16 = d13 - this.cYW.gW;
                    d17 = d14 - this.cYW.gX;
                    if (d17 > -0.5 || d17 < 0.5) {
                        d17 = 0.0;
                    }
                    d18 = d15 - this.cYW.gY;
                    d19 = d16 * d16 + d17 * d17 + d18 * d18;
                    boolean bl3 = false;
                    if (d19 > 0.0625 && !this.cYW.Wg() && !this.cYW.cIZ.amh()) {
                        bl3 = true;
                        cYT.warn(this.cYW.xU() + " moved wrongly!");
                    }
                    this.cYW.a(d13, d14, d15, f4, f5);
                    this.cYW.T(this.cYW.gW - d2, this.cYW.gX - d3, this.cYW.gY - d4);
                    if (!this.cYW.csp) {
                        boolean bl4 = ai2.a((net.minecraft.entity.c)this.cYW, this.cYW.Us().af(0.0625, 0.0625, 0.0625)).isEmpty();
                        if (bl2 && (bl3 || !bl4) && !this.cYW.Wg()) {
                            this.f(this.OZ, this.cZh, this.Pa, f4, f5);
                            return;
                        }
                    }
                    net.minecraft.util.a a2 = this.cYW.Us().ad(0.0625, 0.0625, 0.0625).ac(0.0, -0.55, 0.0);
                    if (!(this.cYV.alz() || this.cYW.cIt.cJL || ai2.t(a2))) {
                        if (d17 >= -0.03125) {
                            ++this.cYZ;
                            if (this.cYZ > 80) {
                                cYT.warn(this.cYW.xU() + " was kicked for floating too long!");
                                this.eQ("Flying is not enabled on this server");
                                return;
                            }
                        }
                    } else {
                        this.cYZ = 0;
                    }
                    this.cYW.aO = e2.isOnGround();
                    this.cYV.alE().r(this.cYW);
                    this.cYW.c(this.cYW.gX - d12, e2.isOnGround());
                } else if (this.cYX - this.cYY > 20) {
                    this.f(this.OZ, this.cZh, this.Pa, this.cYW.pl, this.cYW.pm);
                }
            }
        }
    }

    public void f(double d2, double d3, double d4, float f2, float f3) {
        this.a(d2, d3, d4, f2, f3, Collections.emptySet());
    }

    public void a(double d2, double d3, double d4, float f2, float f3, Set<net.minecraft.network.play.server.j> set) {
        this.cZi = false;
        this.OZ = d2;
        this.cZh = d3;
        this.Pa = d4;
        if (set.contains((Object)net.minecraft.network.play.server.j.dcn)) {
            this.OZ += this.cYW.gW;
        }
        if (set.contains((Object)net.minecraft.network.play.server.j.dco)) {
            this.cZh += this.cYW.gX;
        }
        if (set.contains((Object)net.minecraft.network.play.server.j.dcp)) {
            this.Pa += this.cYW.gY;
        }
        float f4 = f2;
        float f5 = f3;
        if (set.contains((Object)net.minecraft.network.play.server.j.dcq)) {
            f4 = f2 + this.cYW.pl;
        }
        if (set.contains((Object)net.minecraft.network.play.server.j.dcr)) {
            f5 = f3 + this.cYW.pm;
        }
        this.cYW.a(this.OZ, this.cZh, this.Pa, f4, f5);
        this.cYW.cIX.B(new net.minecraft.network.play.server.i(d2, d3, d4, f2, f3, set));
    }

    @Override
    public void a(i i2) {
        al.a(i2, this, this.cYW.acr());
        ai ai2 = this.cYV.ha(this.cYW.csP);
        net.minecraft.util.b b2 = i2.yl();
        this.cYW.acu();
        switch (i2.afW()) {
            case dbd: {
                if (!this.cYW.CZ()) {
                    this.cYW.V(false);
                }
                return;
            }
            case dbc: {
                if (!this.cYW.CZ()) {
                    this.cYW.V(true);
                }
                return;
            }
            case dbe: {
                this.cYW.abI();
                return;
            }
            case daZ: 
            case dba: 
            case dbb: {
                double d2 = this.cYW.gW - ((double)b2.wt() + 0.5);
                double d3 = this.cYW.gX - ((double)b2.wu() + 0.5) + 1.5;
                double d4 = this.cYW.gY - ((double)b2.wx() + 0.5);
                double d5 = d2 * d2 + d3 * d3 + d4 * d4;
                if (d5 > 36.0) {
                    return;
                }
                if (b2.wu() >= this.cYV.alC()) {
                    return;
                }
                if (i2.afW() == j.daZ) {
                    if (!this.cYV.b(ai2, b2, this.cYW) && ai2.Sv().bm(b2)) {
                        this.cYW.cIZ.h(b2, i2.yx());
                    } else {
                        this.cYW.cIX.B(new an(ai2, b2));
                    }
                } else {
                    if (i2.afW() == j.dbb) {
                        this.cYW.cIZ.am(b2);
                    } else if (i2.afW() == j.dba) {
                        this.cYW.cIZ.amj();
                    }
                    if (ai2.L(b2).df().xb() != Material.beo) {
                        this.cYW.cIX.B(new an(ai2, b2));
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid player action");
    }

    @Override
    public void b(k k2) {
        Object object;
        al.a(k2, this, this.cYW.acr());
        ai ai2 = this.cYV.ha(this.cYW.csP);
        co co2 = this.cYW.cHV.acE();
        boolean bl2 = false;
        net.minecraft.util.b b2 = k2.yl();
        ao ao2 = ao.hy(k2.getPlacedBlockDirection());
        this.cYW.acu();
        if (k2.getPlacedBlockDirection() == 255) {
            if (co2 == null) {
                return;
            }
            this.cYW.cIZ.b(this.cYW, ai2, co2);
        } else if (b2.wu() < this.cYV.alC() - 1 || ao2 != ao.dwr && b2.wu() < this.cYV.alC()) {
            if (this.cZi && this.cYW.M((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5) < 64.0 && !this.cYV.b(ai2, b2, this.cYW) && ai2.Sv().bm(b2)) {
                this.cYW.cIZ.a(this.cYW, ai2, co2, b2, ao2, k2.afY(), k2.afZ(), k2.aga());
            }
            bl2 = true;
        } else {
            object = new net.minecraft.util.t("build.tooHigh", this.cYV.alC());
            ((net.minecraft.util.p)object).arp().b(net.minecraft.util.an.dvX);
            this.cYW.cIX.B(new net.minecraft.network.play.server.c((ba)object));
            bl2 = true;
        }
        if (bl2) {
            this.cYW.cIX.B(new an(ai2, b2));
            this.cYW.cIX.B(new an(ai2, b2.x(ao2)));
        }
        if ((co2 = this.cYW.cHV.acE()) != null && co2.cWZ == 0) {
            this.cYW.cHV.cJC[this.cYW.cHV.cJE] = null;
            co2 = null;
        }
        if (co2 == null || co2.aeh() == 0) {
            this.cYW.cJo = true;
            this.cYW.cHV.cJC[this.cYW.cHV.cJE] = co.aK(this.cYW.cHV.cJC[this.cYW.cHV.cJE]);
            object = this.cYW.cHY.b(this.cYW.cHV, this.cYW.cHV.cJE);
            this.cYW.cHY.adc();
            this.cYW.cJo = false;
            if (!co.d(this.cYW.cHV.acE(), k2.ls())) {
                this.B(new az(this.cYW.cHY.cSL, ((net.minecraft.inventory.ak)object).cUk, this.cYW.cHV.acE()));
            }
        }
    }

    @Override
    public void a(ac ac2) {
        al.a(ac2, this, this.cYW.acr());
        if (this.cYW.CZ()) {
            net.minecraft.entity.c c2 = null;
            for (ai ai2 : this.cYV.dkG) {
                if (ai2 != null && (c2 = ac2.a(ai2)) != null) break;
            }
            if (c2 != null) {
                this.cYW.as(this.cYW);
                this.cYW.D((net.minecraft.entity.c)null);
                if (c2.baU != this.cYW.baU) {
                    ai ai3 = this.cYW.acr();
                    ai ai4 = (ai)c2.baU;
                    this.cYW.csP = c2.csP;
                    this.B(new net.minecraft.network.play.server.h(this.cYW.csP, ai3.agm(), ai3.avH().awC(), this.cYW.cIZ.If()));
                    ai3.az(this.cYW);
                    this.cYW.csb = false;
                    this.cYW.b(c2.gW, c2.gX, c2.gY, c2.pl, c2.pm);
                    if (this.cYW.TS()) {
                        ai3.d(this.cYW, false);
                        ai4.G(this.cYW);
                        ai4.d(this.cYW, false);
                    }
                    this.cYW.b(ai4);
                    this.cYV.alE().a(this.cYW, ai3);
                    this.cYW.Q(c2.gW, c2.gX, c2.gY);
                    this.cYW.cIZ.e(ai4);
                    this.cYV.alE().b(this.cYW, ai4);
                    this.cYV.alE().t(this.cYW);
                } else {
                    this.cYW.Q(c2.gW, c2.gX, c2.gY);
                }
            }
        }
    }

    @Override
    public void a(ad ad2) {
    }

    @Override
    public void f(ba ba2) {
        cYT.info(this.cYW.xU() + " lost connection: " + String.valueOf(ba2));
        this.cYV.alU();
        net.minecraft.util.t t2 = new net.minecraft.util.t("multiplayer.player.left", this.cYW.xW());
        t2.arp().b(net.minecraft.util.an.dvZ);
        this.cYV.alE().m(t2);
        this.cYW.acp();
        this.cYV.alE().s(this.cYW);
        if (this.cYV.all() && this.cYW.xU().equals(this.cYV.alk())) {
            cYT.info("Stopping singleplayer server as player logged out");
            this.cYV.akW();
        }
    }

    public void B(aj aj2) {
        Object object;
        if (aj2 instanceof net.minecraft.network.play.server.c) {
            net.minecraft.network.play.server.c c2 = (net.minecraft.network.play.server.c)aj2;
            object = this.cYW.act();
            if (object == net.minecraft.entity.player.c.cIJ) {
                return;
            }
            if (object == net.minecraft.entity.player.c.cII && !c2.isChat()) {
                return;
            }
        }
        try {
            this.cYU.B(aj2);
        }
        catch (Throwable throwable) {
            object = net.minecraft.crash.a.a(throwable, "Sending packet");
            net.minecraft.crash.i i2 = ((net.minecraft.crash.a)object).dY("Packet being sent");
            i2.a("Packet class", new net.minecraft.network.k(this, aj2));
            throw new cl((net.minecraft.crash.a)object);
        }
    }

    @Override
    public void a(l l2) {
        al.a(l2, this, this.cYW.acr());
        if (l2.getSlotId() >= 0 && l2.getSlotId() < net.minecraft.entity.player.g.acG()) {
            this.cYW.cHV.cJE = l2.getSlotId();
            this.cYW.acu();
        } else {
            cYT.warn(this.cYW.xU() + " tried to set an invalid carried item");
        }
    }

    @Override
    public void a(net.minecraft.network.play.client.b b2) {
        al.a(b2, this, this.cYW.acr());
        if (this.cYW.act() == net.minecraft.entity.player.c.cIJ) {
            net.minecraft.util.t t2 = new net.minecraft.util.t("chat.cannotSend", new Object[0]);
            t2.arp().b(net.minecraft.util.an.dvX);
            this.B(new net.minecraft.network.play.server.c(t2));
        } else {
            this.cYW.acu();
            String string = b2.getMessage();
            string = StringUtils.normalizeSpace((String)string);
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (net.minecraft.util.l.o(string.charAt(i2))) continue;
                this.eQ("Illegal characters in chat");
                return;
            }
            if (string.startsWith("/")) {
                this.eR(string);
            } else {
                net.minecraft.util.t t3 = new net.minecraft.util.t("chat.type.text", this.cYW.xW(), string);
                this.cYV.alE().b(t3, false);
            }
            this.cZe += 20;
            if (this.cZe > 200 && !this.cYV.alE().k(this.cYW.Ie())) {
                this.eQ("disconnect.spam");
            }
        }
    }

    private void eR(String string) {
        this.cYV.ali().i(this.cYW, string);
    }

    @Override
    public void a(m m2) {
        al.a(m2, this, this.cYW.acr());
        this.cYW.acu();
        this.cYW.swingItem();
    }

    @Override
    public void a(n n2) {
        al.a(n2, this, this.cYW.acr());
        this.cYW.acu();
        switch (n2.agb()) {
            case dbp: {
                this.cYW.setSneaking(true);
                break;
            }
            case dbq: {
                this.cYW.setSneaking(false);
                break;
            }
            case dbs: {
                this.cYW.setSprinting(true);
                break;
            }
            case dbt: {
                this.cYW.setSprinting(false);
                break;
            }
            case dbr: {
                this.cYW.a(false, true, true);
                this.cZi = false;
                break;
            }
            case dbu: {
                if (!(this.cYW.crC instanceof f)) break;
                ((f)this.cYW.crC).fx(n2.getAuxData());
                break;
            }
            case dbv: {
                if (!(this.cYW.crC instanceof f)) break;
                ((f)this.cYW.crC).A(this.cYW);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }

    @Override
    public void a(c c2) {
        al.a(c2, this, this.cYW.acr());
        ai ai2 = this.cYV.ha(this.cYW.csP);
        net.minecraft.entity.c c3 = c2.j(ai2);
        this.cYW.acu();
        if (c3 != null) {
            boolean bl2 = this.cYW.ai(c3);
            double d2 = 36.0;
            if (!bl2) {
                d2 = 9.0;
            }
            if (this.cYW.T(c3) < d2) {
                if (c2.afQ() == d.daT) {
                    this.cYW.aq(c3);
                } else if (c2.afQ() == d.daV) {
                    c3.a(this.cYW, c2.kI());
                } else if (c2.afQ() == d.daU) {
                    if (c3 instanceof net.minecraft.entity.item.i || c3 instanceof net.minecraft.entity.item.w || c3 instanceof net.minecraft.entity.projectile.a || c3 == this.cYW) {
                        this.eQ("Attempting to attack an invalid entity");
                        this.cYV.fz("Player " + this.cYW.xU() + " tried to attack an invalid entity");
                        return;
                    }
                    this.cYW.ar(c3);
                }
            }
        }
    }

    @Override
    public void a(z z2) {
        al.a(z2, this, this.cYW.acr());
        this.cYW.acu();
        aa aa2 = z2.agh();
        switch (aa2) {
            case dbP: {
                if (this.cYW.cJp) {
                    this.cYW = this.cYV.alE().a(this.cYW, 0, true);
                    break;
                }
                if (this.cYW.acr().avH().azv()) {
                    if (this.cYV.all() && this.cYW.xU().equals(this.cYV.alk())) {
                        this.cYW.cIX.eQ("You have died. Game over, man, it's game over!");
                        this.cYV.alq();
                        break;
                    }
                    UserListBansEntry userListBansEntry = new UserListBansEntry(this.cYW.Ie(), null, "(You just lost the game)", null, "Death in Hardcore");
                    this.cYV.alE().amq().a(userListBansEntry);
                    this.cYW.cIX.eQ("You have died. Game over, man, it's game over!");
                    break;
                }
                if (this.cYW.getHealth() > 0.0f) {
                    return;
                }
                this.cYW = this.cYV.alE().a(this.cYW, 0, false);
                break;
            }
            case dbQ: {
                this.cYW.acv().u(this.cYW);
                break;
            }
            case dbR: {
                this.cYW.a(net.minecraft.stats.b.doE);
            }
        }
    }

    @Override
    public void a(q q2) {
        al.a(q2, this, this.cYW.acr());
        this.cYW.aco();
    }

    @Override
    public void a(r r2) {
        al.a(r2, this, this.cYW.acr());
        this.cYW.acu();
        if (this.cYW.cHY.cSL == r2.getWindowId() && this.cYW.cHY.F(this.cYW)) {
            if (this.cYW.CZ()) {
                ArrayList arrayList = Lists.newArrayList();
                for (int i2 = 0; i2 < this.cYW.cHY.cSK.size(); ++i2) {
                    arrayList.add(this.cYW.cHY.cSK.get(i2).ls());
                }
                this.cYW.a(this.cYW.cHY, arrayList);
            } else {
                co co2 = this.cYW.cHY.a(r2.getSlotId(), r2.getUsedButton(), r2.getMode(), (net.minecraft.entity.player.a)this.cYW);
                if (co.d(r2.agd(), co2)) {
                    this.cYW.cIX.B(new bc(r2.getWindowId(), r2.getActionNumber(), true));
                    this.cYW.cJo = true;
                    this.cYW.cHY.adc();
                    this.cYW.acn();
                    this.cYW.cJo = false;
                } else {
                    this.cZg.c(this.cYW.cHY.cSL, r2.getActionNumber());
                    this.cYW.cIX.B(new bc(r2.getWindowId(), r2.getActionNumber(), false));
                    this.cYW.cHY.c((net.minecraft.entity.player.a)this.cYW, false);
                    ArrayList arrayList = Lists.newArrayList();
                    for (int i3 = 0; i3 < this.cYW.cHY.cSK.size(); ++i3) {
                        arrayList.add(this.cYW.cHY.cSK.get(i3).ls());
                    }
                    this.cYW.a(this.cYW.cHY, arrayList);
                }
            }
        }
    }

    @Override
    public void a(u u2) {
        al.a(u2, this, this.cYW.acr());
        this.cYW.acu();
        if (this.cYW.cHY.cSL == u2.getWindowId() && this.cYW.cHY.F(this.cYW) && !this.cYW.CZ()) {
            this.cYW.cHY.c((net.minecraft.entity.player.a)this.cYW, u2.getButton());
            this.cYW.cHY.adc();
        }
    }

    @Override
    public void a(t t2) {
        al.a(t2, this, this.cYW.acr());
        if (this.cYW.cIZ.amh()) {
            boolean bl2;
            Object object;
            net.minecraft.util.b b2;
            net.minecraft.tileentity.d d2;
            net.minecraft.nbt.n n2;
            boolean bl3 = t2.getSlotId() < 0;
            co co2 = t2.ls();
            if (co2 != null && co2.aej() && co2.aek().C("BlockEntityTag", 10) && (n2 = co2.aek().eN("BlockEntityTag")).eD("x") && n2.eD("y") && n2.eD("z") && (d2 = this.cYW.baU.K(b2 = new net.minecraft.util.b(n2.eG("x"), n2.eG("y"), n2.eG("z")))) != null) {
                object = new net.minecraft.nbt.n();
                d2.b((net.minecraft.nbt.n)object);
                ((net.minecraft.nbt.n)object).eP("x");
                ((net.minecraft.nbt.n)object).eP("y");
                ((net.minecraft.nbt.n)object).eP("z");
                co2.a("BlockEntityTag", (g)object);
            }
            boolean bl4 = t2.getSlotId() >= 1 && t2.getSlotId() < 36 + net.minecraft.entity.player.g.acG();
            boolean bl5 = co2 == null || co2.bP() != null;
            boolean bl6 = bl2 = co2 == null || co2.yc() >= 0 && co2.cWZ <= 64 && co2.cWZ > 0;
            if (bl4 && bl5 && bl2) {
                this.cYW.cHX.i(t2.getSlotId(), co2);
                this.cYW.cHX.c((net.minecraft.entity.player.a)this.cYW, true);
            } else if (bl3 && bl5 && bl2 && this.cZf < 200) {
                this.cZf += 20;
                object = this.cYW.d(co2, true);
                if (object != null) {
                    ((net.minecraft.entity.item.i)object).Yj();
                }
            }
        }
    }

    @Override
    public void a(s s2) {
        al.a(s2, this, this.cYW.acr());
        Short s3 = this.cZg.hE(this.cYW.cHY.cSL);
        if (s3 != null && s2.getUid() == s3.shortValue() && this.cYW.cHY.cSL == s2.getWindowId() && !this.cYW.cHY.F(this.cYW) && !this.cYW.CZ()) {
            this.cYW.cHY.c((net.minecraft.entity.player.a)this.cYW, true);
        }
    }

    @Override
    public void a(v v2) {
        al.a(v2, this, this.cYW.acr());
        this.cYW.acu();
        ai ai2 = this.cYV.ha(this.cYW.csP);
        net.minecraft.util.b b2 = v2.yl();
        if (ai2.aJ(b2)) {
            net.minecraft.tileentity.d d2 = ai2.K(b2);
            if (!(d2 instanceof ag)) {
                return;
            }
            ag ag2 = (ag)d2;
            if (!ag2.aqO() || ag2.aqP() != this.cYW) {
                this.cYV.fz("Player " + this.cYW.xU() + " just tried to change non-editable sign");
                return;
            }
            ba[] baArray = v2.age();
            for (int i2 = 0; i2 < baArray.length; ++i2) {
                ag2.dtx[i2] = new net.minecraft.util.s(net.minecraft.util.an.ge(baArray[i2].arq()));
            }
            ag2.Lw();
            ai2.P(b2);
        }
    }

    @Override
    public void a(a a2) {
        if (a2.getKey() == this.cZb) {
            int n2 = (int)(this.aeY() - this.cZc);
            this.cYW.aW = (this.cYW.aW * 3 + n2) / 4;
        }
    }

    private long aeY() {
        return System.nanoTime() / 1000000L;
    }

    @Override
    public void a(w w2) {
        al.a(w2, this, this.cYW.acr());
        this.cYW.cIt.cJK = w2.isFlying() && this.cYW.cIt.cJL;
    }

    @Override
    public void a(x x2) {
        al.a(x2, this, this.cYW.acr());
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(this.cYV.b(this.cYW, x2.getMessage(), x2.agf()));
        this.cYW.cIX.B(new bm(arrayList.toArray(new String[0])));
    }

    @Override
    public void b(y y2) {
        al.a(y2, this, this.cYW.acr());
        this.cYW.a(y2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(ab ab2) {
        al.a(ab2, this, this.cYW.acr());
        if ("MC|BEdit".equals(ab2.getChannelName())) {
            ak ak2 = new ak(Unpooled.wrappedBuffer((ByteBuf)ab2.agj()));
            try {
                co co2 = ak2.afA();
                if (co2 == null) return;
                if (!cr.v(co2.aek())) {
                    throw new IOException("Invalid book tag!");
                }
                co co3 = this.cYW.cHV.acE();
                if (co3 == null) {
                    return;
                }
                if (co2.bP() != Items.cRQ || co2.bP() != co3.bP()) return;
                co3.a("pages", co2.aek().D("pages", 8));
                return;
            }
            catch (Exception exception) {
                cYT.error("Couldn't handle book info", (Throwable)exception);
                return;
            }
            finally {
                ak2.release();
            }
        }
        if ("MC|BSign".equals(ab2.getChannelName())) {
            ak ak3 = new ak(Unpooled.wrappedBuffer((ByteBuf)ab2.agj()));
            try {
                co co4 = ak3.afA();
                if (co4 == null) return;
                if (!as.r(co4.aek())) {
                    throw new IOException("Invalid book tag!");
                }
                co co5 = this.cYW.cHV.acE();
                if (co5 == null) {
                    return;
                }
                if (co4.bP() != Items.cRR || co5.bP() != Items.cRQ) return;
                co5.a("author", new net.minecraft.nbt.z(this.cYW.xU()));
                co5.a("title", new net.minecraft.nbt.z(co4.aek().eK("title")));
                co5.a("pages", co4.aek().D("pages", 8));
                co5.r(Items.cRR);
                return;
            }
            catch (Exception exception) {
                cYT.error("Couldn't sign book", (Throwable)exception);
                return;
            }
            finally {
                ak3.release();
            }
        }
        if ("MC|TrSel".equals(ab2.getChannelName())) {
            try {
                int n2 = ab2.agj().readInt();
                net.minecraft.inventory.b b2 = this.cYW.cHY;
                if (!(b2 instanceof net.minecraft.inventory.s)) return;
                ((net.minecraft.inventory.s)b2).fP(n2);
                return;
            }
            catch (Exception exception) {
                cYT.error("Couldn't select trade", (Throwable)exception);
            }
            return;
        } else if ("MC|AdvCdm".equals(ab2.getChannelName())) {
            if (!this.cYV.alA()) {
                this.cYW.a(new net.minecraft.util.t("advMode.notEnabled", new Object[0]));
                return;
            } else if (this.cYW.c(2, "") && this.cYW.cIt.cJM) {
                ak ak4 = ab2.agj();
                try {
                    Object object;
                    byte by2 = ak4.readByte();
                    net.minecraft.command.server.e e2 = null;
                    if (by2 == 0) {
                        object = this.cYW.baU.K(new net.minecraft.util.b(ak4.readInt(), ak4.readInt(), ak4.readInt()));
                        if (object instanceof o) {
                            e2 = ((o)object).Wo();
                        }
                    } else if (by2 == 1 && (object = this.cYW.baU.cn(ak4.readInt())) instanceof net.minecraft.entity.t) {
                        e2 = ((net.minecraft.entity.t)object).Wo();
                    }
                    object = ak4.gs(ak4.readableBytes());
                    boolean bl2 = ak4.readBoolean();
                    if (e2 == null) return;
                    e2.dW((String)object);
                    e2.aA(bl2);
                    if (!bl2) {
                        e2.h((ba)null);
                    }
                    e2.Sz();
                    this.cYW.a(new net.minecraft.util.t("advMode.setCommand.success", object));
                    return;
                }
                catch (Exception exception) {
                    cYT.error("Couldn't set command block", (Throwable)exception);
                    return;
                }
                finally {
                    ak4.release();
                }
            } else {
                this.cYW.a(new net.minecraft.util.t("advMode.notAllowed", new Object[0]));
            }
            return;
        } else if ("MC|Beacon".equals(ab2.getChannelName())) {
            if (!(this.cYW.cHY instanceof net.minecraft.inventory.c)) return;
            try {
                ak ak5 = ab2.agj();
                int n3 = ak5.readInt();
                int n4 = ak5.readInt();
                net.minecraft.inventory.c c2 = (net.minecraft.inventory.c)this.cYW.cHY;
                net.minecraft.inventory.ak ak6 = c2.fM(0);
                if (!ak6.GJ()) return;
                ak6.cf(1);
                net.minecraft.inventory.ab ab3 = c2.ade();
                ab3.K(1, n3);
                ab3.K(2, n4);
                ab3.Lw();
                return;
            }
            catch (Exception exception) {
                cYT.error("Couldn't set beacon", (Throwable)exception);
            }
            return;
        } else {
            if (!"MC|ItemName".equals(ab2.getChannelName()) || !(this.cYW.cHY instanceof net.minecraft.inventory.v)) return;
            net.minecraft.inventory.v v2 = (net.minecraft.inventory.v)this.cYW.cHY;
            if (ab2.agj() != null && ab2.agj().readableBytes() >= 1) {
                String string = net.minecraft.util.l.fZ(ab2.agj().gs(Short.MAX_VALUE));
                if (string.length() > 30) return;
                v2.er(string);
                return;
            } else {
                v2.er("");
            }
        }
    }
}

