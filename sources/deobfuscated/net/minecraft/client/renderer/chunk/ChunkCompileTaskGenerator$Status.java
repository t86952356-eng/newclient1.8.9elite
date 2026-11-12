/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.chunk;

public final class ChunkCompileTaskGenerator$Status
extends Enum<ChunkCompileTaskGenerator$Status> {
    public static final /* enum */ ChunkCompileTaskGenerator$Status bSv = new ChunkCompileTaskGenerator$Status();
    public static final /* enum */ ChunkCompileTaskGenerator$Status bSw = new ChunkCompileTaskGenerator$Status();
    public static final /* enum */ ChunkCompileTaskGenerator$Status bSx = new ChunkCompileTaskGenerator$Status();
    public static final /* enum */ ChunkCompileTaskGenerator$Status bSy = new ChunkCompileTaskGenerator$Status();
    private static final /* synthetic */ ChunkCompileTaskGenerator$Status[] bSz;

    public static ChunkCompileTaskGenerator$Status[] values() {
        return (ChunkCompileTaskGenerator$Status[])bSz.clone();
    }

    public static ChunkCompileTaskGenerator$Status valueOf(String string) {
        return Enum.valueOf(ChunkCompileTaskGenerator$Status.class, string);
    }

    private static /* synthetic */ ChunkCompileTaskGenerator$Status[] MK() {
        return new ChunkCompileTaskGenerator$Status[]{bSv, bSw, bSx, bSy};
    }

    static {
        bSz = ChunkCompileTaskGenerator$Status.MK();
    }
}

