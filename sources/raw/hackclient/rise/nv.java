/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.bk;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.go;
import hackclient.rise.lw;
import hackclient.rise.lz;
import hackclient.rise.sz;
import hackclient.rise.tn;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.init.Items;
import net.minecraft.item.az;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;

public class nv
extends akg<lw> {
    private int qI = -1;
    private int hV = -1;
    private boolean Jb;
    public static boolean Jc;
    private boolean Jd;
    private int Je;
    private boolean Jf;
    private sz Jg;
    private final ArrayList<aj<?>> Jh = new ArrayList();
    rip.vantage.commons.util.time.a bN = new rip.vantage.commons.util.time.a();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double Jj = 0.0;
    double Jk = -1.0;
    private int dE;
    @dm(cH=1)
    public final dk<fh> Jl = fh2 -> {
        if (this.tt) {
            return;
        }
        if (nv.aER.bgK == null || nv.aER.bgF == null) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t) {
            if (((t)fh2.dq()).getEntityID() != nv.aER.bgK.getEntityId()) {
                return;
            }
            if (this.Jf) {
                this.hV = 0;
                this.Jb = true;
                this.Jf = false;
                Jc = true;
            }
        }
        aj<?> aj3 = fh2.dq();
        Objects.requireNonNull(aj3);
        aj<?> aj4 = aj3;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class}, aj4, n2)) {
            case 0: {
                t t2 = (t)aj4;
                if (!fh2.isCancelled() && t2.getEntityID() == nv.aER.bgK.getEntityId() && !this.vq) {
                    this.Jk = nv.aER.bgK.ue;
                    aka aka2 = new aka(nv.aER.bgK.ud, nv.aER.bgK.uf);
                    nv.aER.bgK.ud = aka2.getX();
                    nv.aER.bgK.uf = aka2.getY();
                    nv.aER.bgK.ue = this.Jk;
                    fh2.cF();
                    this.dj = true;
                    this.Jh.add(t2);
                    break;
                }
                if (fh2.isCancelled() || t2.getEntityID() != nv.aER.bgK.getEntityId()) break;
                fh2.cF();
                break;
            }
            case 1: {
                bc bc2 = (bc)aj4;
                if (!this.dj) break;
                this.Jh.add(bc2);
                fh2.cF();
                break;
            }
        }
    };
    @dm
    public final dk<fi> Jm = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof k && ((k)fi2.dq()).ls() != null && ((k)fi2.dq()).ls().bP() instanceof az) {
            this.Jf = true;
            if (nv.aER.bgK.aO) {
                // empty if block
            }
        }
    };
    @dm
    public final dk<eo> Jn = eo2 -> {
        if (nv.aER.bgK.cus == 10) {
            // empty if block
        }
        if (nv.aER.bgK.ae == 1) {
            double d2 = bt.aJ(Math.toDegrees(aii.direction(nv.aER.bgK.pl, nv.aER.bgK.cuW, nv.aER.bgK.cuV)));
            double d3 = (d2 + 360.0) % 360.0;
            double d4 = d3 % 90.0 / 90.0;
            double d5 = 1.05 + 0.549 * (1.0 - 4.0 * d4 * (1.0 - d4));
            if (!nv.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.strafe(d5);
            } else {
                aii.strafe(d5);
            }
        }
        if (nv.aER.bgK.ae != 20 || !nv.aER.aIY.chq.Rg()) {
            // empty if block
        }
        if (nv.aER.bgK.tR > 3 && nv.aER.bgK.tR < 33) {
            aii.strafe();
        }
        aii.useDiagonalSpeed();
        if (nv.aER.bgK.tR != 31 || !nv.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (nv.aER.bgK.tR != 32 || !nv.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (nv.aER.bgK.tR != 33 || !nv.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (nv.aER.bgK.ae == 33) {
            // empty if block
        }
    };
    @dm
    public final dk<ei> Jo = ei2 -> {
        if (nv.aER.bgK.tR < 4) {
            // empty if block
        }
        if (!this.dj && nv.aER.bgK.tR < 7) {
            nv.aER.bgK.crP = true;
        }
        if (nv.aER.bgK.tR < 2 && nv.aER.aIY.chq.Rg()) {
            nv.aER.aIY.chq.ay(false);
        }
        if (nv.aER.bgK.aO) {
            // empty if block
        }
        if (!((Boolean)this.e(lz.class).DE.wD()).booleanValue() || bk.bd() || !nv.aER.bgK.aO || this.dE < 999 || !this.dj) {
            // empty if block
        }
        if (nv.aER.bgK.aO) {
            nv.aER.bgK.tR = 0;
        }
        if (nv.aER.bgK.ae == 0 && nv.aER.bgK.a(net.minecraft.potion.a.dgw) || nv.aER.bgK.ae == 0) {
            // empty if block
        }
        if (nv.aER.bgK.ae > 4 && nv.aER.bgK.ae < 20 && this.vq && nv.aER.aIY.chq.Re() && !this.e(go.class).isEnabled()) {
            nv.aER.bgK.ue = 0.35;
            aii.strafe();
        } else if (nv.aER.bgK.ae > 0 && nv.aER.bgK.ae < 21 && this.vq) {
            nv.aER.bgK.ue = 0.005;
            aii.strafe();
        } else {
            nv.aER.bgK.ue += 0.028;
        }
        if (nv.aER.bgK.aO && this.vq) {
            this.e(lw.class).toggle();
        }
        if (nv.aER.bgK.ae == 3) {
            // empty if block
        }
        if (nv.aER.bgK.ae == 1) {
            // empty if block
        }
        if (nv.aER.bgK.tR == 2) {
            // empty if block
        }
        if (nv.aER.bgK.ae == 3) {
            // empty if block
        }
        if (!nv.aER.bgK.aO || this.dE < 999 || this.dj) {
            // empty if block
        }
        if (this.dE >= 999 && this.dj && nv.aER.bgK.tR == 0) {
            double d2 = bt.aJ(Math.toDegrees(aii.direction(nv.aER.bgK.pl, nv.aER.bgK.cuW, nv.aER.bgK.cuV)));
            double d3 = (d2 + 360.0) % 360.0;
            double d4 = d3 % 90.0 / 90.0;
            this.Jj = 1.05 + 0.35 * (1.0 - 4.0 * d4 * (1.0 - d4));
            if (!nv.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.strafe(this.Jj);
            } else {
                aii.strafe(this.Jj);
            }
        }
        if (this.dE >= 999 && this.dj) {
            aii.strafe(this.Jj);
        }
        if (nv.aER.bgK.tR != 1 || nv.aER.bgK.a(net.minecraft.potion.a.dgw)) {
            // empty if block
        }
        if (nv.aER.bgK.tR == 9) {
            // empty if block
        }
        if (nv.aER.bgK.tR == 10) {
            // empty if block
        }
        if (nv.aER.bgK.tR == 3) {
            // empty if block
        }
        boolean bl2 = nv.aER.bgK.a(net.minecraft.potion.a.dgw);
        double d5 = aii.speed();
        int cfr_ignored_0 = nv.aER.bgK.tR;
        if (this.Je == 0) {
            bs.d(false);
            bs.a(new akb(nv.aER.bgK.pl - 180.0f, 89.0f), 10.0, cb.gG);
            int n2 = this.hx();
            if (n2 != -1 && n2 != nv.aER.bgK.cHV.cJE) {
                this.qI = nv.aER.bgK.cHV.cJE;
                nv.aER.bgK.cHV.cJE = n2;
            }
        }
        if (this.Je == 1) {
            if (!this.Jd) {
                ahn.m(new k(nv.aER.bgK.Vk()));
                this.Jd = true;
                if (this.Jg != null && this.Jg.isEnabled()) {
                    this.Jg.abk = 1500;
                    this.Jg.abj.aX();
                }
            }
        } else if (this.Je == 2 && this.qI != -1) {
            nv.aER.bgK.cHV.cJE = this.qI;
            this.qI = -1;
        }
        if (this.hV > 1) {
            this.toggle();
            return;
        }
        if (this.Jb) {
            Jc = true;
            ++this.hV;
        }
        if (this.Je < 3) {
            ++this.Je;
        }
        if (this.Jb) {
            if (this.hV > 1) {
                this.Jb = false;
                Jc = false;
                this.hV = 0;
                return;
            }
            Jc = true;
            ++this.hV;
        }
        aii.useDiagonalSpeed();
    };
    @dm(cH=4)
    public final dk<eh> Jp = eh2 -> {
        if (nv.aER.bgK.cus > 0) {
            this.dE = 999;
        }
        if (this.dE < 999) {
            // empty if block
        }
        if (this.dj && nv.aER.bgK.tR == 7) {
            nv.aER.bgK.ae = 0;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            aka aka2 = new aka(nv.aER.bgK.ud, nv.aER.bgK.uf);
            bm.dispatch();
            aii.strafe();
            this.Jh.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            nv.aER.bgK.ue = 0.005;
            aii.strafe(1.59f);
            this.Jh.clear();
            this.tt = false;
        }
    };
    @dm
    public final dk<eg> Jq = eg2 -> {
        if (this.dE == 4) {
            // empty if block
        }
    };

    public nv(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        nv.aER.bgK.crP = true;
        if (this.e(tn.class).isEnabled()) {
            this.e(tn.class).toggle();
        }
        this.Jg = a.a.g().c(sz.class);
        this.dE = 0;
        if (this.hx() == -1) {
            afl.b("Could not find Fireball", new Object[0]);
            this.toggle();
            return;
        }
        nv.aER.bgK.ud *= -1.0;
        nv.aER.bgK.uf *= -1.0;
        Jc = true;
        this.Je = 0;
        this.dj = false;
        this.tt = false;
        this.Ji = nv.aER.bgK.cHV.cJE;
        this.vq = false;
        this.hV = 0;
    }

    private int hw() {
        co co2;
        int n2;
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = nv.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cPj) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = nv.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cQV) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = nv.aER.bgK.cHV.fi(n2);
            if ((co2 == null || co2.bP() != Items.cQT) && (co2 == null || co2.bP() != Items.cQH)) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public void onDisable() {
        bm.dispatch();
        if (nv.aER.bgK.aO) {
            aii.stop();
        }
        if (this.Ji != -1) {
            nv.aER.bgK.cHV.cJE = this.Ji;
        }
        this.Jh.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.Jh.clear();
        if (this.qI != -1) {
            nv.aER.bgK.cHV.cJE = this.qI;
        }
        this.qI = -1;
        this.hV = -1;
        this.Jd = false;
        Jc = false;
        this.Jb = false;
    }

    private int hx() {
        int n2 = -1;
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = nv.aER.bgK.cHV.fi(i2);
            if (co2 == null || co2.bP() != Items.cRP) continue;
            n2 = i2;
            break;
        }
        return n2;
    }

    private void hy() {
        aii.strafe(1.768f);
    }
}

