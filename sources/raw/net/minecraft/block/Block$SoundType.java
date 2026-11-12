/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

public class Block$SoundType {
    public final String aSN;
    public final float aSO;
    public final float aSP;

    public Block$SoundType(String string, float f2, float f3) {
        this.aSN = string;
        this.aSO = f2;
        this.aSP = f3;
    }

    public float getVolume() {
        return this.aSO;
    }

    public float xT() {
        return this.aSP;
    }

    public String xP() {
        return "dig." + this.aSN;
    }

    public String xR() {
        return "step." + this.aSN;
    }

    public String xQ() {
        return this.xP();
    }
}

