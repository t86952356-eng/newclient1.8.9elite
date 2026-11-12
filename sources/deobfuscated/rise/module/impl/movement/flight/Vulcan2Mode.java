/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import hackclient.rise.bm;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class Vulcan2Mode
extends Mode<Flight> {
    private static final double HD = 10.0;
    @EventLink
    public final Listener<PreMotionEvent> HE = preMotionEvent -> {
        bm.a(25000, true, false, false, false);
        if (aii.speed() < 0.2) {
            aii.strafe(0.2);
        }
        aii.useDiagonalSpeed();
        Vulcan2Mode.aER.bgK.ue = Vulcan2Mode.aER.bgK.aRg % 3 == 0 ? -0.15 : -0.09701;
    };
    @EventLink
    public final Listener<StrafeEvent> HF = strafeEvent -> {};
    @EventLink
    public final Listener<MoveInputEvent> HG = moveInputEvent -> moveInputEvent.setSneak(false);

    public Vulcan2Mode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

