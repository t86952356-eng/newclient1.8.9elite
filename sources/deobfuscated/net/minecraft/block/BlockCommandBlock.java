/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.server.e;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.tileentity.d;
import net.minecraft.tileentity.o;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockCommandBlock
extends BlockContainer {
    public static final PropertyBool aTx = PropertyBool.cs("triggered");

    public BlockCommandBlock() {
        super(Material.bet, MapColor.bdR);
        this.h(this.aSG.zS().a(aTx, false));
    }

    @Override
    public d a(w w2, int n2) {
        return new o();
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        if (!w2.dDw) {
            boolean bl2 = w2.bb(b2);
            boolean bl3 = iBlockState.b(aTx);
            if (bl2 && !bl3) {
                w2.a(b2, iBlockState.a(aTx, true), 4);
                w2.a(b2, (Block)this, this.c(w2));
            } else if (!bl2 && bl3) {
                w2.a(b2, iBlockState.a(aTx, false), 4);
            }
        }
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        d d2 = w2.K(b2);
        if (d2 instanceof o) {
            ((o)d2).Wo().h(w2);
            w2.f(b2, this);
        }
    }

    @Override
    public int c(w w2) {
        return 1;
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, a a2, ao ao2, float f2, float f3, float f4) {
        d d2 = w2.K(b2);
        return d2 instanceof o && ((o)d2).Wo().m(a2);
    }

    @Override
    public boolean xJ() {
        return true;
    }

    @Override
    public int h(w w2, b b2) {
        d d2 = w2.K(b2);
        return d2 instanceof o ? ((o)d2).Wo().Sw() : 0;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, r r2, co co2) {
        d d2 = w2.K(b2);
        if (d2 instanceof o) {
            e e2 = ((o)d2).Wo();
            if (co2.aen()) {
                e2.setName(co2.getDisplayName());
            }
            if (!w2.dDw) {
                e2.aA(w2.Si().gw("sendCommandFeedback"));
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTx, (n2 & 1) > 0);
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        if (iBlockState.b(aTx).booleanValue()) {
            n2 |= 1;
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTx);
    }

    @Override
    public IBlockState a(w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.xM().a(aTx, false);
    }
}

