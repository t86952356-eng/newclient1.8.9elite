/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.d;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockFarmland
extends Block {
    public static final PropertyInteger aUC = PropertyInteger.e("moisture", 0, 7);

    protected BlockFarmland() {
        super(Material.beq);
        this.h(this.aSG.zS().a(aUC, 0));
        this.O(true);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.aN(255);
    }

    @Override
    public a a(w w2, b b2, IBlockState iBlockState) {
        if (ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47) {
            return new a(b2.wt(), b2.wu(), b2.wx(), b2.wt() + 1, b2.wu() + 1, b2.wx() + 1);
        }
        return new a(b2.wt(), b2.wu(), b2.wx(), b2.wt() + 1, (float)b2.wu() + 0.9375f, b2.wx() + 1);
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
    public void b(w w2, b b2, IBlockState iBlockState, Random random) {
        int n2 = iBlockState.b(aUC);
        if (!this.E(w2, b2) && !w2.be(b2.aqX())) {
            if (n2 > 0) {
                w2.a(b2, iBlockState.a(aUC, n2 - 1), 2);
            } else if (!this.D(w2, b2)) {
                w2.d(b2, Blocks.cLf.xM());
            }
        } else if (n2 < 7) {
            w2.a(b2, iBlockState.a(aUC, 7), 2);
        }
    }

    @Override
    public void a(w w2, b b2, c c2, float f2) {
        if (c2 instanceof r) {
            if (!w2.dDw && w2.dDk.nextFloat() < f2 - 0.5f) {
                if (!(c2 instanceof net.minecraft.entity.player.a) && !w2.Si().gw("mobGriefing")) {
                    return;
                }
                w2.d(b2, Blocks.cLf.xM());
            }
            super.a(w2, b2, c2, f2);
        }
    }

    private boolean D(w w2, b b2) {
        Block block = w2.L(b2.aqX()).df();
        return block instanceof BlockCrops || block instanceof BlockStem;
    }

    private boolean E(w w2, b b2) {
        for (g g2 : b.c(b2.C(-4, 0, -4), b2.C(4, 1, 4))) {
            if (w2.L(g2).df().xb() != Material.bev) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        super.a(w2, b2, iBlockState, block);
        if (w2.L(b2.aqX()).df().xb().zw()) {
            w2.d(b2, Blocks.cLf.xM());
        }
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        switch (ao2) {
            case dwr: {
                return true;
            }
            case dws: 
            case dwt: 
            case dwu: 
            case dwv: {
                Block block = l2.L(b2).df();
                return !block.xk() && block != Blocks.cMm;
            }
        }
        return super.a(l2, b2, ao2);
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return Blocks.cLf.a(Blocks.cLf.xM().a(BlockDirt.aTC, BlockDirt$DirtType.aTE), random, n2);
    }

    @Override
    public d e(w w2, b b2) {
        return d.I(Blocks.cLf);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aUC, n2 & 7);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aUC);
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aUC);
    }
}

