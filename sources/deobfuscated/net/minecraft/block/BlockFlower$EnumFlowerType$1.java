/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;

class BlockFlower$EnumFlowerType$1
implements Predicate<BlockFlower$EnumFlowerType> {
    final /* synthetic */ BlockFlower$EnumFlowerColor aVq;

    BlockFlower$EnumFlowerType$1(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor) {
        this.aVq = blockFlower$EnumFlowerColor;
    }

    public boolean a(BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        return blockFlower$EnumFlowerType.yp() == this.aVq;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((BlockFlower$EnumFlowerType)object);
    }
}

