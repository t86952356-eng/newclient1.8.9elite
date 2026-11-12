/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.jesus;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.bd;
import hackclient.rise.bm;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.KeyboardInputEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.module.impl.movement.Jesus;
import rise.module.impl.movement.LongJump;
import rise.util.math.Vector2d;

public class WatchdogDolphin118Mode
extends Mode<Jesus> {
    public static int KA = 0;
    private boolean KJ;
    private boolean HJ;
    private int KK;
    private int KL;
    @EventLink(cH=3)
    public final Listener<PreMotionEvent> KM = preMotionEvent -> {
        if (this.e(LongJump.class).isEnabled() || this.e(Flight.class).isEnabled() || KA > 30) {
            return;
        }
        if (WatchdogDolphin118Mode.aER.bgK.aO) {
            // empty if block
        }
        if (!WatchdogDolphin118Mode.aER.bgK.csz) {
            ++this.KK;
        } else {
            aii.strafe();
            this.KK = 0;
        }
        if (!WatchdogDolphin118Mode.aER.bgK.csz && WatchdogDolphin118Mode.aER.bgK.aO) {
            KA = 31;
        }
        if (WatchdogDolphin118Mode.aER.bgK.ae == 0 && this.KJ) {
            aii.strafe();
        } else if (WatchdogDolphin118Mode.aER.bgK.ae == 0) {
            aii.strafe();
        }
        preMotionEvent.setSprinting(true);
        if (WatchdogDolphin118Mode.aER.bgK.csz) {
            KA = 0;
        } else if (WatchdogDolphin118Mode.aER.bgK.ae > 1 && ++KA < 30) {
            WatchdogDolphin118Mode.aER.bgK.ue += 0.0281;
        }
        if (WatchdogDolphin118Mode.aER.bgK.csz) {
            // empty if block
        }
        int n2 = WatchdogDolphin118Mode.aER.bgK.ae;
        switch (n2) {
            case 1: {
                break;
            }
            case 6: {
                break;
            }
            case 7: {
                break;
            }
            case 8: {
                break;
            }
            case 9: {
                break;
            }
            case 10: {
                break;
            }
            case 11: {
                break;
            }
            case 15: {
                break;
            }
            case 19: {
                break;
            }
        }
    };
    private final ArrayList<aj<?>> KN = new ArrayList();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    @EventLink
    public final Listener<StrafeEvent> KO = strafeEvent -> {
        double d2 = 0.075;
        if (WatchdogDolphin118Mode.aER.bgK.csz) {
            WatchdogDolphin118Mode.aER.bgC.dAp = 0.5f;
            ahn.m(new e(true));
        }
        if (WatchdogDolphin118Mode.aER.bgK.csz) {
            bm.a(100, true, true, false, false, false);
            strafeEvent.setSpeed(0.2);
        }
        if (aii.speed() < 0.205) {
            // empty if block
        }
    };
    @EventLink(cH=2)
    public final Listener<PacketReceiveEvent> KP = packetReceiveEvent -> {
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
                if (!packetReceiveEvent.isCancelled() && t2.getEntityID() == WatchdogDolphin118Mode.aER.bgK.getEntityId() && (KA < 30 || WatchdogDolphin118Mode.aER.bgK.csz) && ((double)t2.agO() / 8000.0 > 0.4 || (double)t2.agO() / 8000.0 < 0.1)) {
                    Vector2d vector2d = new Vector2d(WatchdogDolphin118Mode.aER.bgK.ud, WatchdogDolphin118Mode.aER.bgK.uf);
                    this.Jk = (double)t2.agP() / 8000.0;
                    this.Jk = (double)t2.agO() / 8000.0;
                    packetReceiveEvent.cF();
                    this.dj = true;
                    this.KN.add(t2);
                    if (this.Jk > 0.2) {
                        ++this.KL;
                    }
                    if (this.KL != 2) break;
                    this.KJ = true;
                    break;
                }
                packetReceiveEvent.cF();
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!this.dj) break;
                this.KN.add(bc2);
                packetReceiveEvent.cF();
                break;
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> KQ = moveInputEvent -> {
        if (WatchdogDolphin118Mode.aER.bgK.csz) {
            moveInputEvent.setJump(true);
        }
    };
    @EventLink
    public final Listener<JumpEvent> KR = jumpEvent -> {};
    @EventLink
    public final Listener<KeyboardInputEvent> KS = keyboardInputEvent -> {
        if (keyboardInputEvent.cO() == ((Jesus)this.wy()).getKey() && !this.HJ) {
            keyboardInputEvent.cF();
            this.HJ = true;
        }
    };
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> KT = preUpdateEvent -> {
        if (this.dj && (!WatchdogDolphin118Mode.aER.bgK.csz || this.KJ) && KA < 30) {
            WatchdogDolphin118Mode.aER.bgK.ae = 1;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            Vector2d vector2d = new Vector2d(WatchdogDolphin118Mode.aER.bgK.ud, WatchdogDolphin118Mode.aER.bgK.uf);
            this.KN.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.KJ = false;
            if (WatchdogDolphin118Mode.aER.bgK.Zz > 20 && this.Jk > 0.4) {
                WatchdogDolphin118Mode.aER.bgK.ud *= 1.23;
                WatchdogDolphin118Mode.aER.bgK.uf *= 1.23;
            }
            this.KN.clear();
            if (!this.KJ) {
                // empty if block
            }
            this.tt = false;
        }
    };

    public WatchdogDolphin118Mode(String string, Jesus jesus) {
        super(string, jesus);
    }

    @Override
    public void onEnable() {
        this.KN.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.KN.clear();
        bd.cY = 0.0f;
    }

    @Override
    public void onDisable() {
        this.KN.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.KN.clear();
        this.KJ = false;
        this.KL = 0;
    }
}

