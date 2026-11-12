/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockSandStone$EnumType
extends Enum<BlockSandStone$EnumType>
implements bg {
    public static final /* enum */ BlockSandStone$EnumType bal = new BlockSandStone$EnumType(0, "sandstone", "default");
    public static final /* enum */ BlockSandStone$EnumType bam = new BlockSandStone$EnumType(1, "chiseled_sandstone", "chiseled");
    public static final /* enum */ BlockSandStone$EnumType ban = new BlockSandStone$EnumType(2, "smooth_sandstone", "smooth");
    private static final BlockSandStone$EnumType[] bao;
    private final int bap;
    private final String baq;
    private final String bar;
    private static final /* synthetic */ BlockSandStone$EnumType[] bas;

    public static BlockSandStone$EnumType[] values() {
        return (BlockSandStone$EnumType[])bas.clone();
    }

    public static BlockSandStone$EnumType valueOf(String string) {
        return Enum.valueOf(BlockSandStone$EnumType.class, string);
    }

    private BlockSandStone$EnumType(int n3, String string2, String string3) {
        this.bap = n3;
        this.baq = string2;
        this.bar = string3;
    }

    public int yc() {
        return this.bap;
    }

    public String toString() {
        return this.baq;
    }

    public static BlockSandStone$EnumType bk(int n2) {
        if (n2 < 0 || n2 >= bao.length) {
            n2 = 0;
        }
        return bao[n2];
    }

    @Override
    public String getName() {
        return this.baq;
    }

    public String xB() {
        return this.bar;
    }

    private static /* synthetic */ BlockSandStone$EnumType[] yZ() {
        return new BlockSandStone$EnumType[]{bal, bam, ban};
    }

    static {
        bas = BlockSandStone$EnumType.yZ();
        bao = new BlockSandStone$EnumType[BlockSandStone$EnumType.values().length];
        BlockSandStone$EnumType[] blockSandStone$EnumTypeArray = BlockSandStone$EnumType.values();
        int n2 = blockSandStone$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockSandStone$EnumType blockSandStone$EnumType;
            BlockSandStone$EnumType.bao[blockSandStone$EnumType.yc()] = blockSandStone$EnumType = blockSandStone$EnumTypeArray[i2];
        }
    }
}

