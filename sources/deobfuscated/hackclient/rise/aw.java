/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.fb;
import java.util.List;
import net.minecraft.network.play.server.b;
import net.minecraft.network.play.server.c;
import net.minecraft.network.play.server.h;
import net.minecraft.util.an;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.TickEvent;

public final class aw
extends am {
    private static final String cw = "An exception occurred in your connection, so you have been routed to limbo!";
    private int cx;
    private boolean cy;
    @EventLink
    public final Listener<PacketReceiveEvent> cz = packetReceiveEvent -> {
        c c2;
        String string;
        if (packetReceiveEvent.dq() instanceof c && (string = (c2 = (c)packetReceiveEvent.dq()).DM().arq()) != null && string.contains(cw)) {
            this.cy = true;
            this.cx = 100;
            return;
        }
        if (this.cy && this.cx > 0 && (packetReceiveEvent.dq() instanceof b || packetReceiveEvent.dq() instanceof h)) {
            return;
        }
    };
    @EventLink
    public final Listener<TickEvent> cA = tickEvent -> {
        if (this.cx > 0) {
            --this.cx;
            if (this.cx == 0) {
                this.cy = false;
            }
        }
    };
    @EventLink
    public final Listener<fb> cB = fb2 -> {
        if (!this.cy) {
            return;
        }
        if (this.cx <= 0) {
            return;
        }
        List<String> list = fb2.dm();
        if (list == null || list.isEmpty()) {
            return;
        }
        an an2 = Client.a.k().rP().rX();
        this.cy = false;
        this.cx = 0;
    };

    @Override
    public void aT() {
        this.cx = 0;
        this.cy = false;
    }
}

