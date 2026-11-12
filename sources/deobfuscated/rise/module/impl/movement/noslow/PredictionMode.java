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
import rise.value.NumberValue;

public class PredictionMode
extends Mode<NoSlow> {
    private final NumberValue NR = new NumberValue("Amount", this, (Number)2, (Number)2, (Number)5, (Number)1);
    @EventLink
    public final Listener<SlowDownEvent> NS = slowDownEvent -> {
        if (PredictionMode.aER.bgK.crx % ((Number)this.NR.wD()).intValue() != 0 && PredictionMode.aER.bgK.aO) {
            if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && PredictionMode.aER.bgK.isUsingItem() && PredictionMode.aER.bgK.Vk().bP() instanceof bg) {
                slowDownEvent.cF();
            }
            if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && PredictionMode.aER.bgK.isUsingItem() && PredictionMode.aER.bgK.Vk().bP() instanceof by) {
                slowDownEvent.cF();
            }
            if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && PredictionMode.aER.bgK.isUsingItem() && PredictionMode.aER.bgK.Vk().bP() instanceof cp) {
                slowDownEvent.cF();
            }
            if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && PredictionMode.aER.bgK.isUsingItem() && PredictionMode.aER.bgK.Vk().bP() instanceof ai) {
                slowDownEvent.cF();
            }
        }
    };

    public PredictionMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

