/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.bg;

public final class BlockStoneSlab$EnumType
extends Enum<BlockStoneSlab$EnumType>
implements bg {
    public static final /* enum */ BlockStoneSlab$EnumType bca = new BlockStoneSlab$EnumType(0, MapColor.bdN, "stone");
    public static final /* enum */ BlockStoneSlab$EnumType bcb = new BlockStoneSlab$EnumType(1, MapColor.bdE, "sandstone", "sand");
    public static final /* enum */ BlockStoneSlab$EnumType bcc = new BlockStoneSlab$EnumType(2, MapColor.bdP, "wood_old", "wood");
    public static final /* enum */ BlockStoneSlab$EnumType bcd = new BlockStoneSlab$EnumType(3, MapColor.bdN, "cobblestone", "cobble");
    public static final /* enum */ BlockStoneSlab$EnumType bce = new BlockStoneSlab$EnumType(4, MapColor.bee, "brick");
    public static final /* enum */ BlockStoneSlab$EnumType bcf = new BlockStoneSlab$EnumType(5, MapColor.bdN, "stone_brick", "smoothStoneBrick");
    public static final /* enum */ BlockStoneSlab$EnumType bcg = new BlockStoneSlab$EnumType(6, MapColor.bel, "nether_brick", "netherBrick");
    public static final /* enum */ BlockStoneSlab$EnumType bch = new BlockStoneSlab$EnumType(7, MapColor.bdQ, "quartz");
    private static final BlockStoneSlab$EnumType[] bci;
    private final int bcj;
    private final MapColor bck;
    private final String name;
    private final String bcm;
    private static final /* synthetic */ BlockStoneSlab$EnumType[] bcn;

    public static BlockStoneSlab$EnumType[] values() {
        return (BlockStoneSlab$EnumType[])bcn.clone();
    }

    public static BlockStoneSlab$EnumType valueOf(String string) {
        return Enum.valueOf(BlockStoneSlab$EnumType.class, string);
    }

    private BlockStoneSlab$EnumType(int n3, MapColor mapColor, String string2) {
        this(n3, mapColor, string2, string2);
    }

    private BlockStoneSlab$EnumType(int n3, MapColor mapColor, String string2, String string3) {
        this.bcj = n3;
        this.bck = mapColor;
        this.name = string2;
        this.bcm = string3;
    }

    public int yc() {
        return this.bcj;
    }

    public MapColor zo() {
        return this.bck;
    }

    public String toString() {
        return this.name;
    }

    public static BlockStoneSlab$EnumType bq(int n2) {
        if (n2 < 0 || n2 >= bci.length) {
            n2 = 0;
        }
        return bci[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String xB() {
        return this.bcm;
    }

    private static /* synthetic */ BlockStoneSlab$EnumType[] zp() {
        return new BlockStoneSlab$EnumType[]{bca, bcb, bcc, bcd, bce, bcf, bcg, bch};
    }

    static {
        bcn = BlockStoneSlab$EnumType.zp();
        bci = new BlockStoneSlab$EnumType[BlockStoneSlab$EnumType.values().length];
        BlockStoneSlab$EnumType[] blockStoneSlab$EnumTypeArray = BlockStoneSlab$EnumType.values();
        int n2 = blockStoneSlab$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockStoneSlab$EnumType blockStoneSlab$EnumType;
            BlockStoneSlab$EnumType.bci[blockStoneSlab$EnumType.yc()] = blockStoneSlab$EnumType = blockStoneSlab$EnumTypeArray[i2];
        }
    }
}

