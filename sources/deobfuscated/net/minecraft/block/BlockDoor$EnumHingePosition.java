/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockDoor$EnumHingePosition
extends Enum<BlockDoor$EnumHingePosition>
implements bg {
    public static final /* enum */ BlockDoor$EnumHingePosition aTY = new BlockDoor$EnumHingePosition();
    public static final /* enum */ BlockDoor$EnumHingePosition aTZ = new BlockDoor$EnumHingePosition();
    private static final /* synthetic */ BlockDoor$EnumHingePosition[] aUa;

    public static BlockDoor$EnumHingePosition[] values() {
        return (BlockDoor$EnumHingePosition[])aUa.clone();
    }

    public static BlockDoor$EnumHingePosition valueOf(String string) {
        return Enum.valueOf(BlockDoor$EnumHingePosition.class, string);
    }

    public String toString() {
        return this.getName();
    }

    @Override
    public String getName() {
        return this == aTY ? "left" : "right";
    }

    private static /* synthetic */ BlockDoor$EnumHingePosition[] yg() {
        return new BlockDoor$EnumHingePosition[]{aTY, aTZ};
    }

    static {
        aUa = BlockDoor$EnumHingePosition.yg();
    }
}

