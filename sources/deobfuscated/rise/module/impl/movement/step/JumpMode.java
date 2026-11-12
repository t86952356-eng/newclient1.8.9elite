/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Step;

public class JumpMode
extends Mode<Step> {
    @EventLink
    public final Listener<PreMotionEvent> Se = preMotionEvent -> {
        if (JumpMode.aER.bgK.aO && JumpMode.aER.bgK.crR) {
            JumpMode.aER.bgK.jump();
        }
    };

    public JumpMode(String string, Step step) {
        super(string, step);
    }
}

