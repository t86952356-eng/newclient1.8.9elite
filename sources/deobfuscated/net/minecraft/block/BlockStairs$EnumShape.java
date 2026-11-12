/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockStairs$EnumShape
extends Enum<BlockStairs$EnumShape>
implements bg {
    public static final /* enum */ BlockStairs$EnumShape bbl = new BlockStairs$EnumShape("straight");
    public static final /* enum */ BlockStairs$EnumShape bbm = new BlockStairs$EnumShape("inner_left");
    public static final /* enum */ BlockStairs$EnumShape bbn = new BlockStairs$EnumShape("inner_right");
    public static final /* enum */ BlockStairs$EnumShape bbo = new BlockStairs$EnumShape("outer_left");
    public static final /* enum */ BlockStairs$EnumShape bbp = new BlockStairs$EnumShape("outer_right");
    private final String name;
    private static final /* synthetic */ BlockStairs$EnumShape[] bbr;

    public static BlockStairs$EnumShape[] values() {
        return (BlockStairs$EnumShape[])bbr.clone();
    }

    public static BlockStairs$EnumShape valueOf(String string) {
        return Enum.valueOf(BlockStairs$EnumShape.class, string);
    }

    private BlockStairs$EnumShape(String string2) {
        this.name = string2;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockStairs$EnumShape[] zj() {
        return new BlockStairs$EnumShape[]{bbl, bbm, bbn, bbo, bbp};
    }

    static {
        bbr = BlockStairs$EnumShape.zj();
    }
}

