/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockRedstoneComparator$Mode
extends Enum<BlockRedstoneComparator$Mode>
implements bg {
    public static final /* enum */ BlockRedstoneComparator$Mode aZC = new BlockRedstoneComparator$Mode("compare");
    public static final /* enum */ BlockRedstoneComparator$Mode aZD = new BlockRedstoneComparator$Mode("subtract");
    private final String aZE;
    private static final /* synthetic */ BlockRedstoneComparator$Mode[] aZF;

    public static BlockRedstoneComparator$Mode[] values() {
        return (BlockRedstoneComparator$Mode[])aZF.clone();
    }

    public static BlockRedstoneComparator$Mode valueOf(String string) {
        return Enum.valueOf(BlockRedstoneComparator$Mode.class, string);
    }

    private BlockRedstoneComparator$Mode(String string2) {
        this.aZE = string2;
    }

    public String toString() {
        return this.aZE;
    }

    @Override
    public String getName() {
        return this.aZE;
    }

    private static /* synthetic */ BlockRedstoneComparator$Mode[] yW() {
        return new BlockRedstoneComparator$Mode[]{aZC, aZD};
    }

    static {
        aZF = BlockRedstoneComparator$Mode.yW();
    }
}

