/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.potion.a;

public class vq
extends akg<tn> {
    private int hV;
    @dm(cH=0)
    public final dk<eo> aky = eo2 -> {
        double d2;
        ++this.hV;
        vq.aER.aIY.chs.ay(true);
        vq.aER.bgK.setSprinting(true);
        double d3 = d2 = vq.aER.bgK.a(a.dgw) ? 0.118 : 0.083;
        if (vq.aER.bgK.aO) {
            aii.strafe(d2 - (vq.aER.bgK.Zz <= 40 ? 0.1 : 0.0) - Math.random() * 1.0E-4);
        }
        if (aii.speed() >= d2 && !vq.aER.aIY.chq.Re()) {
            aii.moveFlying((aii.speed() - d2) * -1.0);
        }
    };
    @dm
    public final dk<fi> akz = fi2 -> {};

    public vq(String string, tn tn2) {
        super(string, tn2);
    }

    @Override
    public void onDisable() {
        vq.aER.bgK.cIt.cJK = false;
        vq.aER.bgC.dAp = 1.0f;
    }
}

