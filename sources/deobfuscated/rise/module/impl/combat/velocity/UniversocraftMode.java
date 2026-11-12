/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.velocity;

import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;

public final class UniversocraftMode
extends Mode<Velocity> {
    @EventLink
    public final Listener<PacketReceiveEvent> vb = packetReceiveEvent -> {
        t t2;
        if (((Boolean)((Velocity)this.wy()).qQ.wD()).booleanValue() && !UniversocraftMode.aER.bgK.cup || packetReceiveEvent.isCancelled()) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == UniversocraftMode.aER.bgK.getEntityId()) {
            packetReceiveEvent.cF();
            UniversocraftMode.aER.bgK.ue += 0.1 - Math.random() / 100.0;
        }
        if (aj2 instanceof ar) {
            packetReceiveEvent.cF();
            UniversocraftMode.aER.bgK.ue += 0.1 - Math.random() / 100.0;
        }
    };

    public UniversocraftMode(String string, Velocity velocity) {
        super(string, velocity);
    }
}

