/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockHugeMushroom$EnumType
extends Enum<BlockHugeMushroom$EnumType>
implements bg {
    public static final /* enum */ BlockHugeMushroom$EnumType aWc = new BlockHugeMushroom$EnumType(1, "north_west");
    public static final /* enum */ BlockHugeMushroom$EnumType aWd = new BlockHugeMushroom$EnumType(2, "north");
    public static final /* enum */ BlockHugeMushroom$EnumType aWe = new BlockHugeMushroom$EnumType(3, "north_east");
    public static final /* enum */ BlockHugeMushroom$EnumType aWf = new BlockHugeMushroom$EnumType(4, "west");
    public static final /* enum */ BlockHugeMushroom$EnumType aWg = new BlockHugeMushroom$EnumType(5, "center");
    public static final /* enum */ BlockHugeMushroom$EnumType aWh = new BlockHugeMushroom$EnumType(6, "east");
    public static final /* enum */ BlockHugeMushroom$EnumType aWi = new BlockHugeMushroom$EnumType(7, "south_west");
    public static final /* enum */ BlockHugeMushroom$EnumType aWj = new BlockHugeMushroom$EnumType(8, "south");
    public static final /* enum */ BlockHugeMushroom$EnumType aWk = new BlockHugeMushroom$EnumType(9, "south_east");
    public static final /* enum */ BlockHugeMushroom$EnumType aWl = new BlockHugeMushroom$EnumType(10, "stem");
    public static final /* enum */ BlockHugeMushroom$EnumType aWm = new BlockHugeMushroom$EnumType(0, "all_inside");
    public static final /* enum */ BlockHugeMushroom$EnumType aWn = new BlockHugeMushroom$EnumType(14, "all_outside");
    public static final /* enum */ BlockHugeMushroom$EnumType aWo = new BlockHugeMushroom$EnumType(15, "all_stem");
    private static final BlockHugeMushroom$EnumType[] aWp;
    private final int aWq;
    private final String name;
    private static final /* synthetic */ BlockHugeMushroom$EnumType[] aWs;

    public static BlockHugeMushroom$EnumType[] values() {
        return (BlockHugeMushroom$EnumType[])aWs.clone();
    }

    public static BlockHugeMushroom$EnumType valueOf(String string) {
        return Enum.valueOf(BlockHugeMushroom$EnumType.class, string);
    }

    private BlockHugeMushroom$EnumType(int n3, String string2) {
        this.aWq = n3;
        this.name = string2;
    }

    public int yc() {
        return this.aWq;
    }

    public String toString() {
        return this.name;
    }

    public static BlockHugeMushroom$EnumType aY(int n2) {
        BlockHugeMushroom$EnumType blockHugeMushroom$EnumType;
        if (n2 < 0 || n2 >= aWp.length) {
            n2 = 0;
        }
        return (blockHugeMushroom$EnumType = aWp[n2]) == null ? aWp[0] : blockHugeMushroom$EnumType;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockHugeMushroom$EnumType[] yv() {
        return new BlockHugeMushroom$EnumType[]{aWc, aWd, aWe, aWf, aWg, aWh, aWi, aWj, aWk, aWl, aWm, aWn, aWo};
    }

    static {
        aWs = BlockHugeMushroom$EnumType.yv();
        aWp = new BlockHugeMushroom$EnumType[16];
        BlockHugeMushroom$EnumType[] blockHugeMushroom$EnumTypeArray = BlockHugeMushroom$EnumType.values();
        int n2 = blockHugeMushroom$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockHugeMushroom$EnumType blockHugeMushroom$EnumType;
            BlockHugeMushroom$EnumType.aWp[blockHugeMushroom$EnumType.yc()] = blockHugeMushroom$EnumType = blockHugeMushroom$EnumTypeArray[i2];
        }
    }
}

