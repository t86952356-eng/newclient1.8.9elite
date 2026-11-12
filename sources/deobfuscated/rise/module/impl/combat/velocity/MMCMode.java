/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import hackclient.rise.aii;
import hackclient.rise.bb;
import hackclient.rise.bv;
import java.util.List;
import net.minecraft.entity.r;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.module.impl.movement.Speed;

public final class MMCMode
extends Mode<Velocity> {
    private boolean gD;
    @EventLink
    public final Listener<PacketReceiveEvent> uH = packetReceiveEvent -> {
        t t2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == MMCMode.aER.bgK.getEntityId()) {
            this.gD = true;
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> uI = preMotionEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !MMCMode.aER.bgK.cup) {
            return;
        }
        List<r> list = bv.f(7.0);
        if (!MMCMode.aER.bgK.aO || MMCMode.aER.bgK.cus <= 0 || !bb.a(false, true, false, false, false)) {
            // empty if block
        }
        if (MMCMode.aER.bgK.ae == 1) {
            MMCMode.aER.bgK.ud *= 0.0;
            MMCMode.aER.bgK.uf *= 0.0;
        }
        if (MMCMode.aER.bgK.ae == 1 && (MMCMode.aER.bgK.cuU || this.e(Speed.class).isEnabled())) {
            MMCMode.aER.bgK.ue -= 9.0;
        }
        if (MMCMode.aER.bgK.crx == 1 && MMCMode.aER.bgK.ae < 4 && aii.speed() < 0.31) {
            aii.moveFlying(0.05);
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> uJ = moveInputEvent -> {
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !MMCMode.aER.bgK.cup) {
            return;
        }
        if (this.gD) {
            // empty if block
        }
    };

    public MMCMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

