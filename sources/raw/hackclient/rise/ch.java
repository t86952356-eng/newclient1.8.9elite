/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahd;
import hackclient.rise.aiw;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ch
extends am
implements ahd {
    public static ConcurrentLinkedQueue<aiw> hu = new ConcurrentLinkedQueue();
    public static int hv;
    public static int hw;
    @dm(cH=4)
    public final dk<fs> hx = fs2 -> {
        if (!hu.isEmpty()) {
            // empty if block
        }
    };

    public static void ci() {
        hu.forEach(aiw::ci);
        hw = ch.aER.bha.bnU;
    }

    public static void cj() {
        hv = ch.aER.bha.bnU;
        hu.forEach(aiw2 -> {
            aiw2.cj();
            if (aiw2.hj.aKM() > 3000L) {
                hu.remove(aiw2);
            }
        });
        if (hu.isEmpty()) {
            return;
        }
        aNC.execute(() -> hu.forEach(aiw::jA));
    }

    public static void a(aiw aiw2) {
        hu.add(aiw2);
    }
}

