/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.aii;
import hackclient.rise.bd;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class RoundMode
extends Mode<NoFall> {
    @EventLink
    public final Listener<PreMotionEvent> ajC = preMotionEvent -> {
        double d2 = aii.roundToGround(preMotionEvent.getPosY());
        float f2 = bd.cY;
        if (f2 > 3.0f && Math.abs(d2 - preMotionEvent.getPosY()) < 0.005) {
            RoundMode.aER.bgK.setPosition(RoundMode.aER.bgK.gW, d2, RoundMode.aER.bgK.gY);
            preMotionEvent.setOnGround(true);
            preMotionEvent.setPosY(d2);
        }
    };

    public RoundMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

