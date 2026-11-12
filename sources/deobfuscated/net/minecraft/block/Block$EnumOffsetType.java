/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

public final class Block$EnumOffsetType
extends Enum<Block$EnumOffsetType> {
    public static final /* enum */ Block$EnumOffsetType aSJ = new Block$EnumOffsetType();
    public static final /* enum */ Block$EnumOffsetType aSK = new Block$EnumOffsetType();
    public static final /* enum */ Block$EnumOffsetType aSL = new Block$EnumOffsetType();
    private static final /* synthetic */ Block$EnumOffsetType[] aSM;

    public static Block$EnumOffsetType[] values() {
        return (Block$EnumOffsetType[])aSM.clone();
    }

    public static Block$EnumOffsetType valueOf(String string) {
        return Enum.valueOf(Block$EnumOffsetType.class, string);
    }

    private static /* synthetic */ Block$EnumOffsetType[] xS() {
        return new Block$EnumOffsetType[]{aSJ, aSK, aSL};
    }

    static {
        aSM = Block$EnumOffsetType.xS();
    }
}

