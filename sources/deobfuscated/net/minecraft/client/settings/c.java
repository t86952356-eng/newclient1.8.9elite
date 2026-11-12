/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.settings;

import net.minecraft.src.a;
import net.minecraft.util.bt;

public final class c
extends Enum<c> {
    public static final /* enum */ c cjJ = new c("options.invertMouse", false, true);
    public static final /* enum */ c cjK = new c("options.sensitivity", true, false);
    public static final /* enum */ c cjL = new c("options.fov", true, false, 30.0f, 110.0f, 1.0f);
    public static final /* enum */ c cjM = new c("options.gamma", true, false);
    public static final /* enum */ c cjN = new c("options.saturation", true, false);
    public static final /* enum */ c cjO = new c("options.renderDistance", true, false, 2.0f, 16.0f, 1.0f);
    public static final /* enum */ c cjP = new c("options.viewBobbing", false, true);
    public static final /* enum */ c cjQ = new c("options.anaglyph", false, true);
    public static final /* enum */ c cjR = new c("options.framerateLimit", true, false, 0.0f, 260.0f, 5.0f);
    public static final /* enum */ c cjS = new c("options.fboEnable", false, true);
    public static final /* enum */ c cjT = new c("options.renderClouds", false, false);
    public static final /* enum */ c cjU = new c("options.graphics", false, false);
    public static final /* enum */ c cjV = new c("options.ao", false, false);
    public static final /* enum */ c cjW = new c("options.guiScale", false, false);
    public static final /* enum */ c cjX = new c("options.particles", false, false);
    public static final /* enum */ c cjY = new c("options.chat.visibility", false, false);
    public static final /* enum */ c cjZ = new c("options.chat.color", false, true);
    public static final /* enum */ c cka = new c("options.chat.links", false, true);
    public static final /* enum */ c ckb = new c("options.chat.opacity", true, false);
    public static final /* enum */ c ckc = new c("options.chat.links.prompt", false, true);
    public static final /* enum */ c ckd = new c("options.snooper", false, true);
    public static final /* enum */ c cke = new c("options.fullscreen", false, true);
    public static final /* enum */ c ckf = new c("options.vsync", false, true);
    public static final /* enum */ c ckg = new c("options.vbo", false, true);
    public static final /* enum */ c ckh = new c("options.touchscreen", false, true);
    public static final /* enum */ c cki = new c("options.chat.scale", true, false);
    public static final /* enum */ c ckj = new c("options.chat.width", true, false);
    public static final /* enum */ c ckk = new c("options.chat.height.focused", true, false);
    public static final /* enum */ c ckl = new c("options.chat.height.unfocused", true, false);
    public static final /* enum */ c ckm = new c("options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f);
    public static final /* enum */ c ckn = new c("options.forceUnicodeFont", false, true);
    public static final /* enum */ c cko = new c("options.blockAlternatives", false, true);
    public static final /* enum */ c ckp = new c("options.reducedDebugInfo", false, true);
    public static final /* enum */ c ckq = new c("options.entityShadows", false, true);
    public static final /* enum */ c ckr = new c("options.realmsNotifications", false, true);
    public static final /* enum */ c cks = new c("of.options.FOG_FANCY", false, false);
    public static final /* enum */ c ckt = new c("of.options.FOG_START", false, false);
    public static final /* enum */ c cku = new c("of.options.MIPMAP_TYPE", true, false, 0.0f, 3.0f, 1.0f);
    public static final /* enum */ c ckv = new c("of.options.SMOOTH_FPS", false, false);
    public static final /* enum */ c ckw = new c("of.options.CLOUDS", false, false);
    public static final /* enum */ c ckx = new c("of.options.CLOUD_HEIGHT", true, false);
    public static final /* enum */ c cky = new c("of.options.TREES", false, false);
    public static final /* enum */ c ckz = new c("of.options.RAIN", false, false);
    public static final /* enum */ c ckA = new c("of.options.ANIMATED_WATER", false, false);
    public static final /* enum */ c ckB = new c("of.options.ANIMATED_LAVA", false, false);
    public static final /* enum */ c ckC = new c("of.options.ANIMATED_FIRE", false, false);
    public static final /* enum */ c ckD = new c("of.options.ANIMATED_PORTAL", false, false);
    public static final /* enum */ c ckE = new c("of.options.AO_LEVEL", true, false);
    public static final /* enum */ c ckF = new c("of.options.LAGOMETER", false, false);
    public static final /* enum */ c ckG = new c("of.options.SHOW_FPS", false, false);
    public static final /* enum */ c ckH = new c("of.options.AUTOSAVE_TICKS", false, false);
    public static final /* enum */ c ckI = new c("of.options.BETTER_GRASS", false, false);
    public static final /* enum */ c ckJ = new c("of.options.ANIMATED_REDSTONE", false, false);
    public static final /* enum */ c ckK = new c("of.options.ANIMATED_EXPLOSION", false, false);
    public static final /* enum */ c ckL = new c("of.options.ANIMATED_FLAME", false, false);
    public static final /* enum */ c ckM = new c("of.options.ANIMATED_SMOKE", false, false);
    public static final /* enum */ c ckN = new c("of.options.WEATHER", false, false);
    public static final /* enum */ c ckO = new c("of.options.SKY", false, false);
    public static final /* enum */ c ckP = new c("of.options.STARS", false, false);
    public static final /* enum */ c ckQ = new c("of.options.SUN_MOON", false, false);
    public static final /* enum */ c ckR = new c("of.options.VIGNETTE", false, false);
    public static final /* enum */ c ckS = new c("of.options.CHUNK_UPDATES", false, false);
    public static final /* enum */ c ckT = new c("of.options.CHUNK_UPDATES_DYNAMIC", false, false);
    public static final /* enum */ c ckU = new c("of.options.TIME", false, false);
    public static final /* enum */ c ckV = new c("of.options.CLEAR_WATER", false, false);
    public static final /* enum */ c ckW = new c("of.options.SMOOTH_WORLD", false, false);
    public static final /* enum */ c ckX = new c("of.options.VOID_PARTICLES", false, false);
    public static final /* enum */ c ckY = new c("of.options.WATER_PARTICLES", false, false);
    public static final /* enum */ c ckZ = new c("of.options.RAIN_SPLASH", false, false);
    public static final /* enum */ c cla = new c("of.options.PORTAL_PARTICLES", false, false);
    public static final /* enum */ c clb = new c("of.options.POTION_PARTICLES", false, false);
    public static final /* enum */ c clc = new c("of.options.FIREWORK_PARTICLES", false, false);
    public static final /* enum */ c cld = new c("of.options.PROFILER", false, false);
    public static final /* enum */ c cle = new c("of.options.DRIPPING_WATER_LAVA", false, false);
    public static final /* enum */ c clf = new c("of.options.BETTER_SNOW", false, false);
    public static final /* enum */ c clg = new c("of.options.FULLSCREEN_MODE", true, false, 0.0f, a.aoo().length, 1.0f);
    public static final /* enum */ c clh = new c("of.options.ANIMATED_TERRAIN", false, false);
    public static final /* enum */ c cli = new c("of.options.SWAMP_COLORS", false, false);
    public static final /* enum */ c clj = new c("of.options.RANDOM_ENTITIES", false, false);
    public static final /* enum */ c clk = new c("of.options.SMOOTH_BIOMES", false, false);
    public static final /* enum */ c cll = new c("of.options.CUSTOM_FONTS", false, false);
    public static final /* enum */ c clm = new c("of.options.CUSTOM_COLORS", false, false);
    public static final /* enum */ c cln = new c("of.options.SHOW_CAPES", false, false);
    public static final /* enum */ c clo = new c("of.options.CONNECTED_TEXTURES", false, false);
    public static final /* enum */ c clp = new c("of.options.CUSTOM_ITEMS", false, false);
    public static final /* enum */ c clq = new c("of.options.AA_LEVEL", true, false, 0.0f, 16.0f, 1.0f);
    public static final /* enum */ c clr = new c("of.options.AF_LEVEL", true, false, 1.0f, 16.0f, 1.0f);
    public static final /* enum */ c cls = new c("of.options.ANIMATED_TEXTURES", false, false);
    public static final /* enum */ c clt = new c("of.options.NATURAL_TEXTURES", false, false);
    public static final /* enum */ c clu = new c("of.options.EMISSIVE_TEXTURES", false, false);
    public static final /* enum */ c clv = new c("of.options.HELD_ITEM_TOOLTIPS", false, false);
    public static final /* enum */ c clw = new c("of.options.DROPPED_ITEMS", false, false);
    public static final /* enum */ c clx = new c("of.options.LAZY_CHUNK_LOADING", false, false);
    public static final /* enum */ c cly = new c("of.options.CUSTOM_SKY", false, false);
    public static final /* enum */ c clz = new c("of.options.FAST_MATH", false, false);
    public static final /* enum */ c clA = new c("of.options.FAST_RENDER", false, false);
    public static final /* enum */ c clB = new c("of.options.TRANSLUCENT_BLOCKS", false, false);
    public static final /* enum */ c clC = new c("of.options.DYNAMIC_FOV", false, false);
    public static final /* enum */ c clD = new c("of.options.DYNAMIC_LIGHTS", false, false);
    public static final /* enum */ c clE = new c("of.options.ALTERNATE_BLOCKS", false, false);
    public static final /* enum */ c clF = new c("of.options.CUSTOM_ENTITY_MODELS", false, false);
    public static final /* enum */ c clG = new c("of.options.ADVANCED_TOOLTIPS", false, false);
    public static final /* enum */ c clH = new c("of.options.SCREENSHOT_SIZE", false, false);
    public static final /* enum */ c clI = new c("of.options.CUSTOM_GUIS", false, false);
    public static final /* enum */ c clJ = new c("of.options.RENDER_REGIONS", false, false);
    public static final /* enum */ c clK = new c("of.options.SHOW_GL_ERRORS", false, false);
    public static final /* enum */ c clL = new c("of.options.SMART_ANIMATIONS", false, false);
    private final boolean clM;
    private final boolean clN;
    private final String clO;
    private final float clP;
    private final float clQ;
    private float clR;
    private static final /* synthetic */ c[] clS;

    public static c[] values() {
        return (c[])clS.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c dZ(int n2) {
        for (c c2 : c.values()) {
            if (c2.QX() != n2) continue;
            return c2;
        }
        return null;
    }

    private c(String string2, boolean bl2, boolean bl3) {
        this(string2, bl2, bl3, 0.0f, 1.0f, 0.0f);
    }

    private c(String string2, boolean bl2, boolean bl3, float f2, float f3, float f4) {
        this.clO = string2;
        this.clM = bl2;
        this.clN = bl3;
        this.clQ = f2;
        this.clR = f3;
        this.clP = f4;
    }

    public boolean QV() {
        return this.clM;
    }

    public boolean QW() {
        return this.clN;
    }

    public int QX() {
        return this.ordinal();
    }

    public String QY() {
        return this.clO;
    }

    public float QZ() {
        return this.clR;
    }

    public void aH(float f2) {
        this.clR = f2;
    }

    public float aI(float f2) {
        return bt.I((this.aK(f2) - this.clQ) / (this.clR - this.clQ), 0.0f, 1.0f);
    }

    public float aJ(float f2) {
        return this.aK(this.clQ + (this.clR - this.clQ) * bt.I(f2, 0.0f, 1.0f));
    }

    public float aK(float f2) {
        f2 = this.aL(f2);
        return bt.I(f2, this.clQ, this.clR);
    }

    private float aL(float f2) {
        if (this.clP > 0.0f) {
            f2 = this.clP * (float)Math.round(f2 / this.clP);
        }
        return f2;
    }

    private static /* synthetic */ c[] Ra() {
        return new c[]{cjJ, cjK, cjL, cjM, cjN, cjO, cjP, cjQ, cjR, cjS, cjT, cjU, cjV, cjW, cjX, cjY, cjZ, cka, ckb, ckc, ckd, cke, ckf, ckg, ckh, cki, ckj, ckk, ckl, ckm, ckn, cko, ckp, ckq, ckr, cks, ckt, cku, ckv, ckw, ckx, cky, ckz, ckA, ckB, ckC, ckD, ckE, ckF, ckG, ckH, ckI, ckJ, ckK, ckL, ckM, ckN, ckO, ckP, ckQ, ckR, ckS, ckT, ckU, ckV, ckW, ckX, ckY, ckZ, cla, clb, clc, cld, cle, clf, clg, clh, cli, clj, clk, cll, clm, cln, clo, clp, clq, clr, cls, clt, clu, clv, clw, clx, cly, clz, clA, clB, clC, clD, clE, clF, clG, clH, clI, clJ, clK, clL};
    }

    static {
        clS = c.Ra();
    }
}

