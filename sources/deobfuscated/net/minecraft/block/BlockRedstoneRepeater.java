/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockRedstoneRepeater
extends BlockRedstoneDiode {
    public static final PropertyBool aZJ = PropertyBool.cs("locked");
    public static final PropertyInteger aZK = PropertyInteger.e("delay", 1, 4);

    protected BlockRedstoneRepeater(boolean bl2) {
        super(bl2);
        this.h(this.aSG.zS().a(aTB, ao.dws).a(aZK, 1).a(aZJ, false));
    }

    @Override
    public String xA() {
        return cr.gm("item.diode.name");
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        return iBlockState.a(aZJ, this.b(l2, b2, iBlockState));
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, a a2, ao ao2, float f2, float f3, float f4) {
        if (!a2.cIt.cJN) {
            return false;
        }
        w2.a(b2, iBlockState.c(aZK), 3);
        return true;
    }

    @Override
    protected int q(IBlockState iBlockState) {
        return iBlockState.b(aZK) * 2;
    }

    @Override
    protected IBlockState r(IBlockState iBlockState) {
        Integer n2 = iBlockState.b(aZK);
        Boolean bl2 = iBlockState.b(aZJ);
        ao ao2 = iBlockState.b(aTB);
        return Blocks.cNe.xM().a(aTB, ao2).a(aZK, n2).a(aZJ, bl2);
    }

    @Override
    protected IBlockState s(IBlockState iBlockState) {
        Integer n2 = iBlockState.b(aZK);
        Boolean bl2 = iBlockState.b(aZJ);
        ao ao2 = iBlockState.b(aTB);
        return Blocks.cNd.xM().a(aTB, ao2).a(aZK, n2).a(aZJ, bl2);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cRf;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cRf;
    }

    @Override
    public boolean b(l l2, b b2, IBlockState iBlockState) {
        return this.c(l2, b2, iBlockState) > 0;
    }

    @Override
    protected boolean q(Block block) {
        return BlockRedstoneRepeater.r(block);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        if (this.aZG) {
            ao ao2 = iBlockState.b(aTB);
            double d2 = (double)((float)b2.wt() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d3 = (double)((float)b2.wu() + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d4 = (double)((float)b2.wx() + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            float f2 = -5.0f;
            if (random.nextBoolean()) {
                f2 = iBlockState.b(aZK) * 2 - 1;
            }
            double d5 = (f2 /= 16.0f) * (float)ao2.asH();
            double d6 = f2 * (float)ao2.asJ();
            w2.a(as.dxA, d2 + d5, d3, d4 + d6, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        super.d(w2, b2, iBlockState);
        this.B(w2, b2, iBlockState);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTB, ao.hz(n2)).a(aZJ, false).a(aZK, 1 + (n2 >> 2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aTB).asA();
        return n2 |= iBlockState.b(aZK) - 1 << 2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTB, aZK, aZJ);
    }
}

