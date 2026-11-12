/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bm;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.ft;
import hackclient.rise.go;
import hackclient.rise.hf;
import hackclient.rise.lw;
import hackclient.rise.ly;
import hackclient.rise.lz;
import hackclient.rise.mh;
import hackclient.rise.ok;
import hackclient.rise.qq;
import hackclient.rise.ti;
import hackclient.rise.tn;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.w;
import net.minecraft.network.play.server.x;
import net.minecraft.network.play.server.y;
import net.minecraft.network.play.server.z;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import org.lwjgl.opengl.GL11;

public final class jc
extends akg<hf> {
    private long vc = -1L;
    boolean vd = false;
    boolean vf = false;
    public final aki vQ = new aki("Stack", (akg<?>)this, (Boolean)true);
    boolean vh;
    public final aki vR = new aki("Ping Spoof", (akg<?>)this, (Boolean)true);
    public final aki vS = new aki("Always Cancel Vertical", (akg<?>)this, (Boolean)false);
    public final aki vT = new aki("Watchdog Backtrack", (akg<?>)this, (Boolean)false);
    public final aki vU = new aki("Damage Boost (not for hypixel)", (akg<?>)this, (Boolean)false);
    private final akq vV = new akq("Damage Boost Speed", this, (Number)1, (Number)1, (Number)10, (Number)0.01);
    public static boolean dj;
    public static boolean tt;
    public static boolean vq;
    private da pU = new da(0.0, 0.0, 0.0);
    public c pY;
    private int sG;
    private final ArrayList<aj<?>> vW = new ArrayList();
    @dm
    public final dk<fh> vX = fh2 -> {
        aj<a> aj2;
        aj<a> aj3;
        Object object;
        Object object2;
        if (tt || this.e(lz.class).isEnabled() || this.e(lw.class).isEnabled() || this.e(ly.class).isEnabled() && ((akg)this.e(ly.class).DA.wD()).getName().equals("Watchdog Dolphin 1.18+") && ok.KA < 30) {
            return;
        }
        aj<?> aj4 = fh2.dq();
        Objects.requireNonNull(aj4);
        Object object3 = aj4;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class, net.minecraft.network.play.server.a.class, x.class, w.class, y.class, aa.class}, object3, n2)) {
            case 0: {
                object2 = (t)object3;
                if (((t)object2).getEntityID() == jc.aER.bgK.getEntityId() && !aik.vz() && (jc.aER.bgK.crx <= 0 || !((Boolean)this.vS.wD()).booleanValue() || this.e(mh.class).isEnabled() || jc.aER.bgK.cuU || jc.aER.aIY.chq.Re() || this.vh || !((double)((t)object2).agO() / 8000.0 > 0.08) || jc.aER.bgK.Zz <= 11)) {
                    if ((Boolean)this.vQ.wD() != false && this.sG < 1 && !jc.aER.bgK.aO && Math.random() < 0.73 && jc.aER.bgK.tR <= 13 || jc.aER.bgK.csz || this.e(tn.class).isEnabled() && (jc.aER.bgK.tR <= 3 || !aii.isMoving() || !this.e(mh.class).isEnabled() || !qq.RK || !(Math.hypot(aii.predictedMotion((double)((t)object2).agN() / 8000.0, 1), aii.predictedMotion((double)((t)object2).agP() / 8000.0, 1)) > aii.speed()))) {
                        ++this.sG;
                        vq = true;
                        fh2.cF();
                        vq = false;
                    }
                    if (!(fh2.isCancelled() || this.e(tn.class).isEnabled() || jc.aER.bgK.tR > 11 || jc.aER.bgK.aO && (!jc.aER.bgK.aO || aii.isMoving()) || (double)((t)object2).agO() / 8000.0 < 0.08 && !this.e(mh.class).isEnabled() && !this.e(lz.class).isEnabled() || !this.e(tn.class).isEnabled() && jc.aER.bgK.tR > 3 && aii.isMoving() && this.e(mh.class).isEnabled() && qq.RK && Math.hypot((double)((t)object2).agN() / 8000.0, (double)((t)object2).agP() / 8000.0) > aii.speed())) {
                        this.sG = 0;
                        dj = true;
                        this.vW.add((aj<?>)object2);
                        fh2.cF();
                        break;
                    }
                    if (fh2.isCancelled()) break;
                    if (qq.RK) {
                        // empty if block
                    }
                    if (!this.e(tn.class).isEnabled()) {
                        jc.aER.bgK.ue = (double)((t)object2).agO() / 8000.0;
                    }
                    if (this.e(mh.class).isEnabled()) break;
                    fh2.cF();
                    break;
                }
                if (!fh2.isCancelled() && aik.vz()) {
                    fh2.cF();
                    break;
                }
                if (fh2.isCancelled() || ((t)object2).getEntityID() != jc.aER.bgK.getEntityId() || this.e(lz.class).isEnabled()) break;
                ((t)object2).dcS *= 0;
                jc.aER.bgK.ud *= 0.9;
                jc.aER.bgK.uf *= 0.9;
                fh2.e((aj<?>)object2);
                break;
            }
            case 1: {
                object = (bc)object3;
                if (!dj || !((Boolean)this.vR.wD()).booleanValue()) break;
                this.vW.add((aj<?>)object);
                fh2.cF();
                break;
            }
            case 2: {
                net.minecraft.network.play.server.a a2 = (net.minecraft.network.play.server.a)object3;
                if (!dj || !((Boolean)this.vR.wD()).booleanValue()) break;
                fh2.cF();
                break;
            }
            case 3: {
                x x2 = (x)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(x2);
                fh2.cF();
                break;
            }
            case 4: {
                aj3 = (w)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(aj3);
                fh2.cF();
                break;
            }
            case 5: {
                aj2 = (y)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(aj2);
                fh2.cF();
                break;
            }
            case 6: {
                aa aa2 = (aa)object3;
                if (!this.vd && !dj || !((Boolean)this.vT.wD()).booleanValue() || this.vf) break;
                this.vW.add(aa2);
                fh2.cF();
                break;
            }
        }
        object3 = bv.f(12.0);
        object3.sort(Comparator.comparingDouble(r2 -> r2.cus));
        if (object3.isEmpty()) {
            this.pY = null;
            if (((Boolean)this.vT.wD()).booleanValue()) {
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
                this.vd = false;
                this.vf = false;
            }
            return;
        }
        c c2 = (c)object3.get(0);
        if (((Boolean)this.vT.wD()).booleanValue()) {
            double d2;
            if (c2 != this.pY) {
                this.pY = c2;
                this.pU.dAG = c2.gW;
                this.pU.dAH = c2.gX;
                this.pU.dAI = c2.gY;
            }
            if ((d2 = ((da)(object2 = jc.aER.bgK.aQ(1.0f))).x((da)(object = new da(this.pU.dAG, this.pU.dAH, this.pU.dAI)))) > 4.5 && dj || jc.aER.bgK.tR > 9 && dj) {
                this.vf = true;
            } else if (dj) {
                this.vf = false;
            }
            boolean bl2 = this.vd = d2 < 4.5;
            if (!jc.aER.bgK.cup || !(d2 > 3.1) || !(d2 < 4.5) || this.e(go.class).isEnabled()) {
                // empty if block
            }
            if (this.vd) {
                if (this.vc == -1L) {
                    this.vc = System.currentTimeMillis();
                }
                if (System.currentTimeMillis() - this.vc >= Math.round(Math.random() * 150.0) + 100L) {
                    tt = true;
                    this.vW.stream().filter(this::f).forEach(ahn::q);
                    this.vW.clear();
                    tt = false;
                    this.vd = false;
                    this.vc = -1L;
                }
            } else {
                this.vc = -1L;
            }
            if (this.vf && dj) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (jc.aER.bgK.aRg < 100) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (jc.aER.bgK.cus == 9) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (d2 < 2.5) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if (d2 > 4.5) {
                this.vd = false;
                tt = true;
                this.vW.stream().filter(this::f).forEach(ahn::q);
                this.vW.clear();
                tt = false;
            }
            if ((aj3 = fh2.dq()) instanceof v) {
                aj2 = aj3;
                if (((v)aj2).crw == this.pY.getEntityId()) {
                    this.pU.dAG += (double)((v)aj2).agR() / 32.0;
                    this.pU.dAH += (double)((v)aj2).agS() / 32.0;
                    this.pU.dAI += (double)((v)aj2).agT() / 32.0;
                }
            } else if (aj3 instanceof z && ((z)(aj2 = (z)aj3)).getEntityId() == this.pY.getEntityId()) {
                this.pU = new da((double)((z)aj2).wt() / 32.0, (double)((z)aj2).wu() / 32.0, (double)((z)aj2).wx() / 32.0);
            }
        }
    };
    @dm(cH=4)
    public final dk<ed> vY = ed2 -> {};
    @dm(cH=4)
    public final dk<ei> vZ = ei2 -> {
        this.vh = Math.abs(jc.aER.bgK.gX - (double)Math.round(jc.aER.bgK.gX)) > 0.01 && jc.aER.bgK.aO;
        if (jc.aER.bgK.ae == 1 && aii.isMoving() && (Math.abs(jc.aER.bgK.gX - Math.floor(jc.aER.bgK.gX)) < 0.03 || jc.aER.bgK.ue < 0.0) && ((Boolean)this.vS.wD()).booleanValue()) {
            aii.strafe();
        } else if (jc.aER.bgK.ae == 1 && (Math.abs(jc.aER.bgK.gX - Math.floor(jc.aER.bgK.gX)) < 0.03 || jc.aER.bgK.ue < 0.0) && ((Boolean)this.vS.wD()).booleanValue()) {
            jc.aER.bgK.ud *= -1.0;
            jc.aER.bgK.uf *= -1.0;
        }
        if (((Boolean)this.vS.wD()).booleanValue() && jc.aER.bgK.ae < 5 && jc.aER.bgK.aO) {
            jc.aER.bgK.crP = true;
        }
    };
    @dm(cH=4)
    public final dk<ej> wa = ej2 -> {
        double d2;
        aka aka2;
        if (this.vd && !dj && ((Boolean)this.vT.wD()).booleanValue()) {
            bm.a(50, true, false, false, false, false, false);
        }
        if (ti.ir && dj) {
            dj = false;
            tt = true;
            aka2 = new aka(jc.aER.bgK.ud, jc.aER.bgK.uf);
            d2 = jc.aER.bgK.ue;
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            jc.aER.bgK.ue = d2;
            jc.aER.bgK.ud = aka2.getX();
            jc.aER.bgK.uf = aka2.getY();
            tt = false;
        }
        if (jc.aER.bgK.aO && dj && !this.e(mh.class).isEnabled()) {
            dj = false;
            tt = true;
            this.vf = false;
            bm.dispatch();
            aka2 = new aka(jc.aER.bgK.ud, jc.aER.bgK.uf);
            d2 = jc.aER.bgK.ue;
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            jc.aER.bgK.jump();
            jc.aER.bgK.ud = aka2.getX();
            jc.aER.bgK.uf = aka2.getY();
            if (jc.aER.bgK.cuU) {
                float f2 = jc.aER.bgK.pp * ((float)Math.PI / 180);
                d d3 = d.AZ();
                if (d3.bgK.bkD) {
                    f2 = (float)(aii.direction() * 57.29577951308232);
                    f2 *= (float)Math.PI / 180;
                }
                d3.bgK.ud -= (double)(bt.bx(f2) * 0.2f);
                d3.bgK.uf += (double)(bt.bB(f2) * 0.2f);
            }
            tt = false;
        }
    };
    @dm(cH=2)
    public final dk<ed> wb = ed2 -> {
        if (jc.aER.bgK.aO && dj && this.e(mh.class).isEnabled()) {
            dj = false;
            tt = true;
            this.vf = false;
            bm.dispatch();
            aka aka2 = new aka(jc.aER.bgK.ud, jc.aER.bgK.uf);
            double d2 = jc.aER.bgK.ue;
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            jc.aER.bgK.ud = aka2.getX();
            jc.aER.bgK.uf = aka2.getY();
            tt = false;
        }
    };
    @dm(cH=2)
    public final dk<eh> wc = eh2 -> {
        if (jc.aER.bgK.tR > 12 && dj) {
            dj = false;
            tt = true;
            aka aka2 = new aka(jc.aER.bgK.ud, jc.aER.bgK.uf);
            double d2 = jc.aER.bgK.ue;
            bm.dispatch();
            this.vW.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.vW.clear();
            if (!this.e(mh.class).isEnabled()) {
                jc.aER.bgK.ud = aka2.getX();
                jc.aER.bgK.uf = aka2.getY();
            }
            tt = false;
        }
    };
    @dm
    public final dk<ft> wd = ft2 -> {
        if (this.pY == null || !((Boolean)this.vT.wD()).booleanValue() || !this.vd && !dj) {
            return;
        }
        GlStateManager.JV();
        GlStateManager.Jw();
        GlStateManager.tQ();
        GlStateManager.JO();
        GlStateManager.JA();
        GL11.glDepthMask((boolean)false);
        double d2 = -0.14;
        ait.e(ais.d(this.rP().rR(), 100));
        ait.g(jc.aER.bgK.Us().ae(-jc.aER.bgK.gW, -jc.aER.bgK.gX, -jc.aER.bgK.gY).ae(this.pU.dAG, this.pU.dAH, this.pU.dAI).ad(d2, -0.3, d2));
        GlStateManager.JN();
        GlStateManager.Jz();
        GlStateManager.tR();
        GL11.glDepthMask((boolean)true);
        GlStateManager.Jx();
        GlStateManager.JW();
        GlStateManager.JX();
    };

    public jc(String string, hf hf2) {
        super(string, hf2);
    }

    private boolean f(aj<?> aj2) {
        return aj2 instanceof x || aj2 instanceof w || aj2 instanceof y || aj2 instanceof aa || aj2 instanceof z;
    }
}

