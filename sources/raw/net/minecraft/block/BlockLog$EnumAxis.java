/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.ap;
import net.minecraft.util.bg;

public final class BlockLog$EnumAxis
extends Enum<BlockLog$EnumAxis>
implements bg {
    public static final /* enum */ BlockLog$EnumAxis aWY = new BlockLog$EnumAxis("x");
    public static final /* enum */ BlockLog$EnumAxis aWZ = new BlockLog$EnumAxis("y");
    public static final /* enum */ BlockLog$EnumAxis aXa = new BlockLog$EnumAxis("z");
    public static final /* enum */ BlockLog$EnumAxis aXb = new BlockLog$EnumAxis("none");
    private final String aXc;
    private static final /* synthetic */ BlockLog$EnumAxis[] aXd;

    public static BlockLog$EnumAxis[] values() {
        return (BlockLog$EnumAxis[])aXd.clone();
    }

    public static BlockLog$EnumAxis valueOf(String string) {
        return Enum.valueOf(BlockLog$EnumAxis.class, string);
    }

    private BlockLog$EnumAxis(String string2) {
        this.aXc = string2;
    }

    public String toString() {
        return this.aXc;
    }

    public static BlockLog$EnumAxis a(ap ap2) {
        switch (ap2) {
            case dwH: {
                return aWY;
            }
            case dwI: {
                return aWZ;
            }
            case dwJ: {
                return aXa;
            }
        }
        return aXb;
    }

    @Override
    public String getName() {
        return this.aXc;
    }

    private static /* synthetic */ BlockLog$EnumAxis[] yz() {
        return new BlockLog$EnumAxis[]{aWY, aWZ, aXa, aXb};
    }

    static {
        aXd = BlockLog$EnumAxis.yz();
    }
}

