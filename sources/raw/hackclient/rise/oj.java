/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.ly;
import net.minecraft.potion.a;

public class oj
extends akg<ly> {
    private int KA = 0;
    @dm
    public final dk<ei> KH = ei2 -> {
        if (oj.aER.bgK.isInWater()) {
            this.KA = 0;
            aii.strafe(0.335 - Math.random() / 1000.0);
            if (oj.aER.bgK.a(a.dgw)) {
                aii.strafe(0.033 * (double)(1 + oj.aER.bgK.b(a.dgw).ajf()) + 0.34 - Math.random() / 1000.0);
            }
            ++this.KA;
        }
        ++this.KA;
    };
    @dm
    public final dk<eo> KI = eo2 -> {
        if (oj.aER.bgK.isInWater() && this.KA < 10) {
            oj.aER.bgK.ue = 0.01 - Math.random() / 1000.0;
            ++this.KA;
        }
    };

    public oj(String string, ly ly2) {
        super(string, ly2);
    }
}

