/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockWall
extends Block {
    public static final PropertyBool bdj = PropertyBool.cs("up");
    public static final PropertyBool bdk = PropertyBool.cs("north");
    public static final PropertyBool bdl = PropertyBool.cs("east");
    public static final PropertyBool bdm = PropertyBool.cs("south");
    public static final PropertyBool bdn = PropertyBool.cs("west");
    public static final PropertyEnum<BlockWall$EnumType> bdo = PropertyEnum.c("variant", BlockWall$EnumType.class);

    public BlockWall(Block block) {
        super(block.aSD);
        this.h(this.aSG.zS().a(bdj, false).a(bdk, false).a(bdl, false).a(bdm, false).a(bdn, false).a(bdo, BlockWall$EnumType.bdp));
        this.L(block.aSq);
        this.K(block.aSr / 3.0f);
        this.a(block.aSB);
        this.a(a.cpx);
    }

    @Override
    public String xA() {
        return cr.gm(this.xB() + "." + BlockWall$EnumType.bdp.xB() + ".name");
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean a(l l2, b b2) {
        return false;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public void c(l l2, b b2) {
        boolean bl2 = this.i(l2, b2.aqZ());
        boolean bl3 = this.i(l2, b2.ara());
        boolean bl4 = this.i(l2, b2.arb());
        boolean bl5 = this.i(l2, b2.arc());
        float f2 = 0.25f;
        float f3 = 0.75f;
        float f4 = 0.25f;
        float f5 = 0.75f;
        float f6 = 1.0f;
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
        if (bl2 && bl3 && !bl4 && !bl5) {
            f6 = 0.8125f;
            f2 = 0.3125f;
            f3 = 0.6875f;
        } else if (!bl2 && !bl3 && bl4 && bl5) {
            f6 = 0.8125f;
            f4 = 0.3125f;
            f5 = 0.6875f;
        }
        this.a(f2, 0.0f, f4, f3, f6, f5);
    }

    @Override
    public net.minecraft.util.a a(w w2, b b2, IBlockState iBlockState) {
        this.c((l)w2, b2);
        this.aSz = 1.5;
        return super.a(w2, b2, iBlockState);
    }

    public boolean i(l l2, b b2) {
        Block block = l2.L(b2).df();
        return block != Blocks.cOx && (block == this || block instanceof BlockFenceGate || block.aSD.isOpaque() && block.xf() && block.aSD != Material.beQ);
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockWall$EnumType blockWall$EnumType : BlockWall$EnumType.values()) {
            list.add(new co(d2, 1, blockWall$EnumType.yc()));
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(bdo).yc();
    }

    @Override
    public boolean a(l l2, b b2, ao ao2) {
        return ao2 != ao.dwq || super.a(l2, b2, ao2);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(bdo, BlockWall$EnumType.bt(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(bdo).yc();
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        return iBlockState.a(bdj, !l2.aG(b2.aqX())).a(bdk, this.i(l2, b2.aqZ())).a(bdl, this.i(l2, b2.arc())).a(bdm, this.i(l2, b2.ara())).a(bdn, this.i(l2, b2.arb()));
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, bdj, bdk, bdl, bdn, bdm, bdo);
    }
}

