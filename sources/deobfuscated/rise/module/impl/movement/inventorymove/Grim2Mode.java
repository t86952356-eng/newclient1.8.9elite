/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.inventorymove;

import hackclient.rise.en;
import net.minecraft.client.gui.f;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.client.settings.a;
import net.minecraft.client.settings.d;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.InventoryMove;

public final class Grim2Mode
extends Mode<InventoryMove> {
    private final d[] JV;
    @EventLink
    public final Listener<en> JW;
    @EventLink
    private final Listener<PreUpdateEvent> JX;

    public Grim2Mode(String string, InventoryMove inventoryMove) {
        super(string, inventoryMove);
        this.JV = new d[]{Grim2Mode.aER.aIY.chm, Grim2Mode.aER.aIY.cho, Grim2Mode.aER.aIY.chp, Grim2Mode.aER.aIY.chn, Grim2Mode.aER.aIY.chq};
        this.JW = en2 -> {
            if (Grim2Mode.aER.bgR instanceof q || Grim2Mode.aER.bgR instanceof h) {
                Grim2Mode.aER.bgK.setSprinting(false);
            }
        };
        this.JX = preUpdateEvent -> {
            if (Grim2Mode.aER.bgR == null || Grim2Mode.aER.bgR instanceof f || Grim2Mode.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JV) {
                d2.ay(a.a(d2));
            }
        };
    }
}

