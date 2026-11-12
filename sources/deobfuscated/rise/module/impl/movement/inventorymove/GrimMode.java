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
import rise.value.NumberValue;

public final class GrimMode
extends Mode<InventoryMove> {
    private final d[] JR;
    private final NumberValue JS;
    @EventLink
    public final Listener<PreUpdateEvent> JT;
    @EventLink
    public final Listener<en> JU;

    public GrimMode(String string, InventoryMove inventoryMove) {
        super(string, inventoryMove);
        this.JR = new d[]{GrimMode.aER.aIY.chm, GrimMode.aER.aIY.cho, GrimMode.aER.aIY.chp, GrimMode.aER.aIY.chn, GrimMode.aER.aIY.chq};
        this.JS = new NumberValue("Manager Extra Sprint Ticks", this, (Number)9, (Number)0, (Number)20, (Number)1);
        this.JT = preUpdateEvent -> {
            if (GrimMode.aER.bgR == null || GrimMode.aER.bgR instanceof f || GrimMode.aER.bgR == this.v()) {
                return;
            }
            for (d d2 : this.JR) {
                d2.ay(a.a(d2));
            }
        };
        this.JU = en2 -> {
            if (GrimMode.aER.bgR instanceof q || GrimMode.aER.bgR instanceof h) {
                GrimMode.aER.bgK.setSprinting(false);
            }
        };
    }

    public int hA() {
        return ((Number)this.JS.wD()).intValue();
    }
}

