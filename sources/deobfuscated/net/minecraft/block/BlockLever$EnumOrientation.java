/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.minecraft.util.ao;
import net.minecraft.util.bg;

public final class BlockLever$EnumOrientation
extends Enum<BlockLever$EnumOrientation>
implements bg {
    public static final /* enum */ BlockLever$EnumOrientation aWI = new BlockLever$EnumOrientation(0, "down_x", ao.dwq);
    public static final /* enum */ BlockLever$EnumOrientation aWJ = new BlockLever$EnumOrientation(1, "east", ao.dwv);
    public static final /* enum */ BlockLever$EnumOrientation aWK = new BlockLever$EnumOrientation(2, "west", ao.dwu);
    public static final /* enum */ BlockLever$EnumOrientation aWL = new BlockLever$EnumOrientation(3, "south", ao.dwt);
    public static final /* enum */ BlockLever$EnumOrientation aWM = new BlockLever$EnumOrientation(4, "north", ao.dws);
    public static final /* enum */ BlockLever$EnumOrientation aWN = new BlockLever$EnumOrientation(5, "up_z", ao.dwr);
    public static final /* enum */ BlockLever$EnumOrientation aWO = new BlockLever$EnumOrientation(6, "up_x", ao.dwr);
    public static final /* enum */ BlockLever$EnumOrientation aWP = new BlockLever$EnumOrientation(7, "down_z", ao.dwq);
    private static final BlockLever$EnumOrientation[] aWQ;
    private final int aWR;
    private final String name;
    private final ao aWT;
    private static final /* synthetic */ BlockLever$EnumOrientation[] aWU;

    public static BlockLever$EnumOrientation[] values() {
        return (BlockLever$EnumOrientation[])aWU.clone();
    }

    public static BlockLever$EnumOrientation valueOf(String string) {
        return Enum.valueOf(BlockLever$EnumOrientation.class, string);
    }

    private BlockLever$EnumOrientation(int n3, String string2, ao ao2) {
        this.aWR = n3;
        this.name = string2;
        this.aWT = ao2;
    }

    public int yc() {
        return this.aWR;
    }

    public ao yx() {
        return this.aWT;
    }

    public String toString() {
        return this.name;
    }

    public static BlockLever$EnumOrientation ba(int n2) {
        if (n2 < 0 || n2 >= aWQ.length) {
            n2 = 0;
        }
        return aWQ[n2];
    }

    public static BlockLever$EnumOrientation a(ao ao2, ao ao3) {
        switch (ao2) {
            case dwq: {
                switch (ao3.asL()) {
                    case dwH: {
                        return aWI;
                    }
                    case dwJ: {
                        return aWP;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + String.valueOf(ao3) + " for facing " + String.valueOf(ao2));
            }
            case dwr: {
                switch (ao3.asL()) {
                    case dwH: {
                        return aWO;
                    }
                    case dwJ: {
                        return aWN;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + String.valueOf(ao3) + " for facing " + String.valueOf(ao2));
            }
            case dws: {
                return aWM;
            }
            case dwt: {
                return aWL;
            }
            case dwu: {
                return aWK;
            }
            case dwv: {
                return aWJ;
            }
        }
        throw new IllegalArgumentException("Invalid facing: " + String.valueOf(ao2));
    }

    @Override
    public String getName() {
        return this.name;
    }

    private static /* synthetic */ BlockLever$EnumOrientation[] yy() {
        return new BlockLever$EnumOrientation[]{aWI, aWJ, aWK, aWL, aWM, aWN, aWO, aWP};
    }

    static {
        aWU = BlockLever$EnumOrientation.yy();
        aWQ = new BlockLever$EnumOrientation[BlockLever$EnumOrientation.values().length];
        BlockLever$EnumOrientation[] blockLever$EnumOrientationArray = BlockLever$EnumOrientation.values();
        int n2 = blockLever$EnumOrientationArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            BlockLever$EnumOrientation blockLever$EnumOrientation;
            BlockLever$EnumOrientation.aWQ[blockLever$EnumOrientation.yc()] = blockLever$EnumOrientation = blockLever$EnumOrientationArray[i2];
        }
    }
}

