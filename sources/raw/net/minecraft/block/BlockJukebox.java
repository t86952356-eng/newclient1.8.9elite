/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockJukebox$TileEntityJukebox;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.item.i;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockJukebox
extends BlockContainer {
    public static final PropertyBool aWt = PropertyBool.cs("has_record");

    protected BlockJukebox() {
        super(Material.ber, MapColor.bdM);
        this.h(this.aSG.zS().a(aWt, false));
        this.a(a.cpy);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (iBlockState.b(aWt).booleanValue()) {
            this.s(w2, b2, iBlockState);
            iBlockState = iBlockState.a(aWt, false);
            w2.a(b2, iBlockState, 2);
            return true;
        }
        return false;
    }

    public void a(w w2, b b2, IBlockState iBlockState, co co2) {
        net.minecraft.tileentity.d d2;
        if (!w2.dDw && (d2 = w2.K(b2)) instanceof BlockJukebox$TileEntityJukebox) {
            ((BlockJukebox$TileEntityJukebox)d2).E(new co(co2.bP(), 1, co2.yc()));
            w2.a(b2, iBlockState.a(aWt, true), 2);
        }
    }

    private void s(w w2, b b2, IBlockState iBlockState) {
        BlockJukebox$TileEntityJukebox blockJukebox$TileEntityJukebox;
        co co2;
        net.minecraft.tileentity.d d2;
        if (!w2.dDw && (d2 = w2.K(b2)) instanceof BlockJukebox$TileEntityJukebox && (co2 = (blockJukebox$TileEntityJukebox = (BlockJukebox$TileEntityJukebox)d2).yw()) != null) {
            w2.e(1005, b2, 0);
            w2.a(b2, (String)null);
            blockJukebox$TileEntityJukebox.E(null);
            float f2 = 0.7f;
            double d3 = (double)(w2.dDk.nextFloat() * 0.7f) + (double)0.15f;
            double d4 = (double)(w2.dDk.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
            double d5 = (double)(w2.dDk.nextFloat() * 0.7f) + (double)0.15f;
            co co3 = co2.aeg();
            i i2 = new i(w2, (double)b2.wt() + d3, (double)b2.wu() + d4, (double)b2.wx() + d5, co3);
            i2.Yn();
            w2.G(i2);
        }
    }

    @Override
    public void d(w w2, b b2, IBlockState iBlockState) {
        this.s(w2, b2, iBlockState);
        super.d(w2, b2, iBlockState);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        if (!w2.dDw) {
            super.a(w2, b2, iBlockState, f2, 0);
        }
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new BlockJukebox$TileEntityJukebox();
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        co co2;
        net.minecraft.tileentity.d d2 = w2.K(b2);
        if (d2 instanceof BlockJukebox$TileEntityJukebox && (co2 = ((BlockJukebox$TileEntityJukebox)d2).yw()) != null) {
            return d.p(co2.bP()) + 1 - d.p(Items.cSu);
        }
        return 0;
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aWt, n2 > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aWt) != false ? 1 : 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aWt);
    }
}

