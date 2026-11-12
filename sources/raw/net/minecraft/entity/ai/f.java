/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.world.w;

public class f
extends e {
    private final ai cwT;
    private a cwU;
    private final w cwV;
    private final float cwW;
    private int cwX;

    public f(ai ai2, float f2) {
        this.cwT = ai2;
        this.cwV = ai2.baU;
        this.cwW = f2;
        this.eO(2);
    }

    @Override
    public boolean WC() {
        this.cwU = this.cwV.f(this.cwT, this.cwW);
        return this.cwU != null && this.u(this.cwU);
    }

    @Override
    public boolean WD() {
        return this.cwU.TS() && !(this.cwT.T((c)this.cwU) > (double)(this.cwW * this.cwW)) && this.cwX > 0 && this.u(this.cwU);
    }

    @Override
    public void WG() {
        this.cwT.bI(true);
        this.cwX = 40 + this.cwT.VB().nextInt(40);
    }

    @Override
    public void WE() {
        this.cwT.bI(false);
        this.cwU = null;
    }

    @Override
    public void WF() {
        this.cwT.UR().d(this.cwU.gW, this.cwU.gX + (double)this.cwU.getEyeHeight(), this.cwU.gY, 10.0f, this.cwT.Vg());
        --this.cwX;
    }

    private boolean u(a a2) {
        co co2 = a2.cHV.acE();
        return co2 != null && (!this.cwT.abl() && co2.bP() == Items.cRb || this.cwT.ac(co2));
    }
}

