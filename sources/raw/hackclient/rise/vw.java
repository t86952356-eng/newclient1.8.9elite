/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.tn;

public class vw
extends akg<tn> {
    @dm
    public final dk<ei> akL = ei2 -> {
        if (vw.aER.aIY.chq.Re() && aik.a(2.0, false) && vw.aER.bgK.ue < 0.2 && !aii.isMoving()) {
            vw.aER.bgK.ue = 0.42f;
            ei2.setOnGround(true);
        }
    };

    public vw(String string, tn tn2) {
        super(string, tn2);
    }
}

