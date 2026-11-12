/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tn;

public class vs
extends akg<tn> {
    @dm
    public final dk<ei> akF = ei2 -> {
        if (vs.aER.aIY.chq.Re() && vs.aER.bgK.aRg % 2 == 0 && aik.ay(2)) {
            vs.aER.bgK.ue = 0.42f;
            ei2.setOnGround(true);
        }
    };

    public vs(String string, tn tn2) {
        super(string, tn2);
    }
}

