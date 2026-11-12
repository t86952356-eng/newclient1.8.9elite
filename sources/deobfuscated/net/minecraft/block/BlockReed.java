/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockReed
extends Block {
    public static final PropertyInteger aZZ = PropertyInteger.e("age", 0, 15);

    protected BlockReed() {
        super(Material.bey);
        this.h(this.aSG.zS().a(aZZ, 0));
        float f2 = 0.375f;
        this.a(0.125f, 0.0f, 0.125f, 0.875f, 1.0f, 0.875f);
        this.O(true);
    }

    @Override
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        if ((w2.L(b2.aqY()).df() == Blocks.cMO || this.F(w2, b2, iBlockState)) && w2.aG(b2.aqX())) {
            int n2 = 1;
            while (w2.L(b2.hr(n2)).df() == this) {
                ++n2;
            }
            if (n2 < 3) {
                int n3 = iBlockState.b(aZZ);
                if (n3 == 15) {
                    w2.d(b2.aqX(), this.xM());
                    w2.a(b2, iBlockState.a(aZZ, 0), 4);
                } else {
                    w2.a(b2, iBlockState.a(aZZ, n3 + 1), 4);
                }
            }
        }
    }

    @Override
    public boolean d(w w2, b b2) {
        Block block = w2.L(b2.aqY()).df();
        if (block == this) {
            return true;
        }
        if (block != Blocks.cLe && block != Blocks.cLf && block != Blocks.cLo) {
            return false;
        }
        for (ao ao2 : ar.dwT) {
            if (w2.L(b2.x(ao2).aqY()).df().xb() != Material.bev) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        this.F(w2, b2, iBlockState);
    }

    protected final boolean F(w w2, b b2, IBlockState iBlockState) {
        if (this.p(w2, b2)) {
            return true;
        }
        this.a(w2, b2, iBlockState, 0);
        w2.aL(b2);
        return false;
    }

    public boolean p(w w2, b b2) {
        return this.d(w2, b2);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        return null;
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Items.cQN;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cQN;
    }

    @Override
    public int a(l l2, b b2, int n2) {
        return l2.aF(b2).bj(b2);
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aZZ, n2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aZZ);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aZZ);
    }
}

