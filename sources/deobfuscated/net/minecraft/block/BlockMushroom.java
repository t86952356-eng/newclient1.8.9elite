/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.b;
import net.minecraft.world.w;

public class BlockMushroom
extends BlockBush
implements IGrowable {
    protected BlockMushroom() {
        float f2 = 0.2f;
        this.a(0.3f, 0.0f, 0.3f, 0.7f, 0.4f, 0.7f);
        this.O(true);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void b(w w2, net.minecraft.util.b object, IBlockState iBlockState, Random random) {
        if (random.nextInt(25) == 0) {
            void var8_10;
            int n2 = 5;
            int n3 = 4;
            for (net.minecraft.util.b b2 : net.minecraft.util.b.c(((net.minecraft.util.b)object).C(-4, -1, -4), ((net.minecraft.util.b)object).C(4, 1, 4))) {
                if (w2.L(b2).df() != this || --n2 > 0) continue;
                return;
            }
            Object object2 = ((net.minecraft.util.b)object).C(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            boolean i2 = false;
            while (var8_10 < 4) {
                if (w2.aG((net.minecraft.util.b)object2) && this.f(w2, (net.minecraft.util.b)object2, this.xM())) {
                    object = object2;
                }
                object2 = ((net.minecraft.util.b)object).C(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
                ++var8_10;
            }
            if (w2.aG((net.minecraft.util.b)object2) && this.f(w2, (net.minecraft.util.b)object2, this.xM())) {
                w2.a((net.minecraft.util.b)object2, this.xM(), 2);
            }
        }
    }

    @Override
    public boolean d(w w2, net.minecraft.util.b b2) {
        return super.d(w2, b2) && this.f(w2, b2, this.xM());
    }

    @Override
    protected boolean l(Block block) {
        return block.isFullBlock();
    }

    @Override
    public boolean f(w w2, net.minecraft.util.b b2, IBlockState iBlockState) {
        if (b2.wu() >= 0 && b2.wu() < 256) {
            IBlockState iBlockState2 = w2.L(b2.aqY());
            return iBlockState2.df() == Blocks.cNy || iBlockState2.df() == Blocks.cLf && iBlockState2.b(BlockDirt.aTC) == BlockDirt$DirtType.aTG || w2.aO(b2) < 13 && this.l(iBlockState2.df());
        }
        return false;
    }

    public boolean d(w w2, net.minecraft.util.b b2, IBlockState iBlockState, Random random) {
        w2.aL(b2);
        b b3 = null;
        if (this == Blocks.cLR) {
            b3 = new b(Blocks.cNi);
        } else if (this == Blocks.cLS) {
            b3 = new b(Blocks.cNj);
        }
        if (b3 != null && ((ao)b3).b(w2, random, b2)) {
            return true;
        }
        w2.a(b2, iBlockState, 3);
        return false;
    }

    @Override
    public boolean a(w w2, net.minecraft.util.b b2, IBlockState iBlockState, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(w w2, Random random, net.minecraft.util.b b2, IBlockState iBlockState) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void b(w w2, Random random, net.minecraft.util.b b2, IBlockState iBlockState) {
        this.d(w2, b2, iBlockState, random);
    }
}

