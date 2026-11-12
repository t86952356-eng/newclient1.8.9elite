/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

public class k {
    private final float[] dsq;
    private int height;

    public k(float[] fArray) {
        this.dsq = fArray;
        this.height = 1;
    }

    protected void aqo() {
        ++this.height;
    }

    public float[] aqp() {
        return this.dsq;
    }

    public int getHeight() {
        return this.height;
    }
}

