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
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.ci;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.eu;
import hackclient.rise.fd;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.fr;
import hackclient.rise.ft;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.tj;
import hackclient.rise.tl;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.server.an;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.da;
import net.minecraft.world.w;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.player.breaker.name"}, description="module.player.breaker.description", category=gj.PLAYER)
public class ti
extends gi {
    public final akp ace = new akp("Mode", this).a(new akg[]{new aks("Normal")}).a(new akg[]{new aks("Instant")}).co("Normal");
    public final akq acf = new akq("Range", this, (Number)4.5, (Number)1, (Number)6, (Number)0.1);
    public final aki acg = new aki("Bed", (gi)this, (Boolean)true);
    public final aki ach = new aki("Keep Break Progress When Out Of Range", (gi)this, (Boolean)true);
    public final aki aci = new aki("Cancel velocity whilst breaking, so you don't slow down in air", (gi)this, (Boolean)true);
    public final aki acj = new aki("Delay Velocity Until Bed Broken", (gi)this, (Boolean)false);
    public final aki ack = new aki("Through Walls", (gi)this, (Boolean)true);
    private final aki acl = new aki("Empty Surrounding", (gi)this, (Boolean)false, () -> (Boolean)this.ack.wD() == false);
    private final aki acm = new aki("Show Best Stand Position", (gi)this, (Boolean)false, () -> (Boolean)this.ack.wD());
    private final aki acn = new aki("Heypixel", (gi)this, (Boolean)false, () -> (Boolean)this.ack.wD() == false || (Boolean)this.acl.wD() == false);
    private final aki aco = new aki("Watchdog Ground Spoof", (gi)this, (Boolean)false);
    public final aki acp = new aki("Attack While Breaking", (gi)this, (Boolean)true);
    private final aki acq = new aki("Show Breaker Percentage", (gi)this, (Boolean)true);
    public final aki acr = new aki("Rotate", (gi)this, (Boolean)true);
    public final aki acs = new aki("Only Rotate at Start and Stop", (gi)this, (Boolean)true);
    public final aki act = new aki("Whitelist Own Bed", (gi)this, (Boolean)true);
    public final aki acu = new aki("Slow Down In Air", (gi)this, (Boolean)true);
    private final ako<cb> acv = new ako("Movement Correction", this);
    public static akd acw;
    public static akd acx;
    public static akd acy;
    private int abk;
    public static boolean iq;
    public static boolean ir;
    public static boolean acz;
    private int dm;
    private boolean ji;
    private float acA;
    public static boolean tt;
    private afj acB = new afj(afk.aGW, 50L);
    private b acC;
    private da acD;
    private int acE;
    private int acF;
    private final ArrayList<aj<?>> acG = new ArrayList();
    private b acH;
    private da acI;
    private b acJ;
    private boolean acK = false;
    @dm
    public final dk<ft> acL = ft2 -> {
        if (acw == null) {
            return;
        }
        if (a.a.g().c(tl.class).isEnabled() && ((Boolean)this.acq.wD()).booleanValue()) {
            ci.a((float)(1.21 * (double)this.acA + (Double)((Number)a.a.g().c(tl.class).adi.wD()) / 100.0));
        } else if (((Boolean)this.acq.wD()).booleanValue()) {
            ci.a((float)(1.21 * (double)this.acA));
        }
        ake ake2 = new ake((int)Math.floor(acw.getX()), (int)Math.floor(acw.getY()), (int)Math.floor(acw.getZ()));
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
    @dm
    public final dk<ft> acM = ft2 -> {
        b b2 = this.acC;
        if (b2 == null) {
            return;
        }
        net.minecraft.util.a a2 = new net.minecraft.util.a(b2, b2.C(1, 1, 1));
        this.a(a2, this.rP().rQ());
        this.b(gg.kT).c(() -> this.a(a2, this.rP().rQ()));
    };
    @dm(cH=2)
    public final dk<fh> acN = fh2 -> {
        aj<net.minecraft.network.play.a> aj2;
        aj<?> aj3 = fh2.dq();
        if (tt) {
            return;
        }
        if (((Boolean)this.acj.wD()).booleanValue()) {
            if (aj3 instanceof t) {
                aj2 = (t)aj3;
                if (((t)aj2).getEntityID() == ti.aER.bgK.getEntityId() && acz) {
                    this.acK = true;
                    this.acG.add(aj3);
                    fh2.cF();
                }
            } else if (aj3 instanceof bc && this.acK) {
                afl.b(ti.aER.bgK.aRg, new Object[0]);
                this.acG.add(aj3);
                fh2.cF();
            }
        }
        if (acw == null || !((Boolean)this.aci.wD()).booleanValue()) {
            return;
        }
        if (aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == ti.aER.bgK.getEntityId()) {
            fh2.cF();
        }
        if (aj3 instanceof an) {
            aj2 = (an)aj3;
            b b2 = ((an)aj2).ahk();
            IBlockState iBlockState = ((an)aj2).yU();
            if (acw != null && b2.wt() == (int)acw.getX() && b2.wu() == (int)acw.getY() && b2.wx() == (int)acw.getZ() && iBlockState.df() == Blocks.cLc) {
                acw = null;
                akd akd2 = this.jJ();
                if (akd2 == null) {
                    acz = false;
                }
            }
        }
    };
    @dm(cH=4)
    public final dk<fi> acO = fi2 -> {
        i i2;
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof i) {
            i2 = (i)aj2;
            if (i2.afW() == j.daZ) {
                this.acJ = i2.yl();
            } else if (i2.afW() == j.dba || i2.afW() == j.dbb) {
                this.acJ = null;
            }
        }
        if (aj2 instanceof i && acw != null && ((Boolean)this.aco.wD()).booleanValue() && ((i2 = (i)aj2).afW() == j.daZ || i2.afW() == j.dbb)) {
            iq = true;
            this.dm = ti.aER.bgK.aRg;
        }
    };
    @dm(cH=0)
    public final dk<ei> acP = ei2 -> {
        if (ti.aER.bgu.bDx != 0.0f) {
            // empty if block
        }
        if (iq) {
            bm.blink();
            ei2.setOnGround(true);
        }
        if (ti.aER.bgK.aO && iq) {
            bm.dispatch();
            iq = false;
        }
    };
    @dm
    public final dk<eo> acQ = eo2 -> {
        if (!iq || ti.aER.bgK.aO) {
            // empty if block
        }
    };
    @dm(cH=4)
    public final dk<eu> acR = eu2 -> {
        this.acA = ti.aER.bgu.bDx;
    };
    @dm(cH=4)
    public final dk<ej> acS = ej2 -> {
        this.jM();
        if (((Boolean)this.acj.wD()).booleanValue() && !acz && this.acK) {
            tt = true;
            this.acG.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.acG.clear();
            this.acK = false;
            tt = false;
            afl.b(ti.aER.bgK.aRg, new Object[0]);
        }
        --this.abk;
        if (this.abk > 0) {
            return;
        }
        this.jL();
        if (acw == null || this.a(ti.aER.bgK.aQ(1.0f), this.jS()) > this.jT() || aik.o(acw.getX(), acw.getY(), acw.getZ()) instanceof BlockAir) {
            this.jH();
            if (this.ji) {
                ti.aER.aIY.chw.ay(false);
                this.ji = false;
            }
            if (acw == null) {
                return;
            }
        }
        this.jP();
    };
    @dm
    public final dk<fr> acT = fr2 -> {
        if (acw == null) {
            return;
        }
        b b2 = this.jS();
        da da2 = ti.aER.bgK.aQ(1.0f);
        akb akb2 = (Boolean)this.acr.wD() != false ? this.jQ() : new akb(ti.aER.bgK.pl, ti.aER.bgK.pm);
        double d2 = this.jR();
        if (this.a(da2, b2) > d2) {
            if (!(((Boolean)this.ach.wD()).booleanValue() && ti.aER.bgu.bDA && b2.equals(this.acJ))) {
                fr2.a(null);
                return;
            }
            float f2 = aik.u(b2).a(ti.aER.bgK, ti.aER.bgF, b2);
            ti.aER.bgu.bDx = Math.min(ti.aER.bgu.bDx, 1.0f - f2 - 0.001f);
            d2 = this.jT() + 1.0;
        }
        da da3 = ti.aER.bgK.s(akb2.getY(), akb2.getX());
        da da4 = da2.al(da3.dAG * d2, da3.dAH * d2, da3.dAI * d2);
        ce ce2 = aik.u(b2).a((w)ti.aER.bgF, b2, da2, da4);
        fr2.a(ce2);
    };
    @dm
    public final dk<fd> acU = fd2 -> {
        double d2 = ti.aER.bgK.getDistance(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        if (d2 > 40.0) {
            acy = new akd(fd2.getPosX(), fd2.getPosY(), fd2.getPosZ());
        }
    };

    public ti() {
        for (cb cb2 : cb.values()) {
            this.acv.a((cb[])new cb[]{cb2});
        }
        this.acv.p(cb.gG);
    }

    @Override
    public void onEnable() {
        acw = null;
        this.acA = 0.0f;
        this.abk = 0;
        this.acC = null;
        this.acD = null;
        acz = false;
        this.acG.clear();
        this.acG.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.acK = false;
    }

    @Override
    public void onDisable() {
        acw = null;
        iq = false;
        acz = false;
        this.acC = null;
        this.acD = null;
        if (!this.acG.isEmpty()) {
            this.acG.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.acG.clear();
        }
        this.acK = false;
        if (this.ji) {
            ti.aER.aIY.chw.ay(false);
            this.ji = false;
        }
    }

    private void a(net.minecraft.util.a a2, Color color) {
        double d2 = ti.aER.BF().bVG;
        double d3 = ti.aER.BF().bVH;
        double d4 = ti.aER.BF().bVI;
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GlStateManager.JD();
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.5f);
        ait.e(color);
        RenderGlobal.j(a2.ad(0.002, 0.002, 0.002).ae(-d2, -d3, -d4));
        GL11.glDepthMask((boolean)true);
        GlStateManager.JE();
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    }

    public void jH() {
        if (acw != null) {
            if (!(aik.o(ti.acw.x, ti.acw.y, ti.acw.z) instanceof BlockAir) && !(this.a(ti.aER.bgK.aQ(1.0f), this.jS()) > this.jT())) {
                return;
            }
        }
        if (acx != null && !((Boolean)this.ach.wD()).booleanValue()) {
            ti.aER.bgu.bDx = 0.0f;
        }
        acx = acw;
        akd akd2 = this.jJ();
        acz = akd2 != null;
        acw = akd2;
    }

    public void jI() {
        b b2 = new b(acw.getX(), acw.getY(), acw.getZ());
        float f2 = aik.u(b2).a(ti.aER.bgK, ti.aER.bgF, b2);
        if (((Boolean)this.acs.wD()).booleanValue() && ti.aER.bgu.bDx != 0.0f && (double)ti.aER.bgu.bDx <= (double)(1.0f - f2) - 0.001) {
            return;
        }
        if (!((Boolean)this.acr.wD()).booleanValue()) {
            return;
        }
        bs.a(this.jQ(), 10.0, (cb)((Object)this.acv.wD()));
    }

    public akd jJ() {
        if (acy != null && ti.aER.bgK.M(acy.getX(), acy.getY(), acy.getZ()) < 1225.0 && ((Boolean)this.act.wD()).booleanValue()) {
            return null;
        }
        if (!((Boolean)this.ack.wD()).booleanValue()) {
            return this.jK();
        }
        int n2 = 0;
        for (int i2 = -5; i2 <= 5; ++i2) {
            for (int i3 = -5; i3 <= 5; ++i3) {
                for (int i4 = -5; i4 <= 5; ++i4) {
                    ce ce2;
                    Block block2 = aik.p(i2, i3, i4);
                    akd akd2 = new akd(ti.aER.bgK.gW + (double)i2, ti.aER.bgK.gX + (double)i3, ti.aER.bgK.gY + (double)i4);
                    if (!(block2 instanceof BlockBed) || ++n2 <= 1 || (ce2 = aei.c(aix.d(akd2), ((Number)this.acf.wD()).floatValue())) == null || this.a(ti.aER.bgK.aQ(1.0f), new b(akd2.getX(), akd2.getY(), akd2.getZ())) > ((Number)this.acf.wD()).doubleValue()) continue;
                    if (((Boolean)this.acl.wD()).booleanValue()) {
                        akd akd3 = akd2;
                        double d2 = Double.MAX_VALUE;
                        boolean bl2 = false;
                        int n3 = (Boolean)this.acn.wD() != false ? 0 : 4;
                        int n4 = (Boolean)this.acn.wD() != false ? 1 : 0;
                        for (int i5 = -n3; i5 <= n3; ++i5) {
                            for (int i6 = n4; i6 <= 1; ++i6) {
                                for (int i7 = -n3; i7 <= n3; ++i7) {
                                    double d3;
                                    Block block3 = aik.o(akd2.getX() + (double)i5, akd2.getY() + (double)i6, akd2.getZ() + (double)i7);
                                    if (block3 instanceof BlockBed || bl2 || ti.aER.bgK.getDistance(akd2.getX() + (double)i5, akd2.getY() + (double)i6, akd2.getZ()) + (double)i7 > 46.0 || this.a(akd2.v(i5, i6, i7)).stream().noneMatch(block -> block instanceof BlockBed)) continue;
                                    if (block3 instanceof BlockAir || block3 instanceof BlockLiquid) {
                                        bl2 = true;
                                        continue;
                                    }
                                    if (this.a(ti.aER.bgK.aQ(1.0f), new b(akd2.getX() + (double)i5, akd2.getY() + (double)i6, akd2.getZ() + (double)i7)) > ((Number)this.acf.wD()).doubleValue() || !((d3 = (double)block3.xn()) < d2)) continue;
                                    d2 = d3;
                                    akd3 = akd2.v(i5, i6, i7);
                                }
                            }
                        }
                        if (!bl2) {
                            if (akd3.equals(akd2)) {
                                return null;
                            }
                            return akd3;
                        }
                    }
                    return akd2;
                }
            }
        }
        return null;
    }

    private akd jK() {
        tj tj2 = this.a(ti.aER.bgK.aQ(1.0f), this.jO());
        if (tj2 == null) {
            return null;
        }
        b b2 = tj2.acW.get(0);
        return new akd((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5);
    }

    private tj a(da da2, List<b> list) {
        tj tj2 = null;
        for (tj tj3 : this.b(da2, list)) {
            if (tj2 != null && !(tj3.acX < tj2.acX)) continue;
            tj2 = tj3;
        }
        return tj2;
    }

    private List<tj> b(da da2, List<b> list) {
        ArrayList<tj> arrayList = new ArrayList<tj>();
        for (b b2 : list) {
            for (da da3 : this.n(b2)) {
                tj tj2 = this.a(da2, b2, da3);
                if (tj2 == null) continue;
                arrayList.add(tj2);
            }
        }
        return arrayList;
    }

    private tj a(da da2, b b2, da da3) {
        double d2 = ((Number)this.acf.wD()).doubleValue();
        ArrayList<b> arrayList = new ArrayList<b>();
        double d3 = 0.0;
        for (b b3 : this.b(da2, da3)) {
            if (this.a(da2, b3) > d2) {
                return null;
            }
            if (b3.equals(b2)) {
                arrayList.add(b2);
                return new tj(b2, arrayList, d3);
            }
            if (this.m(b3)) continue;
            Block block = aik.u(b3);
            if (block instanceof BlockBed || block.b(ti.aER.bgF, b3) < 0.0f) {
                return null;
            }
            arrayList.add(b3);
            d3 += (double)(1.0f / Math.max(block.a(ti.aER.bgK, ti.aER.bgF, b3), 1.0E-4f));
        }
        return null;
    }

    private List<b> b(da da2, da da3) {
        double d2;
        double d3;
        double d4;
        int n2;
        int n3;
        ArrayList<b> arrayList = new ArrayList<b>();
        int n4 = bt.aF(da2.dAG);
        int n5 = bt.aF(da2.dAH);
        int n6 = bt.aF(da2.dAI);
        int n7 = bt.aF(da3.dAG);
        int n8 = bt.aF(da3.dAH);
        int n9 = bt.aF(da3.dAI);
        double d5 = da3.dAG - da2.dAG;
        double d6 = da3.dAH - da2.dAH;
        double d7 = da3.dAI - da2.dAI;
        int n10 = d5 > 0.0 ? 1 : (n3 = d5 < 0.0 ? -1 : 0);
        int n11 = d6 > 0.0 ? 1 : (n2 = d6 < 0.0 ? -1 : 0);
        int n12 = d7 > 0.0 ? 1 : (d7 < 0.0 ? -1 : 0);
        double d8 = n3 == 0 ? Double.MAX_VALUE : 1.0 / Math.abs(d5);
        double d9 = n2 == 0 ? Double.MAX_VALUE : 1.0 / Math.abs(d6);
        double d10 = d4 = n12 == 0 ? Double.MAX_VALUE : 1.0 / Math.abs(d7);
        double d11 = n3 == 0 ? Double.MAX_VALUE : (d3 = (n3 > 0 ? (double)(n4 + 1) - da2.dAG : da2.dAG - (double)n4) / Math.abs(d5));
        double d12 = n2 == 0 ? Double.MAX_VALUE : (d2 = (n2 > 0 ? (double)(n5 + 1) - da2.dAH : da2.dAH - (double)n5) / Math.abs(d6));
        double d13 = n12 == 0 ? Double.MAX_VALUE : (n12 > 0 ? (double)(n6 + 1) - da2.dAI : da2.dAI - (double)n6) / Math.abs(d7);
        arrayList.add(new b(n4, n5, n6));
        while ((n4 != n7 || n5 != n8 || n6 != n9) && arrayList.size() < 64) {
            if (d3 <= d2 && d3 <= d13) {
                n4 += n3;
                d3 += d8;
            } else if (d2 <= d13) {
                n5 += n2;
                d2 += d9;
            } else {
                n6 += n12;
                d13 += d4;
            }
            arrayList.add(new b(n4, n5, n6));
        }
        return arrayList;
    }

    private void jL() {
        double d2;
        if (acw == null || ((Boolean)this.ack.wD()).booleanValue()) {
            this.acD = null;
            return;
        }
        da da2 = new da(ti.aER.bgK.gW, ti.aER.bgK.gX, ti.aER.bgK.gY);
        if (this.acD == null || this.acD.y(da2) < 0.25 || ti.aER.bgK.aRg - this.acF < 5) {
            if (this.acD == null) {
                this.acD = da2;
            }
            return;
        }
        this.acD = da2;
        this.acF = ti.aER.bgK.aRg;
        b b2 = new b(acw.getX(), acw.getY(), acw.getZ());
        tj tj2 = null;
        tj tj3 = null;
        for (tj tj4 : this.b(ti.aER.bgK.aQ(1.0f), this.jO())) {
            if (tj3 == null || tj4.acX < tj3.acX) {
                tj3 = tj4;
            }
            if (!tj4.acW.get(0).equals(b2) || tj2 != null && !(tj4.acX < tj2.acX)) continue;
            tj2 = tj4;
        }
        if (tj3 == null || tj3.acW.get(0).equals(b2)) {
            return;
        }
        if (tj2 != null && tj3.acX >= (tj2.acX - (d2 = (double)(ti.aER.bgu.bDx / Math.max(aik.u(b2).a(ti.aER.bgK, ti.aER.bgF, b2), 1.0E-4f)))) * 0.9) {
            return;
        }
        ti.aER.bgu.bDx = 0.0f;
        this.acA = 0.0f;
        if (this.ji) {
            ti.aER.aIY.chw.ay(false);
            this.ji = false;
        }
        acw = null;
    }

    private void jM() {
        if (!((Boolean)this.acm.wD()).booleanValue() || ((Boolean)this.ack.wD()).booleanValue()) {
            this.acC = null;
            return;
        }
        if (ti.aER.bgK.aRg - this.acE < 10) {
            return;
        }
        this.acE = ti.aER.bgK.aRg;
        this.acC = this.jN();
    }

    private b jN() {
        double d2 = ((Number)this.acf.wD()).doubleValue();
        int n2 = (int)Math.ceil(d2) + 1;
        List<b> list = this.jO();
        if (list.isEmpty()) {
            return null;
        }
        b b2 = list.get(0);
        b b3 = null;
        double d3 = 0.0;
        double d4 = 0.0;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    b b4 = b2.C(i2, i3, i4);
                    da da2 = new da((double)b4.wt() + 0.5, (float)b4.wu() + ti.aER.bgK.getEyeHeight(), (double)b4.wx() + 0.5);
                    boolean bl2 = false;
                    Object object = list.iterator();
                    while (object.hasNext()) {
                        b b5 = object.next();
                        if (!(this.a(da2, b5) <= d2)) continue;
                        bl2 = true;
                        break;
                    }
                    if (!bl2 || !this.l(b4) || (object = this.a(da2, list)) == null) continue;
                    double d5 = ti.aER.bgK.M((double)b4.wt() + 0.5, b4.wu(), (double)b4.wx() + 0.5);
                    if (b3 != null && !(((tj)object).acX < d3 - 0.001) && (!(Math.abs(((tj)object).acX - d3) <= 0.001) || !(d5 < d4))) continue;
                    b3 = b4;
                    d3 = ((tj)object).acX;
                    d4 = d5;
                }
            }
        }
        return b3;
    }

    private boolean l(b b2) {
        return this.m(b2) && this.m(b2.aqX()) && aik.u(b2.aqY()).a((w)ti.aER.bgF, b2.aqY(), ti.aER.bgF.L(b2.aqY())) != null;
    }

    private boolean m(b b2) {
        return aik.u(b2).a((w)ti.aER.bgF, b2, ti.aER.bgF.L(b2)) == null;
    }

    private double a(da da2, b b2) {
        double d2 = Math.max((double)b2.wt() - da2.dAG, Math.max(0.0, da2.dAG - (double)(b2.wt() + 1)));
        double d3 = Math.max((double)b2.wu() - da2.dAH, Math.max(0.0, da2.dAH - (double)(b2.wu() + 1)));
        double d4 = Math.max((double)b2.wx() - da2.dAI, Math.max(0.0, da2.dAI - (double)(b2.wx() + 1)));
        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
    }

    private List<b> jO() {
        ArrayList<b> arrayList = new ArrayList<b>();
        for (int i2 = -5; i2 <= 5; ++i2) {
            for (int i3 = -5; i3 <= 5; ++i3) {
                for (int i4 = -5; i4 <= 5; ++i4) {
                    if (!(aik.p(i2, i3, i4) instanceof BlockBed)) continue;
                    arrayList.add(new b(ti.aER.bgK.gW + (double)i2, ti.aER.bgK.gX + (double)i3, ti.aER.bgK.gY + (double)i4));
                }
            }
        }
        return arrayList;
    }

    private da[] n(b b2) {
        return new da[]{new da((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5), new da((double)b2.wt() + 0.1, (double)b2.wu() + 0.1, (double)b2.wx() + 0.1), new da((double)b2.wt() + 0.9, (double)b2.wu() + 0.1, (double)b2.wx() + 0.9), new da((double)b2.wt() + 0.1, (double)b2.wu() + 0.5, (double)b2.wx() + 0.9), new da((double)b2.wt() + 0.9, (double)b2.wu() + 0.5, (double)b2.wx() + 0.1)};
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
        eu eu2 = new eu(ti.aER.bgK, ti.aER.bgK.baU, b2);
        a.a.e().d(eu2);
    }

    public void jP() {
        boolean bl2 = (Boolean)this.acu.wD();
        boolean bl3 = ti.aER.bgK.aO;
        if (!bl2) {
            ti.aER.bgK.aO = true;
        }
        b b2 = new b(acw.getX(), acw.getY(), acw.getZ());
        switch (((akg)this.ace.wD()).getName()) {
            case "Instant": {
                if (this.a(ti.aER.bgK.aQ(1.0f), b2) > this.jR()) break;
                this.jI();
                this.o(b2);
                ti.aER.bgK.swingItem();
                ahn.m(new i(j.daZ, b2, ao.dwr));
                ti.aER.bgK.swingItem();
                ahn.m(new i(j.dbb, b2, ao.dwr));
                acw = null;
                this.abk = 20;
                ti.aER.bgu.d(b2, ao.dwq);
                break;
            }
            case "Normal": {
                this.o(b2);
                this.jI();
                ti.aER.aIY.chw.ay(true);
                this.ji = true;
            }
        }
        ti.aER.bgK.aO = bl3;
    }

    public akb jQ() {
        da da2 = this.p(new b(acw.getX(), acw.getY(), acw.getZ()));
        return aix.d(new akd(da2.dAG, da2.dAH, da2.dAI));
    }

    private da p(b b2) {
        if (this.acI == null || !b2.equals(this.acH)) {
            net.minecraft.util.a a2 = aik.u(b2).c(ti.aER.bgF, b2);
            if (a2 == null) {
                a2 = new net.minecraft.util.a(b2, b2.C(1, 1, 1));
            }
            this.acH = b2;
            this.acI = new da((a2.dtH + a2.dtK) / 2.0 + (Math.random() - 0.5) * (a2.dtK - a2.dtH) * 0.4, (a2.dtI + a2.dtL) / 2.0 + (Math.random() - 0.5) * (a2.dtL - a2.dtI) * 0.4, (a2.dtJ + a2.dtM) / 2.0 + (Math.random() - 0.5) * (a2.dtM - a2.dtJ) * 0.4);
        }
        return this.acI;
    }

    private double jR() {
        return ((Number)this.acf.wD()).doubleValue() - ti.aER.bgK.getDistance(ti.aER.bgK.csh, ti.aER.bgK.csi, ti.aER.bgK.csj);
    }

    private b jS() {
        return new b(acw.getX(), acw.getY(), acw.getZ());
    }

    private double jT() {
        return (Boolean)this.ach.wD() != false ? ((Number)this.acf.wD()).doubleValue() + 2.5 : ((Number)this.acf.wD()).doubleValue();
    }

    static {
        acz = false;
    }
}

