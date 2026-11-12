/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aik;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class WaMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akR = preMotionEvent -> {
        if (WaMode.aER.aIY.chq.Re() && aik.ay(1)) {
            WaMode.aER.bgK.ue = 0.42f;
        }
    };

    public WaMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

