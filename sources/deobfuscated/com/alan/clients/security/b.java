/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.security;

import com.alan.clients.security.a;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.network.aj;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.impl.player.AntiCrash;

public final class b
extends ArrayList<a> {
    private AntiCrash axO;
    @EventLink
    public final Listener<PacketReceiveEvent> axP = packetReceiveEvent -> packetReceiveEvent.setCancelled(this.l(packetReceiveEvent.dq()));

    public void init() {
        Client.a.e().b(this);
        this.axO = Client.a.g().c(AntiCrash.class);
        if (this.axO == null) {
            return;
        }
    }

    public boolean l(aj<?> aj2) {
        return this.axO != null && this.axO.isEnabled() && !Minecraft.getMinecraft().isSingleplayer() && this.stream().anyMatch(a2 -> a2.k(aj2));
    }
}

