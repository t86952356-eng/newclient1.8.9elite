/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockBed$EnumPartType
extends Enum<BlockBed$EnumPartType>
implements bg {
    public static final /* enum */ BlockBed$EnumPartType aTe = new BlockBed$EnumPartType("head");
    public static final /* enum */ BlockBed$EnumPartType aTf = new BlockBed$EnumPartType("foot");
    private final String aTg;
    private static final /* synthetic */ BlockBed$EnumPartType[] aTh;

    public static BlockBed$EnumPartType[] values() {
        return (BlockBed$EnumPartType[])aTh.clone();
    }

    public static BlockBed$EnumPartType valueOf(String string) {
        return Enum.valueOf(BlockBed$EnumPartType.class, string);
    }

    private BlockBed$EnumPartType(String string2) {
        this.aTg = string2;
    }

    public String toString() {
        return this.aTg;
    }

    @Override
    public String getName() {
        return this.aTg;
    }

    private static /* synthetic */ BlockBed$EnumPartType[] xZ() {
        return new BlockBed$EnumPartType[]{aTe, aTf};
    }

    static {
        aTh = BlockBed$EnumPartType.xZ();
    }
}

