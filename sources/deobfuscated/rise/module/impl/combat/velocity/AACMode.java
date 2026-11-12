/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.bb;
import hackclient.rise.bv;
import java.util.List;
import net.minecraft.entity.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;

public final class AACMode
extends Mode<Velocity> {
    private boolean gD;
    @EventLink
    public final Listener<PreMotionEvent> sx = preMotionEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !AACMode.aER.bgK.cup) {
            return;
        }
        List<r> list = bv.f(7.0);
        if (AACMode.aER.bgK.aO && AACMode.aER.bgK.cus > 0 && !bb.a(false, true, false, false, false)) {
            AACMode.aER.bgK.ud *= 0.6;
            AACMode.aER.bgK.uf *= 0.6;
        }
        this.gD = false;
    };
    @EventLink
    public final Listener<MoveInputEvent> sy = moveInputEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !AACMode.aER.bgK.cup) {
            return;
        }
        if (this.gD) {
            moveInputEvent.setJump(true);
        }
    };

    public AACMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

