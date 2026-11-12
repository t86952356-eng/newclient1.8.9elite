/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.am;
import hackclient.rise.cm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.ff;
import hackclient.rise.fg;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.go;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class cf
extends am {
    public static ConcurrentLinkedQueue<cm> hc = new ConcurrentLinkedQueue();
    @dm(cH=4)
    public final dk<fs> hd = fs2 -> {
        if (hc.isEmpty()) {
            return;
        }
        hc.forEach(cm::co);
    };
    @dm(cH=4)
    public final dk<ff> he = ff2 -> {
        if (hc == null || hc.isEmpty()) {
            return;
        }
        for (cm cm2 : hc) {
            cm2.a(ff2.do(), ff2.dp());
        }
    };
    @dm(cH=4)
    public final dk<ft> hf = ft2 -> {
        if (hc == null || hc.isEmpty()) {
            return;
        }
        hc.forEach(cm::cp);
    };
    @dm(cH=4)
    public final dk<ej> hg = ej2 -> {
        go go2 = a.a.g().c(go.class);
        ArrayList arrayList = go2.isEnabled() ? go2.oM : new ArrayList();
        hc.removeIf(cm2 -> cm2.hQ + 10 < cf.aER.bgK.aRg || !arrayList.contains(cm2.by));
        for (cm cm3 : hc) {
            cm3.cq();
        }
    };
    @dm
    public final dk<fg> hh = fg2 -> hc.clear();

    public static void a(cm cm2) {
        hc.removeIf(cm3 -> cm2.getClass() == cm3.getClass() && cm2.by == cm3.by);
        hc.add(cm2);
    }
}

