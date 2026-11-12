/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.lw;

public class nj
extends akg<lw> {
    private static final double HD = 10.0;
    @dm
    public final dk<ei> HE = ei2 -> {
        bm.a(25000, true, false, false, false);
        if (aii.speed() < 0.2) {
            aii.strafe(0.2);
        }
        aii.useDiagonalSpeed();
        nj.aER.bgK.ue = nj.aER.bgK.aRg % 3 == 0 ? -0.15 : -0.09701;
    };
    @dm
    public final dk<eo> HF = eo2 -> {};
    @dm
    public final dk<dz> HG = dz2 -> dz2.setSneak(false);

    public nj(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

