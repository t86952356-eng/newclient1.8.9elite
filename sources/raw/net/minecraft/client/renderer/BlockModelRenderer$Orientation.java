/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.util.ao;

public final class BlockModelRenderer$Orientation
extends Enum<BlockModelRenderer$Orientation> {
    public static final /* enum */ BlockModelRenderer$Orientation bHT = new BlockModelRenderer$Orientation(ao.dwq, false);
    public static final /* enum */ BlockModelRenderer$Orientation bHU = new BlockModelRenderer$Orientation(ao.dwr, false);
    public static final /* enum */ BlockModelRenderer$Orientation bHV = new BlockModelRenderer$Orientation(ao.dws, false);
    public static final /* enum */ BlockModelRenderer$Orientation bHW = new BlockModelRenderer$Orientation(ao.dwt, false);
    public static final /* enum */ BlockModelRenderer$Orientation bHX = new BlockModelRenderer$Orientation(ao.dwu, false);
    public static final /* enum */ BlockModelRenderer$Orientation bHY = new BlockModelRenderer$Orientation(ao.dwv, false);
    public static final /* enum */ BlockModelRenderer$Orientation bHZ = new BlockModelRenderer$Orientation(ao.dwq, true);
    public static final /* enum */ BlockModelRenderer$Orientation bIa = new BlockModelRenderer$Orientation(ao.dwr, true);
    public static final /* enum */ BlockModelRenderer$Orientation bIb = new BlockModelRenderer$Orientation(ao.dws, true);
    public static final /* enum */ BlockModelRenderer$Orientation bIc = new BlockModelRenderer$Orientation(ao.dwt, true);
    public static final /* enum */ BlockModelRenderer$Orientation bId = new BlockModelRenderer$Orientation(ao.dwu, true);
    public static final /* enum */ BlockModelRenderer$Orientation bIe = new BlockModelRenderer$Orientation(ao.dwv, true);
    private final int bIf;
    private static final /* synthetic */ BlockModelRenderer$Orientation[] bIg;

    public static BlockModelRenderer$Orientation[] values() {
        return (BlockModelRenderer$Orientation[])bIg.clone();
    }

    public static BlockModelRenderer$Orientation valueOf(String string) {
        return Enum.valueOf(BlockModelRenderer$Orientation.class, string);
    }

    private BlockModelRenderer$Orientation(ao ao2, boolean bl2) {
        this.bIf = ao2.OY() + (bl2 ? ao.values().length : 0);
    }

    private static /* synthetic */ BlockModelRenderer$Orientation[] IS() {
        return new BlockModelRenderer$Orientation[]{bHT, bHU, bHV, bHW, bHX, bHY, bHZ, bIa, bIb, bIc, bId, bIe};
    }

    static {
        bIg = BlockModelRenderer$Orientation.IS();
    }
}

