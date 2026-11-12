/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.bg;

public final class BlockStone$EnumType
extends Enum<BlockStone$EnumType>
implements bg {
    public static final /* enum */ BlockStone$EnumType bbx = new BlockStone$EnumType(0, MapColor.bdN, "stone");
    public static final /* enum */ BlockStone$EnumType bby = new BlockStone$EnumType(1, MapColor.bdM, "granite");
    public static final /* enum */ BlockStone$EnumType bbz = new BlockStone$EnumType(2, MapColor.bdM, "smooth_granite", "graniteSmooth");
    public static final /* enum */ BlockStone$EnumType bbA = new BlockStone$EnumType(3, MapColor.bdQ, "diorite");
    public static final /* enum */ BlockStone$EnumType bbB = new BlockStone$EnumType(4, MapColor.bdQ, "smooth_diorite", "dioriteSmooth");
    public static final /* enum */ BlockStone$EnumType bbC = new BlockStone$EnumType(5, MapColor.bdN, "andesite");
    public static final /* enum */ BlockStone$EnumType bbD = new BlockStone$EnumType(6, MapColor.bdN, "smooth_andesite", "andesiteSmooth");
    private static final BlockStone$EnumType[] bbE;
    private final int bbF;
    private final String name;
    private final String bbH;
    private final MapColor bbI;
    private static final /* synthetic */ BlockStone$EnumType[] bbJ;

    public static BlockStone$EnumType[] values() {
        return (BlockStone$EnumType[])bbJ.clone();
    }

    public static BlockStone$EnumType valueOf(String string) {
        return Enum.valueOf(BlockStone$EnumType.class, string);
    }

    private BlockStone$EnumType(int n3, MapColor mapColor, String string2) {
        this(n3, mapColor, string2, string2);
    }

    private BlockStone$EnumType(int n3, MapColor mapColor, String string2, String string3) {
        this.bbF = n3;
        this.name = string2;
        this.bbH = string3;
        this.bbI = mapColor;
    }

    public int yc() {
        return this.bbF;
    }

    public MapColor zl() {
        return this.bbI;
    }

    public String toString() {
        return this.name;
    }

    public static BlockStone$EnumType bo(int n2) {
        if (n2 < 0 || n2 >= bbE.length) {
            n2 = 0;
        }
        return bbE[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String xB() {
        return this.bbH;
    }

    private static /* synthetic */ BlockStone$EnumType[] zm() {
        return new BlockStone$EnumType[]{bbx, bby, bbz, bbA, bbB, bbC, bbD};
    }

    static {
        bbJ = BlockStone$EnumType.zm();
        bbE = new BlockStone$EnumType[BlockStone$EnumType.values().length];
        BlockStone$EnumType[] blockStone$EnumTypeArray = BlockStone$EnumType.values();
        int n2 = blockStone$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockStone$EnumType blockStone$EnumType;
            BlockStone$EnumType.bbE[blockStone$EnumType.yc()] = blockStone$EnumType = blockStone$EnumTypeArray[i2];
        }
    }
}

