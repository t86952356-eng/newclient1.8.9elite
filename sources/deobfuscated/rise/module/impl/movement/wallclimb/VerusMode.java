/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.wallclimb;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.WallClimb;

public class VerusMode
extends Mode<WallClimb> {
    @EventLink
    public final Listener<PreMotionEvent> Tt = preMotionEvent -> {
        if (VerusMode.aER.bgK.crR && VerusMode.aER.bgK.aRg % 2 == 0) {
            VerusMode.aER.bgK.jump();
        }
    };

    public VerusMode(String string, WallClimb wallClimb) {
        super(string, wallClimb);
    }
}

