/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.fullbright;

import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.render.FullBright;

public final class GammaMode
extends Mode<FullBright> {
    private float asT;
    @EventLink
    public final Listener<TickEvent> asU = tickEvent -> {
        GammaMode.aER.aIY.chW = 100.0f;
    };

    public GammaMode(String string, FullBright fullBright) {
        super(string, fullBright);
    }

    @Override
    public void onEnable() {
        this.asT = GammaMode.aER.aIY.chW;
    }

    @Override
    public void onDisable() {
        GammaMode.aER.aIY.chW = this.asT;
    }
}

