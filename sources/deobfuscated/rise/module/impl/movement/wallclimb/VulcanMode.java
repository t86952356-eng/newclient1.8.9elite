/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.wallclimb;

import hackclient.rise.aii;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.WallClimb;

public class VulcanMode
extends Mode<WallClimb> {
    @EventLink
    public final Listener<PreMotionEvent> Tu = preMotionEvent -> {
        if (VulcanMode.aER.bgK.crR) {
            if (VulcanMode.aER.bgK.aRg % 2 == 0) {
                preMotionEvent.setOnGround(true);
                VulcanMode.aER.bgK.ue = aii.jumpMotion();
            }
            double d2 = aii.direction();
            preMotionEvent.setPosX(preMotionEvent.getPosX() - (double)(-bt.bx((float)d2) * 0.1f));
            preMotionEvent.setPosZ(preMotionEvent.getPosZ() - (double)(bt.bB((float)d2) * 0.1f));
        }
    };

    public VulcanMode(String string, WallClimb wallClimb) {
        super(string, wallClimb);
    }
}

