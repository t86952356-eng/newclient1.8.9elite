/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.es;
import net.minecraft.block.BlockAir;
import net.minecraft.util.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;

public class AirJumpMode
extends Mode<Flight> {
    private double y;
    @EventLink
    public final Listener<PreMotionEvent> Fm = preMotionEvent -> {
        if (AirJumpMode.aER.aIY.chq.Re() || AirJumpMode.aER.aIY.chr.Re()) {
            this.y = AirJumpMode.aER.bgK.gX;
        }
        if (AirJumpMode.aER.bgK.aO) {
            AirJumpMode.aER.bgK.jump();
        }
    };
    @EventLink
    public final Listener<es> Fn = es2 -> {
        if (es2.df() instanceof BlockAir && !AirJumpMode.aER.aIY.chr.Re() && (AirJumpMode.aER.bgK.gX < this.y + 1.0 || AirJumpMode.aER.aIY.chq.Re())) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < AirJumpMode.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> Fo = moveInputEvent -> moveInputEvent.setSneak(false);

    public AirJumpMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onEnable() {
        this.y = Math.floor(AirJumpMode.aER.bgK.gX);
    }
}

