/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.em;
import hackclient.rise.mc;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;

public class pm
extends akg<mc> {
    private final akq NU = new akq("Multiplier", this, (Number)0.8, (Number)0.2, (Number)1, (Number)0.05);
    @dm
    public final dk<em> NV = em2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pm.aER.bgK.isUsingItem() && pm.aER.bgK.Vk().bP() instanceof bg) {
            em2.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            em2.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pm.aER.bgK.isUsingItem() && pm.aER.bgK.Vk().bP() instanceof by) {
            em2.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            em2.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pm.aER.bgK.isUsingItem() && pm.aER.bgK.Vk().bP() instanceof cp) {
            em2.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            em2.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pm.aER.bgK.isUsingItem() && pm.aER.bgK.Vk().bP() instanceof ai) {
            em2.setForwardMultiplier(((Number)this.NU.wD()).floatValue());
            em2.setStrafeMultiplier(((Number)this.NU.wD()).floatValue());
        }
    };

    public pm(String string, mc mc2) {
        super(string, mc2);
    }
}

