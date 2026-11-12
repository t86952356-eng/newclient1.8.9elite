/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;

public final class bd
extends am {
    public static float cY;
    @EventLink(cH=0)
    public final Listener<PreMotionEvent> cZ = preMotionEvent -> {
        double d2 = bd.aER.bgK.csi - bd.aER.bgK.gX;
        if (d2 > 0.0) {
            cY = (float)((double)cY + d2);
        }
        if (preMotionEvent.isOnGround()) {
            cY = 0.0f;
        }
    };
}

