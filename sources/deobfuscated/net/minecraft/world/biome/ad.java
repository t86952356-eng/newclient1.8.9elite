/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.entity.passive.f;
import net.minecraft.util.b;
import net.minecraft.world.biome.ae;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.w;

public class ad
extends j {
    private static final net.minecraft.world.gen.feature.ae dHZ = new net.minecraft.world.gen.feature.ae(false);

    protected ad(int n2) {
        super(n2);
        this.dHj.add(new m(f.class, 1, 2, 6));
        this.dHh.dFB = 1;
        this.dHh.dFC = 4;
        this.dHh.dFD = 20;
    }

    @Override
    public a j(Random random) {
        return random.nextInt(5) > 0 ? dHZ : this.dHp;
    }

    @Override
    protected j in(int n2) {
        ae ae2 = new ae(n2, this);
        ae2.dHe = (this.dHe + 1.0f) * 0.5f;
        ae2.dHc = this.dHc * 0.5f + 0.3f;
        ae2.dHd = this.dHd * 0.5f + 1.2f;
        return ae2;
    }

    @Override
    public void a(w w2, Random random, b b2) {
        dGW.a(BlockDoublePlant$EnumPlantType.aUj);
        for (int i2 = 0; i2 < 7; ++i2) {
            int n2 = random.nextInt(16) + 8;
            int n3 = random.nextInt(16) + 8;
            int n4 = random.nextInt(w2.aQ(b2.C(n2, 0, n3)).wu() + 32);
            dGW.b(w2, random, b2.C(n2, n4, n3));
        }
        super.a(w2, random, b2);
    }
}

