/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VhMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> ajT = preMotionEvent -> VhMode.aER.bgK.setSprinting(false);

    public VhMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

