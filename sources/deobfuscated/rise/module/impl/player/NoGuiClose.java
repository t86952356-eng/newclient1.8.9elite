/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import net.minecraft.client.gui.f;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ay;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.other.noguiclose.name"}, category=Category.PLAYER, description="module.other.noguiclose.description")
public final class NoGuiClose
extends Module {
    private final BooleanValue Vv = new BooleanValue("Chat Only", (Module)this, (Boolean)false);
    @EventLink
    public final Listener<PacketReceiveEvent> Vw = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (packetReceiveEvent.dq() instanceof ay && (NoGuiClose.aER.bgR instanceof f || !((Boolean)this.Vv.wD()).booleanValue())) {
            packetReceiveEvent.cF();
        }
    };
}

