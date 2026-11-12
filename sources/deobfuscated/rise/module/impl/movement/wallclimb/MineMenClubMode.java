/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.wallclimb;

import hackclient.rise.aii;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.WallClimb;

public class MineMenClubMode
extends Mode<WallClimb> {
    private boolean Tr;
    @EventLink
    public final Listener<PreMotionEvent> Ts = preMotionEvent -> {
        if (MineMenClubMode.aER.bgK.crR && !this.Tr && MineMenClubMode.aER.bgK.aRg % 3 == 0) {
            MineMenClubMode.aER.bgK.ue = aii.jumpMotion();
        }
        if (MineMenClubMode.aER.bgK.crW) {
            this.Tr = !MineMenClubMode.aER.bgK.aO;
        }
    };

    public MineMenClubMode(String string, WallClimb wallClimb) {
        super(string, wallClimb);
    }
}

