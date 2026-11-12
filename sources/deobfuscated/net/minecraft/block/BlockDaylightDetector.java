/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.tileentity.r;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.g;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockDaylightDetector
extends BlockContainer {
    public static final PropertyInteger aTz = PropertyInteger.e("power", 0, 15);
    private final boolean aTA;

    public BlockDaylightDetector(boolean bl2) {
        super(Material.ber);
        this.aTA = bl2;
        this.h(this.aSG.zS().a(aTz, 0));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.a(a.cpz);
        this.L(0.2f);
        this.a(aRZ);
        this.cr("daylightDetector");
    }

    @Override
    public void c(l l2, b b2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }

    @Override
    public int a(l l2, b b2, IBlockState iBlockState, ao ao2) {
        return iBlockState.b(aTz);
    }

    public void w(w w2, b b2) {
        if (!w2.dDl.awf()) {
            IBlockState iBlockState = w2.L(b2);
            int n2 = w2.b(g.dBZ, b2) - w2.avP();
            float f2 = w2.bU(1.0f);
            float f3 = f2 < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
            f2 += (f3 - f2) * 0.2f;
            n2 = Math.round((float)n2 * bt.bB(f2));
            n2 = bt.F(n2, 0, 15);
            if (this.aTA) {
                n2 = 15 - n2;
            }
            if (iBlockState.b(aTz) != n2) {
                w2.a(b2, iBlockState.a(aTz, n2), 3);
            }
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (a2.aca()) {
            if (w2.dDw) {
                return true;
            }
            if (this.aTA) {
                w2.a(b2, Blocks.cOnn.xM().a(aTz, iBlockState.b(aTz)), 4);
                Blocks.cOnn.w(w2, b2);
            } else {
                w2.a(b2, Blocks.cOo.xM().a(aTz, iBlockState.b(aTz)), 4);
                Blocks.cOo.w(w2, b2);
            }
            return true;
        }
        return super.a(w2, b2, iBlockState, a2, ao2, f2, f3, f4);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return d.I(Blocks.cOnn);
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(Blocks.cOnn);
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public int xg() {
        return 3;
    }

    @Override
    public boolean xw() {
        return true;
    }

    @Override
    public net.minecraft.tileentity.d a(w w2, int n2) {
        return new r();
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTz, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTz);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTz);
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        if (!this.aTA) {
            super.a(d2, a2, list);
        }
    }
}

