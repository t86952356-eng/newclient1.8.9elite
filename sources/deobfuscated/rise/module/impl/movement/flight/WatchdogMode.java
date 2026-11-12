/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.bk;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.eh;
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
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.LongJump;
import rise.module.impl.player.AntiFireBall;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public class WatchdogMode
extends Mode<Flight> {
    private int qI = -1;
    private int hV = -1;
    private boolean Jb;
    public static boolean Jc;
    private boolean Jd;
    private int Je;
    private boolean Jf;
    private AntiFireBall Jg;
    private final ArrayList<aj<?>> Jh = new ArrayList();
    a bN = new a();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double Jj = 0.0;
    double Jk = -1.0;
    private int dE;
    @EventLink(cH=1)
    public final Listener<PacketReceiveEvent> Jl = packetReceiveEvent -> {
        if (this.tt) {
            return;
        }
        if (WatchdogMode.aER.bgK == null || WatchdogMode.aER.bgF == null) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t) {
            if (((t)packetReceiveEvent.dq()).getEntityID() != WatchdogMode.aER.bgK.getEntityId()) {
                return;
            }
            if (this.Jf) {
                this.hV = 0;
                this.Jb = true;
                this.Jf = false;
                Jc = true;
            }
        }
        aj<?> aj3 = packetReceiveEvent.dq();
        Objects.requireNonNull(aj3);
        aj<?> aj4 = aj3;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class}, aj4, n2)) {
            case 0: {
                t t2 = (t)aj4;
                if (!packetReceiveEvent.isCancelled() && t2.getEntityID() == WatchdogMode.aER.bgK.getEntityId() && !this.vq) {
                    this.Jk = WatchdogMode.aER.bgK.ue;
                    Vector2d vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
                    WatchdogMode.aER.bgK.ud = vector2d.getX();
                    WatchdogMode.aER.bgK.uf = vector2d.getY();
                    WatchdogMode.aER.bgK.ue = this.Jk;
                    packetReceiveEvent.cF();
                    this.dj = true;
                    this.Jh.add(t2);
                    break;
                }
                if (packetReceiveEvent.isCancelled() || t2.getEntityID() != WatchdogMode.aER.bgK.getEntityId()) break;
                packetReceiveEvent.cF();
                break;
            }
            case 1: {
                bc bc2 = (bc)aj4;
                if (!this.dj) break;
                this.Jh.add(bc2);
                packetReceiveEvent.cF();
                break;
            }
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> Jm = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof k && ((k)packetSendEvent.dq()).ls() != null && ((k)packetSendEvent.dq()).ls().bP() instanceof az) {
            this.Jf = true;
            if (WatchdogMode.aER.bgK.aO) {
                // empty if block
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Jn = strafeEvent -> {
        if (WatchdogMode.aER.bgK.cus == 10) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae == 1) {
            double d2 = bt.aJ(Math.toDegrees(aii.direction(WatchdogMode.aER.bgK.pl, WatchdogMode.aER.bgK.cuW, WatchdogMode.aER.bgK.cuV)));
            double d3 = (d2 + 360.0) % 360.0;
            double d4 = d3 % 90.0 / 90.0;
            double d5 = 1.05 + 0.549 * (1.0 - 4.0 * d4 * (1.0 - d4));
            if (!WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.strafe(d5);
            } else {
                aii.strafe(d5);
            }
        }
        if (WatchdogMode.aER.bgK.ae != 20 || !WatchdogMode.aER.aIY.chq.Rg()) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR > 3 && WatchdogMode.aER.bgK.tR < 33) {
            aii.strafe();
        }
        aii.useDiagonalSpeed();
        if (WatchdogMode.aER.bgK.tR != 31 || !WatchdogMode.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR != 32 || !WatchdogMode.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR != 33 || !WatchdogMode.aER.aIY.chq.Re()) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae == 33) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Jo = preMotionEvent -> {
        if (WatchdogMode.aER.bgK.tR < 4) {
            // empty if block
        }
        if (!this.dj && WatchdogMode.aER.bgK.tR < 7) {
            WatchdogMode.aER.bgK.crP = true;
        }
        if (WatchdogMode.aER.bgK.tR < 2 && WatchdogMode.aER.aIY.chq.Rg()) {
            WatchdogMode.aER.aIY.chq.ay(false);
        }
        if (WatchdogMode.aER.bgK.aO) {
            // empty if block
        }
        if (!((Boolean)this.e(LongJump.class).DE.wD()).booleanValue() || bk.bd() || !WatchdogMode.aER.bgK.aO || this.dE < 999 || !this.dj) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.aO) {
            WatchdogMode.aER.bgK.tR = 0;
        }
        if (WatchdogMode.aER.bgK.ae == 0 && WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw) || WatchdogMode.aER.bgK.ae == 0) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae > 4 && WatchdogMode.aER.bgK.ae < 20 && this.vq && WatchdogMode.aER.aIY.chq.Re() && !this.e(KillAura.class).isEnabled()) {
            WatchdogMode.aER.bgK.ue = 0.35;
            aii.strafe();
        } else if (WatchdogMode.aER.bgK.ae > 0 && WatchdogMode.aER.bgK.ae < 21 && this.vq) {
            WatchdogMode.aER.bgK.ue = 0.005;
            aii.strafe();
        } else {
            WatchdogMode.aER.bgK.ue += 0.028;
        }
        if (WatchdogMode.aER.bgK.aO && this.vq) {
            this.e(Flight.class).toggle();
        }
        if (WatchdogMode.aER.bgK.ae == 3) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae == 1) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR == 2) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae == 3) {
            // empty if block
        }
        if (!WatchdogMode.aER.bgK.aO || this.dE < 999 || this.dj) {
            // empty if block
        }
        if (this.dE >= 999 && this.dj && WatchdogMode.aER.bgK.tR == 0) {
            double d2 = bt.aJ(Math.toDegrees(aii.direction(WatchdogMode.aER.bgK.pl, WatchdogMode.aER.bgK.cuW, WatchdogMode.aER.bgK.cuV)));
            double d3 = (d2 + 360.0) % 360.0;
            double d4 = d3 % 90.0 / 90.0;
            this.Jj = 1.05 + 0.35 * (1.0 - 4.0 * d4 * (1.0 - d4));
            if (!WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
                aii.strafe(this.Jj);
            } else {
                aii.strafe(this.Jj);
            }
        }
        if (this.dE >= 999 && this.dj) {
            aii.strafe(this.Jj);
        }
        if (WatchdogMode.aER.bgK.tR != 1 || WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw)) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR == 9) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR == 10) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.tR == 3) {
            // empty if block
        }
        boolean bl2 = WatchdogMode.aER.bgK.a(net.minecraft.potion.a.dgw);
        double d5 = aii.speed();
        int cfr_ignored_0 = WatchdogMode.aER.bgK.tR;
        if (this.Je == 0) {
            bs.d(false);
            bs.a(new Vector2f(WatchdogMode.aER.bgK.pl - 180.0f, 89.0f), 10.0, cb.gG);
            int n2 = this.hx();
            if (n2 != -1 && n2 != WatchdogMode.aER.bgK.cHV.cJE) {
                this.qI = WatchdogMode.aER.bgK.cHV.cJE;
                WatchdogMode.aER.bgK.cHV.cJE = n2;
            }
        }
        if (this.Je == 1) {
            if (!this.Jd) {
                ahn.m(new k(WatchdogMode.aER.bgK.Vk()));
                this.Jd = true;
                if (this.Jg != null && this.Jg.isEnabled()) {
                    this.Jg.abk = 1500;
                    this.Jg.abj.aX();
                }
            }
        } else if (this.Je == 2 && this.qI != -1) {
            WatchdogMode.aER.bgK.cHV.cJE = this.qI;
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
    @EventLink(cH=4)
    public final Listener<eh> Jp = eh2 -> {
        if (WatchdogMode.aER.bgK.cus > 0) {
            this.dE = 999;
        }
        if (this.dE < 999) {
            // empty if block
        }
        if (this.dj && WatchdogMode.aER.bgK.tR == 7) {
            WatchdogMode.aER.bgK.ae = 0;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            Vector2d vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
            bm.dispatch();
            aii.strafe();
            this.Jh.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            WatchdogMode.aER.bgK.ue = 0.005;
            aii.strafe(1.59f);
            this.Jh.clear();
            this.tt = false;
        }
    };
    @EventLink
    public final Listener<PostMotionEvent> Jq = postMotionEvent -> {
        if (this.dE == 4) {
            // empty if block
        }
    };

    public WatchdogMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        WatchdogMode.aER.bgK.crP = true;
        if (this.e(Scaffold.class).isEnabled()) {
            this.e(Scaffold.class).toggle();
        }
        this.Jg = Client.a.g().c(AntiFireBall.class);
        this.dE = 0;
        if (this.hx() == -1) {
            afl.b("Could not find Fireball", new Object[0]);
            this.toggle();
            return;
        }
        WatchdogMode.aER.bgK.ud *= -1.0;
        WatchdogMode.aER.bgK.uf *= -1.0;
        Jc = true;
        this.Je = 0;
        this.dj = false;
        this.tt = false;
        this.Ji = WatchdogMode.aER.bgK.cHV.cJE;
        this.vq = false;
        this.hV = 0;
    }

    private int hw() {
        co co2;
        int n2;
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = WatchdogMode.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cPj) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = WatchdogMode.aER.bgK.cHV.fi(n2);
            if (co2 == null || co2.bP() != Items.cQV) continue;
            return n2;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            co2 = WatchdogMode.aER.bgK.cHV.fi(n2);
            if ((co2 == null || co2.bP() != Items.cQT) && (co2 == null || co2.bP() != Items.cQH)) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public void onDisable() {
        bm.dispatch();
        if (WatchdogMode.aER.bgK.aO) {
            aii.stop();
        }
        if (this.Ji != -1) {
            WatchdogMode.aER.bgK.cHV.cJE = this.Ji;
        }
        this.Jh.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.Jh.clear();
        if (this.qI != -1) {
            WatchdogMode.aER.bgK.cHV.cJE = this.qI;
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
            co co2 = WatchdogMode.aER.bgK.cHV.fi(i2);
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

