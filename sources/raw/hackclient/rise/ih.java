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
import hackclient.rise.ei;
import hackclient.rise.hf;

public final class ih
extends akg<hf> {
    private final akq sz = new akq("Tick", this, (Number)0, (Number)0, (Number)6, (Number)1);
    private final aki sA = new aki("Vertical", (akg<?>)this, (Boolean)false);
    private final aki sB = new aki("Horizontal", (akg<?>)this, (Boolean)false);
    @dm
    public final dk<ei> sC = ei2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !ih.aER.bgK.cup) {
            return;
        }
        if (ih.aER.bgK.cus == 9 - ((Number)this.sz.wD()).intValue()) {
            if (((Boolean)this.sB.wD()).booleanValue()) {
                if (aii.isMoving()) {
                    aii.strafe();
                } else {
                    ih.aER.bgK.uf *= -1.0;
                    ih.aER.bgK.ud *= -1.0;
                }
            }
            if (((Boolean)this.sA.wD()).booleanValue()) {
                ih.aER.bgK.ue *= -1.0;
            }
        }
    };

    public ih(String string, hf hf2) {
        super(string, hf2);
    }
}

