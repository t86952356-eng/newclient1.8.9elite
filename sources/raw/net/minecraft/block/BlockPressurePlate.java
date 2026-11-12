/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.BlockPressurePlate$Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.a;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockPressurePlate
extends BlockBasePressurePlate {
    public static final PropertyBool aYe = PropertyBool.cs("powered");
    private final BlockPressurePlate$Sensitivity aYf;

    protected BlockPressurePlate(Material material, BlockPressurePlate$Sensitivity blockPressurePlate$Sensitivity) {
        super(material);
        this.h(this.aSG.zS().a(aYe, false));
        this.aYf = blockPressurePlate$Sensitivity;
    }

    @Override
    protected int j(IBlockState iBlockState) {
        return iBlockState.b(aYe) != false ? 15 : 0;
    }

    @Override
    protected IBlockState a(IBlockState iBlockState, int n2) {
        return iBlockState.a(aYe, n2 > 0);
    }

    @Override
    protected int l(w w2, b b2) {
        List<c> list;
        a a2 = this.x(b2);
        switch (this.aYf.ordinal()) {
            case 0: {
                list = w2.b((c)null, a2);
                break;
            }
            case 1: {
                list = w2.a(r.class, a2);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!list.isEmpty()) {
            for (c c2 : list) {
                if (c2.Uj()) continue;
                return 15;
            }
        }
        return 0;
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aYe, n2 == 1);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aYe) != false ? 1 : 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aYe);
    }
}

