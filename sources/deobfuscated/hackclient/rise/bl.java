/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aij;
import hackclient.rise.am;
import hackclient.rise.bi;
import hackclient.rise.cg;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;

public final class bl
extends am {
    private static long dH = 250L;
    private static final Executor dI = Executors.newFixedThreadPool(1);
    private static final a dJ = new a();
    private static final a dK = new a();
    private static final long dL = 120000L;
    private static final long dM = 10000L;
    private static final long dN = 250L;
    @EventLink
    public final Listener<PreMotionEvent> dO = preMotionEvent -> {
        if (dJ.T(10000L) && !dK.T(120000L)) {
            bl.a(false);
            dJ.aX();
        }
    };

    public static long getPing() {
        if (dK.T(120000L)) {
            bl.a(true);
            dK.aX();
            return 250L;
        }
        dK.aX();
        return dH;
    }

    private static void a(boolean bl2) {
        if (aER.Bf()) {
            dH = 0L;
            return;
        }
        dI.execute(() -> {
            dJ.aX();
            if (bl2) {
                cg.a("Ping", "Please wait whilst Rise analyses your ping.", 7000);
            }
            aij aij2 = new aij(bi.dx);
            dH = aij2.vu();
            if (bl2) {
                cg.a("Success", "Successfully analysed ping, your features are ready to use.", 7000);
            }
        });
    }
}

