/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VuMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<StrafeEvent> akJ = strafeEvent -> {
        if (!VuMode.aER.aIY.chq.Re()) {
            return;
        }
        if (VuMode.aER.bgK.aO) {
            VuMode.aER.bgK.jump();
        }
    };

    public VuMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

