/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.noslow;

import hackclient.rise.aii;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.SlowDownEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;
import rise.module.impl.movement.Speed;

public class MatrixMode
extends Mode<NoSlow> {
    @EventLink
    public final Listener<SlowDownEvent> Ns = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.cF();
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Nt = strafeEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof bg) {
            if (MatrixMode.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(Speed.class).isEnabled()) {
                MatrixMode.aER.bgK.ud *= 0.992;
                MatrixMode.aER.bgK.uf *= 0.992;
            } else {
                MatrixMode.aER.bgK.ud *= 0.99;
                MatrixMode.aER.bgK.uf *= 0.99;
            }
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof by) {
            if (MatrixMode.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(Speed.class).isEnabled()) {
                MatrixMode.aER.bgK.ud *= 0.992;
                MatrixMode.aER.bgK.uf *= 0.992;
            } else {
                MatrixMode.aER.bgK.ud *= 0.99;
                MatrixMode.aER.bgK.uf *= 0.99;
            }
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof cp) {
            if (MatrixMode.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(Speed.class).isEnabled()) {
                MatrixMode.aER.bgK.ud *= 0.992;
                MatrixMode.aER.bgK.uf *= 0.992;
            } else {
                MatrixMode.aER.bgK.ud *= 0.99;
                MatrixMode.aER.bgK.uf *= 0.99;
            }
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && MatrixMode.aER.bgK.isUsingItem() && MatrixMode.aER.bgK.Vk().bP() instanceof ai) {
            if (MatrixMode.aER.bgK.crx > 1) {
                aii.strafe(0.0265);
            } else if (!this.e(Speed.class).isEnabled()) {
                MatrixMode.aER.bgK.ud *= 0.992;
                MatrixMode.aER.bgK.uf *= 0.992;
            } else {
                MatrixMode.aER.bgK.ud *= 0.99;
                MatrixMode.aER.bgK.uf *= 0.99;
            }
        }
    };

    public MatrixMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

