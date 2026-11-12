/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomUtils
 */
package rise.module.impl.movement.flight;

import hackclient.rise.aii;
import org.apache.commons.lang3.RandomUtils;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class OldNCPMode
extends Mode<Flight> {
    @EventLink
    public final Listener<PreMotionEvent> HP = preMotionEvent -> {
        preMotionEvent.setPosY(preMotionEvent.getPosY() + 1.0E-5 + (OldNCPMode.aER.bgK.aRg % 2 == 0 ? RandomUtils.nextDouble((double)1.0E-10, (double)1.0E-5) : -RandomUtils.nextDouble((double)1.0E-10, (double)1.0E-5)));
        OldNCPMode.aER.bgK.ue = 0.0;
    };
    @EventLink
    public final Listener<StrafeEvent> HQ = strafeEvent -> strafeEvent.setSpeed(aii.getAllowedHorizontalDistance(), Math.random() / 2000.0);

    public OldNCPMode(String string, Flight flight) {
        super(string, flight);
    }
}

