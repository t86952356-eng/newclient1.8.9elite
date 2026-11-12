/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.bg;
import hackclient.rise.bk;
import hackclient.rise.bu;
import hackclient.rise.cl;
import hackclient.rise.eh;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;

public class WatchdogMode
extends Mode<LongJump> {
    private final ArrayList<aj<?>> MT = new ArrayList();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    private final BooleanValue MU = new BooleanValue("Smooth Camera", (Mode<?>)this, (Boolean)false);
    @EventLink(cH=1)
    public final Listener<PacketReceiveEvent> MV = packetReceiveEvent -> {
        if (this.tt) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (!packetReceiveEvent.isCancelled() && t2.getEntityID() == WatchdogMode.aER.bgK.getEntityId() && !this.vq) {
                    this.Jk = WatchdogMode.aER.bgK.ue;
                    Vector2d vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
                    WatchdogMode.aER.bgK.ud = vector2d.getX();
                    WatchdogMode.aER.bgK.uf = vector2d.getY();
                    WatchdogMode.aER.bgK.ue = this.Jk;
                    packetReceiveEvent.cF();
                    this.dj = true;
                    this.MT.add(t2);
                    break;
                }
                if (packetReceiveEvent.isCancelled() || t2.getEntityID() != WatchdogMode.aER.bgK.getEntityId()) break;
                packetReceiveEvent.cF();
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!this.dj) break;
                this.MT.add(bc2);
                packetReceiveEvent.cF();
                break;
            }
        }
    };
    @EventLink
    public final Listener<StrafeEvent> MW = strafeEvent -> {
        double d2;
        if ((WatchdogMode.aER.bgK.gX > this.jy || WatchdogMode.aER.bgK.tR < 14) && ((Boolean)this.MU.wD()).booleanValue()) {
            cl.cn();
        }
        if ((d2 = Math.hypot(WatchdogMode.aER.bgK.ud - (WatchdogMode.aER.bgK.csh - WatchdogMode.aER.bgK.csk), WatchdogMode.aER.bgK.uf - (WatchdogMode.aER.bgK.csj - WatchdogMode.aER.bgK.csm))) < 0.0125) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae != 1 || this.vq) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae <= 7 || this.vq) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae > 120 || WatchdogMode.aER.bgK.ae < 100 || WatchdogMode.aER.bgK.a(a.dgw) || WatchdogMode.aER.bgK.ae == 12 || WatchdogMode.aER.bgK.ae == 13) {
            // empty if block
        }
        aii.useDiagonalSpeed();
        if (this.dE >= 4 || WatchdogMode.aER.bgK.tR == 9) {
            // empty if block
        }
        if (!this.vq) {
            if (WatchdogMode.aER.bgK.tR == 1) {
                if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 >= 2) {
                    aii.strafe(0.475);
                } else if (WatchdogMode.aER.bgK.a(a.dgw) && WatchdogMode.aER.bgK.b((a)a.dgw).dhk + 1 == 1) {
                    aii.strafe(0.395);
                } else {
                    afl.b(aii.speed(), new Object[0]);
                    aii.strafe();
                }
            }
            if (WatchdogMode.aER.bgK.ue <= 0.0) {
                WatchdogMode.aER.bgK.ue += 0.0284;
            }
            if (WatchdogMode.aER.bgK.ue < 0.0) {
                // empty if block
            }
            if (WatchdogMode.aER.bgK.tR == 1) {
                // empty if block
            }
            if (WatchdogMode.aER.bgK.tR == 11) {
                WatchdogMode.aER.bgK.ue += 0.0904;
            }
            if (WatchdogMode.aER.bgK.tR == 12) {
                WatchdogMode.aER.bgK.ue += 0.0904;
            }
            aii.useDiagonalSpeed();
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> MX = preMotionEvent -> {
        if (((Boolean)this.MU.wD()).booleanValue()) {
            WatchdogMode.aER.bgK.cIc = 0.1f;
        }
        if (((Boolean)this.e(LongJump.class).DE.wD()).booleanValue() && !bk.bd() && WatchdogMode.aER.bgK.aO && this.dE >= 999 && !this.dj) {
            this.e(LongJump.class).toggle();
        }
        if (WatchdogMode.aER.bgK.aO) {
            WatchdogMode.aER.bgK.tR = 0;
        }
        if (WatchdogMode.aER.bgK.ae == 0 && WatchdogMode.aER.bgK.a(a.dgw)) {
            aik.fakeDamage();
            aii.strafe();
            WatchdogMode.aER.bgK.ud *= 2.42;
            WatchdogMode.aER.bgK.uf *= 2.42;
        } else if (WatchdogMode.aER.bgK.ae == 0) {
            aik.fakeDamage();
            aii.strafe();
            WatchdogMode.aER.bgK.ud *= 2.42;
            WatchdogMode.aER.bgK.uf *= 2.42;
        }
        if (WatchdogMode.aER.bgK.ae == 2) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae == 3) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae == 1 && WatchdogMode.aER.bgK.a(a.dgw) || WatchdogMode.aER.bgK.ae == 1) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae == 3) {
            // empty if block
        }
        if (WatchdogMode.aER.bgK.ae > 1 && this.vq) {
            WatchdogMode.aER.bgK.ue += 0.0284;
        }
        if (WatchdogMode.aER.bgK.aO && this.dE >= 999 && this.dj) {
            aii.strafe(aii.getAllowedHorizontalDistance() - 0.01);
            WatchdogMode.aER.bgK.jump();
        }
        boolean bl2 = WatchdogMode.aER.bgK.a(a.dgw);
        double d2 = aii.speed();
        int cfr_ignored_0 = WatchdogMode.aER.bgK.tR;
    };
    @EventLink(cH=4)
    public final Listener<eh> MY = eh2 -> {
        if (WatchdogMode.aER.bgK.cus > 0) {
            this.dE = 999;
        }
        if (this.dE < 999) {
            aii.stop();
        }
        if (this.dj && WatchdogMode.aER.bgK.tR == 15) {
            WatchdogMode.aER.bgK.ae = 0;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            Vector2d vector2d = new Vector2d(WatchdogMode.aER.bgK.ud, WatchdogMode.aER.bgK.uf);
            this.MT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.MT.clear();
            this.tt = false;
        }
    };
    @EventLink
    public final Listener<PostMotionEvent> MZ = postMotionEvent -> {
        if (this.dE == 4) {
            // empty if block
        }
    };

    public WatchdogMode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onEnable() {
        this.jy = WatchdogMode.aER.bgK.gX;
        aii.stop();
        this.dj = false;
        this.tt = false;
        this.Ji = WatchdogMode.aER.bgK.cHV.cJE;
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
        aii.stop();
        if (this.Ji != -1) {
            WatchdogMode.aER.bgK.cHV.cJE = this.Ji;
        }
        this.MT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.MT.clear();
    }
}

