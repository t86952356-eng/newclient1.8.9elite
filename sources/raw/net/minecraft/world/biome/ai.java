/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.l;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.aj;
import net.minecraft.world.gen.feature.ak;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.e;
import net.minecraft.world.gen.feature.y;
import net.minecraft.world.w;

public class ai
extends j {
    private static final net.minecraft.world.gen.feature.ai dId = new net.minecraft.world.gen.feature.ai();
    private static final aj dIe = new aj(false);
    private static final y dIf = new y(false, false);
    private static final y dIg = new y(false, true);
    private static final e dIh = new e(Blocks.cMa, 0);
    private final int dIi;

    public ai(int n2, int n3) {
        super(n2);
        this.dIi = n3;
        this.dHj.add(new m(net.minecraft.entity.passive.ai.class, 8, 4, 4));
        this.dHh.dFB = 10;
        if (n3 != 1 && n3 != 2) {
            this.dHh.dFD = 1;
            this.dHh.dFF = 1;
        } else {
            this.dHh.dFD = 7;
            this.dHh.dFE = 1;
            this.dHh.dFF = 3;
        }
    }

    @Override
    public a j(Random random) {
        return (this.dIi == 1 || this.dIi == 2) && random.nextInt(3) == 0 ? (this.dIi != 2 && random.nextInt(13) != 0 ? dIf : dIg) : (random.nextInt(3) == 0 ? dId : dIe);
    }

    @Override
    public ao k(Random random) {
        return random.nextInt(5) > 0 ? new ak(BlockTallGrass$EnumType.bcA) : new ak(BlockTallGrass$EnumType.bcz);
    }

    @Override
    public void a(w w2, Random random, b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.dIi == 1 || this.dIi == 2) {
            n5 = random.nextInt(3);
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                b b3 = w2.aQ(b2.C(n3, 0, n2));
                dIh.b(w2, random, b3);
            }
        }
        dGW.a(BlockDoublePlant$EnumPlantType.aUk);
        for (n5 = 0; n5 < 7; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            n2 = random.nextInt(w2.aQ(b2.C(n4, 0, n3)).wu() + 32);
            dGW.b(w2, random, b2.C(n4, n2, n3));
        }
        super.a(w2, random, b2);
    }

    @Override
    public void a(w w2, Random random, f f2, int n2, int n3, double d2) {
        if (this.dIi == 1 || this.dIi == 2) {
            this.dGZ = Blocks.cLe.xM();
            this.dHa = Blocks.cLf.xM();
            if (d2 > 1.75) {
                this.dGZ = Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTF);
            } else if (d2 > -0.95) {
                this.dGZ = Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTG);
            }
        }
        this.b(w2, random, f2, n2, n3, d2);
    }

    @Override
    protected j in(int n2) {
        return this.dHo == j.dGL.dHo ? new ai(n2, 2).s(5858897, true).gE("Mega Spruce Taiga").ik(5159473).B(0.25f, 0.8f).a(new l(this.dHc, this.dHd)) : super.in(n2);
    }
}

