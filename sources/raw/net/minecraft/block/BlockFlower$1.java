/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;

class BlockFlower$1
implements Predicate<BlockFlower$EnumFlowerType> {
    final /* synthetic */ BlockFlower aUW;

    BlockFlower$1(BlockFlower blockFlower) {
        this.aUW = blockFlower;
    }

    public boolean a(BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        return blockFlower$EnumFlowerType.yp() == this.aUW.yp();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((BlockFlower$EnumFlowerType)object);
    }
}

