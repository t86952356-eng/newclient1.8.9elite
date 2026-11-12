/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.ahn;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import net.minecraft.network.play.server.z;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.value.BooleanValue;

public class WatchdogReduceMode
extends Mode<Velocity> {
    private final BooleanValue vI = new BooleanValue("Cancel On Ground", (Mode<?>)this, (Boolean)true);
    private final BooleanValue vJ = new BooleanValue("Cancel On Attack", (Mode<?>)this, (Boolean)true);
    private final BooleanValue vK = new BooleanValue("Cancel Explosions", (Mode<?>)this, (Boolean)true);
    private final List<aj<?>> vL = new ArrayList();
    private boolean vM = false;
    @EventLink
    public final Listener<PacketReceiveEvent> vN = packetReceiveEvent -> {
        if (this.vM || WatchdogReduceMode.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() != WatchdogReduceMode.aER.bgK.getEntityId()) {
                return;
            }
            packetReceiveEvent.cF();
            List<aj<?>> list = this.vL;
            synchronized (list) {
                this.vL.add(aj2);
            }
            return;
        }
        if (aj2 instanceof bc) {
            List<aj<?>> list = this.vL;
            synchronized (list) {
                if (!this.vL.isEmpty()) {
                    packetReceiveEvent.cF();
                    this.vL.add(aj2);
                }
            }
            return;
        }
        if (aj2 instanceof z) {
            List<aj<?>> list = this.vL;
            synchronized (list) {
                if (!this.vL.isEmpty()) {
                    packetReceiveEvent.cF();
                    this.vL.add(aj2);
                }
            }
            return;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> vO = packetSendEvent -> {
        c c2;
        if (!((Boolean)this.vJ.wD()).booleanValue()) {
            return;
        }
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof c && (c2 = (c)aj2).afQ() == d.daU) {
            this.v("attack");
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> vP = preMotionEvent -> {
        if (!((Boolean)this.vI.wD()).booleanValue()) {
            return;
        }
        if (WatchdogReduceMode.aER.bgK.aO && !this.vL.isEmpty()) {
            this.v("ground");
        }
    };

    public WatchdogReduceMode(String string, Velocity velocity) {
        super(string, velocity);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void v(String string) {
        ArrayList arrayList;
        List<aj<?>> list = this.vL;
        synchronized (list) {
            if (this.vL.isEmpty()) {
                return;
            }
            arrayList = new ArrayList(this.vL);
            this.vL.clear();
        }
        this.vM = true;
        try {
            for (aj aj2 : arrayList) {
                ahn.q(aj2);
            }
        }
        finally {
            this.vM = false;
        }
    }

    @Override
    public void onDisable() {
        this.v("disable");
    }
}

