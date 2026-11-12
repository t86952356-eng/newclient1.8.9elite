/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.NumberValue;

public class VanillaMode
extends Mode<Speed> {
    private final NumberValue QX = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @EventLink
    public final Listener<StrafeEvent> QY = strafeEvent -> {
        if (aii.isMoving() && VanillaMode.aER.bgK.aO) {
            VanillaMode.aER.bgK.jump();
        }
        strafeEvent.setSpeed(((Number)this.QX.wD()).floatValue());
    };

    public VanillaMode(String string, Speed speed) {
        super(string, speed);
    }
}

