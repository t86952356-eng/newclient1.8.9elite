/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.cm;
import hackclient.rise.ff;
import hackclient.rise.fg;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;
import rise.event.impl.Render3DEvent;
import rise.module.impl.combat.KillAura;

public class cf
extends am {
    public static ConcurrentLinkedQueue<cm> hc = new ConcurrentLinkedQueue();
    @EventLink(cH=4)
    public final Listener<Render2DEvent> hd = render2DEvent -> {
        if (hc.isEmpty()) {
            return;
        }
        hc.forEach(cm::co);
    };
    @EventLink(cH=4)
    public final Listener<ff> he = ff2 -> {
        if (hc == null || hc.isEmpty()) {
            return;
        }
        for (cm cm2 : hc) {
            cm2.a(ff2.j_do(), ff2.dp());
        }
    };
    @EventLink(cH=4)
    public final Listener<Render3DEvent> hf = render3DEvent -> {
        if (hc == null || hc.isEmpty()) {
            return;
        }
        hc.forEach(cm::cp);
    };
    @EventLink(cH=4)
    public final Listener<PreUpdateEvent> hg = preUpdateEvent -> {
        KillAura killAura = Client.a.g().c(KillAura.class);
        ArrayList arrayList = killAura.isEnabled() ? killAura.oM : new ArrayList();
        hc.removeIf(cm2 -> cm2.hQ + 10 < cf.aER.bgK.aRg || !arrayList.contains(cm2.by));
        for (cm cm3 : hc) {
            cm3.cq();
        }
    };
    @EventLink
    public final Listener<fg> hh = fg2 -> hc.clear();

    public static void a(cm cm2) {
        hc.removeIf(cm3 -> cm2.getClass() == cm3.getClass() && cm2.by == cm3.by);
        hc.add(cm2);
    }
}

