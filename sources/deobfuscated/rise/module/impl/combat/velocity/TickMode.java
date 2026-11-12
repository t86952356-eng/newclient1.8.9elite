/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.value.NumberValue;

public final class TickMode
extends Mode<Velocity> {
    private final NumberValue uZ = new NumberValue("Tick Velocity", this, (Number)1, (Number)1, (Number)6, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> va = preMotionEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !TickMode.aER.bgK.cup) {
            return;
        }
        if (TickMode.aER.bgK.cus == 10 - ((Number)this.uZ.wD()).intValue()) {
            aii.stop();
        }
    };

    public TickMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

