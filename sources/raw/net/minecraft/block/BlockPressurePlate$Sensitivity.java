/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

public final class BlockPressurePlate$Sensitivity
extends Enum<BlockPressurePlate$Sensitivity> {
    public static final /* enum */ BlockPressurePlate$Sensitivity aYg = new BlockPressurePlate$Sensitivity();
    public static final /* enum */ BlockPressurePlate$Sensitivity aYh = new BlockPressurePlate$Sensitivity();
    private static final /* synthetic */ BlockPressurePlate$Sensitivity[] aYi;

    public static BlockPressurePlate$Sensitivity[] values() {
        return (BlockPressurePlate$Sensitivity[])aYi.clone();
    }

    public static BlockPressurePlate$Sensitivity valueOf(String string) {
        return Enum.valueOf(BlockPressurePlate$Sensitivity.class, string);
    }

    private static /* synthetic */ BlockPressurePlate$Sensitivity[] yI() {
        return new BlockPressurePlate$Sensitivity[]{aYg, aYh};
    }

    static {
        aYi = BlockPressurePlate$Sensitivity.yI();
    }
}

