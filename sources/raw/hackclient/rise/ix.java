/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.hf;

public final class ix
extends akg<hf> {
    private final akq uZ = new akq("Tick Velocity", this, (Number)1, (Number)1, (Number)6, (Number)1);
    @dm
    public final dk<ei> va = ei2 -> {
        if (((Boolean)((hf)this.wy()).qQ.wD()).booleanValue() && !ix.aER.bgK.cup) {
            return;
        }
        if (ix.aER.bgK.cus == 10 - ((Number)this.uZ.wD()).intValue()) {
            aii.stop();
        }
    };

    public ix(String string, hf hf2) {
        super(string, hf2);
    }
}

