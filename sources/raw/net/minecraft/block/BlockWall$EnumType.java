/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockWall$EnumType
extends Enum<BlockWall$EnumType>
implements bg {
    public static final /* enum */ BlockWall$EnumType bdp = new BlockWall$EnumType(0, "cobblestone", "normal");
    public static final /* enum */ BlockWall$EnumType bdq = new BlockWall$EnumType(1, "mossy_cobblestone", "mossy");
    private static final BlockWall$EnumType[] bdr;
    private final int bds;
    private final String bdt;
    private final String bdu;
    private static final /* synthetic */ BlockWall$EnumType[] bdv;

    public static BlockWall$EnumType[] values() {
        return (BlockWall$EnumType[])bdv.clone();
    }

    public static BlockWall$EnumType valueOf(String string) {
        return Enum.valueOf(BlockWall$EnumType.class, string);
    }

    private BlockWall$EnumType(int n3, String string2, String string3) {
        this.bds = n3;
        this.bdt = string2;
        this.bdu = string3;
    }

    public int yc() {
        return this.bds;
    }

    public String toString() {
        return this.bdt;
    }

    public static BlockWall$EnumType bt(int n2) {
        if (n2 < 0 || n2 >= bdr.length) {
            n2 = 0;
        }
        return bdr[n2];
    }

    @Override
    public String getName() {
        return this.bdt;
    }

    public String xB() {
        return this.bdu;
    }

    private static /* synthetic */ BlockWall$EnumType[] zu() {
        return new BlockWall$EnumType[]{bdp, bdq};
    }

    static {
        bdv = BlockWall$EnumType.zu();
        bdr = new BlockWall$EnumType[BlockWall$EnumType.values().length];
        BlockWall$EnumType[] blockWall$EnumTypeArray = BlockWall$EnumType.values();
        int n2 = blockWall$EnumTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockWall$EnumType blockWall$EnumType;
            BlockWall$EnumType.bdr[blockWall$EnumType.yc()] = blockWall$EnumType = blockWall$EnumTypeArray[i2];
        }
    }
}

