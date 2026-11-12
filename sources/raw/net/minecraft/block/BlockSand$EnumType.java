/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.bg;

public final class BlockSand$EnumType
extends Enum<BlockSand$EnumType>
implements bg {
    public static final /* enum */ BlockSand$EnumType bac = new BlockSand$EnumType(0, "sand", "default", MapColor.bdE);
    public static final /* enum */ BlockSand$EnumType bad = new BlockSand$EnumType(1, "red_sand", "red", MapColor.bdR);
    private static final BlockSand$EnumType[] bae;
    private final int baf;
    private final String bag;
    private final MapColor bah;
    private final String bai;
    private static final /* synthetic */ BlockSand$EnumType[] baj;

    public static BlockSand$EnumType[] values() {
        return (BlockSand$EnumType[])baj.clone();
    }

    public static BlockSand$EnumType valueOf(String string) {
        return Enum.valueOf(BlockSand$EnumType.class, string);
    }

    private BlockSand$EnumType(int n3, String string2, String string3, MapColor mapColor) {
        this.baf = n3;
        this.bag = string2;
        this.bah = mapColor;
        this.bai = string3;
    }

    public int yc() {
        return this.baf;
    }

    public String toString() {
        return this.bag;
    }

    public MapColor lv() {
        return this.bah;
    }

    public static BlockSand$EnumType bj(int n2) {
        if (n2 < 0 || n2 >= bae.length) {
            n2 = 0;
        }
        return bae[n2];
    }

    @Override
    public String getName() {
        return this.bag;
    }

    public String xB() {
        return this.bai;
    }

    private static /* synthetic */ BlockSand$EnumType[] yY() {
        return new BlockSand$EnumType[]{bac, bad};
    }

    static {
        baj = BlockSand$EnumType.yY();
        bae = new BlockSand$EnumType[BlockSand$EnumType.values().length];
        BlockSand$EnumType[] blockSand$EnumTypeArray = BlockSand$EnumType.values();
        int n2 = blockSand$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockSand$EnumType blockSand$EnumType;
            BlockSand$EnumType.bae[blockSand$EnumType.yc()] = blockSand$EnumType = blockSand$EnumTypeArray[i2];
        }
    }
}

