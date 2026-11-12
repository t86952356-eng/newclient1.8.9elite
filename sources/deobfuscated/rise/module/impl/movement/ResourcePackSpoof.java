/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.ad;
import net.minecraft.network.play.client.ae;
import net.minecraft.network.play.server.ce;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"Resource Pack Spoof"}, description="Allows you to pretend you loaded a resource pack a server requested", category=Category.MOVEMENT)
public final class ResourcePackSpoof
extends Module {
    @EventLink
    public final Listener<PacketReceiveEvent> VX = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof ce) {
            ce ce2 = (ce)aj2;
            packetReceiveEvent.cF();
            ahn.m(new ad(ce2.getHash(), ae.dbW));
            afl.b("Spoofed resource pack from " + ce2.getURL(), new Object[0]);
        }
    };
}

