/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.biome;

import java.util.Random;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.d;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.af;
import net.minecraft.world.gen.feature.ak;
import net.minecraft.world.gen.feature.al;
import net.minecraft.world.gen.feature.am;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.x;
import net.minecraft.world.gen.feature.z;

public class w
extends j {
    private final boolean dHM;
    private static final IBlockState dHN = Blocks.cLt.xM().a(BlockOldLog.aXm, BlockPlanks$EnumType.aXM);
    private static final IBlockState dHO = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXM).a(BlockLeaves.aWz, false);
    private static final IBlockState dHP = Blocks.cLv.xM().a(BlockOldLeaf.aXl, BlockPlanks$EnumType.aXJ).a(BlockLeaves.aWz, false);

    public w(int n2, boolean bl2) {
        super(n2);
        this.dHM = bl2;
        this.dHh.dFB = bl2 ? 2 : 50;
        this.dHh.dFD = 25;
        this.dHh.dFC = 4;
        if (!bl2) {
            this.dHi.add(new m(net.minecraft.entity.passive.j.class, 2, 1, 1));
        }
        this.dHj.add(new m(d.class, 10, 4, 4));
    }

    @Override
    public a j(Random random) {
        return random.nextInt(10) == 0 ? this.dHq : (random.nextInt(2) == 0 ? new af(dHN, dHP) : (!this.dHM && random.nextInt(3) == 0 ? new x(false, 10, 20, dHN, dHO) : new al(false, 4 + random.nextInt(7), dHN, dHO, true)));
    }

    @Override
    public ao k(Random random) {
        return random.nextInt(4) == 0 ? new ak(BlockTallGrass$EnumType.bcA) : new ak(BlockTallGrass$EnumType.bcz);
    }

    @Override
    public void a(net.minecraft.world.w w2, Random random, b b2) {
        super.a(w2, random, b2);
        int n2 = random.nextInt(16) + 8;
        int n3 = random.nextInt(16) + 8;
        int n4 = random.nextInt(w2.aQ(b2.C(n2, 0, n3)).wu() * 2);
        new z().b(w2, random, b2.C(n2, n4, n3));
        am am2 = new am();
        for (n3 = 0; n3 < 50; ++n3) {
            n4 = random.nextInt(16) + 8;
            int n5 = 128;
            int n6 = random.nextInt(16) + 8;
            am2.b(w2, random, b2.C(n4, 128, n6));
        }
    }
}

