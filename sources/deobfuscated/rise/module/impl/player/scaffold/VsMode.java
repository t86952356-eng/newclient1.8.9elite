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

public class VsMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akF = preMotionEvent -> {
        if (VsMode.aER.aIY.chq.Re() && VsMode.aER.bgK.aRg % 2 == 0 && aik.ay(2)) {
            VsMode.aER.bgK.ue = 0.42f;
            preMotionEvent.setOnGround(true);
        }
    };

    public VsMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

