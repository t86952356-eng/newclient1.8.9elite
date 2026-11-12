/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

public class NgMode
extends Mode<Flight> {
    private final NumberValue Hl = new NumberValue("Duration", this, (Number)3000.0, (Number)1000.0, (Number)10000.0, (Number)100.0);
    private final NumberValue Hm = new NumberValue("Timer", this, (Number)1.0, (Number)0.1, (Number)2.0, (Number)0.1);
    private long Hn;
    private boolean dj;
    private int Ho;
    @EventLink
    public final Listener<PacketReceiveEvent> Hp = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == NgMode.aER.bgK.getEntityId()) {
            this.Hn = System.currentTimeMillis();
            this.dj = true;
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> Hq = preUpdateEvent -> {
        if (!this.dj) {
            return;
        }
        long l2 = System.currentTimeMillis() - this.Hn;
        if (l2 >= ((Number)this.Hl.wD()).longValue()) {
            if (this.Ho == 1) {
                ((Flight)this.wy()).toggle();
            }
            return;
        }
        NgMode.aER.bgC.dAp = ((Number)this.Hm.wD()).floatValue();
        this.Ho = 1;
        if (NgMode.aER.bgK.aO && NgMode.aER.bgK.crW) {
            NgMode.aER.bgK.ue = 0.42;
        } else {
            aii.strafe(0.002);
            NgMode.aER.bgC.dAp = 4.0f;
            NgMode.aER.bgK.ue = Math.max(-1.0E-8, NgMode.aER.bgK.ue);
        }
        if (NgMode.aER.bgK.crR) {
            NgMode.aER.bgC.dAp = 1.0f;
            ((Flight)this.wy()).toggle();
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Hr = preMotionEvent -> {
        if (!this.dj) {
            return;
        }
        long l2 = System.currentTimeMillis() - this.Hn;
        if (l2 < ((Number)this.Hl.wD()).longValue()) {
            preMotionEvent.setOnGround(false);
        }
    };

    public NgMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.Hn = 0L;
        this.dj = false;
        this.Ho = 0;
    }

    @Override
    public void onDisable() {
        NgMode.aER.bgC.dAp = 1.0f;
        aii.stop();
        this.dj = false;
        this.Ho = 0;
    }
}

