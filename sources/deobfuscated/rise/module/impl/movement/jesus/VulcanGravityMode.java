/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.jesus;

import hackclient.rise.aii;
import net.minecraft.potion.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.Jesus;

public class VulcanGravityMode
extends Mode<Jesus> {
    private boolean Kz = true;
    private boolean gD = true;
    private int KA = 0;
    private double gX = 50.0;
    @EventLink
    public final Listener<PreMotionEvent> KB = preMotionEvent -> {
        if (!VulcanGravityMode.aER.aIY.chq.Rg() && VulcanGravityMode.aER.bgK.isInWater() && this.Kz && VulcanGravityMode.aER.bgK.gX % 1.0 != 0.0 && VulcanGravityMode.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            VulcanGravityMode.aER.bgK.setPosition(VulcanGravityMode.aER.bgK.gW, VulcanGravityMode.aER.bgK.gX - 0.85, VulcanGravityMode.aER.bgK.gY);
            this.Kz = false;
        }
        if (VulcanGravityMode.aER.bgK.isInWater() && !VulcanGravityMode.aER.aIY.chq.Re() && VulcanGravityMode.aER.bgK.gX % 1.0 != 0.0 && VulcanGravityMode.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            aii.strafe(0.34 - Math.random() / 1000.0);
            VulcanGravityMode.aER.bgK.ue = 0.0;
        }
        if (this.Kz) {
            this.gX = VulcanGravityMode.aER.bgK.gX - 1.6;
        }
        if (VulcanGravityMode.aER.bgK.isInWater()) {
            this.KA = 0;
        }
        if (this.KA < 20) {
            aii.strafe();
        }
        ++this.KA;
        this.gD = VulcanGravityMode.aER.aIY.chq.Re() || VulcanGravityMode.aER.aIY.chq.Rg();
        if (this.gD && VulcanGravityMode.aER.bgK.isInWater() && !VulcanGravityMode.aER.aIY.chq.Re() && !VulcanGravityMode.aER.aIY.chq.Rg()) {
            VulcanGravityMode.aER.bgK.setPosition(VulcanGravityMode.aER.bgK.gW, this.gX, VulcanGravityMode.aER.bgK.gY);
        }
        if (VulcanGravityMode.aER.bgK.a(a.dgw) && VulcanGravityMode.aER.bgK.isInWater() && !VulcanGravityMode.aER.aIY.chq.Re()) {
            aii.strafe(0.05 * (double)(1 + VulcanGravityMode.aER.bgK.b(a.dgw).ajf()) + 0.34 - Math.random() / 1000.0);
        }
        if (!VulcanGravityMode.aER.aIY.chq.Re() && VulcanGravityMode.aER.bgK.isInWater() && VulcanGravityMode.aER.bgK.gX % 1.0 != 0.0 && VulcanGravityMode.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            VulcanGravityMode.aER.bgK.setPosition(VulcanGravityMode.aER.bgK.gW, this.gX, VulcanGravityMode.aER.bgK.gY);
        }
        if (VulcanGravityMode.aER.aIY.chq.Re() && VulcanGravityMode.aER.bgK.isInWater()) {
            VulcanGravityMode.aER.bgK.ue = 0.6;
            aii.strafe(0.1);
        }
        if (VulcanGravityMode.aER.bgK.isInWater() && !VulcanGravityMode.aER.aIY.chq.Re() && !VulcanGravityMode.aER.aIY.chq.Rg() && VulcanGravityMode.aER.bgK.gX % 1.0 != 0.0 && VulcanGravityMode.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            VulcanGravityMode.aER.bgK.setPosition(VulcanGravityMode.aER.bgK.gW, this.gX - 0.2, VulcanGravityMode.aER.bgK.gY);
        }
        if (!VulcanGravityMode.aER.bgK.isInWater() && !this.Kz && VulcanGravityMode.aER.bgK.gX % 1.0 != 0.0 && VulcanGravityMode.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            this.Kz = true;
        }
    };

    public VulcanGravityMode(String string, Jesus jesus) {
        super(string, jesus);
    }
}

