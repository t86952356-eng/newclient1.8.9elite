/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockPrismarine$EnumType
extends Enum<BlockPrismarine$EnumType>
implements bg {
    public static final /* enum */ BlockPrismarine$EnumType aYp = new BlockPrismarine$EnumType(0, "prismarine", "rough");
    public static final /* enum */ BlockPrismarine$EnumType aYq = new BlockPrismarine$EnumType(1, "prismarine_bricks", "bricks");
    public static final /* enum */ BlockPrismarine$EnumType aYr = new BlockPrismarine$EnumType(2, "dark_prismarine", "dark");
    private static final BlockPrismarine$EnumType[] aYs;
    private final int aYt;
    private final String aYu;
    private final String aYv;
    private static final /* synthetic */ BlockPrismarine$EnumType[] aYw;

    public static BlockPrismarine$EnumType[] values() {
        return (BlockPrismarine$EnumType[])aYw.clone();
    }

    public static BlockPrismarine$EnumType valueOf(String string) {
        return Enum.valueOf(BlockPrismarine$EnumType.class, string);
    }

    private BlockPrismarine$EnumType(int n3, String string2, String string3) {
        this.aYt = n3;
        this.aYu = string2;
        this.aYv = string3;
    }

    public int yc() {
        return this.aYt;
    }

    public String toString() {
        return this.aYu;
    }

    public static BlockPrismarine$EnumType be(int n2) {
        if (n2 < 0 || n2 >= aYs.length) {
            n2 = 0;
        }
        return aYs[n2];
    }

    @Override
    public String getName() {
        return this.aYu;
    }

    public String xB() {
        return this.aYv;
    }

    private static /* synthetic */ BlockPrismarine$EnumType[] yJ() {
        return new BlockPrismarine$EnumType[]{aYp, aYq, aYr};
    }

    static {
        aYw = BlockPrismarine$EnumType.yJ();
        aYs = new BlockPrismarine$EnumType[BlockPrismarine$EnumType.values().length];
        BlockPrismarine$EnumType[] blockPrismarine$EnumTypeArray = BlockPrismarine$EnumType.values();
        int n2 = blockPrismarine$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockPrismarine$EnumType blockPrismarine$EnumType;
            BlockPrismarine$EnumType.aYs[blockPrismarine$EnumType.yc()] = blockPrismarine$EnumType = blockPrismarine$EnumTypeArray[i2];
        }
    }
}

