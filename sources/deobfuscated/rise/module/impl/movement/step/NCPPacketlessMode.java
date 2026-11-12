/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.step;

import hackclient.rise.aii;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Step;

public class NCPPacketlessMode
extends Mode<Step> {
    private boolean Sk;
    @EventLink
    public final Listener<PreMotionEvent> Sl = preMotionEvent -> {
        if (NCPPacketlessMode.aER.bgK.aO && NCPPacketlessMode.aER.bgK.crR && !NCPPacketlessMode.aER.bgK.a(a.dgD)) {
            NCPPacketlessMode.aER.bgK.jump();
            aii.stop();
            this.Sk = true;
        }
        if (NCPPacketlessMode.aER.bgK.tR == 3 && this.Sk) {
            NCPPacketlessMode.aER.bgK.ue = aii.predictedMotion(NCPPacketlessMode.aER.bgK.ue, 2);
            aii.strafe(aii.getAllowedHorizontalDistance() * 0.6 - Math.random() / 100.0 - 0.05);
            this.Sk = false;
        }
    };

    public NCPPacketlessMode(String string, Step step) {
        super(string, step);
    }

    @Override
    public void onDisable() {
        NCPPacketlessMode.aER.bgK.cso = 0.6f;
    }
}

