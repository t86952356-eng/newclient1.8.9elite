/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.am;
import hackclient.rise.fa;
import hackclient.rise.fg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.handshake.client.a;
import net.minecraft.network.play.client.e;
import net.minecraft.network.status.client.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;

public final class bc
extends am {
    private static boolean cP = true;
    public static final ConcurrentLinkedQueue<aj<?>> cQ = new ConcurrentLinkedQueue();
    public static boolean cR;
    public static boolean cS;
    public static ArrayList<Class<?>> cT;
    public static rip.vantage.commons.util.time.a cU;
    @EventLink(cH=0)
    public final Listener<PacketSendEvent> cV = packetSendEvent -> {
        if (bc.aER.bgK == null) {
            cQ.clear();
            cT.clear();
            return;
        }
        if (bc.aER.bgK.aRg < 10 && cP) {
            Client.a.p().tC();
            cP = false;
        }
        if (bc.aER.bgK.csb || aER.isSingleplayer() || !bc.aER.AU().bEQ) {
            cQ.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
            cQ.clear();
            cR = false;
            cT.clear();
            if (bc.aER.bgK.aRg < 10 && cP) {
                Client.a.p().tC();
                cP = false;
            }
            return;
        }
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof a || aj2 instanceof net.minecraft.network.login.client.a || aj2 instanceof net.minecraft.network.status.client.a || aj2 instanceof b || aj2 instanceof net.minecraft.network.login.client.b) {
            return;
        }
        if (cR && !cS) {
            if (cU.T(100L)) {
                cU.aX();
                cT.clear();
            }
            if (!packetSendEvent.isCancelled() && cT.stream().noneMatch(clazz -> clazz == aj2.getClass())) {
                cQ.add(aj2);
                packetSendEvent.cF();
            }
        } else if (aj2 instanceof e) {
            cQ.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
            cQ.clear();
            cS = false;
        }
    };
    @EventLink(cH=0)
    public final Listener<fg> cW = fg2 -> {
        cQ.clear();
        cR = false;
    };
    @EventLink(cH=0)
    public final Listener<fa> cX = fa2 -> {
        afl.b("s", new Object[0]);
        cQ.clear();
        cR = false;
    };

    public static void a(Class<?> ... classArray) {
        cT = new ArrayList(Arrays.asList(classArray));
        cU.aX();
    }

    public static void dispatch() {
        cS = true;
    }

    static {
        cT = new ArrayList();
        cU = new rip.vantage.commons.util.time.a();
    }
}

