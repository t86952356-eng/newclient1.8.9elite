/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.am;
import hackclient.rise.bc;
import hackclient.rise.fg;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;

public class bj
extends am {
    public static final ConcurrentLinkedQueue<aj<?>> dA = new ConcurrentLinkedQueue();
    public static boolean cR;
    @EventLink(cH=1)
    public final Listener<PacketSendEvent> dB = packetSendEvent -> {
        if (bj.aER.bgK == null) {
            cR = false;
            dA.clear();
            return;
        }
        if (bj.aER.bgK.csb || aER.isSingleplayer() || bc.cR) {
            dA.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
            dA.clear();
            cR = false;
            return;
        }
        if (packetSendEvent.isCancelled()) {
            return;
        }
        aj<?> aj2 = packetSendEvent.dq();
        if (cR) {
            if (aj2 instanceof e) {
                dA.add(aj2);
                packetSendEvent.cF();
            }
        } else if (aj2 instanceof e) {
            dA.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
            dA.clear();
        }
    };
    @EventLink
    public final Listener<fg> dC = fg2 -> {
        cR = false;
        dA.clear();
    };

    public static void bc() {
        dA.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::n));
        dA.clear();
        cR = false;
    }
}

