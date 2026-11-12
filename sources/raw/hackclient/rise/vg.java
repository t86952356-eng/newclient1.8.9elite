/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.akg;
import hackclient.rise.bu;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.tn;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;

public class vg
extends akg<tn> {
    @dm
    public final dk<ei> ajR = ei2 -> {
        if (vg.aER.bgK.aO) {
            // empty if block
        }
    };
    @dm(cH=1)
    public final dk<ej> ajS = ej2 -> {
        boolean bl2 = vg.aER.bgK.aI == ((tn)this.wy()).Ms;
        this.d(bu.class);
        if (bu.bO() != null && vg.aER.bgK.gX > ((tn)this.wy()).Ms && vg.aER.bgK.gX + aii.predictedMotion(vg.aER.bgK.ue, 3) < ((tn)this.wy()).Ms + 1.0) {
            this.d(bu.class);
            bu.setSlot(ain.vM());
            this.d(bu.class);
            if (bu.bO().cXa > 0) {
                aER.AO();
            }
        }
        if (!bl2 && vg.aER.bgK.aO) {
            vg.aER.bgK.jump();
            aii.strafe();
        }
        if (vg.aER.bgK.tR == 4 && !vg.aER.aIY.chq.Re()) {
            vg.aER.bgK.ue -= -0.09800000190735147;
        }
        if (vg.aER.bgK.tR == 1 && !vg.aER.aIY.chq.Re()) {
            aii.strafe();
        }
        if (aik.p(0.0, vg.aER.bgK.ue, 0.0) != Blocks.cLc && vg.aER.bgK.tR > 2) {
            aii.strafe();
        }
        vg.aER.bgK.bkD = aii.isMoving();
    };

    public vg(String string, tn tn2) {
        super(string, tn2);
    }

    @Override
    public void onEnable() {
        if (!(aik.o(vg.aER.bgK.gW, vg.aER.bgK.aI - 2.0, vg.aER.bgK.gX) instanceof BlockAir)) {
            ((tn)this.wy()).Ms = vg.aER.bgK.aI - 1.0;
        }
    }

    @Override
    public void onDisable() {
        if (!(aik.o(vg.aER.bgK.gW, vg.aER.bgK.aI - 2.0, vg.aER.bgK.gX) instanceof BlockAir)) {
            ((tn)this.wy()).Ms = vg.aER.bgK.aI - 1.0;
        }
    }
}

