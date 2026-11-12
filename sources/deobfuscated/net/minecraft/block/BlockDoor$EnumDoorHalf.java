/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockDoor$EnumDoorHalf
extends Enum<BlockDoor$EnumDoorHalf>
implements bg {
    public static final /* enum */ BlockDoor$EnumDoorHalf aTV = new BlockDoor$EnumDoorHalf();
    public static final /* enum */ BlockDoor$EnumDoorHalf aTW = new BlockDoor$EnumDoorHalf();
    private static final /* synthetic */ BlockDoor$EnumDoorHalf[] aTX;

    public static BlockDoor$EnumDoorHalf[] values() {
        return (BlockDoor$EnumDoorHalf[])aTX.clone();
    }

    public static BlockDoor$EnumDoorHalf valueOf(String string) {
        return Enum.valueOf(BlockDoor$EnumDoorHalf.class, string);
    }

    public String toString() {
        return this.getName();
    }

    @Override
    public String getName() {
        return this == aTV ? "upper" : "lower";
    }

    private static /* synthetic */ BlockDoor$EnumDoorHalf[] yf() {
        return new BlockDoor$EnumDoorHalf[]{aTV, aTW};
    }

    static {
        aTX = BlockDoor$EnumDoorHalf.yf();
    }
}

