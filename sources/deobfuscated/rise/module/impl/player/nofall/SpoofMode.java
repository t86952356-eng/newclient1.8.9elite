/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class SpoofMode
extends Mode<NoFall> {
    @EventLink
    public final Listener<PreMotionEvent> ajD = preMotionEvent -> preMotionEvent.setOnGround(true);

    public SpoofMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

