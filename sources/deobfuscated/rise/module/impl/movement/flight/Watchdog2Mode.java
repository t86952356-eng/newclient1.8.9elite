/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class Watchdog2Mode
extends Mode<Flight> {
    private boolean Fg;
    @EventLink
    public final Listener<PreMotionEvent> Fh = preMotionEvent -> {
        if (Watchdog2Mode.aER.bgK.ae == 1) {
            Watchdog2Mode.aER.bgK.uf *= 1.004;
            Watchdog2Mode.aER.bgK.ud *= 1.004;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Fi = strafeEvent -> {
        if (Watchdog2Mode.aER.bgK.tR == 20) {
            this.Fg = true;
        }
        if (Watchdog2Mode.aER.bgK.ae > 1 && Watchdog2Mode.aER.bgK.ae < 5) {
            Watchdog2Mode.aER.bgK.ue += 0.0445;
        } else if (Watchdog2Mode.aER.bgK.ae > 1 && Watchdog2Mode.aER.bgK.tR > 11) {
            Watchdog2Mode.aER.bgK.ue += 0.028;
        }
        if (this.Fg && Watchdog2Mode.aER.bgK.aO) {
            this.e(Flight.class).setEnabled(false);
        }
        strafeEvent.setFriction((float)((double)strafeEvent.getFriction() + 0.005));
        aii.useDiagonalSpeed();
        aii.strafe();
        if (Watchdog2Mode.aER.bgK.ae < 6) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> Fj = preUpdateEvent -> {};
    @EventLink(cH=0)
    public final Listener<PacketReceiveEvent> Fk = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == Watchdog2Mode.aER.bgK.getEntityId()) {
            Watchdog2Mode.aER.bgK.ue = (double)t2.agO() / 8000.0;
        }
    };
    @EventLink
    private final Listener<MoveEvent> Fl = moveEvent -> {};

    public Watchdog2Mode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onDisable() {
        if (Watchdog2Mode.aER.bgK.ae < 4 && !Watchdog2Mode.aER.bgK.aO) {
            aii.stop();
        }
        this.Fg = false;
    }

    @Override
    public void onEnable() {
        if (Watchdog2Mode.aER.bgK.aO) {
            // empty if block
        }
    }
}

