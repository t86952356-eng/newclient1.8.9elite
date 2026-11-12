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
    private int foodLevel = 20;
    private float saturationLevel = 5.0f;
    private float dyc;
    private int dyd;
    private int dye = 20;

    public void h(int n2, float f2) {
        this.foodLevel = Math.min(n2 + this.foodLevel, 20);
        this.saturationLevel = Math.min(this.saturationLevel + (float)n2 * f2 * 2.0f, (float)this.foodLevel);
    }

    public void a(bg bg2, co co2) {
        this.h(bg2.aE(co2), bg2.aF(co2));
    }

    public void M(a a2) {
        f f2 = a2.baU.agm();
        this.dye = this.foodLevel;
        if (this.dyc > 4.0f) {
            this.dyc -= 4.0f;
            if (this.saturationLevel > 0.0f) {
                this.saturationLevel = Math.max(this.saturationLevel - 1.0f, 0.0f);
            } else if (f2 != f.dBR) {
                this.foodLevel = Math.max(this.foodLevel - 1, 0);
            }
        }
        if (a2.baU.Si().gw("naturalRegeneration") && this.foodLevel >= 18 && a2.abZ()) {
            ++this.dyd;
            if (this.dyd >= 80) {
                a2.P(1.0f);
                this.bs(3.0f);
                this.dyd = 0;
            }
        } else if (this.foodLevel <= 0) {
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
            this.foodLevel = n2.eG("foodLevel");
            this.dyd = n2.eG("foodTickTimer");
            this.saturationLevel = n2.eI("foodSaturationLevel");
            this.dyc = n2.eI("foodExhaustionLevel");
        }
    }

    public void F(n n2) {
        n2.B("foodLevel", this.foodLevel);
        n2.B("foodTickTimer", this.dyd);
        n2.a("foodSaturationLevel", this.saturationLevel);
        n2.a("foodExhaustionLevel", this.dyc);
    }

    public int getFoodLevel() {
        return this.foodLevel;
    }

    public int ate() {
        return this.dye;
    }

    public boolean atf() {
        return this.foodLevel < 20;
    }

    public void bs(float f2) {
        this.dyc = Math.min(this.dyc + f2, 40.0f);
    }

    public float getSaturationLevel() {
        return this.saturationLevel;
    }

    public void hB(int n2) {
        this.foodLevel = n2;
    }

    public void bJ(float f2) {
        this.saturationLevel = f2;
    }
}

