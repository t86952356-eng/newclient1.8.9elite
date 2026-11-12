/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import net.minecraft.network.play.client.k;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VxMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akM = preMotionEvent -> {
        if (VxMode.aER.aIY.chq.Re() && aik.ay(2)) {
            ahn.n(new k(null));
            if (VxMode.aER.bgK.gX % 1.0 <= 0.00153598) {
                VxMode.aER.bgK.setPosition(VxMode.aER.bgK.gW, Math.floor(VxMode.aER.bgK.gX), VxMode.aER.bgK.gY);
                VxMode.aER.bgK.ue = 0.42f;
            } else if (VxMode.aER.bgK.gX % 1.0 < 0.1 && VxMode.aER.bgK.tR != 0) {
                VxMode.aER.bgK.ue = 0.0;
                VxMode.aER.bgK.setPosition(VxMode.aER.bgK.gW, Math.floor(VxMode.aER.bgK.gX), VxMode.aER.bgK.gY);
            }
        }
    };

    public VxMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

