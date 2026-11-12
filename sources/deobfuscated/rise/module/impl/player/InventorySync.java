/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import net.minecraft.inventory.b;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bc;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.player.inventorysync.name"}, description="module.player.inventorysync.description", category=Category.PLAYER)
public class InventorySync
extends Module {
    public short adq;
    @EventLink
    public final Listener<PacketReceiveEvent> adr = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof bc) {
            bc bc2 = (bc)aj2;
            b b2 = InventorySync.aER.bgK.cHX;
            if (bc2.getWindowId() == b2.cSL) {
                this.adq = bc2.getActionNumber();
                if (this.adq > 0 && this.adq < b2.cSM) {
                    b2.cSM = (short)(this.adq + 1);
                }
            }
        }
    };
}

