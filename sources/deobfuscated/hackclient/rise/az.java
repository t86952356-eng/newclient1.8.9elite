/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;

public class az
extends am {
    private boolean cF;
    @EventLink
    public final Listener<PreMotionEvent> cG = preMotionEvent -> {
        if (az.aER.bgR == null && this.cF) {
            for (d d2 : az.aER.aIY.chL) {
                d2.ay(a.a(d2));
            }
        }
        this.cF = az.aER.bgR != null;
    };
}

