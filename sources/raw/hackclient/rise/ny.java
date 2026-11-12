/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aic;
import hackclient.rise.aid;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.lw;

public class ny
extends akg<lw> {
    private final akq Jx = new akq("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @dm
    public final dk<eo> Jy = eo2 -> {
        float f2 = ((Number)this.Jx.wD()).floatValue();
        eo2.setSpeed(f2);
    };
    @dm
    public final dk<ei> Jz = ei2 -> {
        float f2 = ((Number)this.Jx.wD()).floatValue();
        ny.aER.bgK.ue = 0.0 + (ny.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (ny.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @dm
    public final dk<dz> JA = dz2 -> dz2.setSneak(false);

    public ny(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        aic.a(aid.aOJ, 3.42f, 1, false, false);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

