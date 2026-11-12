/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import hackclient.rise.aik;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VtMode
extends Mode<Scaffold> {
    private int akG = 5;
    @EventLink
    public final Listener<PreMotionEvent> akH = preMotionEvent -> {
        if (VtMode.aER.aIY.chq.Re() && aik.ay(2) && !aii.isMoving()) {
            if (VtMode.aER.bgK.gX % 1.0 <= 0.00153598) {
                VtMode.aER.bgK.setPosition(VtMode.aER.bgK.gW, Math.floor(VtMode.aER.bgK.gX), VtMode.aER.bgK.gY);
                VtMode.aER.bgK.ue = 0.42f;
            } else if (VtMode.aER.bgK.gX % 1.0 < 0.1 && VtMode.aER.bgK.tR != 0) {
                VtMode.aER.bgK.ue = 0.0;
                VtMode.aER.bgK.setPosition(VtMode.aER.bgK.gW, Math.floor(VtMode.aER.bgK.gX), VtMode.aER.bgK.gY);
            }
        }
        if (aii.isMoving() && VtMode.aER.aIY.chq.Re() && VtMode.aER.bgK.aO) {
            VtMode.aER.bgK.jump();
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> akI = packetSendEvent -> {
        k k2;
        aj<?> aj2 = packetSendEvent.dq();
        if (aii.isMoving() && VtMode.aER.bgK.ue > -0.09800000190734864 && aj2 instanceof k && (k2 = (k)aj2).yl().equals(new b(VtMode.aER.bgK.gW, VtMode.aER.bgK.gX - 1.4, VtMode.aER.bgK.gY))) {
            VtMode.aER.bgK.ue = -0.09800000190734864;
        }
    };

    public VtMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

