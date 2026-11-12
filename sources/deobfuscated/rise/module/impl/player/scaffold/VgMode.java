/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.scaffold;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.bu;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.player.Scaffold;

public class VgMode
extends Mode<Scaffold> {
    @EventLink
    public final Listener<PreMotionEvent> ajR = preMotionEvent -> {
        if (VgMode.aER.bgK.aO) {
            // empty if block
        }
    };
    @EventLink(cH=1)
    public final Listener<PreUpdateEvent> ajS = preUpdateEvent -> {
        boolean bl2 = VgMode.aER.bgK.aI == ((Scaffold)this.wy()).Ms;
        this.d(bu.class);
        if (bu.bO() != null && VgMode.aER.bgK.gX > ((Scaffold)this.wy()).Ms && VgMode.aER.bgK.gX + aii.predictedMotion(VgMode.aER.bgK.ue, 3) < ((Scaffold)this.wy()).Ms + 1.0) {
            this.d(bu.class);
            bu.setSlot(ain.vM());
            this.d(bu.class);
            if (bu.bO().cXa > 0) {
                aER.AO();
            }
        }
        if (!bl2 && VgMode.aER.bgK.aO) {
            VgMode.aER.bgK.jump();
            aii.strafe();
        }
        if (VgMode.aER.bgK.tR == 4 && !VgMode.aER.aIY.chq.Re()) {
            VgMode.aER.bgK.ue -= -0.09800000190735147;
        }
        if (VgMode.aER.bgK.tR == 1 && !VgMode.aER.aIY.chq.Re()) {
            aii.strafe();
        }
        if (aik.p(0.0, VgMode.aER.bgK.ue, 0.0) != Blocks.cLc && VgMode.aER.bgK.tR > 2) {
            aii.strafe();
        }
        VgMode.aER.bgK.bkD = aii.isMoving();
    };

    public VgMode(String string, Scaffold scaffold) {
        super(string, scaffold);
    }

    @Override
    public void onEnable() {
        if (!(aik.o(VgMode.aER.bgK.gW, VgMode.aER.bgK.aI - 2.0, VgMode.aER.bgK.gX) instanceof BlockAir)) {
            ((Scaffold)this.wy()).Ms = VgMode.aER.bgK.aI - 1.0;
        }
    }

    @Override
    public void onDisable() {
        if (!(aik.o(VgMode.aER.bgK.gW, VgMode.aER.bgK.aI - 2.0, VgMode.aER.bgK.gX) instanceof BlockAir)) {
            ((Scaffold)this.wy()).Ms = VgMode.aER.bgK.aI - 1.0;
        }
    }
}

