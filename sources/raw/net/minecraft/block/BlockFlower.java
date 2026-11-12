/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower$1;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.item.co;
import net.minecraft.item.d;

public abstract class BlockFlower
extends BlockBush {
    protected PropertyEnum<BlockFlower$EnumFlowerType> aUV;

    protected BlockFlower() {
        this.h(this.aSG.zS().a(this.yq(), this.yp() == BlockFlower$EnumFlowerColor.aUY ? BlockFlower$EnumFlowerType.aVb : BlockFlower$EnumFlowerType.aVa));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(this.yq()).yi();
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        for (BlockFlower$EnumFlowerType blockFlower$EnumFlowerType : BlockFlower$EnumFlowerType.a(this.yp())) {
            list.add(new co(d2, 1, blockFlower$EnumFlowerType.yi()));
        }
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(this.yq(), BlockFlower$EnumFlowerType.a(this.yp(), n2));
    }

    public abstract BlockFlower$EnumFlowerColor yp();

    public IProperty<BlockFlower$EnumFlowerType> yq() {
        if (this.aUV == null) {
            this.aUV = PropertyEnum.a("type", BlockFlower$EnumFlowerType.class, new BlockFlower$1(this));
        }
        return this.aUV;
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(this.yq()).yi();
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, this.yq());
    }

    @Override
    public Block$EnumOffsetType xN() {
        return Block$EnumOffsetType.aSK;
    }
}

