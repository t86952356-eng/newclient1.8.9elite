/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.value.NumberValue;

public class VanillaMode
extends Mode<LongJump> {
    private final NumberValue LR = new NumberValue("Height", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.01);
    private final NumberValue LS = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @EventLink
    public final Listener<StrafeEvent> LT = strafeEvent -> {
        if (VanillaMode.aER.bgK.aO) {
            VanillaMode.aER.bgK.ue = ((Number)this.LR.wD()).floatValue();
        }
        strafeEvent.setSpeed(((Number)this.LS.wD()).floatValue());
    };

    public VanillaMode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

