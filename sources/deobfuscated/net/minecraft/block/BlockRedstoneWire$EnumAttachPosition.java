/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

final class BlockRedstoneWire$EnumAttachPosition
extends Enum<BlockRedstoneWire$EnumAttachPosition>
implements bg {
    public static final /* enum */ BlockRedstoneWire$EnumAttachPosition aZU = new BlockRedstoneWire$EnumAttachPosition("up");
    public static final /* enum */ BlockRedstoneWire$EnumAttachPosition aZV = new BlockRedstoneWire$EnumAttachPosition("side");
    public static final /* enum */ BlockRedstoneWire$EnumAttachPosition aZW = new BlockRedstoneWire$EnumAttachPosition("none");
    private final String name;
    private static final /* synthetic */ BlockRedstoneWire$EnumAttachPosition[] aZY;

    public static BlockRedstoneWire$EnumAttachPosition[] values() {
        return (BlockRedstoneWire$EnumAttachPosition[])aZY.clone();
    }

    public static BlockRedstoneWire$EnumAttachPosition valueOf(String string) {
        return Enum.valueOf(BlockRedstoneWire$EnumAttachPosition.class, string);
    }

    private BlockRedstoneWire$EnumAttachPosition(String string2) {
        this.name = string2;
    }

    public String toString() {
        return this.getName();
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockRedstoneWire$EnumAttachPosition[] yX() {
        return new BlockRedstoneWire$EnumAttachPosition[]{aZU, aZV, aZW};
    }

    static {
        aZY = BlockRedstoneWire$EnumAttachPosition.yX();
    }
}

