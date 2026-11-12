/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.tn;
import net.minecraft.potion.a;

public class vz
extends akg<tn> {
    @dm
    public final dk<ei> akP = ei2 -> {
        if (vz.aER.aIY.chq.Re() && aik.ay(1)) {
            vz.aER.bgK.ue = 0.8f;
        }
    };
    @dm
    public final dk<eo> akQ = eo2 -> {
        if (!(vz.aER.bgK.ue < 0.77) || vz.aER.bgK.a(a.dgw)) {
            // empty if block
        }
    };

    public vz(String string, tn tn2) {
        super(string, tn2);
    }
}

