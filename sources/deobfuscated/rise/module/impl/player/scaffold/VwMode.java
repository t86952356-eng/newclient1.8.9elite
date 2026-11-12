/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import hackclient.rise.aik;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VwMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akL = preMotionEvent -> {
        if (VwMode.aER.aIY.chq.Re() && aik.a(2.0, false) && VwMode.aER.bgK.ue < 0.2 && !aii.isMoving()) {
            VwMode.aER.bgK.ue = 0.42f;
            preMotionEvent.setOnGround(true);
        }
    };

    public VwMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

