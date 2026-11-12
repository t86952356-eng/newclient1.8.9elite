/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import hackclient.rise.aik;
import net.minecraft.item.co;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class WbMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> akS = preMotionEvent -> {
        if (WbMode.aER.aIY.chq.Re() && aik.ay(2) && WbMode.aER.bgK.tR > 3) {
            co co2 = WbMode.aER.bgK.cHV.cJC[WbMode.aER.bgK.cHV.cJE];
            if (co2 == null || co2.cWZ > 2) {
                // empty if block
            }
            if (!aii.isMoving()) {
                preMotionEvent.setOnGround(true);
                WbMode.aER.bgK.aO = true;
                WbMode.aER.bgK.ue = 0.5;
                if (WbMode.aER.bgK.aRg % 2 == 0) {
                    preMotionEvent.setPosX(preMotionEvent.getPosX() + 0.1);
                }
            }
        }
    };

    public WbMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }
}

