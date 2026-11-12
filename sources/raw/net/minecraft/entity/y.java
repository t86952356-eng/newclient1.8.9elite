/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.entity;

import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.h;
import net.minecraft.entity.item.b;
import net.minecraft.entity.item.c;
import net.minecraft.entity.item.d;
import net.minecraft.entity.item.f;
import net.minecraft.entity.item.g;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.j;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.t;
import net.minecraft.entity.item.v;
import net.minecraft.entity.item.w;
import net.minecraft.entity.m;
import net.minecraft.entity.p;
import net.minecraft.entity.passive.ak;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.e;
import net.minecraft.entity.r;
import net.minecraft.init.Items;
import net.minecraft.item.bo;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.ac;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.ae;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.cf;
import net.minecraft.network.play.server.l;
import net.minecraft.network.play.server.q;
import net.minecraft.network.play.server.s;
import net.minecraft.network.play.server.x;
import net.minecraft.network.play.server.z;
import net.minecraft.util.bt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y {
    private static final Logger cvx = LogManager.getLogger();
    public net.minecraft.entity.c cvy;
    public int cvz;
    public int cvA;
    public int cvB;
    public int cvC;
    public int cvD;
    public int cvE;
    public int cvF;
    public int cvG;
    public double cvH;
    public double cvI;
    public double uf;
    public int bnB;
    private double cvJ;
    private double cvK;
    private double cvL;
    private boolean cvM;
    private final boolean cvN;
    private int cvO;
    private net.minecraft.entity.c cvP;
    private boolean cvQ;
    private boolean aO;
    public boolean cvR;
    public Set<e> cvS = Sets.newHashSet();

    public y(net.minecraft.entity.c c2, int n2, int n3, boolean bl2) {
        this.cvy = c2;
        this.cvz = n2;
        this.cvA = n3;
        this.cvN = bl2;
        this.cvB = bt.aF(c2.gW * 32.0);
        this.cvC = bt.aF(c2.gX * 32.0);
        this.cvD = bt.aF(c2.gY * 32.0);
        this.cvE = bt.bL(c2.pl * 256.0f / 360.0f);
        this.cvF = bt.bL(c2.pm * 256.0f / 360.0f);
        this.cvG = bt.bL(c2.Uf() * 256.0f / 360.0f);
        this.aO = c2.aO;
    }

    public boolean equals(Object object) {
        return object instanceof y && ((y)object).cvy.getEntityId() == this.cvy.getEntityId();
    }

    public int hashCode() {
        return this.cvy.getEntityId();
    }

    public void C(List<a> list) {
        this.cvR = false;
        if (!this.cvM || this.cvy.M(this.cvJ, this.cvK, this.cvL) > 16.0) {
            this.cvJ = this.cvy.gW;
            this.cvK = this.cvy.gX;
            this.cvL = this.cvy.gY;
            this.cvM = true;
            this.cvR = true;
            this.D(list);
        }
        if (this.cvP != this.cvy.crC || this.cvy.crC != null && this.bnB % 60 == 0) {
            this.cvP = this.cvy.crC;
            this.y(new ac(0, this.cvy, this.cvy.crC));
        }
        if (this.cvy instanceof j && this.bnB % 10 == 0) {
            j j2 = (j)this.cvy;
            co co2 = j2.Yt();
            if (co2 != null && co2.bP() instanceof bo) {
                net.minecraft.world.storage.f f2 = Items.cRh.a(co2, this.cvy.baU);
                for (a a2 : list) {
                    e e2 = (e)a2;
                    f2.c(e2, co2);
                    aj aj2 = Items.cRh.e(co2, this.cvy.baU, e2);
                    if (aj2 == null) continue;
                    e2.cIX.B(aj2);
                }
            }
            this.Wq();
        }
        if (this.bnB % this.cvA == 0 || this.cvy.csL || this.cvy.Tp().Tg()) {
            int n2;
            if (this.cvy.crC == null) {
                boolean bl2;
                ++this.cvO;
                n2 = bt.aF(this.cvy.gW * 32.0);
                int n3 = bt.aF(this.cvy.gX * 32.0);
                int n4 = bt.aF(this.cvy.gY * 32.0);
                int n5 = bt.bL(this.cvy.pl * 256.0f / 360.0f);
                int n6 = bt.bL(this.cvy.pm * 256.0f / 360.0f);
                int n7 = n2 - this.cvB;
                int n8 = n3 - this.cvC;
                int n9 = n4 - this.cvD;
                aj<net.minecraft.network.play.a> aj3 = null;
                boolean bl3 = Math.abs(n7) >= 4 || Math.abs(n8) >= 4 || Math.abs(n9) >= 4 || this.bnB % 60 == 0;
                boolean bl4 = bl2 = Math.abs(n5 - this.cvE) >= 4 || Math.abs(n6 - this.cvF) >= 4;
                if (this.bnB > 0 || this.cvy instanceof net.minecraft.entity.projectile.a) {
                    if (n7 >= -128 && n7 < 128 && n8 >= -128 && n8 < 128 && n9 >= -128 && n9 < 128 && this.cvO <= 400 && !this.cvQ && this.aO == this.cvy.aO) {
                        if (!(bl3 && bl2 || this.cvy instanceof net.minecraft.entity.projectile.a)) {
                            if (bl3) {
                                aj3 = new net.minecraft.network.play.server.w(this.cvy.getEntityId(), (byte)n7, (byte)n8, (byte)n9, this.cvy.aO);
                            } else if (bl2) {
                                aj3 = new x(this.cvy.getEntityId(), (byte)n5, (byte)n6, this.cvy.aO);
                            }
                        } else {
                            aj3 = new net.minecraft.network.play.server.y(this.cvy.getEntityId(), (byte)n7, (byte)n8, (byte)n9, (byte)n5, (byte)n6, this.cvy.aO);
                        }
                    } else {
                        this.aO = this.cvy.aO;
                        this.cvO = 0;
                        aj3 = new z(this.cvy.getEntityId(), n2, n3, n4, (byte)n5, (byte)n6, this.cvy.aO);
                    }
                }
                if (this.cvN) {
                    double d2 = this.cvy.ud - this.cvH;
                    double d3 = this.cvy.ue - this.cvI;
                    double d4 = this.cvy.uf - this.uf;
                    double d5 = 0.02;
                    double d6 = d2 * d2 + d3 * d3 + d4 * d4;
                    if (d6 > 4.0E-4 || d6 > 0.0 && this.cvy.ud == 0.0 && this.cvy.ue == 0.0 && this.cvy.uf == 0.0) {
                        this.cvH = this.cvy.ud;
                        this.cvI = this.cvy.ue;
                        this.uf = this.cvy.uf;
                        this.y(new net.minecraft.network.play.server.t(this.cvy.getEntityId(), this.cvH, this.cvI, this.uf));
                    }
                }
                if (aj3 != null) {
                    this.y(aj3);
                }
                this.Wq();
                if (bl3) {
                    this.cvB = n2;
                    this.cvC = n3;
                    this.cvD = n4;
                }
                if (bl2) {
                    this.cvE = n5;
                    this.cvF = n6;
                }
                this.cvQ = false;
            } else {
                boolean bl5;
                n2 = bt.bL(this.cvy.pl * 256.0f / 360.0f);
                int n10 = bt.bL(this.cvy.pm * 256.0f / 360.0f);
                boolean bl6 = bl5 = Math.abs(n2 - this.cvE) >= 4 || Math.abs(n10 - this.cvF) >= 4;
                if (bl5) {
                    this.y(new x(this.cvy.getEntityId(), (byte)n2, (byte)n10, this.cvy.aO));
                    this.cvE = n2;
                    this.cvF = n10;
                }
                this.cvB = bt.aF(this.cvy.gW * 32.0);
                this.cvC = bt.aF(this.cvy.gX * 32.0);
                this.cvD = bt.aF(this.cvy.gY * 32.0);
                this.Wq();
                this.cvQ = true;
            }
            n2 = bt.bL(this.cvy.Uf() * 256.0f / 360.0f);
            if (Math.abs(n2 - this.cvG) >= 4) {
                this.y(new aa(this.cvy, (byte)n2));
                this.cvG = n2;
            }
            this.cvy.csL = false;
        }
        ++this.bnB;
        if (this.cvy.crY) {
            this.z(new net.minecraft.network.play.server.t(this.cvy));
            this.cvy.crY = false;
        }
    }

    private void Wq() {
        net.minecraft.entity.a a2 = this.cvy.Tp();
        if (a2.Tg()) {
            this.z(new ad(this.cvy.getEntityId(), a2, false));
        }
        if (this.cvy instanceof r) {
            h h2 = (h)((r)this.cvy).VX();
            Set<net.minecraft.entity.ai.attributes.e> set = h2.XE();
            if (!set.isEmpty()) {
                this.z(new ah(this.cvy.getEntityId(), set));
            }
            set.clear();
        }
    }

    public void y(aj aj2) {
        for (e e2 : this.cvS) {
            e2.cIX.B(aj2);
        }
    }

    public void z(aj aj2) {
        this.y(aj2);
        if (this.cvy instanceof e) {
            ((e)this.cvy).cIX.B(aj2);
        }
    }

    public void Wr() {
        for (e e2 : this.cvS) {
            e2.H(this.cvy);
        }
    }

    public void d(e e2) {
        if (this.cvS.contains(e2)) {
            e2.H(this.cvy);
            this.cvS.remove(e2);
        }
    }

    public void e(e e2) {
        if (e2 != this.cvy) {
            if (this.f(e2)) {
                if (!this.cvS.contains(e2) && (this.g(e2) || this.cvy.crD)) {
                    Serializable serializable;
                    Object object;
                    n n2;
                    this.cvS.add(e2);
                    aj aj2 = this.Ws();
                    e2.cIX.B(aj2);
                    if (!this.cvy.Tp().Tj()) {
                        e2.cIX.B(new ad(this.cvy.getEntityId(), this.cvy.Tp(), true));
                    }
                    if ((n2 = this.cvy.Uv()) != null) {
                        e2.cIX.B(new cf(this.cvy.getEntityId(), n2));
                    }
                    if (this.cvy instanceof r && !(object = ((h)(serializable = (h)((r)this.cvy).VX())).XF()).isEmpty()) {
                        e2.cIX.B(new ah(this.cvy.getEntityId(), (Collection<net.minecraft.entity.ai.attributes.e>)object));
                    }
                    this.cvH = this.cvy.ud;
                    this.cvI = this.cvy.ue;
                    this.uf = this.cvy.uf;
                    if (this.cvN && !(aj2 instanceof q)) {
                        e2.cIX.B(new net.minecraft.network.play.server.t(this.cvy.getEntityId(), this.cvy.ud, this.cvy.ue, this.cvy.uf));
                    }
                    if (this.cvy.crC != null) {
                        e2.cIX.B(new ac(0, this.cvy, this.cvy.crC));
                    }
                    if (this.cvy instanceof p && ((p)this.cvy).Vr() != null) {
                        e2.cIX.B(new ac(1, this.cvy, ((p)this.cvy).Vr()));
                    }
                    if (this.cvy instanceof r) {
                        for (int i2 = 0; i2 < 5; ++i2) {
                            object = ((r)this.cvy).eG(i2);
                            if (object == null) continue;
                            e2.cIX.B(new net.minecraft.network.play.server.e(this.cvy.getEntityId(), i2, (co)object));
                        }
                    }
                    if (this.cvy instanceof a && ((a)(serializable = (a)this.cvy)).Wg()) {
                        e2.cIX.B(new l((a)serializable, new net.minecraft.util.b(this.cvy)));
                    }
                    if (this.cvy instanceof r) {
                        serializable = (r)this.cvy;
                        for (net.minecraft.potion.d d2 : ((r)serializable).VL()) {
                            e2.cIX.B(new ae(this.cvy.getEntityId(), d2));
                        }
                    }
                }
            } else if (this.cvS.contains(e2)) {
                this.cvS.remove(e2);
                e2.H(this.cvy);
            }
        }
    }

    public boolean f(e e2) {
        double d2 = e2.gW - (double)(this.cvB / 32);
        double d3 = e2.gY - (double)(this.cvD / 32);
        return d2 >= (double)(-this.cvz) && d2 <= (double)this.cvz && d3 >= (double)(-this.cvz) && d3 <= (double)this.cvz && this.cvy.a(e2);
    }

    private boolean g(e e2) {
        return e2.acr().awv().a(e2, this.cvy.csH, this.cvy.csJ);
    }

    public void D(List<a> list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.e((e)list.get(i2));
        }
    }

    private aj Ws() {
        if (this.cvy.csb) {
            cvx.warn("Fetching addPacket for removed entity");
        }
        if (this.cvy instanceof i) {
            return new net.minecraft.network.play.server.p(this.cvy, 2, 1);
        }
        if (this.cvy instanceof e) {
            return new net.minecraft.network.play.server.n((a)this.cvy);
        }
        if (this.cvy instanceof k) {
            k k2 = (k)this.cvy;
            return new net.minecraft.network.play.server.p(this.cvy, 10, k2.Wm().YG());
        }
        if (this.cvy instanceof b) {
            return new net.minecraft.network.play.server.p(this.cvy, 1);
        }
        if (this.cvy instanceof ak) {
            this.cvG = bt.bL(this.cvy.Uf() * 256.0f / 360.0f);
            return new q((r)this.cvy);
        }
        if (this.cvy instanceof net.minecraft.entity.projectile.d) {
            a a2 = ((net.minecraft.entity.projectile.d)this.cvy).cKm;
            return new net.minecraft.network.play.server.p(this.cvy, 90, a2 != null ? a2.getEntityId() : this.cvy.getEntityId());
        }
        if (this.cvy instanceof net.minecraft.entity.projectile.a) {
            net.minecraft.entity.c c2 = ((net.minecraft.entity.projectile.a)this.cvy).cJY;
            return new net.minecraft.network.play.server.p(this.cvy, 60, c2 != null ? c2.getEntityId() : this.cvy.getEntityId());
        }
        if (this.cvy instanceof net.minecraft.entity.projectile.h) {
            return new net.minecraft.network.play.server.p(this.cvy, 61);
        }
        if (this.cvy instanceof net.minecraft.entity.projectile.f) {
            return new net.minecraft.network.play.server.p(this.cvy, 73, ((net.minecraft.entity.projectile.f)this.cvy).acQ());
        }
        if (this.cvy instanceof f) {
            return new net.minecraft.network.play.server.p(this.cvy, 75);
        }
        if (this.cvy instanceof net.minecraft.entity.item.e) {
            return new net.minecraft.network.play.server.p(this.cvy, 65);
        }
        if (this.cvy instanceof d) {
            return new net.minecraft.network.play.server.p(this.cvy, 72);
        }
        if (this.cvy instanceof net.minecraft.entity.item.h) {
            return new net.minecraft.network.play.server.p(this.cvy, 76);
        }
        if (this.cvy instanceof net.minecraft.entity.projectile.c) {
            net.minecraft.entity.projectile.c c3 = (net.minecraft.entity.projectile.c)this.cvy;
            net.minecraft.network.play.server.p p2 = null;
            int n2 = 63;
            if (this.cvy instanceof net.minecraft.entity.projectile.g) {
                n2 = 64;
            } else if (this.cvy instanceof net.minecraft.entity.projectile.j) {
                n2 = 66;
            }
            p2 = c3.cKd != null ? new net.minecraft.network.play.server.p(this.cvy, n2, ((net.minecraft.entity.projectile.c)this.cvy).cKd.getEntityId()) : new net.minecraft.network.play.server.p(this.cvy, n2, 0);
            p2.gw((int)(c3.cKf * 8000.0));
            p2.gx((int)(c3.cKg * 8000.0));
            p2.gy((int)(c3.cKh * 8000.0));
            return p2;
        }
        if (this.cvy instanceof net.minecraft.entity.projectile.b) {
            return new net.minecraft.network.play.server.p(this.cvy, 62);
        }
        if (this.cvy instanceof v) {
            return new net.minecraft.network.play.server.p(this.cvy, 50);
        }
        if (this.cvy instanceof c) {
            return new net.minecraft.network.play.server.p(this.cvy, 51);
        }
        if (this.cvy instanceof g) {
            g g2 = (g)this.cvy;
            return new net.minecraft.network.play.server.p(this.cvy, 70, Block.a(g2.Yh()));
        }
        if (this.cvy instanceof net.minecraft.entity.item.a) {
            return new net.minecraft.network.play.server.p(this.cvy, 78);
        }
        if (this.cvy instanceof t) {
            return new net.minecraft.network.play.server.r((t)this.cvy);
        }
        if (this.cvy instanceof j) {
            j j2 = (j)this.cvy;
            net.minecraft.network.play.server.p p3 = new net.minecraft.network.play.server.p(this.cvy, 71, j2.cty.asA());
            net.minecraft.util.b b2 = j2.UN();
            p3.aG(bt.bL(b2.wt() * 32));
            p3.aH(bt.bL(b2.wu() * 32));
            p3.aI(bt.bL(b2.wx() * 32));
            return p3;
        }
        if (this.cvy instanceof m) {
            m m2 = (m)this.cvy;
            net.minecraft.network.play.server.p p4 = new net.minecraft.network.play.server.p(this.cvy, 77);
            net.minecraft.util.b b3 = m2.UN();
            p4.aG(bt.bL(b3.wt() * 32));
            p4.aH(bt.bL(b3.wu() * 32));
            p4.aI(bt.bL(b3.wx() * 32));
            return p4;
        }
        if (this.cvy instanceof w) {
            return new s((w)this.cvy);
        }
        throw new IllegalArgumentException("Don't know how to add " + String.valueOf(this.cvy.getClass()) + "!");
    }

    public void h(e e2) {
        if (this.cvS.contains(e2)) {
            this.cvS.remove(e2);
            e2.H(this.cvy);
        }
    }
}

