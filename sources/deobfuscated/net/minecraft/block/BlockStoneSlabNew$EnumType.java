/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.material.MapColor;
import net.minecraft.util.bg;

public final class BlockStoneSlabNew$EnumType
extends Enum<BlockStoneSlabNew$EnumType>
implements bg {
    public static final /* enum */ BlockStoneSlabNew$EnumType bcq = new BlockStoneSlabNew$EnumType(0, "red_sandstone", BlockSand$EnumType.bad.lv());
    private static final BlockStoneSlabNew$EnumType[] bcr;
    private final int bcs;
    private final String name;
    private final MapColor bcu;
    private static final /* synthetic */ BlockStoneSlabNew$EnumType[] bcv;

    public static BlockStoneSlabNew$EnumType[] values() {
        return (BlockStoneSlabNew$EnumType[])bcv.clone();
    }

    public static BlockStoneSlabNew$EnumType valueOf(String string) {
        return Enum.valueOf(BlockStoneSlabNew$EnumType.class, string);
    }

    private BlockStoneSlabNew$EnumType(int n3, String string2, MapColor mapColor) {
        this.bcs = n3;
        this.name = string2;
        this.bcu = mapColor;
    }

    public int yc() {
        return this.bcs;
    }

    public MapColor zq() {
        return this.bcu;
    }

    public String toString() {
        return this.name;
    }

    public static BlockStoneSlabNew$EnumType br(int n2) {
        if (n2 < 0 || n2 >= bcr.length) {
            n2 = 0;
        }
        return bcr[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String xB() {
        return this.name;
    }

    private static /* synthetic */ BlockStoneSlabNew$EnumType[] zr() {
        return new BlockStoneSlabNew$EnumType[]{bcq};
    }

    static {
        bcv = BlockStoneSlabNew$EnumType.zr();
        bcr = new BlockStoneSlabNew$EnumType[BlockStoneSlabNew$EnumType.values().length];
        BlockStoneSlabNew$EnumType[] blockStoneSlabNew$EnumTypeArray = BlockStoneSlabNew$EnumType.values();
        int n2 = blockStoneSlabNew$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockStoneSlabNew$EnumType blockStoneSlabNew$EnumType;
            BlockStoneSlabNew$EnumType.bcr[blockStoneSlabNew$EnumType.yc()] = blockStoneSlabNew$EnumType = blockStoneSlabNew$EnumTypeArray[i2];
        }
    }
}

