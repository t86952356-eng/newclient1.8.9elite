/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import hackclient.rise.aik;
import hackclient.rise.fc;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Step;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class VanillaMode
extends Mode<Step> {
    private final NumberValue Sx = new NumberValue("Height", this, (Number)1, (Number)1, (Number)10, (Number)0.1);
    private final BooleanValue Sy = new BooleanValue("Reverse", (Mode<?>)this, (Boolean)false);
    private final NumberValue Sz = new NumberValue("Timer", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.1);
    @EventLink
    public final Listener<PreMotionEvent> SA = preMotionEvent -> {
        VanillaMode.aER.bgK.cso = ((Number)this.Sx.wD()).floatValue();
        if (!((Boolean)this.Sy.wD()).booleanValue() || !aik.ad(((Number)this.Sx.wD()).floatValue() + VanillaMode.aER.bgK.getEyeHeight()) || aik.vy()) {
            return;
        }
        if (VanillaMode.aER.bgK.gX < VanillaMode.aER.bgK.aI && !VanillaMode.aER.bgK.aO && VanillaMode.aER.bgK.tR <= 1) {
            VanillaMode.aER.bgK.ue = -((Number)this.Sx.wD()).doubleValue();
        }
        if (VanillaMode.aER.bgK.tR == 1 && VanillaMode.aER.bgK.gX < VanillaMode.aER.bgK.crK) {
            VanillaMode.aER.bgC.dAp = ((Number)this.Sz.wD()).floatValue();
        }
    };
    @EventLink
    public final Listener<fc> SB = fc2 -> {
        if (fc2.da() > 0.6) {
            VanillaMode.aER.bgC.dAp = ((Number)this.Sz.wD()).floatValue();
        }
    };

    public VanillaMode(String string, Step step) {
        super(string, step);
    }

    @Override
    public void onDisable() {
        VanillaMode.aER.bgK.cso = 0.6f;
    }
}

