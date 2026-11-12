/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.lk;
import net.minecraft.entity.r;

public final class lq
extends akg<lk> {
    private r jE;
    @dm
    public final dk<ei> Cy = ei2 -> {
        if (this.jE != null && this.jE.cus == 9) {
            ei2.setSprinting(false);
        }
    };
    @dm
    public final dk<eq> Cz = eq2 -> {
        this.jE = eq2.dc();
    };

    public lq(String string, lk lk2) {
        super(string, lk2);
    }
}

