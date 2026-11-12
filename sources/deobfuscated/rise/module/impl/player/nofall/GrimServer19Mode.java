/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.bd;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.a;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;
import rise.value.BooleanValue;

public class GrimServer19Mode
extends Mode<NoFall> {
    private boolean ajn;
    public static boolean dj = false;
    public static boolean tt;
    private int tR;
    private final ArrayList<aj<?>> ajo = new ArrayList();
    private float ub;
    private double vB;
    private double vC;
    private final BooleanValue ajp = new BooleanValue("Newest Grim, may flag the anticheat", (Mode<?>)this, (Boolean)false);
    private boolean gD;
    @EventLink(cH=2)
    public final Listener<PacketReceiveEvent> ajq = packetReceiveEvent -> {
        if (tt || GrimServer19Mode.aER.bgK.aRg < 10 || GrimServer19Mode.aER.bgK.crR) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        Objects.requireNonNull(aj2);
        aj<?> aj3 = aj2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{t.class, bc.class, a.class}, aj3, n2)) {
            case 0: {
                t t2 = (t)aj3;
                if (t2.getEntityID() != GrimServer19Mode.aER.bgK.getEntityId() || packetReceiveEvent.isCancelled()) break;
                if (t2.getEntityID() == GrimServer19Mode.aER.bgK.getEntityId() && t2.dcS > 0 || GrimServer19Mode.aER.bgK.ae <= 14 || GrimServer19Mode.aER.bgK.crx <= 1) {
                    this.gD = true;
                }
                if (GrimServer19Mode.aER.bgK.aO || !this.ajn) break;
                dj = true;
                break;
            }
            case 1: {
                bc bc2 = (bc)aj3;
                if (!dj) break;
                break;
            }
            case 2: {
                a a2 = (a)aj3;
                if (!dj) break;
                break;
            }
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> ajr = preMotionEvent -> {
        if (GrimServer19Mode.aER.bgK.crR) {
            return;
        }
        float f2 = bd.cY;
        if (GrimServer19Mode.aER.bgK.ue > 0.1) {
            this.ajn = false;
        }
        if (f2 > 3.0f) {
            this.ajn = true;
        }
        if (this.ajn && GrimServer19Mode.aER.bgK.aO) {
            if (!((Boolean)this.ajp.wD()).booleanValue()) {
                preMotionEvent.setCancelled(true);
            } else {
                ahn.m(new f(GrimServer19Mode.aER.bgK.gW, GrimServer19Mode.aER.bgK.gX + 0.01, GrimServer19Mode.aER.bgK.gY, true));
            }
            preMotionEvent.setCancelled(true);
            ahn.m(new e(true));
            GrimServer19Mode.aER.aIY.chq.ay(false);
            f2 = 0.0f;
        }
        if (this.ajn) {
            GrimServer19Mode.aER.aIY.chq.ay(false);
        }
        if (aik.vx() > 5.0 && GrimServer19Mode.aER.bgK.tR == 9 && GrimServer19Mode.aER.bgK.Zz > 200 && ((Boolean)this.ajp.wD()).booleanValue()) {
            GrimServer19Mode.aER.bgK.ue = aii.predictedMotion(GrimServer19Mode.aER.bgK.ue, 10);
        }
        bd.cY = f2;
    };
    @EventLink(cH=2)
    public final Listener<PreUpdateEvent> ajs = preUpdateEvent -> {
        if (dj && GrimServer19Mode.aER.bgK.aO) {
            tt = true;
            dj = false;
            this.ajo.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.ajo.clear();
            tt = false;
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> ajt = moveInputEvent -> {
        if (GrimServer19Mode.aER.bgK.crR) {
            return;
        }
        if (this.gD && this.ajn) {
            moveInputEvent.setJump(true);
            this.gD = false;
        } else if (this.ajn) {
            // empty if block
        }
    };

    public GrimServer19Mode(String string, NoFall noFall) {
        super(string, noFall);
    }

    @Override
    public void onEnable() {
        this.ajn = false;
    }
}

