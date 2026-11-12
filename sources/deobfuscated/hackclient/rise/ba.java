/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.au;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;

public class ba
extends am {
    @EventLink
    public final Listener<PacketReceiveEvent> cH = packetReceiveEvent -> {
        au au2;
        double d2;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof au && (d2 = ba.aER.bgK.M((au2 = (au)aj2).ahr(), au2.ahs(), au2.aht())) >= 36.0) {
            packetReceiveEvent.cF();
        }
    };
}

