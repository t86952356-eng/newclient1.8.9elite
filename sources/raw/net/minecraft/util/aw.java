/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.entity.player.a;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.util.ad;
import net.minecraft.world.f;

public class aw {
    private int dci = 20;
    private float dyb = 5.0f;
    private float dyc;
    private int dyd;
    private int dye = 20;

    public void h(int n2, float f2) {
        this.dci = Math.min(n2 + this.dci, 20);
        this.dyb = Math.min(this.dyb + (float)n2 * f2 * 2.0f, (float)this.dci);
    }

    public void a(bg bg2, co co2) {
        this.h(bg2.aE(co2), bg2.aF(co2));
    }

    public void M(a a2) {
        f f2 = a2.baU.agm();
        this.dye = this.dci;
        if (this.dyc > 4.0f) {
            this.dyc -= 4.0f;
            if (this.dyb > 0.0f) {
                this.dyb = Math.max(this.dyb - 1.0f, 0.0f);
            } else if (f2 != f.dBR) {
                this.dci = Math.max(this.dci - 1, 0);
            }
        }
        if (a2.baU.Si().gw("naturalRegeneration") && this.dci >= 18 && a2.abZ()) {
            ++this.dyd;
            if (this.dyd >= 80) {
                a2.P(1.0f);
                this.bs(3.0f);
                this.dyd = 0;
            }
        } else if (this.dci <= 0) {
            ++this.dyd;
            if (this.dyd >= 80) {
                if (a2.getHealth() > 10.0f || f2 == f.dBU || a2.getHealth() > 1.0f && f2 == f.dBT) {
                    a2.a(ad.dvh, 1.0f);
                }
                this.dyd = 0;
            }
        } else {
            this.dyd = 0;
        }
    }

    public void E(n n2) {
        if (n2.C("foodLevel", 99)) {
            this.dci = n2.eG("foodLevel");
            this.dyd = n2.eG("foodTickTimer");
            this.dyb = n2.eI("foodSaturationLevel");
            this.dyc = n2.eI("foodExhaustionLevel");
        }
    }

    public void F(n n2) {
        n2.B("foodLevel", this.dci);
        n2.B("foodTickTimer", this.dyd);
        n2.a("foodSaturationLevel", this.dyb);
        n2.a("foodExhaustionLevel", this.dyc);
    }

    public int getFoodLevel() {
        return this.dci;
    }

    public int ate() {
        return this.dye;
    }

    public boolean atf() {
        return this.dci < 20;
    }

    public void bs(float f2) {
        this.dyc = Math.min(this.dyc + f2, 40.0f);
    }

    public float getSaturationLevel() {
        return this.dyb;
    }

    public void hB(int n2) {
        this.dci = n2;
    }

    public void bJ(float f2) {
        this.dyb = f2;
    }
}

