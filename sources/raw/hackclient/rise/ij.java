/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.go;
import hackclient.rise.hf;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.block.BlockWeb;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.server.ab;
import net.minecraft.network.play.server.an;
import net.minecraft.network.play.server.at;
import net.minecraft.network.play.server.br;
import net.minecraft.network.play.server.bt;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.da;

public final class ij
extends akg<hf> {
    private final akp sI = new akp("Type", this).a(new akg[]{new aks("Reduce")}).a(new akg[]{new aks("Jump Reset")}).a(new akg[]{new aks("Grim Full")}).co("Reduce");
    private final akq sJ = new akq("Min Attacks", this, (Number)2, (Number)1, (Number)5, (Number)1, () -> !this.u("Reduce"));
    private final akq sK = new akq("Max Attacks", this, (Number)3, (Number)1, (Number)10, (Number)1, () -> !this.u("Reduce"));
    private final aki sL = new aki("Delay Release", (akg<?>)this, (Boolean)false, () -> !this.u("Reduce"));
    private final akq sM = new akq("Delay Speed Threshold", this, (Number)0.6, (Number)0.1, (Number)2, (Number)0.05, () -> !this.u("Reduce") || (Boolean)this.sL.wD() == false);
    private final akq sN = new akq("Delay Timeout (ms)", this, (Number)5000, (Number)50, (Number)10000, (Number)50, () -> !this.u("Reduce") || (Boolean)this.sL.wD() == false);
    private final aki sO = new aki("Delay Logging", (akg<?>)this, (Boolean)false, () -> !this.u("Reduce") || (Boolean)this.sL.wD() == false);
    private final akq sP = new akq("Jump Reset Tick", this, (Number)1, (Number)0, (Number)9, (Number)1, () -> !this.u("Jump Reset"));
    private final akq sQ = new akq("Grim Level", this, (Number)0.001, (Number)0.001, (Number)0.1, (Number)0.001, () -> !this.u("Grim Full"));
    private final aki sR = new aki("Logging", (akg<?>)this, (Boolean)true);
    private net.minecraft.entity.c pY;
    private boolean sS;
    private int sT;
    private double sU;
    private int sV;
    private boolean sW;
    private long sX;
    private boolean sY;
    private int sZ;
    private final Random ta = new Random();
    private final Queue<aj<?>> tb = new ConcurrentLinkedQueue();
    private boolean tc;
    private da td;
    private long te;
    private boolean tf;
    private boolean tg;
    @dm
    public final dk<fi> th = fi2 -> {
        e e2;
        if (ij.aER.bgK == null || ij.aER.bgF == null) {
            return;
        }
        if (!this.u("Grim Full")) {
            return;
        }
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e && (e2 = (e)aj2).afV()) {
            float f2 = e2.getYaw();
            float f3 = e2.getPitch();
            if (this.h(f2) || this.h(f3)) {
                float f4 = ((Number)this.sQ.wD()).floatValue();
                f2 += (float)(this.ta.nextBoolean() ? 1 : -1) * f4;
                f3 += (float)(this.ta.nextBoolean() ? 1 : -1) * f4;
                if (e2 instanceof h) {
                    fi2.e(new h(e2.afS(), e2.afT(), e2.afU(), f2, f3, e2.isOnGround()));
                } else if (e2 instanceof g) {
                    fi2.e(new g(f2, f3, e2.isOnGround()));
                }
            }
        }
    };
    @dm
    public final dk<fh> ti = fh2 -> {
        aj<a> aj2;
        if (ij.aER.bgK == null || ij.aER.bgF == null) {
            return;
        }
        aj<?> aj3 = fh2.dq();
        if (this.u("Grim Full")) {
            if (aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == ij.aER.bgK.getEntityId()) {
                fh2.cF();
                return;
            }
            if (aj3 instanceof i) {
                aj2 = (i)aj3;
                ij.aER.bgK.setPosition(((i)aj2).getX(), ((i)aj2).getY(), ((i)aj2).getZ());
                ij.aER.bgK.P(0.0, 0.0, 0.0);
                fh2.cF();
                return;
            }
        }
        if (this.u("Reduce") && ((Boolean)this.sL.wD()).booleanValue() && aj3 instanceof i && !this.tc) {
            this.tg = true;
            this.t("Flag detected, skipping next delay.");
        }
        if (aj3 instanceof ab && ((ab)(aj2 = (ab)aj3)).l(ij.aER.bgF) == ij.aER.bgK && ((ab)aj2).getOpCode() == 2) {
            this.sW = true;
        }
        if (aj3 instanceof t) {
            double d2;
            aj2 = (t)aj3;
            if (((t)aj2).getEntityID() != ij.aER.bgK.getEntityId()) {
                return;
            }
            this.sS = true;
            go go2 = this.e(go.class);
            this.pY = go2 != null ? go2.jE : null;
            double d3 = (double)((t)aj2).agN() / 8000.0;
            double d4 = (double)((t)aj2).agO() / 8000.0;
            double d5 = (double)((t)aj2).agP() / 8000.0;
            this.sU = d2 = Math.sqrt(d3 * d3 + d5 * d5);
            if (this.u("Reduce")) {
                if (this.sW) {
                    this.sW = false;
                    if (this.gA()) {
                        return;
                    }
                    if (System.currentTimeMillis() - this.sX < 1000L) {
                        return;
                    }
                    if (d2 < 0.1) {
                        return;
                    }
                    if (!ij.aER.bgK.isSprinting()) {
                        return;
                    }
                    if (((Boolean)this.sL.wD()).booleanValue() && !this.tg) {
                        if (d2 >= ((Number)this.sM.wD()).doubleValue()) {
                            fh2.cF();
                            this.tc = true;
                            this.td = new da(d3, d4, d5);
                            this.te = System.currentTimeMillis();
                            this.t("Strong KB (speed: " + String.format("%.3f", d2) + "), delay started.");
                            return;
                        }
                        this.t("Weak KB (speed: " + String.format("%.3f", d2) + "), normal reduce.");
                    }
                    if (this.tg) {
                        this.tg = false;
                        this.t("Flagged, using normal reduce this time.");
                    }
                    this.sV = this.gz();
                    this.sY = !ij.aER.bgK.isSprinting();
                }
            } else if (this.u("Jump Reset")) {
                this.sT = ((Number)this.sP.wD()).intValue();
            }
        }
        if (this.tc) {
            if (aj3 instanceof an || aj3 instanceof at || aj3 instanceof net.minecraft.network.play.server.c) {
                return;
            }
            if (aj3 instanceof br || aj3 instanceof net.minecraft.network.play.server.a) {
                return;
            }
            if (aj3 instanceof net.minecraft.network.play.server.g) {
                aj2 = (net.minecraft.network.play.server.g)aj3;
                if (((net.minecraft.network.play.server.g)aj2).getHealth() <= 0.0f) {
                    this.t("Player died, releasing all packets.");
                    this.r(true);
                }
                return;
            }
            if (aj3 instanceof bt || aj3 instanceof net.minecraft.network.play.server.h || aj3 instanceof i) {
                this.t("Critical packet received, releasing all packets.");
                this.r(true);
                return;
            }
            this.tb.add(aj3);
            fh2.cF();
        }
    };
    @dm
    public final dk<ej> tj = ej2 -> {
        if (ij.aER.bgK == null) {
            return;
        }
        if (ij.aER.bgK.cus == 0) {
            this.sS = false;
            this.sU = 0.0;
        }
        if (this.sT > 0) {
            --this.sT;
        }
        if (this.tc && this.td != null) {
            long l2;
            ce ce2 = ij.aER.bhc;
            if (ce2 != null && ce2.dzw instanceof net.minecraft.entity.player.a) {
                net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)ce2.dzw;
                int n2 = this.gz();
                double d2 = 1.0;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (ij.aER.bgK.isSprinting()) {
                        ij.aER.bgK.setSprinting(false);
                    }
                    ij.aER.bgu.a(ij.aER.bgK, a2);
                    ij.aER.bgK.swingItem();
                    d2 *= 0.6;
                }
                ij.aER.bgK.P(this.td.dAG * d2, this.td.dAH, this.td.dAI * d2);
                this.t("Target acquired, attacks: " + n2 + ", KB reduced to " + String.format("%.1f%%", d2 * 100.0));
                this.tf = true;
            }
            if (!this.tf && (l2 = System.currentTimeMillis() - this.te) >= ((Number)this.sN.wD()).longValue()) {
                ij.aER.bgK.P(this.td.dAG, this.td.dAH, this.td.dAI);
                this.t("Timeout (" + l2 + "ms), applying full KB.");
                this.tf = true;
            }
            if (this.tf) {
                this.r(true);
            }
        }
        if (this.tg && ij.aER.bgK.cus == 0) {
            this.tg = false;
        }
        if (this.u("Reduce") && this.pY != null && this.sV > 0) {
            if (this.sY) {
                aER.AU().u(new n(ij.aER.bgK, o.dbs));
            }
            while (this.sV >= 1) {
                aER.AU().u(new c(this.pY, d.daU));
                ij.aER.bgK.swingItem();
                ij.aER.bgK.P(ij.aER.bgK.ud * 0.6, ij.aER.bgK.ue, ij.aER.bgK.uf * 0.6);
                ij.aER.bgK.aO = false;
                --this.sV;
            }
            if (this.sY) {
                aER.AU().u(new n(ij.aER.bgK, o.dbt));
                this.sY = false;
            }
        }
    };
    @dm
    public final dk<dz> tk = dz2 -> {
        if (ij.aER.bgK != null && this.u("Jump Reset") && ij.aER.bgK.aO && this.sT == 1) {
            dz2.setJump(true);
            this.sT = 0;
            dz2.setForward(1.0f);
        }
    };

    public ij(String string, hf hf2) {
        super(string, hf2);
    }

    @Override
    public void onEnable() {
        this.sX = System.currentTimeMillis();
    }

    @Override
    public void onDisable() {
        this.sS = false;
        this.sT = 0;
        this.pY = null;
        this.sU = 0.0;
        this.sV = 0;
        this.sW = false;
        this.sY = false;
        this.r(true);
    }

    private void r(boolean bl2) {
        this.tc = false;
        if (bl2) {
            bm.dispatch();
            while (!this.tb.isEmpty()) {
                aj<?> aj2 = this.tb.poll();
                if (aj2 == null) continue;
                ahn.q(aj2);
            }
        } else {
            this.tb.clear();
        }
        this.td = null;
        this.tf = false;
        this.te = 0L;
    }

    private void t(String string) {
        if (((Boolean)this.sR.wD()).booleanValue() && ((Boolean)this.sO.wD()).booleanValue()) {
            afl.d("%s", "[Delay] " + string);
        }
    }

    private boolean h(float f2) {
        float f3 = Math.abs(f2 % 90.0f);
        return f3 < 0.01f || f3 > 89.99f;
    }

    private int gz() {
        int n2 = ((Number)this.sJ.wD()).intValue();
        int n3 = ((Number)this.sK.wD()).intValue();
        if (n2 < 1) {
            n2 = 1;
        }
        if (n3 < 1) {
            n3 = 1;
        }
        if (n2 > n3) {
            int n4 = n2;
            n2 = n3;
            n3 = n4;
        }
        if (n2 == n3) {
            this.sZ = n2;
            return n2;
        }
        this.sZ = ThreadLocalRandom.current().nextInt(n2, n3 + 1);
        return this.sZ;
    }

    private boolean gA() {
        if (ij.aER.bgK != null && ij.aER.bgF != null) {
            if (!ij.aER.bgK.isInWater() && !ij.aER.bgK.isInLava()) {
                if (ij.aER.bgK.isOnLadder()) {
                    return true;
                }
                b b2 = ij.aER.bgK.yl();
                return ij.aER.bgF.L(b2).df() instanceof BlockWeb;
            }
            return true;
        }
        return false;
    }

    private boolean u(String string) {
        return this.sI.wD() != null && ((akg)this.sI.wD()).getName().equalsIgnoreCase(string);
    }
}

