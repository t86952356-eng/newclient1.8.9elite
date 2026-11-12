/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.ai;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class ah
extends j {
    protected ah(int n2) {
        super(n2);
        this.dHh.dFB = 2;
        this.dHh.dFC = 1;
        this.dHh.dFE = 1;
        this.dHh.dFF = 8;
        this.dHh.dFG = 10;
        this.dHh.dFK = 1;
        this.dHh.dFA = 4;
        this.dHh.dFJ = 0;
        this.dHh.dFI = 0;
        this.dHh.dFD = 5;
        this.dHg = 14745518;
        this.dHi.add(new m(ai.class, 1, 1, 1));
    }

    @Override
    public a j(Random random) {
        return this.dHr;
    }

    @Override
    public int bj(b b2) {
        double d2 = dGV.D((double)b2.wt() * 0.0225, (double)b2.wx() * 0.0225);
        return d2 < -0.1 ? 5011004 : 6975545;
    }

    @Override
    public int bk(b b2) {
        return 6975545;
    }

    @Override
    public BlockFlower$EnumFlowerType a(Random random, b b2) {
        return BlockFlower$EnumFlowerType.aVc;
    }

    @Override
    public void a(w w2, Random random, f f2, int n2, int n3, double d2) {
        double d3 = dGV.D((double)n2 * 0.25, (double)n3 * 0.25);
        if (d3 > 0.0) {
            int n4 = n2 & 0xF;
            int n5 = n3 & 0xF;
            for (int i2 = 255; i2 >= 0; --i2) {
                if (f2.S(n5, i2, n4).df().xb() == Material.beo) continue;
                if (i2 != 62 || f2.S(n5, i2, n4).df() == Blocks.cLl) break;
                f2.a(n5, i2, n4, Blocks.cLl.xM());
                if (!(d3 < 0.12)) break;
                f2.a(n5, i2 + 1, n4, Blocks.cNz.xM());
                break;
            }
        }
        this.b(w2, random, f2, n2, n3, d2);
    }
}

