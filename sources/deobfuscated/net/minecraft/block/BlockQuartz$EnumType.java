/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockQuartz$EnumType
extends Enum<BlockQuartz$EnumType>
implements bg {
    public static final /* enum */ BlockQuartz$EnumType aYE = new BlockQuartz$EnumType(0, "default", "default");
    public static final /* enum */ BlockQuartz$EnumType aYF = new BlockQuartz$EnumType(1, "chiseled", "chiseled");
    public static final /* enum */ BlockQuartz$EnumType aYG = new BlockQuartz$EnumType(2, "lines_y", "lines");
    public static final /* enum */ BlockQuartz$EnumType aYH = new BlockQuartz$EnumType(3, "lines_x", "lines");
    public static final /* enum */ BlockQuartz$EnumType aYI = new BlockQuartz$EnumType(4, "lines_z", "lines");
    private static final BlockQuartz$EnumType[] aYJ;
    private final int aYK;
    private final String name;
    private final String aYM;
    private static final /* synthetic */ BlockQuartz$EnumType[] aYN;

    public static BlockQuartz$EnumType[] values() {
        return (BlockQuartz$EnumType[])aYN.clone();
    }

    public static BlockQuartz$EnumType valueOf(String string) {
        return Enum.valueOf(BlockQuartz$EnumType.class, string);
    }

    private BlockQuartz$EnumType(int n3, String string2, String string3) {
        this.aYK = n3;
        this.name = string2;
        this.aYM = string3;
    }

    public int yc() {
        return this.aYK;
    }

    public String toString() {
        return this.aYM;
    }

    public static BlockQuartz$EnumType bf(int n2) {
        if (n2 < 0 || n2 >= aYJ.length) {
            n2 = 0;
        }
        return aYJ[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockQuartz$EnumType[] yO() {
        return new BlockQuartz$EnumType[]{aYE, aYF, aYG, aYH, aYI};
    }

    static {
        aYN = BlockQuartz$EnumType.yO();
        aYJ = new BlockQuartz$EnumType[BlockQuartz$EnumType.values().length];
        BlockQuartz$EnumType[] blockQuartz$EnumTypeArray = BlockQuartz$EnumType.values();
        int n2 = blockQuartz$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockQuartz$EnumType blockQuartz$EnumType;
            BlockQuartz$EnumType.aYJ[blockQuartz$EnumType.yc()] = blockQuartz$EnumType = blockQuartz$EnumTypeArray[i2];
        }
    }
}

