/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockSlab$EnumBlockHalf
extends Enum<BlockSlab$EnumBlockHalf>
implements bg {
    public static final /* enum */ BlockSlab$EnumBlockHalf baP = new BlockSlab$EnumBlockHalf("top");
    public static final /* enum */ BlockSlab$EnumBlockHalf baQ = new BlockSlab$EnumBlockHalf("bottom");
    private final String name;
    private static final /* synthetic */ BlockSlab$EnumBlockHalf[] baS;

    public static BlockSlab$EnumBlockHalf[] values() {
        return (BlockSlab$EnumBlockHalf[])baS.clone();
    }

    public static BlockSlab$EnumBlockHalf valueOf(String string) {
        return Enum.valueOf(BlockSlab$EnumBlockHalf.class, string);
    }

    private BlockSlab$EnumBlockHalf(String string2) {
        this.name = string2;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockSlab$EnumBlockHalf[] zf() {
        return new BlockSlab$EnumBlockHalf[]{baP, baQ};
    }

    static {
        baS = BlockSlab$EnumBlockHalf.zf();
    }
}

