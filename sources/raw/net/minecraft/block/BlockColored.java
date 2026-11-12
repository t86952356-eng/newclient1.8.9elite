/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class BlockColored
extends Block {
    public static final PropertyEnum<b> aTw = PropertyEnum.c("color", b.class);

    public BlockColored(Material material) {
        super(material);
        this.h(this.aSG.zS().a(aTw, b.cUC));
        this.a(a.cpx);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aTw).yc();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (b b2 : b.values()) {
            list.add(new co(d2, 1, b2.yc()));
        }
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(aTw).lv();
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aTw, b.fS(n2));
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aTw).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTw);
    }
}

