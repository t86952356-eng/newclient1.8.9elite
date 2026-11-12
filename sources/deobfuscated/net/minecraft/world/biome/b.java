/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import net.minecraft.world.biome.a;
import net.minecraft.world.biome.j;

public class b {
    public float[] dEU = new float[256];
    public j[] dEV = new j[256];
    public int xPosition;
    public int dEW;
    public long dEX;

    public b(a a2, int n2, int n3) {
        this.xPosition = n2;
        this.dEW = n3;
        a2.dEQ.a(this.dEU, n2 << 4, n3 << 4, 16, 16);
        a2.dEQ.a(this.dEV, n2 << 4, n3 << 4, 16, 16, false);
    }

    public j aS(int n2, int n3) {
        return this.dEV[n2 & 0xF | (n3 & 0xF) << 4];
    }
}

