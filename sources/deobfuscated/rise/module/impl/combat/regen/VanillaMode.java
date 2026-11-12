/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.regen;

import hackclient.rise.ahn;
import net.minecraft.network.play.client.h;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Regen;
import rise.value.NumberValue;

public final class VanillaMode
extends Mode<Regen> {
    private final NumberValue sm = new NumberValue("Minimum Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    private final NumberValue sn = new NumberValue("Speed", this, (Number)20, (Number)1, (Number)100, (Number)1);
    @EventLink
    public final Listener<PreMotionEvent> so = preMotionEvent -> {
        if (VanillaMode.aER.bgK.getHealth() < ((Number)this.sm.wD()).floatValue()) {
            for (int i2 = 0; i2 < ((Number)this.sn.wD()).intValue(); ++i2) {
                ahn.m(new h(VanillaMode.aER.bgK.gW, VanillaMode.aER.bgK.gX, VanillaMode.aER.bgK.gY, VanillaMode.aER.bgK.pl, VanillaMode.aER.bgK.pm, VanillaMode.aER.bgK.aO));
            }
        }
    };

    public VanillaMode(String string, Regen regen) {
        super(string, regen);
    }
}

