/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.bd;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
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
import rise.module.impl.movement.LongJump;
import rise.util.math.Vector2d;

public class WatchdogWater118Mode
extends Mode<LongJump> {
    private boolean KJ;
    private boolean HJ;
    private int KK;
    private int KL;
    @EventLink(cH=3)
    public final Listener<PreMotionEvent> KZ = preMotionEvent -> {
        if (!WatchdogWater118Mode.aER.bgK.csz) {
            ++this.KK;
        } else {
            aii.strafe();
            this.KK = 0;
        }
        if (WatchdogWater118Mode.aER.bgK.ae == 0 && this.KJ) {
            WatchdogWater118Mode.aER.bgK.ud *= 4.1;
            WatchdogWater118Mode.aER.bgK.uf *= 4.1;
            aii.strafe();
        } else if (WatchdogWater118Mode.aER.bgK.ae == 0) {
            aii.strafe();
        }
        preMotionEvent.setSprinting(true);
        if (!WatchdogWater118Mode.aER.bgK.csz) {
            WatchdogWater118Mode.aER.bgK.ue += 0.0281;
        }
        if (WatchdogWater118Mode.aER.bgK.csz) {
            // empty if block
        }
        int n2 = WatchdogWater118Mode.aER.bgK.ae;
        switch (n2) {
            case 1: {
                break;
            }
            case 6: {
                break;
            }
            case 7: {
                WatchdogWater118Mode.aER.bgK.ue = 0.03;
                break;
            }
            case 8: {
                WatchdogWater118Mode.aER.bgK.ue = 0.03;
                break;
            }
            case 9: {
                break;
            }
            case 10: {
                break;
            }
            case 11: {
                WatchdogWater118Mode.aER.bgK.ue += 0.01;
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
    private final ArrayList<aj<?>> La = new ArrayList();
    private boolean dj;
    private boolean tt;
    private boolean vq;
    int Ji = -1;
    double jy;
    double Jk = -1.0;
    private int dE;
    private int hV;
    @EventLink
    public final Listener<StrafeEvent> Lb = strafeEvent -> {
        double d2 = 0.075;
        if (WatchdogWater118Mode.aER.bgK.csz) {
            aii.stop();
            WatchdogWater118Mode.aER.bgC.dAp = 0.33f;
            ahn.m(new e(true));
            ahn.m(new f(WatchdogWater118Mode.aER.bgK.gW, WatchdogWater118Mode.aER.bgK.gX + 0.068, WatchdogWater118Mode.aER.bgK.gY, true));
        }
        if (aii.speed() < 0.205) {
            // empty if block
        }
    };
    @EventLink(cH=2)
    public final Listener<PacketReceiveEvent> Lc = packetReceiveEvent -> {
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
                if (packetReceiveEvent.isCancelled() || t2.getEntityID() != WatchdogWater118Mode.aER.bgK.getEntityId()) break;
                Vector2d vector2d = new Vector2d(WatchdogWater118Mode.aER.bgK.ud, WatchdogWater118Mode.aER.bgK.uf);
                this.Jk = (double)t2.agP() / 8000.0;
                this.Jk = (double)t2.agO() / 8000.0;
                packetReceiveEvent.cF();
                this.dj = true;
                this.La.add(t2);
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!this.dj) break;
                this.La.add(bc2);
                packetReceiveEvent.cF();
                break;
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Ld = moveInputEvent -> {
        if (WatchdogWater118Mode.aER.bgK.csz) {
            moveInputEvent.setJump(true);
        }
    };
    @EventLink
    public final Listener<JumpEvent> Le = jumpEvent -> {};
    @EventLink
    public final Listener<KeyboardInputEvent> Lf = keyboardInputEvent -> {
        if (keyboardInputEvent.cO() == ((LongJump)this.wy()).getKey() && !this.HJ) {
            keyboardInputEvent.cF();
            this.HJ = true;
        }
    };
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> Lg = preUpdateEvent -> {
        if (this.dj && !WatchdogWater118Mode.aER.bgK.csz) {
            WatchdogWater118Mode.aER.bgK.ae = 0;
            this.vq = true;
            this.dj = false;
            this.tt = true;
            Vector2d vector2d = new Vector2d(WatchdogWater118Mode.aER.bgK.ud, WatchdogWater118Mode.aER.bgK.uf);
            this.La.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            if (this.Jk > 0.41) {
                ++this.KL;
            }
            if (this.KL == 2) {
                this.KJ = true;
            }
            this.La.clear();
            if (!this.KJ) {
                WatchdogWater118Mode.aER.bgK.ud *= 1.3;
                WatchdogWater118Mode.aER.bgK.uf *= 1.3;
            } else {
                WatchdogWater118Mode.aER.bgK.ud *= 1.1;
                WatchdogWater118Mode.aER.bgK.uf *= 1.1;
            }
            this.tt = false;
        }
    };

    public WatchdogWater118Mode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onEnable() {
        this.La.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.La.clear();
        if (WatchdogWater118Mode.aER.bgK.aO) {
            aii.stop();
        }
        bd.cY = 0.0f;
    }

    @Override
    public void onDisable() {
        this.La.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.La.clear();
        this.KJ = false;
        this.KL = 0;
        aii.stop();
    }
}

