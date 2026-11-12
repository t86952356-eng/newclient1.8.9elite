/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.bg;

public final class BlockDirt$DirtType
extends Enum<BlockDirt$DirtType>
implements bg {
    public static final /* enum */ BlockDirt$DirtType aTE = new BlockDirt$DirtType(0, "dirt", "default", MapColor.bdM);
    public static final /* enum */ BlockDirt$DirtType aTF = new BlockDirt$DirtType(1, "coarse_dirt", "coarse", MapColor.bdM);
    public static final /* enum */ BlockDirt$DirtType aTG = new BlockDirt$DirtType(2, "podzol", MapColor.bek);
    private static final BlockDirt$DirtType[] aTH;
    private final int aTI;
    private final String aTJ;
    private final String aTK;
    private final MapColor aTL;
    private static final /* synthetic */ BlockDirt$DirtType[] aTM;

    public static BlockDirt$DirtType[] values() {
        return (BlockDirt$DirtType[])aTM.clone();
    }

    public static BlockDirt$DirtType valueOf(String string) {
        return Enum.valueOf(BlockDirt$DirtType.class, string);
    }

    private BlockDirt$DirtType(int n3, String string2, MapColor mapColor) {
        this(n3, string2, string2, mapColor);
    }

    private BlockDirt$DirtType(int n3, String string2, String string3, MapColor mapColor) {
        this.aTI = n3;
        this.aTJ = string2;
        this.aTK = string3;
        this.aTL = mapColor;
    }

    public int yc() {
        return this.aTI;
    }

    public String xB() {
        return this.aTK;
    }

    public MapColor yd() {
        return this.aTL;
    }

    public String toString() {
        return this.aTJ;
    }

    public static BlockDirt$DirtType aP(int n2) {
        if (n2 < 0 || n2 >= aTH.length) {
            n2 = 0;
        }
        return aTH[n2];
    }

    @Override
    public String getName() {
        return this.aTJ;
    }

    private static /* synthetic */ BlockDirt$DirtType[] ye() {
        return new BlockDirt$DirtType[]{aTE, aTF, aTG};
    }

    static {
        aTM = BlockDirt$DirtType.ye();
        aTH = new BlockDirt$DirtType[BlockDirt$DirtType.values().length];
        BlockDirt$DirtType[] blockDirt$DirtTypeArray = BlockDirt$DirtType.values();
        int n2 = blockDirt$DirtTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockDirt$DirtType blockDirt$DirtType;
            BlockDirt$DirtType.aTH[blockDirt$DirtType.yc()] = blockDirt$DirtType = blockDirt$DirtTypeArray[i2];
        }
    }
}

