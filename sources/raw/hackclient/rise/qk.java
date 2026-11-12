/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.eo;
import hackclient.rise.mh;

public final class qk
extends akg<mh> {
    private final aki QK = new aki("Hurt Boost", (akg<?>)this, (Boolean)false);
    private final akq QL = new akq("Boost Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    @dm
    public final dk<eo> QM = eo2 -> {
        if (!aii.isMoving()) {
            aii.stop();
            return;
        }
        if (qk.aER.bgK.aO) {
            qk.aER.bgK.jump();
        }
        if (((Boolean)this.QK.wD()).booleanValue() && qk.aER.bgK.cus == 9) {
            aii.strafe(((Number)this.QL.wD()).doubleValue());
        }
        aii.strafe();
    };
    @dm
    public final dk<dz> QN = dz2 -> dz2.setJump(false);

    public qk(String string, mh mh2) {
        super(string, mh2);
    }
}

