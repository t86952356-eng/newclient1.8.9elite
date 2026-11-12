/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockStairs$EnumHalf
extends Enum<BlockStairs$EnumHalf>
implements bg {
    public static final /* enum */ BlockStairs$EnumHalf bbh = new BlockStairs$EnumHalf("top");
    public static final /* enum */ BlockStairs$EnumHalf bbi = new BlockStairs$EnumHalf("bottom");
    private final String name;
    private static final /* synthetic */ BlockStairs$EnumHalf[] bbk;

    public static BlockStairs$EnumHalf[] values() {
        return (BlockStairs$EnumHalf[])bbk.clone();
    }

    public static BlockStairs$EnumHalf valueOf(String string) {
        return Enum.valueOf(BlockStairs$EnumHalf.class, string);
    }

    private BlockStairs$EnumHalf(String string2) {
        this.name = string2;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockStairs$EnumHalf[] zi() {
        return new BlockStairs$EnumHalf[]{bbh, bbi};
    }

    static {
        bbk = BlockStairs$EnumHalf.zi();
    }
}

