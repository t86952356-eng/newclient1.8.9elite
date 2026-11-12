/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockStoneBrick$EnumType
extends Enum<BlockStoneBrick$EnumType>
implements bg {
    public static final /* enum */ BlockStoneBrick$EnumType bbP = new BlockStoneBrick$EnumType(0, "stonebrick", "default");
    public static final /* enum */ BlockStoneBrick$EnumType bbQ = new BlockStoneBrick$EnumType(1, "mossy_stonebrick", "mossy");
    public static final /* enum */ BlockStoneBrick$EnumType bbR = new BlockStoneBrick$EnumType(2, "cracked_stonebrick", "cracked");
    public static final /* enum */ BlockStoneBrick$EnumType bbS = new BlockStoneBrick$EnumType(3, "chiseled_stonebrick", "chiseled");
    private static final BlockStoneBrick$EnumType[] bbT;
    private final int bbU;
    private final String name;
    private final String bbW;
    private static final /* synthetic */ BlockStoneBrick$EnumType[] bbX;

    public static BlockStoneBrick$EnumType[] values() {
        return (BlockStoneBrick$EnumType[])bbX.clone();
    }

    public static BlockStoneBrick$EnumType valueOf(String string) {
        return Enum.valueOf(BlockStoneBrick$EnumType.class, string);
    }

    private BlockStoneBrick$EnumType(int n3, String string2, String string3) {
        this.bbU = n3;
        this.name = string2;
        this.bbW = string3;
    }

    public int yc() {
        return this.bbU;
    }

    public String toString() {
        return this.name;
    }

    public static BlockStoneBrick$EnumType bp(int n2) {
        if (n2 < 0 || n2 >= bbT.length) {
            n2 = 0;
        }
        return bbT[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String xB() {
        return this.bbW;
    }

    private static /* synthetic */ BlockStoneBrick$EnumType[] zn() {
        return new BlockStoneBrick$EnumType[]{bbP, bbQ, bbR, bbS};
    }

    static {
        bbX = BlockStoneBrick$EnumType.zn();
        bbT = new BlockStoneBrick$EnumType[BlockStoneBrick$EnumType.values().length];
        BlockStoneBrick$EnumType[] blockStoneBrick$EnumTypeArray = BlockStoneBrick$EnumType.values();
        int n2 = blockStoneBrick$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockStoneBrick$EnumType blockStoneBrick$EnumType;
            BlockStoneBrick$EnumType.bbT[blockStoneBrick$EnumType.yc()] = blockStoneBrick$EnumType = blockStoneBrick$EnumTypeArray[i2];
        }
    }
}

