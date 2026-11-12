/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

public final class ChunkCompileTaskGenerator$Type
extends Enum<ChunkCompileTaskGenerator$Type> {
    public static final /* enum */ ChunkCompileTaskGenerator$Type bSA = new ChunkCompileTaskGenerator$Type();
    public static final /* enum */ ChunkCompileTaskGenerator$Type bSB = new ChunkCompileTaskGenerator$Type();
    private static final /* synthetic */ ChunkCompileTaskGenerator$Type[] bSC;

    public static ChunkCompileTaskGenerator$Type[] values() {
        return (ChunkCompileTaskGenerator$Type[])bSC.clone();
    }

    public static ChunkCompileTaskGenerator$Type valueOf(String string) {
        return Enum.valueOf(ChunkCompileTaskGenerator$Type.class, string);
    }

    private static /* synthetic */ ChunkCompileTaskGenerator$Type[] ML() {
        return new ChunkCompileTaskGenerator$Type[]{bSA, bSB};
    }

    static {
        bSC = ChunkCompileTaskGenerator$Type.ML();
    }
}

