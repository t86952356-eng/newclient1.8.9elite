/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockTallGrass$EnumType
extends Enum<BlockTallGrass$EnumType>
implements bg {
    public static final /* enum */ BlockTallGrass$EnumType bcy = new BlockTallGrass$EnumType(0, "dead_bush");
    public static final /* enum */ BlockTallGrass$EnumType bcz = new BlockTallGrass$EnumType(1, "tall_grass");
    public static final /* enum */ BlockTallGrass$EnumType bcA = new BlockTallGrass$EnumType(2, "fern");
    private static final BlockTallGrass$EnumType[] bcB;
    private final int bcC;
    private final String bcD;
    private static final /* synthetic */ BlockTallGrass$EnumType[] bcE;

    public static BlockTallGrass$EnumType[] values() {
        return (BlockTallGrass$EnumType[])bcE.clone();
    }

    public static BlockTallGrass$EnumType valueOf(String string) {
        return Enum.valueOf(BlockTallGrass$EnumType.class, string);
    }

    private BlockTallGrass$EnumType(int n3, String string2) {
        this.bcC = n3;
        this.bcD = string2;
    }

    public int yi() {
        return this.bcC;
    }

    public String toString() {
        return this.bcD;
    }

    public static BlockTallGrass$EnumType bs(int n2) {
        if (n2 < 0 || n2 >= bcB.length) {
            n2 = 0;
        }
        return bcB[n2];
    }

    @Override
    public String getName() {
        return this.bcD;
    }

    private static /* synthetic */ BlockTallGrass$EnumType[] zs() {
        return new BlockTallGrass$EnumType[]{bcy, bcz, bcA};
    }

    static {
        bcE = BlockTallGrass$EnumType.zs();
        bcB = new BlockTallGrass$EnumType[BlockTallGrass$EnumType.values().length];
        BlockTallGrass$EnumType[] blockTallGrass$EnumTypeArray = BlockTallGrass$EnumType.values();
        int n2 = blockTallGrass$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockTallGrass$EnumType blockTallGrass$EnumType;
            BlockTallGrass$EnumType.bcB[blockTallGrass$EnumType.yi()] = blockTallGrass$EnumType = blockTallGrass$EnumTypeArray[i2];
        }
    }
}

