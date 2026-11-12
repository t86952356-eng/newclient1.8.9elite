/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VqMode
extends Mode<Scaffold> {
    private int hV;
    @EventLink(cH=0)
    public final Listener<StrafeEvent> aky = strafeEvent -> {
        double d2;
        ++this.hV;
        VqMode.aER.aIY.chs.ay(true);
        VqMode.aER.bgK.setSprinting(true);
        double d3 = d2 = VqMode.aER.bgK.a(a.dgw) ? 0.118 : 0.083;
        if (VqMode.aER.bgK.aO) {
            aii.strafe(d2 - (VqMode.aER.bgK.Zz <= 40 ? 0.1 : 0.0) - Math.random() * 1.0E-4);
        }
        if (aii.speed() >= d2 && !VqMode.aER.aIY.chq.Re()) {
            aii.moveFlying((aii.speed() - d2) * -1.0);
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> akz = packetSendEvent -> {};

    public VqMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }

    @Override
    public void onDisable() {
        VqMode.aER.bgK.cIt.cJK = false;
        VqMode.aER.bgC.dAp = 1.0f;
    }
}

