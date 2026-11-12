/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.z;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class bc
extends e {
    private final z czZ;
    private z cAa;
    private final w cAb;
    private int cAc;
    net.minecraft.village.c cAd;

    public bc(z z2) {
        this.czZ = z2;
        this.cAb = z2.baU;
        this.eO(3);
    }

    @Override
    public boolean WC() {
        if (this.czZ.Ux() != 0) {
            return false;
        }
        if (this.czZ.VB().nextInt(500) != 0) {
            return false;
        }
        this.cAd = this.cAb.avS().e(new b(this.czZ), 0);
        if (this.cAd == null) {
            return false;
        }
        if (this.WY() && this.czZ.bF(true)) {
            z z2 = this.cAb.a(z.class, this.czZ.Us().ad(8.0, 3.0, 8.0), this.czZ);
            if (z2 == null) {
                return false;
            }
            this.cAa = z2;
            return this.cAa.Ux() == 0 && this.cAa.bF(true);
        }
        return false;
    }

    @Override
    public void WG() {
        this.cAc = 300;
        this.czZ.bD(true);
    }

    @Override
    public void WE() {
        this.cAd = null;
        this.cAa = null;
        this.czZ.bD(false);
    }

    @Override
    public boolean WD() {
        return this.cAc >= 0 && this.WY() && this.czZ.Ux() == 0 && this.czZ.bF(false);
    }

    @Override
    public void WF() {
        --this.cAc;
        this.czZ.UR().b(this.cAa, 10.0f, 30.0f);
        if (this.czZ.T((c)this.cAa) > 2.25) {
            this.czZ.UU().e(this.cAa, 0.25);
        } else if (this.cAc == 0 && this.cAa.abr()) {
            this.WZ();
        }
        if (this.czZ.VB().nextInt(35) == 0) {
            this.cAb.a((c)this.czZ, (byte)12);
        }
    }

    private boolean WY() {
        if (!this.cAd.auxx()) {
            return false;
        }
        int n2 = (int)((double)this.cAd.auo() * 0.35);
        return this.cAd.auq() < n2;
    }

    private void WZ() {
        z z2 = this.czZ.i(this.cAa);
        this.cAa.eC(6000);
        this.czZ.eC(6000);
        this.cAa.bG(false);
        this.czZ.bG(false);
        z2.eC(-24000);
        z2.b(this.czZ.gW, this.czZ.gX, this.czZ.gY, 0.0f, 0.0f);
        this.cAb.G(z2);
        this.cAb.a((c)z2, (byte)12);
    }
}

