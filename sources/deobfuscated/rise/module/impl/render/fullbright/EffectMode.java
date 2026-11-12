/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.fullbright;

import net.minecraft.potion.a;
import net.minecraft.potion.d;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.render.FullBright;

public final class EffectMode
extends Mode<FullBright> {
    @EventLink
    public final Listener<TickEvent> asS = tickEvent -> EffectMode.aER.bgK.b(new d(a.dgL.id, Integer.MAX_VALUE, 1));

    public EffectMode(String string, FullBright fullBright) {
        super(string, fullBright);
    }

    @Override
    public void onDisable() {
        if (EffectMode.aER.bgK.a(a.dgL)) {
            EffectMode.aER.bgK.eL(a.dgL.id);
        }
    }
}

