/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;

public final class bd
extends am {
    public static float cY;
    @dm(cH=0)
    public final dk<ei> cZ = ei2 -> {
        double d2 = bd.aER.bgK.csi - bd.aER.bgK.gX;
        if (d2 > 0.0) {
            cY = (float)((double)cY + d2);
        }
        if (ei2.isOnGround()) {
            cY = 0.0f;
        }
    };
}

