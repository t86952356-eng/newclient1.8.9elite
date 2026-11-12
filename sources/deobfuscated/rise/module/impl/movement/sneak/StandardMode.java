/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.sneak;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Sneak;

public class StandardMode
extends Mode<Sneak> {
    @EventLink
    public final Listener<PreMotionEvent> Pl = preMotionEvent -> {
        StandardMode.aER.bgK.bkr.jr = StandardMode.aER.bgK.bkd.bEQ;
    };

    public StandardMode(String string, Sneak sneak) {
        super(string, sneak);
    }
}

