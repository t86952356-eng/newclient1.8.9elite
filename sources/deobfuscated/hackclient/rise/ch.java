/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahd;
import hackclient.rise.aiw;
import hackclient.rise.am;
import java.util.concurrent.ConcurrentLinkedQueue;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;

public class ch
extends am
implements ahd {
    public static ConcurrentLinkedQueue<aiw> hu = new ConcurrentLinkedQueue();
    public static int hv;
    public static int hw;
    @EventLink(cH=4)
    public final Listener<Render2DEvent> hx = render2DEvent -> {
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

