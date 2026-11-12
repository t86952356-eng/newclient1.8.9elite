/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.afl;
import hackclient.rise.aii;
import hackclient.rise.bs;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;

public class PolarMode
extends Mode<Speed> {
    private int PR = 0;
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> PS = preUpdateEvent -> {
        PolarMode.aER.bgC.dAp = 1.009f;
        if (PolarMode.aER.bgK.aO || !PolarMode.aER.aIY.chm.Re() || !bs.bd()) {
            // empty if block
        }
    };
    @EventLink(cH=4)
    public final Listener<StrafeEvent> PT = strafeEvent -> {
        if (PolarMode.aER.bgK.tR == 1) {
            // empty if block
        }
        if (PolarMode.aER.bgK.tR == 5 && this.PR % 2 != 0) {
            PolarMode.aER.bgK.ue -= 0.03;
        }
        if (PolarMode.aER.bgK.aO) {
            PolarMode.aER.bgK.jump();
        }
        if (this.PR % 2 != 0) {
            afl.c(PolarMode.aER.bgK.tR, new Object[0]);
        }
        aii.moveFlying(0.002);
    };
    @EventLink
    public final Listener<JumpEvent> PU = jumpEvent -> ++this.PR;

    public PolarMode(String string, Speed speed) {
        super(string, speed);
    }
}

