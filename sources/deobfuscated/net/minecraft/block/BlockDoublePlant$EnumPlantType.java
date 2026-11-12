/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockDoublePlant$EnumPlantType
extends Enum<BlockDoublePlant$EnumPlantType>
implements bg {
    public static final /* enum */ BlockDoublePlant$EnumPlantType aUh = new BlockDoublePlant$EnumPlantType(0, "sunflower");
    public static final /* enum */ BlockDoublePlant$EnumPlantType aUi = new BlockDoublePlant$EnumPlantType(1, "syringa");
    public static final /* enum */ BlockDoublePlant$EnumPlantType aUj = new BlockDoublePlant$EnumPlantType(2, "double_grass", "grass");
    public static final /* enum */ BlockDoublePlant$EnumPlantType aUk = new BlockDoublePlant$EnumPlantType(3, "double_fern", "fern");
    public static final /* enum */ BlockDoublePlant$EnumPlantType aUl = new BlockDoublePlant$EnumPlantType(4, "double_rose", "rose");
    public static final /* enum */ BlockDoublePlant$EnumPlantType aUm = new BlockDoublePlant$EnumPlantType(5, "paeonia");
    private static final BlockDoublePlant$EnumPlantType[] aUn;
    private final int aUo;
    private final String name;
    private final String aUq;
    private static final /* synthetic */ BlockDoublePlant$EnumPlantType[] aUr;

    public static BlockDoublePlant$EnumPlantType[] values() {
        return (BlockDoublePlant$EnumPlantType[])aUr.clone();
    }

    public static BlockDoublePlant$EnumPlantType valueOf(String string) {
        return Enum.valueOf(BlockDoublePlant$EnumPlantType.class, string);
    }

    private BlockDoublePlant$EnumPlantType(int n3, String string2) {
        this(n3, string2, string2);
    }

    private BlockDoublePlant$EnumPlantType(int n3, String string2, String string3) {
        this.aUo = n3;
        this.name = string2;
        this.aUq = string3;
    }

    public int yi() {
        return this.aUo;
    }

    public String toString() {
        return this.name;
    }

    public static BlockDoublePlant$EnumPlantType aW(int n2) {
        if (n2 < 0 || n2 >= aUn.length) {
            n2 = 0;
        }
        return aUn[n2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String xB() {
        return this.aUq;
    }

    private static /* synthetic */ BlockDoublePlant$EnumPlantType[] yj() {
        return new BlockDoublePlant$EnumPlantType[]{aUh, aUi, aUj, aUk, aUl, aUm};
    }

    static {
        aUr = BlockDoublePlant$EnumPlantType.yj();
        aUn = new BlockDoublePlant$EnumPlantType[BlockDoublePlant$EnumPlantType.values().length];
        BlockDoublePlant$EnumPlantType[] blockDoublePlant$EnumPlantTypeArray = BlockDoublePlant$EnumPlantType.values();
        int n2 = blockDoublePlant$EnumPlantTypeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType;
            BlockDoublePlant$EnumPlantType.aUn[blockDoublePlant$EnumPlantType.yi()] = blockDoublePlant$EnumPlantType = blockDoublePlant$EnumPlantTypeArray[i2];
        }
    }
}

