/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ly;
import net.minecraft.potion.a;

public class of
extends akg<ly> {
    private boolean Kz = true;
    private boolean gD = true;
    private int KA = 0;
    private double gX = 50.0;
    @dm
    public final dk<ei> KB = ei2 -> {
        if (!of.aER.aIY.chq.Rg() && of.aER.bgK.isInWater() && this.Kz && of.aER.bgK.gX % 1.0 != 0.0 && of.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            of.aER.bgK.setPosition(of.aER.bgK.gW, of.aER.bgK.gX - 0.85, of.aER.bgK.gY);
            this.Kz = false;
        }
        if (of.aER.bgK.isInWater() && !of.aER.aIY.chq.Re() && of.aER.bgK.gX % 1.0 != 0.0 && of.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            aii.strafe(0.34 - Math.random() / 1000.0);
            of.aER.bgK.ue = 0.0;
        }
        if (this.Kz) {
            this.gX = of.aER.bgK.gX - 1.6;
        }
        if (of.aER.bgK.isInWater()) {
            this.KA = 0;
        }
        if (this.KA < 20) {
            aii.strafe();
        }
        ++this.KA;
        this.gD = of.aER.aIY.chq.Re() || of.aER.aIY.chq.Rg();
        if (this.gD && of.aER.bgK.isInWater() && !of.aER.aIY.chq.Re() && !of.aER.aIY.chq.Rg()) {
            of.aER.bgK.setPosition(of.aER.bgK.gW, this.gX, of.aER.bgK.gY);
        }
        if (of.aER.bgK.a(a.dgw) && of.aER.bgK.isInWater() && !of.aER.aIY.chq.Re()) {
            aii.strafe(0.05 * (double)(1 + of.aER.bgK.b(a.dgw).ajf()) + 0.34 - Math.random() / 1000.0);
        }
        if (!of.aER.aIY.chq.Re() && of.aER.bgK.isInWater() && of.aER.bgK.gX % 1.0 != 0.0 && of.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            of.aER.bgK.setPosition(of.aER.bgK.gW, this.gX, of.aER.bgK.gY);
        }
        if (of.aER.aIY.chq.Re() && of.aER.bgK.isInWater()) {
            of.aER.bgK.ue = 0.6;
            aii.strafe(0.1);
        }
        if (of.aER.bgK.isInWater() && !of.aER.aIY.chq.Re() && !of.aER.aIY.chq.Rg() && of.aER.bgK.gX % 1.0 != 0.0 && of.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            of.aER.bgK.setPosition(of.aER.bgK.gW, this.gX - 0.2, of.aER.bgK.gY);
        }
        if (!of.aER.bgK.isInWater() && !this.Kz && of.aER.bgK.gX % 1.0 != 0.0 && of.aER.bgK.gX * 2.0 % 1.0 != 0.0) {
            this.Kz = true;
        }
    };

    public of(String string, ly ly2) {
        super(string, ly2);
    }
}

