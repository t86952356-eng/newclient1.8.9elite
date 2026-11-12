/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.util.ao;

final class BlockModelRenderer$VertexTranslations
extends Enum<BlockModelRenderer$VertexTranslations> {
    public static final /* enum */ BlockModelRenderer$VertexTranslations bIh = new BlockModelRenderer$VertexTranslations(0, 1, 2, 3);
    public static final /* enum */ BlockModelRenderer$VertexTranslations bIi = new BlockModelRenderer$VertexTranslations(2, 3, 0, 1);
    public static final /* enum */ BlockModelRenderer$VertexTranslations bIj = new BlockModelRenderer$VertexTranslations(3, 0, 1, 2);
    public static final /* enum */ BlockModelRenderer$VertexTranslations bIk = new BlockModelRenderer$VertexTranslations(0, 1, 2, 3);
    public static final /* enum */ BlockModelRenderer$VertexTranslations bIl = new BlockModelRenderer$VertexTranslations(3, 0, 1, 2);
    public static final /* enum */ BlockModelRenderer$VertexTranslations bIm = new BlockModelRenderer$VertexTranslations(1, 2, 3, 0);
    private final int bIn;
    private final int bIo;
    private final int bIp;
    private final int bIq;
    private static final BlockModelRenderer$VertexTranslations[] bIr;
    private static final /* synthetic */ BlockModelRenderer$VertexTranslations[] bIs;

    public static BlockModelRenderer$VertexTranslations[] values() {
        return (BlockModelRenderer$VertexTranslations[])bIs.clone();
    }

    public static BlockModelRenderer$VertexTranslations valueOf(String string) {
        return Enum.valueOf(BlockModelRenderer$VertexTranslations.class, string);
    }

    private BlockModelRenderer$VertexTranslations(int n3, int n4, int n5, int n6) {
        this.bIn = n3;
        this.bIo = n4;
        this.bIp = n5;
        this.bIq = n6;
    }

    public static BlockModelRenderer$VertexTranslations g(ao ao2) {
        return bIr[ao2.OY()];
    }

    private static /* synthetic */ BlockModelRenderer$VertexTranslations[] IT() {
        return new BlockModelRenderer$VertexTranslations[]{bIh, bIi, bIj, bIk, bIl, bIm};
    }

    static {
        bIs = BlockModelRenderer$VertexTranslations.IT();
        bIr = new BlockModelRenderer$VertexTranslations[6];
        BlockModelRenderer$VertexTranslations.bIr[ao.dwq.OY()] = bIh;
        BlockModelRenderer$VertexTranslations.bIr[ao.dwr.OY()] = bIi;
        BlockModelRenderer$VertexTranslations.bIr[ao.dws.OY()] = bIj;
        BlockModelRenderer$VertexTranslations.bIr[ao.dwt.OY()] = bIk;
        BlockModelRenderer$VertexTranslations.bIr[ao.dwu.OY()] = bIl;
        BlockModelRenderer$VertexTranslations.bIr[ao.dwv.OY()] = bIm;
    }
}

