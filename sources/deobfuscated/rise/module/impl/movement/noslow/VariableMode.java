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

public class VariableMode
extends Mode<NoSlow> {
    private final NumberValue NU = new NumberValue("Multiplier", this, (Number)0.8, (Number)0.2, (Number)1, (Number)0.05);
    @EventLink
    public final Listener<SlowDownEvent> NV = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && VariableMode.aER.bgK.isUsingItem() && VariableMode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            slowDownEvent.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && VariableMode.aER.bgK.isUsingItem() && VariableMode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            slowDownEvent.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && VariableMode.aER.bgK.isUsingItem() && VariableMode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            slowDownEvent.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && VariableMode.aER.bgK.isUsingItem() && VariableMode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            slowDownEvent.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
    };

    public VariableMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

