/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockPlanks$EnumType;

class BlockOldLog$1
implements Predicate<BlockPlanks$EnumType> {
    BlockOldLog$1() {
    }

    public boolean a(BlockPlanks$EnumType blockPlanks$EnumType) {
        return blockPlanks$EnumType.yc() < 4;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((BlockPlanks$EnumType)object);
    }
}

