/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VvMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PacketSendEvent> akK = packetSendEvent -> {
        k k2;
        aj<?> aj2 = packetSendEvent.dq();
        if (VvMode.aER.aIY.chq.Re() && aj2 instanceof k && (k2 = (k)aj2).yl().equals(new b(VvMode.aER.bgK.gW, VvMode.aER.bgK.gX - 1.4, VvMode.aER.bgK.gY))) {
            VvMode.aER.aIY.chs.ay(false);
            VvMode.aER.bgK.setSprinting(false);
            VvMode.aER.bgK.ue = 0.42f;
        }
    };

    public VvMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

