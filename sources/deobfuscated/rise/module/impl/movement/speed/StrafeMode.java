/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public final class StrafeMode
extends Mode<Speed> {
    private final BooleanValue QK = new BooleanValue("Hurt Boost", (Mode<?>)this, (Boolean)false);
    private final NumberValue QL = new NumberValue("Boost Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @EventLink
    public final Listener<StrafeEvent> QM = strafeEvent -> {
        if (!aii.isMoving()) {
            aii.stop();
            return;
        }
        if (StrafeMode.aER.bgK.aO) {
            StrafeMode.aER.bgK.jump();
        }
        if (((Boolean)this.QK.wD()).booleanValue() && StrafeMode.aER.bgK.cus == 9) {
            aii.strafe(((Number)this.QL.wD()).doubleValue());
        }
        aii.strafe();
    };
    @EventLink
    public final Listener<MoveInputEvent> QN = moveInputEvent -> moveInputEvent.setJump(false);

    public StrafeMode(String string, Speed speed) {
        super(string, speed);
    }
}

