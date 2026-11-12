/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;

public class VanillaMode
extends Mode<NoSlow> {
    @EventLink
    public final Listener<SlowDownEvent> NT = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && VanillaMode.aER.bgK.isUsingItem() && VanillaMode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && VanillaMode.aER.bgK.isUsingItem() && VanillaMode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && VanillaMode.aER.bgK.isUsingItem() && VanillaMode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && VanillaMode.aER.bgK.isUsingItem() && VanillaMode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.cF();
        }
    };

    public VanillaMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

