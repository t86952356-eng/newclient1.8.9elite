/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.il;
import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class DelayMode
extends Mode<Velocity> {
    private final NumberValue tl = new NumberValue("Delay (ticks)", this, (Number)5, (Number)0, (Number)40, (Number)1);
    private final BooleanValue tm = new BooleanValue("Delay Explosions", (Mode<?>)this, (Boolean)true);
    private final Deque<il> tn = new ArrayDeque<il>();
    private boolean to = false;
    @EventLink
    public final Listener<PacketReceiveEvent> tp = packetReceiveEvent -> {
        if (this.to || DelayMode.aER.bgK == null) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() == DelayMode.aER.bgK.getEntityId()) {
                packetReceiveEvent.cF();
                int n2 = ((Number)this.tl.wD()).intValue();
                int n3 = DelayMode.aER.bgK.aRg;
                this.tn.addLast(new il(t2, n3 + n2));
            }
            return;
        }
        if (aj2 instanceof bc) {
            bc bc2 = (bc)aj2;
            packetReceiveEvent.cF();
            int n4 = ((Number)this.tl.wD()).intValue();
            int n5 = DelayMode.aER.bgK.aRg;
            this.tn.addLast(new il(bc2, n5 + n4));
            return;
        }
        if (((Boolean)this.tm.wD()).booleanValue() && aj2 instanceof ar) {
            packetReceiveEvent.cF();
            int n6 = ((Number)this.tl.wD()).intValue();
            int n7 = DelayMode.aER.bgK.aRg;
            this.tn.addLast(new il(aj2, n7 + n6));
        }
    };
    @EventLink
    public final Listener<TickEvent> tq = tickEvent -> {
        if (DelayMode.aER.bgK == null || this.tn.isEmpty()) {
            return;
        }
        int n2 = DelayMode.aER.bgK.aRg;
        while (!this.tn.isEmpty() && this.tn.peekFirst().ts <= n2) {
            aj<?> aj2 = this.tn.removeFirst().tr;
            this.to = true;
            try {
                ahn.q(aj2);
            }
            finally {
                this.to = false;
            }
        }
        afl.c(this.tn.peekFirst().ts - n2, new Object[0]);
    };

    public DelayMode(String string, Velocity velocity) {
        super(string, velocity);
    }

    @Override
    public void onDisable() {
        if (this.tn.isEmpty()) {
            return;
        }
        this.to = true;
        try {
            for (il il2 : this.tn) {
                ahn.q(il2.tr);
            }
        }
        finally {
            this.to = false;
            this.tn.clear();
        }
    }
}

