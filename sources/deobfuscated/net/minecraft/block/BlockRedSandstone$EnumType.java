/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockRedSandstone$EnumType
extends Enum<BlockRedSandstone$EnumType>
implements bg {
    public static final /* enum */ BlockRedSandstone$EnumType aZr = new BlockRedSandstone$EnumType(0, "red_sandstone", "default");
    public static final /* enum */ BlockRedSandstone$EnumType aZs = new BlockRedSandstone$EnumType(1, "chiseled_red_sandstone", "chiseled");
    public static final /* enum */ BlockRedSandstone$EnumType aZt = new BlockRedSandstone$EnumType(2, "smooth_red_sandstone", "smooth");
    private static final BlockRedSandstone$EnumType[] aZu;
    private final int aZv;
    private final String name;
    private final String aZx;
    private static final /* synthetic */ BlockRedSandstone$EnumType[] aZy;

    public static BlockRedSandstone$EnumType[] values() {
        return (BlockRedSandstone$EnumType[])aZy.clone();
    }

    public static BlockRedSandstone$EnumType valueOf(String string) {
        return Enum.valueOf(BlockRedSandstone$EnumType.class, string);
    }

    private BlockRedSandstone$EnumType(int n3, String string2, String string3) {
        this.aZv = n3;
        this.name = string2;
        this.aZx = string3;
    }

    public int yc() {
        return this.aZv;
    }

    public String toString() {
        return this.name;
    }

    public static BlockRedSandstone$EnumType bh(int n2) {
        if (n2 < 0 || n2 >= aZu.length) {
            n2 = 0;
        }
        return aZu[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String xB() {
        return this.aZx;
    }

    private static /* synthetic */ BlockRedSandstone$EnumType[] yV() {
        return new BlockRedSandstone$EnumType[]{aZr, aZs, aZt};
    }

    static {
        aZy = BlockRedSandstone$EnumType.yV();
        aZu = new BlockRedSandstone$EnumType[BlockRedSandstone$EnumType.values().length];
        BlockRedSandstone$EnumType[] blockRedSandstone$EnumTypeArray = BlockRedSandstone$EnumType.values();
        int n2 = blockRedSandstone$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockRedSandstone$EnumType blockRedSandstone$EnumType;
            BlockRedSandstone$EnumType.aZu[blockRedSandstone$EnumType.yc()] = blockRedSandstone$EnumType = blockRedSandstone$EnumTypeArray[i2];
        }
    }
}

