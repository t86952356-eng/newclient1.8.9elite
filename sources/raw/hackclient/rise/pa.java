/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bg;
import hackclient.rise.bk;
import hackclient.rise.bu;
import hackclient.rise.cl;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.fh;
import hackclient.rise.lz;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import net.minecraft.potion.a;

public class pa
extends akg<lz> {
    private final ArrayList<aj<?>> MT = new ArrayList();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    private final aki MU = new aki("Smooth Camera", (akg<?>)this, (Boolean)false);
    @dm(cH=1)
    public final dk<fh> MV = fh2 -> {
        if (this.tt) {
            return;
        }
        aj<?> aj2 = fh2.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (!fh2.isCancelled() && t2.getEntityID() == pa.aER.bgK.getEntityId() && !this.vq) {
                    this.Jk = pa.aER.bgK.ue;
                    aka aka2 = new aka(pa.aER.bgK.ud, pa.aER.bgK.uf);
                    pa.aER.bgK.ud = aka2.getX();
                    pa.aER.bgK.uf = aka2.getY();
                    pa.aER.bgK.ue = this.Jk;
                    fh2.cF();
                    this.dj = true;
                    this.MT.add(t2);
                    break;
                }
                if (fh2.isCancelled() || t2.getEntityID() != pa.aER.bgK.getEntityId()) break;
                fh2.cF();
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!this.dj) break;
                this.MT.add(bc2);
                fh2.cF();
                break;
            }
        }
    };
    @dm
    public final dk<eo> MW = eo2 -> {
        double d2;
        if ((pa.aER.bgK.gX > this.jy || pa.aER.bgK.tR < 14) && ((Boolean)this.MU.wD()).booleanValue()) {
            cl.cn();
        }
        if ((d2 = Math.hypot(pa.aER.bgK.ud - (pa.aER.bgK.csh - pa.aER.bgK.csk), pa.aER.bgK.uf - (pa.aER.bgK.csj - pa.aER.bgK.csm))) < 0.0125) {
            // empty if block
        }
        if (pa.aER.bgK.ae != 1 || this.vq) {
            // empty if block
        }
        if (pa.aER.bgK.ae <= 7 || this.vq) {
            // empty if block
        }
        if (pa.aER.bgK.ae > 120 || pa.aER.bgK.ae < 100 || pa.aER.bgK.a(a.dgw) || pa.aER.bgK.ae == 12 || pa.aER.bgK.ae == 13) {
            // empty if block
        }
        aii.useDiagonalSpeed();
        if (this.dE >= 4 || pa.aER.bgK.tR == 9) {
            // empty if block
        }
        if (!this.vq) {
            if (pa.aER.bgK.tR == 1) {
                if (pa.aER.bgK.a(a.dgw) && pa.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                    aii.strafe(0.475);
                } else if (pa.aER.bgK.a(a.dgw) && pa.aER.bgK.b((a)a.dgw).dhk + 1 == 1) {
                    aii.strafe(0.395);
                } else {
                    afl.b(aii.speed(), new Object[0]);
                    aii.strafe();
                }
            }
            if (pa.aER.bgK.ue <= 0.0) {
                pa.aER.bgK.ue += 0.0284;
            }
            if (pa.aER.bgK.ue < 0.0) {
                // empty if block
            }
            if (pa.aER.bgK.tR == 1) {
                // empty if block
            }
            if (pa.aER.bgK.tR == 11) {
                pa.aER.bgK.ue += 0.0904;
            }
            if (pa.aER.bgK.tR == 12) {
                pa.aER.bgK.ue += 0.0904;
            }
            aii.useDiagonalSpeed();
        }
    };
    @dm
    public final dk<ei> MX = ei2 -> {
        if (((Boolean)this.MU.wD()).booleanValue()) {
            pa.aER.bgK.cIc = 0.1f;
        }
        if (((Boolean)this.e(lz.class).DE.wD()).booleanValue() && !bk.bd() && pa.aER.bgK.aO && this.dE >= 999 && !this.dj) {
            this.e(lz.class).toggle();
        }
        if (pa.aER.bgK.aO) {
            pa.aER.bgK.tR = 0;
        }
        if (pa.aER.bgK.ae == 0 && pa.aER.bgK.a(a.dgw)) {
            aik.fakeDamage();
            aii.strafe();
            pa.aER.bgK.ud *= 2.42;
            pa.aER.bgK.uf *= 2.42;
        } else if (pa.aER.bgK.ae == 0) {
            aik.fakeDamage();
            aii.strafe();
            pa.aER.bgK.ud *= 2.42;
            pa.aER.bgK.uf *= 2.42;
        }
        if (pa.aER.bgK.ae == 2) {
            // empty if block
        }
        if (pa.aER.bgK.ae == 3) {
            // empty if block
        }
        if (pa.aER.bgK.ae == 1 && pa.aER.bgK.a(a.dgw) || pa.aER.bgK.ae == 1) {
            // empty if block
        }
        if (pa.aER.bgK.ae == 3) {
            // empty if block
        }
        if (pa.aER.bgK.ae > 1 && this.vq) {
            pa.aER.bgK.ue += 0.0284;
        }
        if (pa.aER.bgK.aO && this.dE >= 999 && this.dj) {
            aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
            pa.aER.bgK.jump();
        }
        boolean bl2 = pa.aER.bgK.a(a.dgw);
        double d2 = aii.speed();
        int cfr_ignored_0 = pa.aER.bgK.tR;
    };
    @dm(cH=4)
    public final dk<eh> MY = eh2 -> {
        if (pa.aER.bgK.cus > 0) {
            this.dE = 999;
        }
        if (this.dE < 999) {
            aii.stop();
        }
        if (this.dj && pa.aER.bgK.tR == 15) {
            pa.aER.bgK.ae = 0;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            aka aka2 = new aka(pa.aER.bgK.ud, pa.aER.bgK.uf);
            this.MT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.MT.clear();
            this.tt = false;
        }
    };
    @dm
    public final dk<eg> MZ = eg2 -> {
        if (this.dE == 4) {
            // empty if block
        }
    };

    public pa(String string, lz lz2) {
        super(string, lz2);
    }

    @Override
    public void onEnable() {
        this.jy = pa.aER.bgK.gX;
        aii.stop();
        this.dj = false;
        this.tt = false;
        this.Ji = pa.aER.bgK.cHV.cJE;
        this.vq = false;
        if (this.hw() == -1) {
            afl.b("you need a projectile in your hotbar for this", new Object[0]);
            return;
        }
        int n2 = this.hw();
        if (n2 != -1) {
            this.d(bu.class);
            bu.setSlot(n2);
        } else {
            afl.b("you need a projectile in your hotbar for this", new Object[0]);
        }
        bg.damage(false);
        this.dE = 0;
        this.hV = 0;
    }

    private int hw() {
        co co2;
        int n2;
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = pa.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cPj) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = pa.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cQV) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = pa.aER.bgK.cHV.fi(n2);
            if ((co2 == null || co2.bP() != Items.cQT) && (co2 == null || co2.bP() != Items.cQH)) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public void onDisable() {
        aii.stop();
        if (this.Ji != -1) {
            pa.aER.bgK.cHV.cJE = this.Ji;
        }
        this.MT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.MT.clear();
    }
}

