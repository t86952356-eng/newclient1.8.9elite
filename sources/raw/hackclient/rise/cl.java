/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import rip.vantage.commons.util.time.a;

public class cl
extends am {
    public static double y;
    public static a bN;
    @dm
    public final dk<ei> hO = ei2 -> {
        if (bN.T(80L)) {
            return;
        }
        cl.aER.bgK.cIc = 0.0f;
        cl.aER.bgK.cuC = 0.0f;
    };

    public static void setY(double d2) {
        bN.aX();
        y = d2;
    }

    public static void cn() {
        if (bN.T(80L)) {
            y = cl.aER.bgK.csi;
        }
        bN.aX();
    }

    static {
        bN = new a();
    }
}

