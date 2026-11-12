/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.BlockModelRenderer$Orientation;
import net.minecraft.util.ao;

public final class BlockModelRenderer$EnumNeighborInfo
extends Enum<BlockModelRenderer$EnumNeighborInfo> {
    public static final /* enum */ BlockModelRenderer$EnumNeighborInfo bHE = new BlockModelRenderer$EnumNeighborInfo(new ao[]{ao.dwu, ao.dwv, ao.dws, ao.dwt}, 0.5f, false, new BlockModelRenderer$Orientation[0], new BlockModelRenderer$Orientation[0], new BlockModelRenderer$Orientation[0], new BlockModelRenderer$Orientation[0]);
    public static final /* enum */ BlockModelRenderer$EnumNeighborInfo bHF = new BlockModelRenderer$EnumNeighborInfo(new ao[]{ao.dwv, ao.dwu, ao.dws, ao.dwt}, 1.0f, false, new BlockModelRenderer$Orientation[0], new BlockModelRenderer$Orientation[0], new BlockModelRenderer$Orientation[0], new BlockModelRenderer$Orientation[0]);
    public static final /* enum */ BlockModelRenderer$EnumNeighborInfo bHG = new BlockModelRenderer$EnumNeighborInfo(new ao[]{ao.dwr, ao.dwq, ao.dwv, ao.dwu}, 0.8f, true, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bId, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHX, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHX, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bId}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bIe, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHY, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHY, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bIe}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bIe, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHY, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHY, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bIe}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bId, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHX, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHX, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bId});
    public static final /* enum */ BlockModelRenderer$EnumNeighborInfo bHH = new BlockModelRenderer$EnumNeighborInfo(new ao[]{ao.dwu, ao.dwv, ao.dwq, ao.dwr}, 0.8f, true, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bId, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bId, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHX, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHX}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bId, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bId, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHX, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHX}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bIe, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bIe, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHY, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHY}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bIe, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bIe, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHY, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHY});
    public static final /* enum */ BlockModelRenderer$EnumNeighborInfo bHI = new BlockModelRenderer$EnumNeighborInfo(new ao[]{ao.dwr, ao.dwq, ao.dws, ao.dwt}, 0.6f, true, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHW, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHW}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHV, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHV}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHV, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHV}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHW, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHW});
    public static final /* enum */ BlockModelRenderer$EnumNeighborInfo bHJ = new BlockModelRenderer$EnumNeighborInfo(new ao[]{ao.dwq, ao.dwr, ao.dws, ao.dwt}, 0.6f, true, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHW, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHW}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bHV, BlockModelRenderer$Orientation.bHZ, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bHT, BlockModelRenderer$Orientation.bHV}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHV, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bIb, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHV}, new BlockModelRenderer$Orientation[]{BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bHW, BlockModelRenderer$Orientation.bIa, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bIc, BlockModelRenderer$Orientation.bHU, BlockModelRenderer$Orientation.bHW});
    private final ao[] bHK;
    private final float bHL;
    private final boolean bHM;
    private final BlockModelRenderer$Orientation[] bHN;
    private final BlockModelRenderer$Orientation[] bHO;
    private final BlockModelRenderer$Orientation[] bHP;
    private final BlockModelRenderer$Orientation[] bHQ;
    private static final BlockModelRenderer$EnumNeighborInfo[] bHR;
    private static final /* synthetic */ BlockModelRenderer$EnumNeighborInfo[] bHS;

    public static BlockModelRenderer$EnumNeighborInfo[] values() {
        return (BlockModelRenderer$EnumNeighborInfo[])bHS.clone();
    }

    public static BlockModelRenderer$EnumNeighborInfo valueOf(String string) {
        return Enum.valueOf(BlockModelRenderer$EnumNeighborInfo.class, string);
    }

    private BlockModelRenderer$EnumNeighborInfo(ao[] aoArray, float f2, boolean bl2, BlockModelRenderer$Orientation[] blockModelRenderer$OrientationArray, BlockModelRenderer$Orientation[] blockModelRenderer$OrientationArray2, BlockModelRenderer$Orientation[] blockModelRenderer$OrientationArray3, BlockModelRenderer$Orientation[] blockModelRenderer$OrientationArray4) {
        this.bHK = aoArray;
        this.bHL = f2;
        this.bHM = bl2;
        this.bHN = blockModelRenderer$OrientationArray;
        this.bHO = blockModelRenderer$OrientationArray2;
        this.bHP = blockModelRenderer$OrientationArray3;
        this.bHQ = blockModelRenderer$OrientationArray4;
    }

    public static BlockModelRenderer$EnumNeighborInfo f(ao ao2) {
        return bHR[ao2.OY()];
    }

    private static /* synthetic */ BlockModelRenderer$EnumNeighborInfo[] IR() {
        return new BlockModelRenderer$EnumNeighborInfo[]{bHE, bHF, bHG, bHH, bHI, bHJ};
    }

    static {
        bHS = BlockModelRenderer$EnumNeighborInfo.IR();
        bHR = new BlockModelRenderer$EnumNeighborInfo[6];
        BlockModelRenderer$EnumNeighborInfo.bHR[ao.dwq.OY()] = bHE;
        BlockModelRenderer$EnumNeighborInfo.bHR[ao.dwr.OY()] = bHF;
        BlockModelRenderer$EnumNeighborInfo.bHR[ao.dws.OY()] = bHG;
        BlockModelRenderer$EnumNeighborInfo.bHR[ao.dwt.OY()] = bHH;
        BlockModelRenderer$EnumNeighborInfo.bHR[ao.dwu.OY()] = bHI;
        BlockModelRenderer$EnumNeighborInfo.bHR[ao.dwv.OY()] = bHJ;
    }
}

