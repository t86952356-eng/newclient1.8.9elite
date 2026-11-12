/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class g
implements aj<a> {
    private float health;
    private int foodLevel;
    private float saturationLevel;

    public g() {
    }

    public g(float f2, int n2, float f3) {
        this.health = f2;
        this.foodLevel = n2;
        this.saturationLevel = f3;
    }

    @Override
    public void a(ak ak2) {
        this.health = ak2.readFloat();
        this.foodLevel = ak2.afw();
        this.saturationLevel = ak2.readFloat();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.health);
        ak2.gr(this.foodLevel);
        ak2.writeFloat(this.saturationLevel);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public float getHealth() {
        return this.health;
    }

    public int getFoodLevel() {
        return this.foodLevel;
    }

    public float getSaturationLevel() {
        return this.saturationLevel;
    }
}

