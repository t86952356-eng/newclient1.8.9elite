/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.biome;

import com.google.common.collect.Lists;
import java.util.Random;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.n;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class z
extends j {
    protected j dHX;

    public z(int n2, j j2) {
        super(n2);
        this.dHX = j2;
        this.s(j2.lp, true);
        this.dGX = j2.dGX + " M";
        this.dGZ = j2.dGZ;
        this.dHa = j2.dHa;
        this.dHb = j2.dHb;
        this.dHc = j2.dHc;
        this.dHd = j2.dHd;
        this.dHe = j2.dHe;
        this.dHf = j2.dHf;
        this.dHg = j2.dHg;
        this.dHm = j2.dHm;
        this.dHn = j2.dHn;
        this.dHj = Lists.newArrayList(j2.dHj);
        this.dHi = Lists.newArrayList(j2.dHi);
        this.dHl = Lists.newArrayList(j2.dHl);
        this.dHk = Lists.newArrayList(j2.dHk);
        this.dHe = j2.dHe;
        this.dHf = j2.dHf;
        this.dHc = j2.dHc + 0.1f;
        this.dHd = j2.dHd + 0.2f;
    }

    @Override
    public void a(w w2, Random random, b b2) {
        this.dHX.dHh.a(w2, random, this, b2);
    }

    @Override
    public void a(w w2, Random random, f f2, int n2, int n3, double d2) {
        this.dHX.a(w2, random, f2, n2, n3, d2);
    }

    @Override
    public float awZ() {
        return this.dHX.awZ();
    }

    @Override
    public a j(Random random) {
        return this.dHX.j(random);
    }

    @Override
    public int bk(b b2) {
        return this.dHX.bk(b2);
    }

    @Override
    public int bj(b b2) {
        return this.dHX.bj(b2);
    }

    @Override
    public Class<? extends j> axe() {
        return this.dHX.axe();
    }

    @Override
    public boolean b(j j2) {
        return this.dHX.b(j2);
    }

    @Override
    public n axf() {
        return this.dHX.axf();
    }
}

