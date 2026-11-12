/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gq;

public final class hz
extends akg<gq> {
    @dm
    public final dk<ei> rS = ei2 -> {
        if (hz.aER.bgK.ae <= 18 && (double)bd.cY < 1.8) {
            ei2.setOnGround(false);
        }
    };

    public hz(String string, gq gq2) {
        super(string, gq2);
    }
}

