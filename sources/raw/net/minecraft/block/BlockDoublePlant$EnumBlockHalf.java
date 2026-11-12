/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockDoublePlant$EnumBlockHalf
extends Enum<BlockDoublePlant$EnumBlockHalf>
implements bg {
    public static final /* enum */ BlockDoublePlant$EnumBlockHalf aUe = new BlockDoublePlant$EnumBlockHalf();
    public static final /* enum */ BlockDoublePlant$EnumBlockHalf aUf = new BlockDoublePlant$EnumBlockHalf();
    private static final /* synthetic */ BlockDoublePlant$EnumBlockHalf[] aUg;

    public static BlockDoublePlant$EnumBlockHalf[] values() {
        return (BlockDoublePlant$EnumBlockHalf[])aUg.clone();
    }

    public static BlockDoublePlant$EnumBlockHalf valueOf(String string) {
        return Enum.valueOf(BlockDoublePlant$EnumBlockHalf.class, string);
    }

    public String toString() {
        return this.getName();
    }

    @Override
    public String getName() {
        return this == aUe ? "upper" : "lower";
    }

    private static /* synthetic */ BlockDoublePlant$EnumBlockHalf[] yh() {
        return new BlockDoublePlant$EnumBlockHalf[]{aUe, aUf};
    }

    static {
        aUg = BlockDoublePlant$EnumBlockHalf.yh();
    }
}

