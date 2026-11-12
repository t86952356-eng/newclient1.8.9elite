/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.lw;

public class nr
extends akg<lw> {
    private static final double Iz = 10.0;
    private final akq IA = new akq("Speed", this, (Number)1, (Number)0.1, (Number)10, (Number)0.1);
    @dm
    public final dk<ei> IB = ei2 -> {
        double d2;
        float f2 = ((Number)this.IA.wD()).floatValue();
        nr.aER.bgK.ue = d2 = (nr.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (nr.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @dm
    public final dk<eo> IC = eo2 -> {
        double d2;
        float f2 = ((Number)this.IA.wD()).floatValue();
        double d3 = Math.sqrt((double)(f2 * f2) + (d2 = nr.aER.bgK.ue) * d2);
        if (d3 > 10.0) {
            double d4 = 10.0 / d3;
            f2 = (float)((double)f2 * d4);
            d2 *= d4;
        }
        eo2.setSpeed(f2);
        nr.aER.bgK.ue = d2;
    };
    @dm
    public final dk<dz> ID = dz2 -> dz2.setSneak(false);

    public nr(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onDisable() {
        aii.stop();
    }
}

