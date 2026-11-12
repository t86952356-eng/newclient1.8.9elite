/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.es;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public final class AirWalkMode
extends Mode<Flight> {
    @EventLink
    public final Listener<es> Fp = es2 -> {
        if (es2.df() instanceof BlockAir && !AirWalkMode.aER.bgK.isSneaking() && AirWalkMode.aER.bgK.Zz > 2) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < AirWalkMode.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };

    public AirWalkMode(String string, Flight flight) {
        super(string, flight);
    }
}

