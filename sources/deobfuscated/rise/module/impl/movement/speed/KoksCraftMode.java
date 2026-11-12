/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;

public class KoksCraftMode
extends Mode<Speed> {
    int dE;
    @EventLink
    public final Listener<PreMotionEvent> Qc = preMotionEvent -> {
        if (KoksCraftMode.aER.bgK.aO) {
            if (KoksCraftMode.aER.bgK.cus == 0) {
                aii.strafe(aii.getAllowedHorizontalDistance() * 0.99);
            }
            KoksCraftMode.aER.bgK.jump();
            ++this.dE;
        }
        if (KoksCraftMode.aER.bgK.tR == 1 && KoksCraftMode.aER.bgK.cus == 0) {
            KoksCraftMode.aER.bgK.ue = aii.predictedMotion(KoksCraftMode.aER.bgK.ue, this.dE % 2 == 0 ? 2 : 4);
        }
    };

    public KoksCraftMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onEnable() {
        this.dE = 0;
    }
}

