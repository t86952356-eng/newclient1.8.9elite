/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.bc;
import hackclient.rise.fd;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class MMCMode
extends Mode<Flight> {
    private boolean Gv;
    private int hV;
    @EventLink
    public final Listener<PreMotionEvent> Gz = preMotionEvent -> {
        ++this.hV;
        if (!MMCMode.aER.bgK.aO) {
            return;
        }
        aii.stop();
        if (this.hV == 1 && aik.p(0.0, -2.5, 0.0).isFullBlock()) {
            MMCMode.aER.bgC.dAp = 0.1f;
            bc.cR = true;
            ahn.m(new f(MMCMode.aER.bgK.gW, MMCMode.aER.bgK.gX, MMCMode.aER.bgK.gY, true));
            ahn.m(new f(MMCMode.aER.bgK.gW, aii.roundToGround(MMCMode.aER.bgK.gX - (2.5 - Math.random() / 100.0)), MMCMode.aER.bgK.gY, false));
            ahn.m(new f(MMCMode.aER.bgK.gW, MMCMode.aER.bgK.gX, MMCMode.aER.bgK.gY, false));
            this.Gv = true;
            MMCMode.aER.bgK.jump();
            aii.strafe(7.0 - Math.random() / 10.0);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> GA = strafeEvent -> aii.strafe();
    @EventLink
    public final Listener<fd> GB = fd2 -> {
        if (this.Gv) {
            fd2.cF();
            this.Gv = false;
        }
    };

    public MMCMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.Gv = false;
        this.hV = 0;
    }

    @Override
    public void onDisable() {
        bc.cR = false;
        aii.stop();
    }
}

