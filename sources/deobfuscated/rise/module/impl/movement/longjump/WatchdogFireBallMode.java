/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.bs;
import hackclient.rise.cb;
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
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;

public class WatchdogFireBallMode
extends Mode<LongJump> {
    public final BooleanValue MG = new BooleanValue("Boost", (Mode<?>)this, (Boolean)true);
    private int qI = -1;
    private int hV = -1;
    private boolean Jb;
    public static boolean Jc;
    private boolean Jd;
    private int Je;
    private boolean Jf;
    private boolean MH;
    a bN = new a();
    public static boolean dj;
    public static boolean tt;
    private int tR;
    private final ArrayList<aj<?>> MI = new ArrayList();
    private float ub;
    private double vB;
    private double vC;
    private boolean gD;
    @EventLink
    public final Listener<PacketSendEvent> MJ = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof k && ((k)packetSendEvent.dq()).ls() != null && ((k)packetSendEvent.dq()).ls().bP() instanceof az) {
            this.Jf = true;
        }
        if (this.Je == 1) {
            // empty if block
        }
    };
    @EventLink(cH=2)
    public final Listener<PacketReceiveEvent> MK = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (tt) {
            return;
        }
        if (aj2 instanceof t) {
            if (((t)packetReceiveEvent.dq()).getEntityID() != WatchdogFireBallMode.aER.bgK.getEntityId()) {
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
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class, net.minecraft.network.play.server.a.class}, aj4, n2)) {
            case 0: {
                t t2 = (t)aj4;
                if (t2.getEntityID() != WatchdogFireBallMode.aER.bgK.getEntityId() || packetReceiveEvent.isCancelled()) break;
                this.hV = 0;
                this.Jb = true;
                this.Jf = false;
                Jc = true;
                this.MI.add(t2);
                packetReceiveEvent.cF();
                dj = true;
                double d2 = (double)t2.agN() / 8000.0;
                double d3 = (double)t2.agP() / 8000.0;
                this.ub = (float)Math.toDegrees(Math.atan2(d3, d2));
                if (this.ub < -180.0f) {
                    this.ub += 360.0f;
                }
                if (this.ub > 180.0f) {
                    this.ub -= 360.0f;
                }
                this.vB = d2;
                this.vC = d3;
                break;
            }
            case 1: {
                bc bc2 = (bc)aj4;
                if (!dj) break;
                packetReceiveEvent.cF();
                this.MI.add(bc2);
                break;
            }
            case 2: {
                net.minecraft.network.play.server.a a2 = (net.minecraft.network.play.server.a)aj4;
                if (!dj) break;
                packetReceiveEvent.cF();
                this.MI.add(a2);
                break;
            }
            default: {
                if (!dj) break;
            }
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> ML = preMotionEvent -> {
        if (this.Je == 0) {
            bs.d(false);
            bs.a(new Vector2f(WatchdogFireBallMode.aER.bgK.pl, 89.0f), 10.0, cb.gH);
            int n2 = this.hx();
            if (n2 != -1 && n2 != WatchdogFireBallMode.aER.bgK.cHV.cJE) {
                this.qI = WatchdogFireBallMode.aER.bgK.cHV.cJE;
                if (WatchdogFireBallMode.aER.bgK.crx > 1) {
                    WatchdogFireBallMode.aER.bgK.cHV.cJE = n2;
                }
            }
        }
        if (this.Je == 1) {
            if (!this.Jd) {
                ahn.m(new k(WatchdogFireBallMode.aER.bgK.Vk()));
                this.Jd = true;
            }
        } else if (this.Je == 2 && this.qI != -1) {
            WatchdogFireBallMode.aER.bgK.cHV.cJE = this.qI;
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
    };
    @EventLink(cH=2)
    public final Listener<PreUpdateEvent> MM = preUpdateEvent -> {
        if (dj && WatchdogFireBallMode.aER.bgK.tR == 13) {
            tt = true;
            dj = false;
            this.MI.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.MI.clear();
            tt = false;
            this.tR = 0;
        }
        if (!WatchdogFireBallMode.aER.bgK.aO) {
            bs.a(new Vector2f(WatchdogFireBallMode.aER.bgK.pl + 45.0f, WatchdogFireBallMode.aER.bgK.pm), 10.0, cb.gH);
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> MN = moveInputEvent -> {
        if (this.gD) {
            this.gD = false;
        }
        if (dj || tt) {
            this.gD = false;
        }
        if (dj || tt) {
            // empty if block
        }
    };

    public WatchdogFireBallMode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onDisable() {
        this.MI.clear();
        tt = false;
        dj = false;
        if (WatchdogFireBallMode.aER.bgK.aO) {
            aii.stop();
        }
        if (this.qI != -1) {
            WatchdogFireBallMode.aER.bgK.cHV.cJE = this.qI;
        }
        this.qI = -1;
        this.hV = -1;
        this.Jd = false;
        Jc = false;
        this.Jb = false;
        this.Je = 0;
    }

    @Override
    public void onEnable() {
        if (WatchdogFireBallMode.aER.bgK.aO) {
            // empty if block
        }
        this.MI.clear();
        tt = false;
        dj = false;
        if (this.hx() == -1) {
            afl.b("Could not find Fireball", new Object[0]);
            this.toggle();
            return;
        }
        Jc = true;
        this.Je = 0;
    }

    private int hx() {
        int n2 = -1;
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = WatchdogFireBallMode.aER.bgK.cHV.fi(i2);
            if (co2 == null || co2.bP() != Items.cRP) continue;
            n2 = i2;
            break;
        }
        return n2;
    }

    static {
        dj = false;
    }
}

