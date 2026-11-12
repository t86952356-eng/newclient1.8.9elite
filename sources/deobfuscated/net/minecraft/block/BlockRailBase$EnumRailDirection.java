/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockRailBase$EnumRailDirection
extends Enum<BlockRailBase$EnumRailDirection>
implements bg {
    public static final /* enum */ BlockRailBase$EnumRailDirection aYQ = new BlockRailBase$EnumRailDirection(0, "north_south");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYR = new BlockRailBase$EnumRailDirection(1, "east_west");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYS = new BlockRailBase$EnumRailDirection(2, "ascending_east");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYT = new BlockRailBase$EnumRailDirection(3, "ascending_west");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYU = new BlockRailBase$EnumRailDirection(4, "ascending_north");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYV = new BlockRailBase$EnumRailDirection(5, "ascending_south");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYW = new BlockRailBase$EnumRailDirection(6, "south_east");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYX = new BlockRailBase$EnumRailDirection(7, "south_west");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYY = new BlockRailBase$EnumRailDirection(8, "north_west");
    public static final /* enum */ BlockRailBase$EnumRailDirection aYZ = new BlockRailBase$EnumRailDirection(9, "north_east");
    private static final BlockRailBase$EnumRailDirection[] aZa;
    private final int aZb;
    private final String name;
    private static final /* synthetic */ BlockRailBase$EnumRailDirection[] aZd;

    public static BlockRailBase$EnumRailDirection[] values() {
        return (BlockRailBase$EnumRailDirection[])aZd.clone();
    }

    public static BlockRailBase$EnumRailDirection valueOf(String string) {
        return Enum.valueOf(BlockRailBase$EnumRailDirection.class, string);
    }

    private BlockRailBase$EnumRailDirection(int n3, String string2) {
        this.aZb = n3;
        this.name = string2;
    }

    public int yc() {
        return this.aZb;
    }

    public String toString() {
        return this.name;
    }

    public boolean yQ() {
        return this == aYU || this == aYS || this == aYV || this == aYT;
    }

    public static BlockRailBase$EnumRailDirection bg(int n2) {
        if (n2 < 0 || n2 >= aZa.length) {
            n2 = 0;
        }
        return aZa[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockRailBase$EnumRailDirection[] yR() {
        return new BlockRailBase$EnumRailDirection[]{aYQ, aYR, aYS, aYT, aYU, aYV, aYW, aYX, aYY, aYZ};
    }

    static {
        aZd = BlockRailBase$EnumRailDirection.yR();
        aZa = new BlockRailBase$EnumRailDirection[BlockRailBase$EnumRailDirection.values().length];
        BlockRailBase$EnumRailDirection[] blockRailBase$EnumRailDirectionArray = BlockRailBase$EnumRailDirection.values();
        int n2 = blockRailBase$EnumRailDirectionArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection;
            BlockRailBase$EnumRailDirection.aZa[blockRailBase$EnumRailDirection.yc()] = blockRailBase$EnumRailDirection = blockRailBase$EnumRailDirectionArray[i2];
        }
    }
}

