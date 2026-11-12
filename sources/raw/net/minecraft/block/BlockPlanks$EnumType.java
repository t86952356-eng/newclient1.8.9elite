/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.bg;

public final class BlockPlanks$EnumType
extends Enum<BlockPlanks$EnumType>
implements bg {
    public static final /* enum */ BlockPlanks$EnumType aXJ = new BlockPlanks$EnumType(0, "oak", MapColor.bdP);
    public static final /* enum */ BlockPlanks$EnumType aXK = new BlockPlanks$EnumType(1, "spruce", MapColor.bek);
    public static final /* enum */ BlockPlanks$EnumType aXL = new BlockPlanks$EnumType(2, "birch", MapColor.bdE);
    public static final /* enum */ BlockPlanks$EnumType aXM = new BlockPlanks$EnumType(3, "jungle", MapColor.bdM);
    public static final /* enum */ BlockPlanks$EnumType aXN = new BlockPlanks$EnumType(4, "acacia", MapColor.bdR);
    public static final /* enum */ BlockPlanks$EnumType aXO = new BlockPlanks$EnumType(5, "dark_oak", "big_oak", MapColor.bec);
    private static final BlockPlanks$EnumType[] aXP;
    private final int aXQ;
    private final String aXR;
    private final String aXS;
    private final MapColor aXT;
    private static final /* synthetic */ BlockPlanks$EnumType[] aXU;

    public static BlockPlanks$EnumType[] values() {
        return (BlockPlanks$EnumType[])aXU.clone();
    }

    public static BlockPlanks$EnumType valueOf(String string) {
        return Enum.valueOf(BlockPlanks$EnumType.class, string);
    }

    private BlockPlanks$EnumType(int n3, String string2, MapColor mapColor) {
        this(n3, string2, string2, mapColor);
    }

    private BlockPlanks$EnumType(int n3, String string2, String string3, MapColor mapColor) {
        this.aXQ = n3;
        this.aXR = string2;
        this.aXS = string3;
        this.aXT = mapColor;
    }

    public int yc() {
        return this.aXQ;
    }

    public MapColor yB() {
        return this.aXT;
    }

    public String toString() {
        return this.aXR;
    }

    public static BlockPlanks$EnumType bd(int n2) {
        if (n2 < 0 || n2 >= aXP.length) {
            n2 = 0;
        }
        return aXP[n2];
    }

    @Override
    public String getName() {
        return this.aXR;
    }

    public String xB() {
        return this.aXS;
    }

    private static /* synthetic */ BlockPlanks$EnumType[] yC() {
        return new BlockPlanks$EnumType[]{aXJ, aXK, aXL, aXM, aXN, aXO};
    }

    static {
        aXU = BlockPlanks$EnumType.yC();
        aXP = new BlockPlanks$EnumType[BlockPlanks$EnumType.values().length];
        BlockPlanks$EnumType[] blockPlanks$EnumTypeArray = BlockPlanks$EnumType.values();
        int n2 = blockPlanks$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockPlanks$EnumType blockPlanks$EnumType;
            BlockPlanks$EnumType.aXP[blockPlanks$EnumType.yc()] = blockPlanks$EnumType = blockPlanks$EnumTypeArray[i2];
        }
    }
}

