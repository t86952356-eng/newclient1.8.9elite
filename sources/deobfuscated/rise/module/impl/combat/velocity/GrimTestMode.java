/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aks;
import hackclient.rise.bm;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.combat.Velocity;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

public final class GrimTestMode
extends Mode<Velocity> {
    private final ModeValue sI = new ModeValue("Type", this).a(new Mode[]{new aks("Reduce")}).a(new Mode[]{new aks("Jump Reset")}).a(new Mode[]{new aks("Grim Full")}).co("Reduce");
    private final NumberValue sJ = new NumberValue("Min Attacks", this, (Number)2, (Number)1, (Number)5, (Number)1, () -> !this.u("Reduce"));
    private final NumberValue sK = new NumberValue("Max Attacks", this, (Number)3, (Number)1, (Number)10, (Number)1, () -> !this.u("Reduce"));
    private final BooleanValue sL = new BooleanValue("Delay Release", (Mode<?>)this, (Boolean)false, () -> !this.u("Reduce"));
    private final NumberValue sM = new NumberValue("Delay Speed Threshold", this, (Number)0.6, (Number)0.1, (Number)2, (Number)0.05, () -> !this.u("Reduce") || (Boolean)this.sL.wD() == false);
    private final NumberValue sN = new NumberValue("Delay Timeout (ms)", this, (Number)5000, (Number)50, (Number)10000, (Number)50, () -> !this.u("Reduce") || (Boolean)this.sL.wD() == false);
    private final BooleanValue sO = new BooleanValue("Delay Logging", (Mode<?>)this, (Boolean)false, () -> !this.u("Reduce") || (Boolean)this.sL.wD() == false);
    private final NumberValue sP = new NumberValue("Jump Reset Tick", this, (Number)1, (Number)0, (Number)9, (Number)1, () -> !this.u("Jump Reset"));
    private final NumberValue sQ = new NumberValue("Grim Level", this, (Number)0.001, (Number)0.001, (Number)0.1, (Number)0.001, () -> !this.u("Grim Full"));
    private final BooleanValue sR = new BooleanValue("Logging", (Mode<?>)this, (Boolean)true);
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
    @EventLink
    public final Listener<PacketSendEvent> th = packetSendEvent -> {
        e e2;
        if (GrimTestMode.aER.bgK == null || GrimTestMode.aER.bgF == null) {
            return;
        }
        if (!this.u("Grim Full")) {
            return;
        }
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof e && (e2 = (e)aj2).afV()) {
            float f2 = e2.getYaw();
            float f3 = e2.getPitch();
            if (this.h(f2) || this.h(f3)) {
                float f4 = ((Number)this.sQ.wD()).floatValue();
                f2 += (float)(this.ta.nextBoolean() ? 1 : -1) * f4;
                f3 += (float)(this.ta.nextBoolean() ? 1 : -1) * f4;
                if (e2 instanceof h) {
                    packetSendEvent.e(new h(e2.afS(), e2.afT(), e2.afU(), f2, f3, e2.isOnGround()));
                } else if (e2 instanceof g) {
                    packetSendEvent.e(new g(f2, f3, e2.isOnGround()));
                }
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> ti = packetReceiveEvent -> {
        aj<a> aj2;
        if (GrimTestMode.aER.bgK == null || GrimTestMode.aER.bgF == null) {
            return;
        }
        aj<?> aj3 = packetReceiveEvent.dq();
        if (this.u("Grim Full")) {
            if (aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == GrimTestMode.aER.bgK.getEntityId()) {
                packetReceiveEvent.cF();
                return;
            }
            if (aj3 instanceof i) {
                aj2 = (i)aj3;
                GrimTestMode.aER.bgK.setPosition(((i)aj2).getX(), ((i)aj2).getY(), ((i)aj2).getZ());
                GrimTestMode.aER.bgK.P(0.0, 0.0, 0.0);
                packetReceiveEvent.cF();
                return;
            }
        }
        if (this.u("Reduce") && ((Boolean)this.sL.wD()).booleanValue() && aj3 instanceof i && !this.tc) {
            this.tg = true;
            this.t("Flag detected, skipping next delay.");
        }
        if (aj3 instanceof ab && ((ab)(aj2 = (ab)aj3)).l(GrimTestMode.aER.bgF) == GrimTestMode.aER.bgK && ((ab)aj2).getOpCode() == 2) {
            this.sW = true;
        }
        if (aj3 instanceof t) {
            double d2;
            aj2 = (t)aj3;
            if (((t)aj2).getEntityID() != GrimTestMode.aER.bgK.getEntityId()) {
                return;
            }
            this.sS = true;
            KillAura killAura = this.e(KillAura.class);
            this.pY = killAura != null ? killAura.jE : null;
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
                    if (!GrimTestMode.aER.bgK.isSprinting()) {
                        return;
                    }
                    if (((Boolean)this.sL.wD()).booleanValue() && !this.tg) {
                        if (d2 >= ((Number)this.sM.wD()).doubleValue()) {
                            packetReceiveEvent.cF();
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
                    this.sY = !GrimTestMode.aER.bgK.isSprinting();
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
            packetReceiveEvent.cF();
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> tj = preUpdateEvent -> {
        if (GrimTestMode.aER.bgK == null) {
            return;
        }
        if (GrimTestMode.aER.bgK.cus == 0) {
            this.sS = false;
            this.sU = 0.0;
        }
        if (this.sT > 0) {
            --this.sT;
        }
        if (this.tc && this.td != null) {
            long l2;
            ce ce2 = GrimTestMode.aER.bhc;
            if (ce2 != null && ce2.dzw instanceof net.minecraft.entity.player.a) {
                net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)ce2.dzw;
                int n2 = this.gz();
                double d2 = 1.0;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (GrimTestMode.aER.bgK.isSprinting()) {
                        GrimTestMode.aER.bgK.setSprinting(false);
                    }
                    GrimTestMode.aER.bgu.a(GrimTestMode.aER.bgK, a2);
                    GrimTestMode.aER.bgK.swingItem();
                    d2 *= 0.6;
                }
                GrimTestMode.aER.bgK.P(this.td.dAG * d2, this.td.dAH, this.td.dAI * d2);
                this.t("Target acquired, attacks: " + n2 + ", KB reduced to " + String.format("%.1f%%", d2 * 100.0));
                this.tf = true;
            }
            if (!this.tf && (l2 = System.currentTimeMillis() - this.te) >= ((Number)this.sN.wD()).longValue()) {
                GrimTestMode.aER.bgK.P(this.td.dAG, this.td.dAH, this.td.dAI);
                this.t("Timeout (" + l2 + "ms), applying full KB.");
                this.tf = true;
            }
            if (this.tf) {
                this.r(true);
            }
        }
        if (this.tg && GrimTestMode.aER.bgK.cus == 0) {
            this.tg = false;
        }
        if (this.u("Reduce") && this.pY != null && this.sV > 0) {
            if (this.sY) {
                aER.AU().u(new n(GrimTestMode.aER.bgK, o.dbs));
            }
            while (this.sV >= 1) {
                aER.AU().u(new c(this.pY, d.daU));
                GrimTestMode.aER.bgK.swingItem();
                GrimTestMode.aER.bgK.P(GrimTestMode.aER.bgK.ud * 0.6, GrimTestMode.aER.bgK.ue, GrimTestMode.aER.bgK.uf * 0.6);
                GrimTestMode.aER.bgK.aO = false;
                --this.sV;
            }
            if (this.sY) {
                aER.AU().u(new n(GrimTestMode.aER.bgK, o.dbt));
                this.sY = false;
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> tk = moveInputEvent -> {
        if (GrimTestMode.aER.bgK != null && this.u("Jump Reset") && GrimTestMode.aER.bgK.aO && this.sT == 1) {
            moveInputEvent.setJump(true);
            this.sT = 0;
            moveInputEvent.setForward(1.0f);
        }
    };

    public GrimTestMode(String string, Velocity velocity) {
        super(string, velocity);
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
        if (GrimTestMode.aER.bgK != null && GrimTestMode.aER.bgF != null) {
            if (!GrimTestMode.aER.bgK.isInWater() && !GrimTestMode.aER.bgK.isInLava()) {
                if (GrimTestMode.aER.bgK.isOnLadder()) {
                    return true;
                }
                b b2 = GrimTestMode.aER.bgK.yl();
                return GrimTestMode.aER.bgF.L(b2).df() instanceof BlockWeb;
            }
            return true;
        }
        return false;
    }

    private boolean u(String string) {
        return this.sI.wD() != null && ((Mode)this.sI.wD()).getName().equalsIgnoreCase(string);
    }
}

