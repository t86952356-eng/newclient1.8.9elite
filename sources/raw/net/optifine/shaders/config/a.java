/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

public final class a
extends Enum<a> {
    public static final /* enum */ a eFE = new a("of.options.shaders.ANTIALIASING", "antialiasingLevel", "0");
    public static final /* enum */ a eFF = new a("of.options.shaders.NORMAL_MAP", "normalMapEnabled", "true");
    public static final /* enum */ a eFG = new a("of.options.shaders.SPECULAR_MAP", "specularMapEnabled", "true");
    public static final /* enum */ a eFH = new a("of.options.shaders.RENDER_RES_MUL", "renderResMul", "1.0");
    public static final /* enum */ a eFI = new a("of.options.shaders.SHADOW_RES_MUL", "shadowResMul", "1.0");
    public static final /* enum */ a eFJ = new a("of.options.shaders.HAND_DEPTH_MUL", "handDepthMul", "0.125");
    public static final /* enum */ a eFK = new a("of.options.shaders.CLOUD_SHADOW", "cloudShadow", "true");
    public static final /* enum */ a eFL = new a("of.options.shaders.OLD_HAND_LIGHT", "oldHandLight", "default");
    public static final /* enum */ a eFM = new a("of.options.shaders.OLD_LIGHTING", "oldLighting", "default");
    public static final /* enum */ a eFN = new a("of.options.shaders.SHADER_PACK", "shaderPack", "");
    public static final /* enum */ a eFO = new a("of.options.shaders.TWEAK_BLOCK_DAMAGE", "tweakBlockDamage", "false");
    public static final /* enum */ a eFP = new a("of.options.shaders.SHADOW_CLIP_FRUSTRUM", "shadowClipFrustrum", "true");
    public static final /* enum */ a eFQ = new a("of.options.shaders.TEX_MIN_FIL_B", "TexMinFilB", "0");
    public static final /* enum */ a eFR = new a("of.options.shaders.TEX_MIN_FIL_N", "TexMinFilN", "0");
    public static final /* enum */ a eFS = new a("of.options.shaders.TEX_MIN_FIL_S", "TexMinFilS", "0");
    public static final /* enum */ a eFT = new a("of.options.shaders.TEX_MAG_FIL_B", "TexMagFilB", "0");
    public static final /* enum */ a eFU = new a("of.options.shaders.TEX_MAG_FIL_N", "TexMagFilN", "0");
    public static final /* enum */ a eFV = new a("of.options.shaders.TEX_MAG_FIL_S", "TexMagFilS", "0");
    private String cIM = null;
    private String eFW = null;
    private String eFX = null;
    private static final /* synthetic */ a[] eFY;

    public static a[] values() {
        return (a[])eFY.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a(String string2, String string3, String string4) {
        this.cIM = string2;
        this.eFW = string3;
        this.eFX = string4;
    }

    public String acf() {
        return this.cIM;
    }

    public String aHo() {
        return this.eFW;
    }

    public String aHp() {
        return this.eFX;
    }

    private static /* synthetic */ a[] aHq() {
        return new a[]{eFE, eFF, eFG, eFH, eFI, eFJ, eFK, eFL, eFM, eFN, eFO, eFP, eFQ, eFR, eFS, eFT, eFU, eFV};
    }

    static {
        eFY = a.aHq();
    }
}

