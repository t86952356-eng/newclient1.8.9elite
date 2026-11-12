/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.regen;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.f;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Regen;
import rise.value.NumberValue;

public final class VerusRegenMode
extends Mode<Regen> {
    private final NumberValue sp = new NumberValue("Minimum Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> sq = preMotionEvent -> {
        if (VerusRegenMode.aER.bgK.getHealth() < ((Number)this.sp.wD()).floatValue()) {
            for (int i2 = 0; i2 < 30; ++i2) {
                if (!VerusRegenMode.aER.bgK.aO) continue;
                ahn.n(new f(VerusRegenMode.aER.bgK.gW, VerusRegenMode.aER.bgK.gX, VerusRegenMode.aER.bgK.gY, true));
            }
        }
    };

    public VerusRegenMode(String string, Regen regen) {
        super(string, regen);
    }
}

