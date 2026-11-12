/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Random;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.structure.aa;

class ct
extends aa {
    private ct() {
    }

    @Override
    public void a(Random random, int n2, int n3, int n4, boolean bl2) {
        float f2;
        this.dQM = bl2 ? ((f2 = random.nextFloat()) < 0.2f ? Blocks.cNh.aM(BlockStoneBrick.bbN) : (f2 < 0.5f ? Blocks.cNh.aM(BlockStoneBrick.bbM) : (f2 < 0.55f ? Blocks.cNg.aM(BlockSilverfish$EnumType.baz.yc()) : Blocks.cNh.xM()))) : Blocks.cLc.xM();
    }
}

