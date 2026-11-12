/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockHay
extends BlockRotatedPillar {
    public BlockHay() {
        super(Material.bep, MapColor.bdU);
        this.h(this.aSG.zS().a(baa, ap.dwI));
        this.a(a.cpx);
    }

    @Override
    public IBlockState aM(int n2) {
        ap ap2 = ap.dwI;
        int n3 = n2 & 0xC;
        if (n3 == 4) {
            ap2 = ap.dwH;
        } else if (n3 == 8) {
            ap2 = ap.dwJ;
        }
        return this.xM().a(baa, ap2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        ap ap2 = (ap)iBlockState.b(baa);
        if (ap2 == ap.dwH) {
            n2 |= 4;
        } else if (ap2 == ap.dwJ) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, baa);
    }

    @Override
    protected co f(IBlockState iBlockState) {
        return new co(d.I(this), 1, 0);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return super.a(w2, b2, ao2, f2, f3, f4, n2, r2).a(baa, ao2.asL());
    }
}

