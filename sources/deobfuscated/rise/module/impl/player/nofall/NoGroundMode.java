/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class NoGroundMode
extends Mode<NoFall> {
    @EventLink
    public final Listener<PreMotionEvent> ajz = preMotionEvent -> {
        preMotionEvent.setOnGround(false);
        preMotionEvent.setPosY(preMotionEvent.getPosY() + Math.random() / (double)1.0E20f);
    };

    public NoGroundMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

