/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aho;
import hackclient.rise.am;
import hackclient.rise.bn;
import hackclient.rise.bp;
import hackclient.rise.br;
import hackclient.rise.dh;
import hackclient.rise.fg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.a;
import net.minecraft.network.play.client.ab;
import net.minecraft.network.play.client.ac;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.l;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.p;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.client.y;
import net.minecraft.network.play.client.z;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.bl;
import net.minecraft.network.play.server.t;
import net.minecraft.network.play.server.u;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.x;
import net.minecraft.util.cw;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PostMotionEvent;

public final class bm
extends am {
    public static ConcurrentLinkedQueue<aho> cQ = new ConcurrentLinkedQueue();
    static rip.vantage.commons.util.time.a dP = new rip.vantage.commons.util.time.a();
    public static boolean enabled;
    static long dQ;
    private static final Object dR;
    private static final Map<String, bp> dS;
    private static final long dT = 100L;
    private static final AtomicLong dU;
    static cw<Class[], Boolean> dV;
    static cw<Class[], Boolean> dW;
    static cw<Class[], Boolean> dX;
    static cw<Class[], Boolean> dY;
    static cw<Class[], Boolean> dZ;
    static cw<Class[], Boolean> ea;
    static cw<Class[], Boolean> eb;
    public static cw<Class[], Boolean>[] ec;
    @EventLink
    public final Listener<PacketSendEvent> ed = packetSendEvent -> packetSendEvent.setCancelled(this.a(packetSendEvent.dq(), (dh)packetSendEvent).isCancelled());
    @EventLink
    public final Listener<PacketReceiveEvent> ee = packetReceiveEvent -> packetReceiveEvent.setCancelled(this.a(packetReceiveEvent.dq(), (dh)packetReceiveEvent).isCancelled());
    @EventLink
    public final Listener<fg> ef = fg2 -> bm.bl();
    @EventLink
    public final Listener<PostMotionEvent> eg = postMotionEvent -> {
        if (bm.aER.bgR instanceof net.minecraft.client.gui.r) {
            bm.bl();
            return;
        }
        long l2 = System.currentTimeMillis();
        Object object = dR;
        synchronized (object) {
            bm.b(l2);
        }
        bm.bk();
        bm.a(l2);
        object = dR;
        synchronized (object) {
            dS.values().forEach(bp::br);
            bm.bm();
        }
    };

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dh a(aj<?> aj2, dh dh2) {
        boolean bl2;
        if (dh2.isCancelled() || !enabled) {
            return dh2;
        }
        Object object = dR;
        synchronized (object) {
            Set set = dS.values().stream().filter(bp::bd).filter(bp2 -> bp2.d(aj2)).collect(Collectors.toCollection(HashSet::new));
            Set set2 = set.stream().map(bp2 -> bp2.ek).collect(Collectors.toCollection(HashSet::new));
            boolean bl3 = bl2 = !set2.isEmpty();
            if (bl2) {
                set.forEach(bp::bq);
                cQ.add(new br(aj2, set2));
            }
        }
        if (bl2) {
            dh2.cF();
        }
        return dh2;
    }

    public static void dispatch() {
        bm.e(bm.bn());
    }

    public static void bf() {
        bm.f(bm.bn());
    }

    public static int bg() {
        return bm.g(bm.bn());
    }

    public static boolean bh() {
        return bm.bg() > 0;
    }

    public static void d(int n2) {
        bm.a(bm.bn(), n2);
    }

    public static void bi() {
        bm.e(1);
    }

    public static void e(int n2) {
        bm.b(bm.bn(), n2);
    }

    public static void f(int n2) {
        bm.e(n2);
    }

    public static void bj() {
        bm.bi();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void e(String string) {
        bn bn2;
        Object object = dR;
        synchronized (object) {
            bp bp2 = dS.get(string);
            bn2 = bp2 == null ? null : bp2.bp();
        }
        if (bn2 != null) {
            bm.a(bn2, Integer.MAX_VALUE);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void disable() {
        bn bn2;
        Object object = dR;
        synchronized (object) {
            bp bp2 = dS.get(bm.bn());
            bn2 = bp2 == null ? null : bp2.bp();
            bm.bm();
        }
        if (bn2 != null) {
            bm.a(bn2, Integer.MAX_VALUE);
        }
        object = dR;
        synchronized (object) {
            bm.bm();
        }
        dP.i(bm.dP.aGS - 999999999L);
    }

    public static void a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        bm.a(n2, bl2, bl3, bl4, bl5, false, false, false);
    }

    public static void a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        bm.a(n2, bl2, bl3, bl4, bl5, bl6, false, false);
    }

    public static void a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        bm.a(n2, bl2, bl3, bl4, bl5, bl6, bl7, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        dP.aX();
        Object object = dR;
        synchronized (object) {
            bp bp2 = dS.computeIfAbsent(bm.bn(), bp::new);
            bp2.a(n2, bl2, bl3, bl4, bl5, bl6, bl7, bl8);
            bm.bm();
        }
        dV.k(bl2);
        dW.k(bl3);
        dX.k(bl4);
        dY.k(bl5);
        dZ.k(bl6);
        ea.k(bl7);
        eb.k(bl8);
        dQ = n2;
    }

    public static void blink() {
        bm.a(9999999, true, false, false, false, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void f(String string) {
        bn bn2;
        Object object = dR;
        synchronized (object) {
            bp bp2 = dS.get(string);
            bn bn3 = bn2 = bp2 == null ? null : bp2.bp();
            if (bp2 != null) {
                bp2.bo();
            }
            bm.bm();
        }
        if (bn2 != null) {
            bm.a(bn2, Integer.MAX_VALUE);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static int g(String string) {
        Object object = dR;
        synchronized (object) {
            bp bp2 = dS.get(string);
            if (bp2 == null || bp2.ek == null) {
                return 0;
            }
            int n2 = 0;
            for (aho aho2 : cQ) {
                if (!(aho2 instanceof br) || !((br)aho2).b(bp2.ek)) continue;
                ++n2;
            }
            return n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(String string, int n2) {
        bn bn2;
        Object object = dR;
        synchronized (object) {
            bp bp2 = dS.get(string);
            bn2 = bp2 == null ? null : bp2.ek;
        }
        if (bn2 != null) {
            bm.b(bn2, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void b(String string, int n2) {
        int n3;
        bn bn2;
        if (n2 <= 0) {
            return;
        }
        Object object = dR;
        synchronized (object) {
            bp bp2 = dS.get(string);
            if (bp2 == null || bp2.ek == null) {
                return;
            }
            bp2.br();
            bn2 = bp2.ek;
            n3 = bp2.g(n2);
        }
        if (n3 > 0) {
            bm.b(bn2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(bn bn2, int n2) {
        ArrayList arrayList = new ArrayList();
        Object object = dR;
        synchronized (object) {
            bn2.dj = false;
            int n3 = 0;
            Iterator<aho> iterator = cQ.iterator();
            while (iterator.hasNext() && n3 < n2) {
                aho aho2 = iterator.next();
                if (!(aho2 instanceof br)) continue;
                br br2 = (br)aho2;
                if (br2.bt()) break;
                ++n3;
                iterator.remove();
                arrayList.add(br2.dq());
            }
            bm.bm();
        }
        bm.a(arrayList);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void b(bn bn2, int n2) {
        ArrayList arrayList = new ArrayList();
        Object object = dR;
        synchronized (object) {
            int n3 = 0;
            Iterator<aho> iterator = cQ.iterator();
            while (iterator.hasNext() && n3 < n2) {
                aho aho2 = iterator.next();
                if (!(aho2 instanceof br)) continue;
                br br2 = (br)aho2;
                if (!br2.b(bn2)) break;
                br2.a(bn2);
                ++n3;
                if (br2.bt()) break;
                iterator.remove();
                arrayList.add(br2.dq());
            }
            bm.bm();
        }
        bm.a(arrayList);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void bk() {
        ArrayList arrayList = new ArrayList();
        Object object = dR;
        synchronized (object) {
            bm.a(arrayList, Integer.MAX_VALUE);
            bm.bm();
        }
        bm.a(arrayList);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void bl() {
        ArrayList arrayList = new ArrayList();
        Object object = dR;
        synchronized (object) {
            for (aho aho2 : cQ) {
                arrayList.add(aho2.dq());
            }
            cQ.clear();
            dS.values().forEach(bp::bp);
            bm.bm();
        }
        bm.a(arrayList);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(long l2) {
        ArrayList arrayList = new ArrayList();
        Object object = dR;
        synchronized (object) {
            Iterator<aho> iterator = cQ.iterator();
            while (iterator.hasNext()) {
                aho aho2 = iterator.next();
                if (!(aho2 instanceof br)) {
                    if (aho2.getTime() + dQ >= l2) break;
                    iterator.remove();
                    arrayList.add(aho2.dq());
                    continue;
                }
                br br2 = (br)aho2;
                br2.c(l2);
                if (br2.bt()) break;
                iterator.remove();
                arrayList.add(br2.dq());
            }
        }
        bm.a(arrayList);
    }

    private static void a(List<aj<?>> list, int n2) {
        aho aho2;
        Iterator<aho> iterator = cQ.iterator();
        for (int i2 = 0; !(!iterator.hasNext() || i2 >= n2 || (aho2 = iterator.next()) instanceof br && ((br)aho2).bt()); ++i2) {
            iterator.remove();
            list.add(aho2.dq());
        }
    }

    private static void a(List<aj<?>> list) {
        if (list.isEmpty()) {
            return;
        }
        boolean bl2 = enabled;
        enabled = false;
        list.forEach(ahn::o);
        enabled = bl2;
    }

    private static void b(long l2) {
        if (bm.aER.bgR instanceof net.minecraft.client.gui.r) {
            dS.values().forEach(bp::bp);
            bm.bm();
            return;
        }
        dS.values().stream().filter(bp2 -> bp2.bd() && l2 - bp2.el > 100L).forEach(bp::bp);
        bm.bm();
    }

    private static void bm() {
        enabled = dS.values().stream().anyMatch(bp::bd);
    }

    private static String bn() {
        String string = bm.class.getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String string2 = stackTraceElement.getClassName();
            if (string2.equals(string) || string2.equals(Thread.class.getName())) continue;
            return string2;
        }
        return string;
    }

    static {
        dR = new Object();
        dS = new LinkedHashMap<String, bp>();
        dU = new AtomicLong();
        dV = new cw<Class[], Boolean>(new Class[]{s.class, a.class, ad.class}, false);
        dW = new cw<Class[], Boolean>(new Class[]{t.class, ar.class}, false);
        dX = new cw<Class[], Boolean>(new Class[]{net.minecraft.network.play.server.i.class, bl.class, net.minecraft.network.play.server.k.class}, false);
        dY = new cw<Class[], Boolean>(new Class[]{u.class, v.class, x.class, net.minecraft.network.play.server.w.class, net.minecraft.network.play.server.y.class, net.minecraft.network.play.server.z.class, ah.class, aa.class}, false);
        dZ = new cw<Class[], Boolean>(new Class[]{c.class, q.class, r.class, p.class, n.class, k.class, i.class, l.class, w.class, y.class, z.class, ab.class, ac.class, net.minecraft.network.play.client.ad.class, e.class, f.class, g.class, h.class, m.class}, false);
        ea = new cw<Class[], Boolean>(new Class[]{e.class, f.class, g.class, h.class, m.class}, false);
        eb = new cw<Class[], Boolean>(new Class[]{c.class, q.class, r.class, n.class, k.class, i.class, w.class, y.class, ab.class, ac.class, net.minecraft.network.play.client.ad.class, e.class, f.class, g.class, h.class, m.class}, false);
        ec = new cw[]{dV, dW, dX, dY, dZ, ea, eb};
    }
}

