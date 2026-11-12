/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aei;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.ait;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.ake;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.ako;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.eu;
import hackclient.rise.fd;
import hackclient.rise.fh;
import hackclient.rise.fr;
import hackclient.rise.ft;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.server.t;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import net.minecraft.world.w;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.player.breaker.name"}, description="module.player.breaker.description", category=gj.PLAYER)
public class tx
extends gi {
    public final akp aeR = new akp("Mode", this).a(new akg[]{new aks("Normal")}).a(new akg[]{new aks("Instant")}).co("Normal");
    public final aki aeS = new aki("Bed", (gi)this, (Boolean)true);
    public final aki aeT = new aki("Keep Break Progress When Out Of Range", (gi)this, (Boolean)true);
    public final aki aeU = new aki("Cancel velocity whilst breaking, so you don't slow down in air", (gi)this, (Boolean)true);
    public final aki aeV = new aki("Through Walls", (gi)this, (Boolean)true);
    private final aki aeW = new aki("Empty Surrounding", (gi)this, (Boolean)false, () -> (Boolean)this.aeV.wD() == false);
    public final aki aeX = new aki("Rotate", (gi)this, (Boolean)true);
    public final aki aeY = new aki("Only Rotate at Start and Stop", (gi)this, (Boolean)true);
    public final aki aeZ = new aki("Whitelist Own Bed", (gi)this, (Boolean)true);
    public final aki afa = new aki("Slow Down In Air", (gi)this, (Boolean)true);
    private final ako<cb> afb = new ako("Movement Correction", this);
    private akd acw;
    private akd acx;
    private akd acy;
    private int abk;
    private boolean ji;
    private float acA;
    private afj acB = new afj(afk.aGW, 50L);
    @dm
    public final dk<ft> afc = ft2 -> {
        if (this.acw == null) {
            return;
        }
        ake ake2 = new ake((int)Math.floor(this.acw.getX()), (int)Math.floor(this.acw.getY()), (int)Math.floor(this.acw.getZ()));
        this.acB.Q(this.acA);
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.Jw();
            GlStateManager.tQ();
            GlStateManager.JO();
            GlStateManager.JA();
            GL11.glDepthMask((boolean)false);
            ait.e(this.rP().rQ());
            ait.g(new net.minecraft.util.a(ake2.wt(), ake2.wu(), ake2.wx(), ake2.wt() + 1, (double)ake2.wu() + 1.0 * this.acB.sV(), ake2.wx() + 1));
            GlStateManager.JN();
            GlStateManager.Jz();
            GlStateManager.tR();
            GL11.glDepthMask((boolean)true);
            GlStateManager.Jx();
            GlStateManager.JW();
            GlStateManager.JX();
        });
    };
    @dm(cH=4)
    public final dk<fh> afd = fh2 -> {
        t t2;
        if (!((Boolean)this.aeU.wD()).booleanValue() || this.acw == null) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == tx.aER.bgK.getEntityId()) {
            fh2.cF();
            t2.dcS = 0;
            t2.dcR = 0;
            t2.dcT = 0;
        }
    };
    @dm(cH=4)
    public final dk<eu> afe = eu2 -> {
        this.acA = tx.aER.bgu.bDx;
        afl.b("Updated Damage", new Object[0]);
        afl.b(eu2.dg(), new Object[0]);
        afl.b(this.acw.getX() + ", " + this.acw.getY() + ", " + this.acw.getZ(), new Object[0]);
    };
    @dm(cH=4)
    public final dk<ej> aff = ej2 -> {
        --this.abk;
        if (this.abk > 0) {
            return;
        }
        if (tx.aER.bgu.bDx == 0.0f || tx.aER.bgu.bDx >= 1.0f) {
            this.acA = 0.0f;
        }
        if (this.acw == null || tx.aER.bgK.getDistance(this.acw.getX(), this.acw.getY(), this.acw.getZ()) > 4.0 || aik.o(this.acw.getX(), this.acw.getY(), this.acw.getZ()) instanceof BlockAir) {
            this.jH();
            if (this.ji) {
                tx.aER.aIY.chw.ay(false);
                this.ji = false;
            }
            if (this.acw == null) {
                return;
            }
        }
        this.jP();
    };
    @dm
    public final dk<fr> afg = fr2 -> {
        if (this.acw == null) {
            return;
        }
        ce ce2 = this.kr();
        if (!this.e(ce2)) {
            afl.b("Not Target", new Object[0]);
            return;
        }
        fr2.a(ce2);
    };
    @dm
    public final dk<fd> afh = fd2 -> {
        double d2 = tx.aER.bgK.getDistance(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        if (d2 > 40.0) {
            this.acy = new akd(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        }
    };

    public tx() {
        for (cb cb2 : cb.values()) {
            this.afb.a((cb[])new cb[]{cb2});
        }
        this.afb.p(cb.gG);
    }

    @Override
    public void onEnable() {
        this.acw = null;
        this.acA = 0.0f;
        this.abk = 0;
        this.ji = false;
        this.acx = null;
    }

    @Override
    public void onDisable() {
        this.acw = null;
        if (this.ji) {
            tx.aER.aIY.chw.ay(false);
            this.ji = false;
        }
    }

    public void jH() {
        if (this.acw != null && !(aik.o(this.acw.x, this.acw.y, this.acw.z) instanceof BlockAir) && !(tx.aER.bgK.getDistance(this.acw.x, this.acw.y - (double)tx.aER.bgK.getEyeHeight(), this.acw.z) > 4.5)) {
            return;
        }
        if (this.acx != null && !((Boolean)this.aeT.wD()).booleanValue()) {
            tx.aER.bgu.bDx = 0.0f;
        }
        this.acx = this.acw;
        this.acw = this.jJ();
    }

    public void jI() {
        b b2 = new b(Math.floor(this.acw.getX()), Math.floor(this.acw.getY()), Math.floor(this.acw.getZ()));
        float f2 = aik.u(b2).a(tx.aER.bgK, tx.aER.bgF, b2);
        if (((Boolean)this.aeY.wD()).booleanValue() && tx.aER.bgu.bDx != 0.0f && !((double)tx.aER.bgu.bDx >= (double)(1.0f - f2) - 0.001)) {
            return;
        }
        if (!((Boolean)this.aeX.wD()).booleanValue()) {
            return;
        }
        bs.a(this.jQ(), 10.0, (cb)((Object)this.afb.wD()));
    }

    public akb jQ() {
        return aix.d(new akd(Math.floor(this.acw.getX()) + 0.5 + (Math.random() - 0.5) / 4.0, Math.floor(this.acw.getY()) + 0.1, Math.floor(this.acw.getZ()) + 0.5 + (Math.random() - 0.5) / 4.0));
    }

    public akd jJ() {
        if (this.acy != null && tx.aER.bgK.M(this.acy.getX(), this.acy.getY(), this.acy.getZ()) < 1225.0 && ((Boolean)this.aeZ.wD()).booleanValue()) {
            return null;
        }
        int n2 = 0;
        for (int i2 = -5; i2 <= 5; ++i2) {
            for (int i3 = -5; i3 <= 5; ++i3) {
                for (int i4 = -5; i4 <= 5; ++i4) {
                    ce ce2;
                    Block block2 = aik.p(i2, i3, i4);
                    akd akd2 = new akd(tx.aER.bgK.gW + (double)i2, tx.aER.bgK.gX + (double)i3, tx.aER.bgK.gY + (double)i4);
                    if (!(block2 instanceof BlockBed) || ++n2 <= 1 || (ce2 = aei.c(aix.d(akd2), 4.5)) == null || ce2.daS.x(new da(tx.aER.bgK.gW, tx.aER.bgK.gX - (double)tx.aER.bgK.getEyeHeight(), tx.aER.bgK.gY)) > 4.5) continue;
                    if (!((Boolean)this.aeV.wD()).booleanValue()) {
                        var8_8 = ce2.dg();
                        if (!((b)var8_8).h(akd2)) {
                            continue;
                        }
                    } else if (((Boolean)this.aeW.wD()).booleanValue()) {
                        var8_8 = akd2;
                        double d2 = Double.MAX_VALUE;
                        boolean bl2 = false;
                        for (int i5 = -4; i5 <= 4; ++i5) {
                            for (int i6 = 0; i6 <= 1; ++i6) {
                                for (int i7 = -4; i7 <= 4; ++i7) {
                                    double d3;
                                    Block block3 = aik.o(akd2.getX() + (double)i5, akd2.getY() + (double)i6, akd2.getZ() + (double)i7);
                                    if (block3 instanceof BlockBed || bl2 || tx.aER.bgK.getDistance(akd2.getX() + (double)i5, akd2.getY() + (double)i6, akd2.getZ()) + (double)i7 > 4.5 || this.a(akd2.v(i5, i6, i7)).stream().noneMatch(block -> block instanceof BlockBed)) continue;
                                    if (block3 instanceof BlockAir || block3 instanceof BlockLiquid) {
                                        bl2 = true;
                                        continue;
                                    }
                                    if (tx.aER.bgK.getDistance(akd2.getX() + (double)i5, akd2.getY() + (double)i6 - (double)tx.aER.bgK.getEyeHeight(), akd2.getZ() + (double)i7) > 4.5 || !((d3 = (double)block3.xn()) < d2)) continue;
                                    d2 = d3;
                                    var8_8 = akd2.v(i5, i6, i7);
                                }
                            }
                        }
                        if (!bl2) {
                            if (((akd)var8_8).equals(akd2)) {
                                return null;
                            }
                            return var8_8;
                        }
                    }
                    return akd2;
                }
            }
        }
        return null;
    }

    public List<Block> a(akd akd2) {
        ArrayList<Block> arrayList = new ArrayList<Block>();
        for (ao ao2 : ao.values()) {
            if (ao2 == ao.dwr) continue;
            akd akd3 = akd2.e(new akd(ao2.asM().wt(), ao2.asM().wu(), ao2.asM().wx()));
            arrayList.add(aik.c(akd3));
        }
        return arrayList;
    }

    public void o(b b2) {
        eu eu2 = new eu(tx.aER.bgK, tx.aER.bgK.baU, b2);
        a.a.e().d(eu2);
    }

    public void jP() {
        boolean bl2 = (Boolean)this.afa.wD();
        boolean bl3 = tx.aER.bgK.aO;
        if (!bl2) {
            tx.aER.bgK.aO = true;
        }
        b b2 = new b(this.acw.getX(), this.acw.getY(), this.acw.getZ());
        tx.aER.bhc = this.kr();
        tx.aER.bgu.bDx = this.acA;
        switch (((akg)this.aeR.wD()).getName()) {
            case "Instant": {
                this.jI();
                this.o(b2);
                tx.aER.bgK.swingItem();
                ahn.m(new i(j.daZ, b2, ao.dwr));
                tx.aER.bgK.swingItem();
                ahn.m(new i(j.dbb, b2, ao.dwr));
                this.acw = null;
                this.abk = 20;
                tx.aER.bgu.d(b2, ao.dwq);
                break;
            }
            case "Normal": {
                this.o(b2);
                this.jI();
                tx.aER.aIY.chw.ay(true);
                this.ji = true;
            }
        }
        tx.aER.bgK.aO = bl3;
    }

    private ce kr() {
        ce ce2 = this.g(bs.fk);
        if (!this.e(ce2)) {
            ce2 = this.g(this.jQ());
        }
        if (!this.e(ce2)) {
            ce2 = new ce(new da(this.acw.getX() + Math.random(), this.acw.getY() + 1.0, this.acw.getZ() + Math.random()), ao.dwr, new b(this.acw.getX(), this.acw.getY(), this.acw.getZ()));
        }
        return ce2;
    }

    private boolean e(ce ce2) {
        return ce2 != null && ce2.dzu == cf.dzy && ce2.dg().h(new akd(this.acw.getX(), this.acw.getY(), this.acw.getZ()));
    }

    private ce g(akb akb2) {
        Block block = aik.c(this.acw);
        net.minecraft.util.a a2 = block.a((w)tx.aER.bgF, new b(this.acw.getX(), this.acw.getY(), this.acw.getZ()), block.xM());
        da da2 = tx.aER.bgK.aQ(1.0f);
        da da3 = tx.aER.bgK.s(akb2.getY(), akb2.getX());
        double d2 = 4.5;
        da da4 = da2.al(da3.dAG * 4.5, da3.dAH * 4.5, da3.dAI * 4.5);
        ce ce2 = a2.c(da2, da4);
        if (ce2 != null) {
            ce2.a(new b(this.acw.getX(), this.acw.getY(), this.acw.getZ()));
        }
        return ce2;
    }
}

