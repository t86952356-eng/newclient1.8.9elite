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
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class BounceMode
extends Mode<Velocity> {
    private final NumberValue sz = new NumberValue("Tick", this, (Number)0, (Number)0, (Number)6, (Number)1);
    private final BooleanValue sA = new BooleanValue("Vertical", (Mode<?>)this, (Boolean)false);
    private final BooleanValue sB = new BooleanValue("Horizontal", (Mode<?>)this, (Boolean)false);
    @EventLink
    public final Listener<PreMotionEvent> sC = preMotionEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !BounceMode.aER.bgK.cup) {
            return;
        }
        if (BounceMode.aER.bgK.cus == 9 - ((Number)this.sz.wD()).intValue()) {
            if (((Boolean)this.sB.wD()).booleanValue()) {
                if (aii.isMoving()) {
                    aii.strafe();
                } else {
                    BounceMode.aER.bgK.uf *= -1.0;
                    BounceMode.aER.bgK.ud *= -1.0;
                }
            }
            if (((Boolean)this.sA.wD()).booleanValue()) {
                BounceMode.aER.bgK.ue *= -1.0;
            }
        }
    };

    public BounceMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

