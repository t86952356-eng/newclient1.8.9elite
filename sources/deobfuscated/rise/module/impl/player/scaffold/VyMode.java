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
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VyMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akN = preMotionEvent -> {
        if (VyMode.aER.aIY.chq.Re() && VyMode.aER.bgK.aO) {
            VyMode.aER.bgK.ue = 0.42f;
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> akO = packetSendEvent -> {
        k k2;
        aj<?> aj2 = packetSendEvent.dq();
        if (VyMode.aER.bgK.ue > -0.0784000015258789 && aj2 instanceof k && (k2 = (k)aj2).yl().equals(new b(VyMode.aER.bgK.gW, Math.floor(VyMode.aER.bgK.gX) - 2.0, VyMode.aER.bgK.gY))) {
            VyMode.aER.bgK.ue = -0.0784000015258789;
        }
    };

    public VyMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

