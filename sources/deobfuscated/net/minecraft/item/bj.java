/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.item.v;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class bj
extends d {
    protected v cWB;

    public bj(v v2) {
        this.cWB = v2;
        this.cVn = 1;
        this.fW(v2.adG());
        this.d(a.cpE);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (!a2.a(b2.x(ao2), ao2, co2)) {
            return false;
        }
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        if (ao2 != ao.dwq && w2.L(b2.aqX()).df().xb() == Material.beo) {
            if (block == Blocks.cLe) {
                return this.a(co2, a2, w2, b2, Blocks.cMm.xM());
            }
            if (block == Blocks.cLf) {
                switch (iBlockState.b(BlockDirt.aTC)) {
                    case aTE: {
                        return this.a(co2, a2, w2, b2, Blocks.cMm.xM());
                    }
                    case aTF: {
                        return this.a(co2, a2, w2, b2, Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTE));
                    }
                }
            }
        }
        return false;
    }

    protected boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, IBlockState iBlockState) {
        w2.a((float)b2.wt() + 0.5f, (double)((float)b2.wu() + 0.5f), (double)((float)b2.wx() + 0.5f), iBlockState.df().aSB.xR(), (iBlockState.df().aSB.getVolume() + 1.0f) / 2.0f, iBlockState.df().aSB.xT() * 0.8f);
        if (w2.dDw) {
            return true;
        }
        w2.d(b2, iBlockState);
        co2.b(1, (r)a2);
        return true;
    }

    @Override
    public boolean adw() {
        return true;
    }

    public v adY() {
        return this.cWB;
    }

    public String adZ() {
        return this.cWB.toString();
    }
}

