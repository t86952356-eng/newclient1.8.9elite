/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.es;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;

public final class KarhuMode
extends Mode<Velocity> {
    @EventLink
    public final Listener<es> uB = es2 -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !KarhuMode.aER.bgK.cup) {
            return;
        }
        if (es2.df() instanceof BlockAir && KarhuMode.aER.bgK.cus > 0 && KarhuMode.aER.bgK.ae <= 9) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 == Math.floor(KarhuMode.aER.bgK.gX) + 1.0) {
                es2.a(a.h(0.0, 0.0, 0.0, 1.0, 0.0, 1.0).ae(d2, d3, d4));
            }
        }
    };

    public KarhuMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

