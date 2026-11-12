/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.criticals;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Criticals;

public final class NoGroundMode
extends Mode<Criticals> {
    @EventLink
    public final Listener<PreMotionEvent> rJ = preMotionEvent -> preMotionEvent.setOnGround(false);

    public NoGroundMode(String string, Criticals criticals) {
        super(string, criticals);
    }
}

