/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.util.da;
import net.minecraft.world.ac;
import net.minecraft.world.af;
import net.minecraft.world.biome.ak;
import net.minecraft.world.biome.j;
import net.minecraft.world.border.c;
import net.minecraft.world.chunk.h;
import net.minecraft.world.gen.e;

public class ae
extends ac {
    @Override
    public void avU() {
        this.dDN = new ak(j.dGn, 0.0f);
        this.dDO = true;
        this.dDP = true;
        this.dimensionId = -1;
    }

    @Override
    public da A(float f2, float f3) {
        return new da(0.2f, 0.03f, 0.03f);
    }

    @Override
    protected void avT() {
        float f2 = 0.1f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.dDQ[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * 0.9f + 0.1f;
        }
    }

    @Override
    public h avV() {
        return new e(this.baU, this.baU.avH().awB(), this.baU.avD());
    }

    @Override
    public boolean avW() {
        return false;
    }

    @Override
    public boolean aO(int n2, int n3) {
        return false;
    }

    @Override
    public float a(long l2, float f2) {
        return 0.5f;
    }

    @Override
    public boolean avX() {
        return false;
    }

    @Override
    public boolean aP(int n2, int n3) {
        return true;
    }

    @Override
    public String getDimensionName() {
        return "Nether";
    }

    @Override
    public String awd() {
        return "_nether";
    }

    @Override
    public c Sv() {
        return new af(this);
    }
}

