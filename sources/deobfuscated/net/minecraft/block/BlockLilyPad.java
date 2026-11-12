/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.entity.item.b;
import net.minecraft.init.Blocks;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockLilyPad
extends BlockBush {
    protected BlockLilyPad() {
        float f2 = 0.5f;
        float f3 = 0.015625f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.015625f, 1.0f);
        this.a(a.cpy);
    }

    @Override
    public void a(w w2, net.minecraft.util.b b2, IBlockState iBlockState, net.minecraft.util.a a2, List<net.minecraft.util.a> list, c c2) {
        if (c2 == null || !(c2 instanceof b)) {
            super.a(w2, b2, iBlockState, a2, list, c2);
        }
    }

    @Override
    public net.minecraft.util.a a(w w2, net.minecraft.util.b b2, IBlockState iBlockState) {
        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47) {
            return new net.minecraft.util.a((double)b2.wt() + this.aSv, (double)b2.wu() + this.aSw, (double)b2.wx() + this.aSx, (double)b2.wt() + this.aSy, (double)b2.wu() + this.aSz, (double)b2.wx() + this.aSA);
        }
        return new net.minecraft.util.a((double)b2.wt() + 0.0625, b2.wu(), (double)b2.wx() + 0.0625, (double)b2.wt() + 0.9375, (double)b2.wu() + 0.09375, (double)b2.wx() + 0.9375);
    }

    @Override
    public int xv() {
        return 7455580;
    }

    @Override
    public int e(IBlockState iBlockState) {
        return 7455580;
    }

    @Override
    public int a(l l2, net.minecraft.util.b b2, int n2) {
        return 2129968;
    }

    @Override
    protected boolean l(Block block) {
        return block == Blocks.cLl;
    }

    @Override
    public boolean f(w w2, net.minecraft.util.b b2, IBlockState iBlockState) {
        if (b2.wu() >= 0 && b2.wu() < 256) {
            IBlockState iBlockState2 = w2.L(b2.aqY());
            return iBlockState2.df().xb() == Material.bev && iBlockState2.b(BlockLiquid.aWV) == 0;
        }
        return false;
    }

    @Override
    public int c(IBlockState iBlockState) {
        return 0;
    }
}

