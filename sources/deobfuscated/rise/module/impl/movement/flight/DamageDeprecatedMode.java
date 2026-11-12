/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

public class DamageDeprecatedMode
extends Mode<Flight> {
    private final NumberValue Jx = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @EventLink
    public final Listener<StrafeEvent> Jy = strafeEvent -> {
        float f2 = ((Number)this.Jx.wD()).floatValue();
        strafeEvent.setSpeed(f2);
    };
    @EventLink
    public final Listener<PreMotionEvent> Jz = preMotionEvent -> {
        float f2 = ((Number)this.Jx.wD()).floatValue();
        DamageDeprecatedMode.aER.bgK.ue = 0.0 + (DamageDeprecatedMode.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (DamageDeprecatedMode.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @EventLink
    public final Listener<MoveInputEvent> JA = moveInputEvent -> moveInputEvent.setSneak(false);

    public DamageDeprecatedMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        aic.a(aid.aOJ, 3.42f, 1, false, false);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

