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

public class lp
extends akg<lk> {
    private boolean Cu;
    private boolean Cv;
    @dm
    public final dk<eq> Cw = eq2 -> {
        boolean bl2 = this.Cv = Math.random() * 100.0 < ((Number)((lk)this.wy()).Ce.wD()).doubleValue() && eq2.dc().cus >= 6;
        if (!this.Cv || this.Cu) {
            return;
        }
        if (lp.aER.bgK.isSprinting() || lp.aER.aIY.chs.Re()) {
            lp.aER.aIY.chs.ay(true);
            this.Cu = true;
        }
    };
    @dm
    public final dk<ei> Cx = ei2 -> {
        if (!this.Cv) {
            return;
        }
        if (this.Cu && Math.random() * 100.0 < ((Number)((lk)this.wy()).Ce.wD()).doubleValue()) {
            lp.aER.aIY.chs.ay(false);
            this.Cu = false;
        }
    };

    public lp(String string, lk lk2) {
        super(string, lk2);
    }
}

