/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.criticals;

import hackclient.rise.bd;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Criticals;

public final class VulcanMode
extends Mode<Criticals> {
    @EventLink
    public final Listener<PreMotionEvent> rS = preMotionEvent -> {
        if (VulcanMode.aER.bgK.ae <= 18 && (double)bd.cY < 1.8) {
            preMotionEvent.setOnGround(false);
        }
    };

    public VulcanMode(String string, Criticals criticals) {
        super(string, criticals);
    }
}

