/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import hackclient.rise.ez;
import hackclient.rise.go;
import hackclient.rise.mh;
import hackclient.rise.mo;
import hackclient.rise.tn;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.potion.a;

public final class re
extends akg<mo> {
    private int SS;
    private int ST;
    @dm
    public final dk<eo> To = eo2 -> {
        if (aik.o(re.aER.bgK.gW, re.aER.bgK.gX - 0.5, re.aER.bgK.gY) instanceof BlockSlab && re.aER.bgK.gX == Math.floor(re.aER.bgK.gX) + 0.5 && !this.e(tn.class).isEnabled() && !this.e(mh.class).isEnabled() && this.e(go.class).jE == null && !re.aER.aIY.cho.Re()) {
            if (re.aER.bgK.a(a.dgw)) {
                double[] dArray = new double[]{0.276, 0.309, 0.349, 0.3967};
            }
            this.ST = 0;
        } else {
            ++this.ST;
            if (this.ST == 1) {
                eo2.setFriction(eo2.getFriction() * 0.9f);
            }
        }
        if (aik.o(re.aER.bgK.gW, re.aER.bgK.gX - 0.5, re.aER.bgK.gY) instanceof BlockStairs && !this.e(tn.class).isEnabled() && !this.e(mh.class).isEnabled() && this.e(go.class).jE == null && re.aER.aIY.chm.Re()) {
            if (re.aER.bgK.gX == Math.floor(re.aER.bgK.gX) + 0.5 || this.SS == 0) {
                eo2.setFriction((float)((double)eo2.getFriction() * 3.98));
                this.SS = 0;
            }
        } else {
            ++this.SS;
            if (this.SS == 1) {
                aii.stop();
            }
        }
    };
    @dm
    public final dk<ez> Tp = ez2 -> {
        if (this.SS < 2) {
            ez2.setPosY(-0.0784);
            re.aER.aIY.chq.ay(false);
        }
    };

    public re(String string, mo mo2) {
        super(string, mo2);
    }
}

