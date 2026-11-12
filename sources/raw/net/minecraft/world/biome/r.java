/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.entity.passive.ai;
import net.minecraft.util.bt;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.l;
import net.minecraft.world.biome.m;
import net.minecraft.world.biome.s;
import net.minecraft.world.biome.t;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.b;
import net.minecraft.world.gen.feature.g;
import net.minecraft.world.gen.feature.o;
import net.minecraft.world.w;

public class r
extends j {
    private final int dHC;
    protected static final o dHD = new o(false, true);
    protected static final o dHE = new o(false, false);
    protected static final g dHF = new g(false);

    public r(int n2, int n3) {
        super(n2);
        this.dHC = n3;
        this.dHh.dFB = 10;
        this.dHh.dFD = 2;
        if (this.dHC == 1) {
            this.dHh.dFB = 6;
            this.dHh.dFC = 100;
            this.dHh.dFD = 1;
        }
        this.ik(5159473);
        this.B(0.7f, 0.8f);
        if (this.dHC == 2) {
            this.dGY = 353825;
            this.lp = 3175492;
            this.B(0.6f, 0.6f);
        }
        if (this.dHC == 0) {
            this.dHj.add(new m(ai.class, 5, 4, 4));
        }
        if (this.dHC == 3) {
            this.dHh.dFB = -999;
        }
    }

    @Override
    protected j s(int n2, boolean bl2) {
        if (this.dHC == 2) {
            this.dGY = 353825;
            this.lp = n2;
            if (bl2) {
                this.dGY = (this.dGY & 0xFEFEFE) >> 1;
            }
            return this;
        }
        return super.s(n2, bl2);
    }

    @Override
    public a j(Random random) {
        return this.dHC == 3 && random.nextInt(3) > 0 ? dHF : (this.dHC != 2 && random.nextInt(5) != 0 ? this.dHp : dHE);
    }

    @Override
    public BlockFlower$EnumFlowerType a(Random random, net.minecraft.util.b b2) {
        if (this.dHC == 1) {
            double d2 = bt.ah((1.0 + dGV.D((double)b2.wt() / 48.0, (double)b2.wx() / 48.0)) / 2.0, 0.0, 0.9999);
            BlockFlower$EnumFlowerType blockFlower$EnumFlowerType = BlockFlower$EnumFlowerType.values()[(int)(d2 * (double)BlockFlower$EnumFlowerType.values().length)];
            return blockFlower$EnumFlowerType == BlockFlower$EnumFlowerType.aVc ? BlockFlower$EnumFlowerType.aVb : blockFlower$EnumFlowerType;
        }
        return super.a(random, b2);
    }

    @Override
    public void a(w w2, Random random, net.minecraft.util.b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.dHC == 3) {
            for (n5 = 0; n5 < 4; ++n5) {
                for (n4 = 0; n4 < 4; ++n4) {
                    ao ao2;
                    n3 = n5 * 4 + 1 + 8 + random.nextInt(3);
                    n2 = n4 * 4 + 1 + 8 + random.nextInt(3);
                    net.minecraft.util.b b3 = w2.aQ(b2.C(n3, 0, n2));
                    if (random.nextInt(20) == 0) {
                        ao2 = new b();
                        ((b)ao2).b(w2, random, b3);
                        continue;
                    }
                    ao2 = this.j(random);
                    ao2.ayx();
                    if (!ao2.b(w2, random, b3)) continue;
                    ((a)ao2).c(w2, random, b3);
                }
            }
        }
        n5 = random.nextInt(5) - 3;
        if (this.dHC == 1) {
            n5 += 2;
        }
        block2: for (n4 = 0; n4 < n5; ++n4) {
            n3 = random.nextInt(3);
            if (n3 == 0) {
                dGW.a(BlockDoublePlant$EnumPlantType.aUi);
            } else if (n3 == 1) {
                dGW.a(BlockDoublePlant$EnumPlantType.aUl);
            } else if (n3 == 2) {
                dGW.a(BlockDoublePlant$EnumPlantType.aUm);
            }
            for (n2 = 0; n2 < 5; ++n2) {
                int n6 = random.nextInt(16) + 8;
                int n7 = random.nextInt(16) + 8;
                int n8 = random.nextInt(w2.aQ(b2.C(n6, 0, n7)).wu() + 32);
                if (dGW.b(w2, random, new net.minecraft.util.b(b2.wt() + n6, n8, b2.wx() + n7))) continue block2;
            }
        }
        super.a(w2, random, b2);
    }

    @Override
    public int bj(net.minecraft.util.b b2) {
        int n2 = super.bj(b2);
        return this.dHC == 3 ? (n2 & 0xFEFEFE) + 2634762 >> 1 : n2;
    }

    @Override
    protected j in(int n2) {
        if (this.dHo == j.dGj.dHo) {
            r r2 = new r(n2, 1);
            r2.a(new l(this.dHc, this.dHd + 0.2f));
            r2.gE("Flower Forest");
            r2.s(6976549, true);
            r2.ik(8233509);
            return r2;
        }
        return this.dHo != j.dGG.dHo && this.dHo != j.dGH.dHo ? new s(this, n2, this) : new t(this, n2, this);
    }
}

