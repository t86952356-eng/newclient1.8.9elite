/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockRailBase$EnumRailDirection;

class BlockRailPowered$1
implements Predicate<BlockRailBase$EnumRailDirection> {
    BlockRailPowered$1() {
    }

    public boolean b(BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection) {
        return blockRailBase$EnumRailDirection != BlockRailBase$EnumRailDirection.aYZ && blockRailBase$EnumRailDirection != BlockRailBase$EnumRailDirection.aYY && blockRailBase$EnumRailDirection != BlockRailBase$EnumRailDirection.aYW && blockRailBase$EnumRailDirection != BlockRailBase$EnumRailDirection.aYX;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.b((BlockRailBase$EnumRailDirection)object);
    }
}

