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
import hackclient.rise.tn;
import net.minecraft.potion.a;

public class vl
extends akg<tn> {
    @dm
    public final dk<ei> ajX = ei2 -> {
        if (vl.aER.bgK.aO) {
            vl.aER.bgK.ue = 0.0;
            aii.strafe(0.5);
            if (vl.aER.bgK.a(a.dgw)) {
                aii.strafe(0.06 * (double)(1 + vl.aER.bgK.b(a.dgw).ajf()) + 0.1);
            }
        }
    };
    @dm
    public final dk<eo> ajY = eo2 -> {
        if (vl.aER.bgK.aO) {
            eo2.setSpeed(0.61);
            if (vl.aER.bgK.a(a.dgw)) {
                aii.strafe(0.06 * (double)(1 + vl.aER.bgK.b(a.dgw).ajf()) + 0.1);
            }
        } else if (vl.aER.bgK.ue < 0.77) {
            eo2.setSpeed(0.4);
            if (vl.aER.bgK.a(a.dgw)) {
                aii.strafe(0.01 * (double)(1 + vl.aER.bgK.b(a.dgw).ajf()) + 0.1);
            }
        }
    };

    public vl(String string, tn tn2) {
        super(string, tn2);
    }
}

