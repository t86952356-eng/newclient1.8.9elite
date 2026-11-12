/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.entity.passive.f;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.w;

public class ab
extends j {
    protected boolean dHY;

    protected ab(int n2) {
        super(n2);
        this.B(0.8f, 0.4f);
        this.a(dFT);
        this.dHj.add(new m(f.class, 5, 2, 6));
        this.dHh.dFB = -999;
        this.dHh.dFC = 4;
        this.dHh.dFD = 10;
    }

    @Override
    public BlockFlower$EnumFlowerType a(Random random, b b2) {
        double d2 = dGV.D((double)b2.wt() / 200.0, (double)b2.wx() / 200.0);
        if (d2 < -0.8) {
            int n2 = random.nextInt(4);
            switch (n2) {
                case 0: {
                    return BlockFlower$EnumFlowerType.aVg;
                }
                case 1: {
                    return BlockFlower$EnumFlowerType.aVf;
                }
                case 2: {
                    return BlockFlower$EnumFlowerType.aVi;
                }
            }
            return BlockFlower$EnumFlowerType.aVh;
        }
        if (random.nextInt(3) > 0) {
            int n3 = random.nextInt(3);
            return n3 == 0 ? BlockFlower$EnumFlowerType.aVb : (n3 == 1 ? BlockFlower$EnumFlowerType.aVe : BlockFlower$EnumFlowerType.aVj);
        }
        return BlockFlower$EnumFlowerType.aVa;
    }

    @Override
    public void a(w w2, Random random, b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        double d2 = dGV.D((double)(b2.wt() + 8) / 200.0, (double)(b2.wx() + 8) / 200.0);
        if (d2 < -0.8) {
            this.dHh.dFC = 15;
            this.dHh.dFD = 5;
        } else {
            this.dHh.dFC = 4;
            this.dHh.dFD = 10;
            dGW.a(BlockDoublePlant$EnumPlantType.aUj);
            for (n5 = 0; n5 < 7; ++n5) {
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(w2.aQ(b2.C(n4, 0, n3)).wu() + 32);
                dGW.b(w2, random, b2.C(n4, n2, n3));
            }
        }
        if (this.dHY) {
            dGW.a(BlockDoublePlant$EnumPlantType.aUh);
            for (n5 = 0; n5 < 10; ++n5) {
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(w2.aQ(b2.C(n4, 0, n3)).wu() + 32);
                dGW.b(w2, random, b2.C(n4, n2, n3));
            }
        }
        super.a(w2, random, b2);
    }

    @Override
    protected j in(int n2) {
        ab ab2 = new ab(n2);
        ab2.gE("Sunflower Plains");
        ab2.dHY = true;
        ab2.il(9286496);
        ab2.dGY = 14273354;
        return ab2;
    }
}

