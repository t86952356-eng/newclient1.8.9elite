/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ua;

public class uy
extends akg<ua> {
    @dm
    public final dk<ei> ajB = ei2 -> {
        float f2 = bd.cY;
        if (bd.cY > 3.0f) {
            ei2.setOnGround(true);
            uy.aER.bgK.aO = true;
            uy.aER.bgK.ue = -0.09800000190735147;
            bd.cY = 0.0f;
        }
    };

    public uy(String string, ua ua2) {
        super(string, ua2);
    }
}

