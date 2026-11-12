/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.afl;
import hackclient.rise.aks;
import hackclient.rise.cg;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.c;
import net.minecraft.util.ba;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.other.hypixelautoplay.name"}, description="module.other.hypixelautoplay.description", category=Category.PLAYER)
public final class AutoPlay
extends Module {
    private final ModeValue TQ = new ModeValue("Mode", this).a(new Mode[]{new aks("Hypixel")}).co("Hypixel");
    @EventLink
    public final Listener<PacketReceiveEvent> TR = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof c) {
            c c2 = (c)aj2;
            if (((Mode)this.TQ.wD()).getName().equals("Hypixel")) {
                if (c2.isChat()) {
                    return;
                }
                if (c2.DM().getFormattedText().contains("play again?")) {
                    block0: for (ba ba2 : c2.DM().aro()) {
                        for (String string : ba2.toString().split("'")) {
                            if (!string.startsWith("/play") || string.contains(".")) continue;
                            afl.i(string);
                            cg.a("Auto Play", "Joined a new game", 7000);
                            continue block0;
                        }
                    }
                }
            }
        }
    };
}

