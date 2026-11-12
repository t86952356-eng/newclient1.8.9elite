/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

public class l {
    public float dHt;
    public float dHu;

    public l(float f2, float f3) {
        this.dHt = f2;
        this.dHu = f3;
    }

    public l axh() {
        return new l(this.dHt * 0.8f, this.dHu * 0.6f);
    }
}

