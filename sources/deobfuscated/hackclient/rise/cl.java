/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;

public class cl
extends am {
    public static double y;
    public static a bN;
    @EventLink
    public final Listener<PreMotionEvent> hO = preMotionEvent -> {
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

