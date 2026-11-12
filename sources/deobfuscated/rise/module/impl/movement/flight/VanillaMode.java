/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

public class VanillaMode
extends Mode<Flight> {
    private static final double Iz = 10.0;
    private final NumberValue IA = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1);
    @EventLink
    public final Listener<PreMotionEvent> IB = preMotionEvent -> {
        double d2;
        float f2 = ((Number)this.IA.wD()).floatValue();
        VanillaMode.aER.bgK.ue = d2 = (VanillaMode.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (VanillaMode.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @EventLink
    public final Listener<StrafeEvent> IC = strafeEvent -> {
        double d2;
        float f2 = ((Number)this.IA.wD()).floatValue();
        double d3 = Math.sqrt((double)(f2 * f2) + (d2 = VanillaMode.aER.bgK.ue) * d2);
        if (d3 > 10.0) {
            double d4 = 10.0 / d3;
            f2 = (float)((double)f2 * d4);
            d2 *= d4;
        }
        strafeEvent.setSpeed(f2);
        VanillaMode.aER.bgK.ue = d2;
    };
    @EventLink
    public final Listener<MoveInputEvent> ID = moveInputEvent -> moveInputEvent.setSneak(false);

    public VanillaMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

