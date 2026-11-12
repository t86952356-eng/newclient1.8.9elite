/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.bg;

public final class BlockPistonExtension$EnumPistonType
extends Enum<BlockPistonExtension$EnumPistonType>
implements bg {
    public static final /* enum */ BlockPistonExtension$EnumPistonType aXC = new BlockPistonExtension$EnumPistonType("normal");
    public static final /* enum */ BlockPistonExtension$EnumPistonType aXD = new BlockPistonExtension$EnumPistonType("sticky");
    private final String aXE;
    private static final /* synthetic */ BlockPistonExtension$EnumPistonType[] aXF;

    public static BlockPistonExtension$EnumPistonType[] values() {
        return (BlockPistonExtension$EnumPistonType[])aXF.clone();
    }

    public static BlockPistonExtension$EnumPistonType valueOf(String string) {
        return Enum.valueOf(BlockPistonExtension$EnumPistonType.class, string);
    }

    private BlockPistonExtension$EnumPistonType(String string2) {
        this.aXE = string2;
    }

    public String toString() {
        return this.aXE;
    }

    @Override
    public String getName() {
        return this.aXE;
    }

    private static /* synthetic */ BlockPistonExtension$EnumPistonType[] yA() {
        return new BlockPistonExtension$EnumPistonType[]{aXC, aXD};
    }

    static {
        aXF = BlockPistonExtension$EnumPistonType.yA();
    }
}

