/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

public final class GlStateManager$TexGen
extends Enum<GlStateManager$TexGen> {
    public static final /* enum */ GlStateManager$TexGen bLK = new GlStateManager$TexGen();
    public static final /* enum */ GlStateManager$TexGen bLL = new GlStateManager$TexGen();
    public static final /* enum */ GlStateManager$TexGen bLM = new GlStateManager$TexGen();
    public static final /* enum */ GlStateManager$TexGen bLN = new GlStateManager$TexGen();
    private static final /* synthetic */ GlStateManager$TexGen[] bLO;

    public static GlStateManager$TexGen[] values() {
        return (GlStateManager$TexGen[])bLO.clone();
    }

    public static GlStateManager$TexGen valueOf(String string) {
        return Enum.valueOf(GlStateManager$TexGen.class, string);
    }

    private static /* synthetic */ GlStateManager$TexGen[] Kh() {
        return new GlStateManager$TexGen[]{bLK, bLL, bLM, bLN};
    }

    static {
        bLO = GlStateManager$TexGen.Kh();
    }
}

