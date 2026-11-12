/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akd;
import hackclient.rise.am;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;

public class ao
extends am {
    @EventLink(cH=0)
    public final Listener<PacketSendEvent> bC = packetSendEvent -> {
        if (aER == null || ao.aER.bgF == null || packetSendEvent.isCancelled()) {
            return;
        }
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof k && !((k)aj2).yl().h(new akd(-1.0, -1.0, -1.0))) {
            ao.aER.bgK.cst = 0;
        }
    };
    @EventLink(cH=0)
    public final Listener<AttackEvent> bD = attackEvent -> {
        ao.aER.bgK.aY = 0;
    };
    @EventLink(cH=0)
    public final Listener<PacketReceiveEvent> bE = packetReceiveEvent -> {
        if (aER == null || ao.aER.bgF == null || packetReceiveEvent.isCancelled()) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t) {
            t t2 = (t)aj2;
            c c2 = ao.aER.bgF.cn(t2.getEntityID());
            if (c2 == null) {
                return;
            }
            c2.csu = (double)t2.dcR / 8000.0;
            c2.csv = (double)t2.dcS / 8000.0;
            c2.csw = (double)t2.dcT / 8000.0;
            c2.ae = 0;
            if ((double)t2.dcS / 8000.0 > 0.1 && Math.hypot((double)t2.dcT / 8000.0, (double)t2.dcR / 8000.0) > 0.2) {
                c2.css = 0;
            }
        } else if (aj2 instanceof i) {
            ao.aER.bgK.Zz = 0;
        }
    };
}

