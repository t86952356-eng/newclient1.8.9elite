/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.a;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class cj
extends af {
    private final BlockSlab cWV;
    private final BlockSlab cWW;

    public cj(Block block, BlockSlab blockSlab, BlockSlab blockSlab2) {
        super(block);
        this.cWV = blockSlab;
        this.cWW = blockSlab2;
        this.fW(0);
        this.bM(true);
    }

    @Override
    public int fV(int n2) {
        return n2;
    }

    @Override
    public String ao(co co2) {
        return this.cWV.bm(co2.yc());
    }

    @Override
    public boolean a(co co2, a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (co2.cWZ == 0) {
            return false;
        }
        if (!a2.a(b2.x(ao2), ao2, co2)) {
            return false;
        }
        Object object = this.cWV.F(co2);
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() == this.cWV) {
            IProperty<?> iProperty = this.cWV.ze();
            Object obj = iBlockState.b(iProperty);
            BlockSlab$EnumBlockHalf blockSlab$EnumBlockHalf = iBlockState.b(BlockSlab.baO);
            if ((ao2 == ao.dwr && blockSlab$EnumBlockHalf == BlockSlab$EnumBlockHalf.baQ || ao2 == ao.dwq && blockSlab$EnumBlockHalf == BlockSlab$EnumBlockHalf.baP) && obj == object) {
                IBlockState iBlockState2 = this.cWW.xM().a(iProperty, obj);
                if (w2.s(this.cWW.a(w2, b2, iBlockState2)) && w2.a(b2, iBlockState2, 3)) {
                    w2.a((float)b2.wt() + 0.5f, (double)((float)b2.wu() + 0.5f), (double)((float)b2.wx() + 0.5f), this.cWW.aSB.xQ(), (this.cWW.aSB.getVolume() + 1.0f) / 2.0f, this.cWW.aSB.xT() * 0.8f);
                    --co2.cWZ;
                }
                return true;
            }
        }
        return this.a(co2, w2, b2.x(ao2), object) || super.a(co2, a2, w2, b2, ao2, f2, f3, f4);
    }

    @Override
    public boolean a(w w2, b b2, ao ao2, a a2, co co2) {
        IBlockState iBlockState;
        b b3 = b2;
        IProperty<?> iProperty = this.cWV.ze();
        Object object = this.cWV.F(co2);
        IBlockState iBlockState2 = w2.L(b2);
        if (iBlockState2.df() == this.cWV) {
            boolean bl2;
            boolean bl3 = bl2 = iBlockState2.b(BlockSlab.baO) == BlockSlab$EnumBlockHalf.baP;
            if ((ao2 == ao.dwr && !bl2 || ao2 == ao.dwq && bl2) && object == iBlockState2.b(iProperty)) {
                return true;
            }
        }
        return (iBlockState = w2.L(b2 = b2.x(ao2))).df() == this.cWV && object == iBlockState.b(iProperty) || super.a(w2, b3, ao2, a2, co2);
    }

    private boolean a(co co2, w w2, b b2, Object object) {
        Object obj;
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() == this.cWV && (obj = iBlockState.b(this.cWV.ze())) == object) {
            IBlockState iBlockState2 = this.cWW.xM().a(this.cWV.ze(), obj);
            if (w2.s(this.cWW.a(w2, b2, iBlockState2)) && w2.a(b2, iBlockState2, 3)) {
                w2.a((float)b2.wt() + 0.5f, (double)((float)b2.wu() + 0.5f), (double)((float)b2.wx() + 0.5f), this.cWW.aSB.xQ(), (this.cWW.aSB.getVolume() + 1.0f) / 2.0f, this.cWW.aSB.xT() * 0.8f);
                --co2.cWZ;
            }
            return true;
        }
        return false;
    }
}

