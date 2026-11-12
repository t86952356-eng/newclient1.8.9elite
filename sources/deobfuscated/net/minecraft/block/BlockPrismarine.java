/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPrismarine$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.cr;

public class BlockPrismarine
extends Block {
    public static final PropertyEnum<BlockPrismarine$EnumType> aYl = PropertyEnum.c("variant", BlockPrismarine$EnumType.class);
    public static final int aYm = BlockPrismarine$EnumType.aYp.yc();
    public static final int aYn = BlockPrismarine$EnumType.aYq.yc();
    public static final int aYo = BlockPrismarine$EnumType.aYr.yc();

    public BlockPrismarine() {
        super(Material.bes);
        this.h(this.aSG.zS().a(aYl, BlockPrismarine$EnumType.aYp));
        this.a(a.cpx);
    }

    @Override
    public String xA() {
        return cr.gm(this.xB() + "." + BlockPrismarine$EnumType.aYp.xB() + ".name");
    }

    @Override
    public MapColor b(IBlockState iBlockState) {
        return iBlockState.b(aYl) == BlockPrismarine$EnumType.aYp ? MapColor.bdZ : MapColor.beh;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(aYl).yc();
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(aYl).yc();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aYl);
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(aYl, BlockPrismarine$EnumType.be(n2));
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, aYm));
        list.add(new co(d2, 1, aYn));
        list.add(new co(d2, 1, aYo));
    }
}

