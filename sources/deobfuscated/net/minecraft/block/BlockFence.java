/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.bl;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockFence
extends Block {
    public static final PropertyBool aUE = PropertyBool.cs("north");
    public static final PropertyBool aUF = PropertyBool.cs("east");
    public static final PropertyBool aUG = PropertyBool.cs("south");
    public static final PropertyBool aUH = PropertyBool.cs("west");

    public BlockFence(Material material) {
        this(material, material.zK());
    }

    public BlockFence(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.h(this.aSG.zS().a(aUE, false).a(aUF, false).a(aUG, false).a(aUH, false));
        this.a(a.cpy);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, net.minecraft.util.a a2, List<net.minecraft.util.a> list, c c2) {
        boolean bl2 = this.i(w2, b2.aqZ());
        boolean bl3 = this.i(w2, b2.ara());
        boolean bl4 = this.i(w2, b2.arb());
        boolean bl5 = this.i(w2, b2.arc());
        float f2 = 0.375f;
        float f3 = 0.625f;
        float f4 = 0.375f;
        float f5 = 0.625f;
        if (bl2) {
            f4 = 0.0f;
        }
        if (bl3) {
            f5 = 1.0f;
        }
        if (bl2 || bl3) {
            this.a(f2, 0.0f, f4, f3, 1.5f, f5);
            super.a(w2, b2, iBlockState, a2, list, c2);
        }
        f4 = 0.375f;
        f5 = 0.625f;
        if (bl4) {
            f2 = 0.0f;
        }
        if (bl5) {
            f3 = 1.0f;
        }
        if (bl4 || bl5 || !bl2 && !bl3) {
            this.a(f2, 0.0f, f4, f3, 1.5f, f5);
            super.a(w2, b2, iBlockState, a2, list, c2);
        }
        if (bl2) {
            f4 = 0.0f;
        }
        if (bl3) {
            f5 = 1.0f;
        }
        this.a(f2, 0.0f, f4, f3, 1.0f, f5);
    }

    @Override
    public void c(l l2, b b2) {
        boolean bl2 = this.i(l2, b2.aqZ());
        boolean bl3 = this.i(l2, b2.ara());
        boolean bl4 = this.i(l2, b2.arb());
        boolean bl5 = this.i(l2, b2.arc());
        float f2 = 0.375f;
        float f3 = 0.625f;
        float f4 = 0.375f;
        float f5 = 0.625f;
        if (bl2) {
            f4 = 0.0f;
        }
        if (bl3) {
            f5 = 1.0f;
        }
        if (bl4) {
            f2 = 0.0f;
        }
        if (bl5) {
            f3 = 1.0f;
        }
        this.a(f2, 0.0f, f4, f3, 1.0f, f5);
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
    public boolean a(l l2, b b2) {
        return false;
    }

    public boolean i(l l2, b b2) {
        Block block = l2.L(b2).df();
        return block != Blocks.cOx && (block instanceof BlockFence && block.aSD == this.aSD || block instanceof BlockFenceGate || block.aSD.isOpaque() && block.xf() && block.aSD != Material.beQ);
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return true;
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        return w2.dDw || bl.b(a2, w2, b2);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return 0;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        return iBlockState.a(aUE, this.i(l2, b2.aqZ())).a(aUF, this.i(l2, b2.arc())).a(aUG, this.i(l2, b2.ara())).a(aUH, this.i(l2, b2.arb()));
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aUE, aUF, aUH, aUG);
    }
}

