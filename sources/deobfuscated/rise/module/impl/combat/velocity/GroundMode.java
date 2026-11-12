/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.value.NumberValue;

public final class GroundMode
extends Mode<Velocity> {
    private final NumberValue uu = new NumberValue("Delay", this, (Number)1, (Number)0, (Number)20, (Number)1);
    private int hV;
    @EventLink
    public final Listener<PreMotionEvent> uv = preMotionEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !GroundMode.aER.bgK.cup) {
            return;
        }
        if (GroundMode.aER.bgK.ae == ((Number)this.uu.wD()).intValue()) {
            GroundMode.aER.bgK.aO = true;
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> uw = moveInputEvent -> {
        if (GroundMode.aER.bgK.ae == ((Number)this.uu.wD()).intValue() + 1) {
            moveInputEvent.setJump(false);
        }
    };

    public GroundMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

