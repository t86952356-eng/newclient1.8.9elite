/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.nofall;

import hackclient.rise.bd;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.NoFall;

public class VulcanMode
extends Mode<NoFall> {
    @EventLink
    public final Listener<PreMotionEvent> ajB = preMotionEvent -> {
        float f2 = bd.cY;
        if (bd.cY > 3.0f) {
            preMotionEvent.setOnGround(true);
            VulcanMode.aER.bgK.aO = true;
            VulcanMode.aER.bgK.ue = -0.09800000190735147;
            bd.cY = 0.0f;
        }
    };

    public VulcanMode(String string, NoFall noFall) {
        super(string, noFall);
    }
}

