/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.world.ac;
import net.minecraft.world.biome.ak;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.h;
import net.minecraft.world.gen.b;

public class ad
extends ac {
    @Override
    public void avU() {
        this.dDN = new ak(j.dGo, 0.0f);
        this.dDR = 1;
        this.dDP = true;
    }

    @Override
    public h avV() {
        return new b(this.baU, this.baU.avD());
    }

    @Override
    public float a(long l2, float f2) {
        return 0.0f;
    }

    @Override
    public float[] z(float f2, float f3) {
        return null;
    }

    @Override
    public da A(float f2, float f3) {
        int n2 = 0xA080A0;
        float f4 = bt.bB(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f4 = bt.I(f4, 0.0f, 1.0f);
        float f5 = 0.627451f;
        float f6 = 0.5019608f;
        float f7 = 0.627451f;
        return new da(f5 *= f4 * 0.0f + 0.15f, f6 *= f4 * 0.0f + 0.15f, f7 *= f4 * 0.0f + 0.15f);
    }

    @Override
    public boolean avZ() {
        return false;
    }

    @Override
    public boolean avX() {
        return false;
    }

    @Override
    public boolean avW() {
        return false;
    }

    @Override
    public float avY() {
        return 8.0f;
    }

    @Override
    public boolean aO(int n2, int n3) {
        return this.baU.aH(new net.minecraft.util.b(n2, 0, n3)).xb().zy();
    }

    @Override
    public net.minecraft.util.b awa() {
        return new net.minecraft.util.b(100, 50, 0);
    }

    @Override
    public int awb() {
        return 50;
    }

    @Override
    public boolean aP(int n2, int n3) {
        return true;
    }

    @Override
    public String getDimensionName() {
        return "The End";
    }

    @Override
    public String awd() {
        return "_end";
    }
}

