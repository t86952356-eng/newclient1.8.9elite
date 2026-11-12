/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.inventorymove;

import net.minecraft.client.gui.f;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.InventoryMove;

public final class NormalMode
extends Mode<InventoryMove> {
    private final d[] JY;
    @EventLink
    private final Listener<PreUpdateEvent> JZ;

    public NormalMode(String string, InventoryMove inventoryMove) {
        super(string, inventoryMove);
        this.JY = new d[]{NormalMode.aER.aIY.chm, NormalMode.aER.aIY.cho, NormalMode.aER.aIY.chp, NormalMode.aER.aIY.chn, NormalMode.aER.aIY.chq};
        this.JZ = preUpdateEvent -> {
            if (NormalMode.aER.bgR == null || NormalMode.aER.bgR instanceof f || NormalMode.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JY) {
                d2.ay(a.a(d2));
            }
        };
    }
}

