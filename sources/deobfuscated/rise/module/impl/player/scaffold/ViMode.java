/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class ViMode
extends Mode<Scaffold> {
    @EventLink(cH=0)
    public final Listener<StrafeEvent> ajU = strafeEvent -> {
        ViMode.aER.aIY.chs.ay(false);
        ViMode.aER.bgK.setSprinting(false);
    };

    public ViMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

