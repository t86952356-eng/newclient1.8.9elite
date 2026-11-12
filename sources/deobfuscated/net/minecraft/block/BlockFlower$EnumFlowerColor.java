/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;

public final class BlockFlower$EnumFlowerColor
extends Enum<BlockFlower$EnumFlowerColor> {
    public static final /* enum */ BlockFlower$EnumFlowerColor aUXX = new BlockFlower$EnumFlowerColor();
    public static final /* enum */ BlockFlower$EnumFlowerColor aUY = new BlockFlower$EnumFlowerColor();
    private static final /* synthetic */ BlockFlower$EnumFlowerColor[] aUZ;

    public static BlockFlower$EnumFlowerColor[] values() {
        return (BlockFlower$EnumFlowerColor[])aUZ.clone();
    }

    public static BlockFlower$EnumFlowerColor valueOf(String string) {
        return Enum.valueOf(BlockFlower$EnumFlowerColor.class, string);
    }

    public BlockFlower yr() {
        return this == aUXX ? Blocks.cLP : Blocks.cLQ;
    }

    private static /* synthetic */ BlockFlower$EnumFlowerColor[] ys() {
        return new BlockFlower$EnumFlowerColor[]{aUXX, aUY};
    }

    static {
        aUZ = BlockFlower$EnumFlowerColor.ys();
    }
}

