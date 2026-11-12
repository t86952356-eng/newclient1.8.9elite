/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fc;
import hackclient.rise.mj;

public class qw
extends akg<mj> {
    private final akq Sx = new akq("Height", this, (Number)1, (Number)1, (Number)10, (Number)0.1);
    private final aki Sy = new aki("Reverse", (akg<?>)this, (Boolean)false);
    private final akq Sz = new akq("Timer", this, (Number)0.5, (Number)0.1, (Number)1, (Number)0.1);
    @dm
    public final dk<ei> SA = ei2 -> {
        qw.aER.bgK.cso = ((Number)this.Sx.wD()).floatValue();
        if (!((Boolean)this.Sy.wD()).booleanValue() || !aik.ad(((Number)this.Sx.wD()).floatValue() + qw.aER.bgK.getEyeHeight()) || aik.vy()) {
            return;
        }
        if (qw.aER.bgK.gX < qw.aER.bgK.aI && !qw.aER.bgK.aO && qw.aER.bgK.tR <= 1) {
            qw.aER.bgK.ue = -((Number)this.Sx.wD()).doubleValue();
        }
        if (qw.aER.bgK.tR == 1 && qw.aER.bgK.gX < qw.aER.bgK.crK) {
            qw.aER.bgC.dAp = ((Number)this.Sz.wD()).floatValue();
        }
    };
    @dm
    public final dk<fc> SB = fc2 -> {
        if (fc2.da() > 0.6) {
            qw.aER.bgC.dAp = ((Number)this.Sz.wD()).floatValue();
        }
    };

    public qw(String string, mj mj2) {
        super(string, mj2);
    }

    @Override
    public void onDisable() {
        qw.aER.bgK.cso = 0.6f;
    }
}

