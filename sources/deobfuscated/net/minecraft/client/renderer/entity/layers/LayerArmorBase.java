/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.y;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.ae;
import net.optifine.reflect.g;
import net.optifine.reflect.l;
import net.optifine.shaders.ah;
import net.optifine.shaders.aj;

public abstract class LayerArmorBase<T extends d>
implements LayerRenderer<r> {
    protected static final cm bXe = new cm("textures/misc/enchanted_item_glint.png");
    protected T bXf;
    protected T bXg;
    private final RendererLivingEntity<?> bXh;
    private final float bXi = 1.0f;
    private final float bXj = 1.0f;
    private final float bXk = 1.0f;
    private final float bXl = 1.0f;
    private boolean bXm;
    private static final Map<String, cm> bXn = Maps.newHashMap();

    public LayerArmorBase(RendererLivingEntity<?> rendererLivingEntity) {
        this.bXh = rendererLivingEntity;
        this.Nl();
    }

    @Override
    public void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a(r2, f2, f3, f4, f5, f6, f7, f8, 4);
        this.a(r2, f2, f3, f4, f5, f6, f7, f8, 3);
        this.a(r2, f2, f3, f4, f5, f6, f7, f8, 2);
        this.a(r2, f2, f3, f4, f5, f6, f7, f8, 1);
    }

    @Override
    public boolean NH() {
        return false;
    }

    private void a(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2) {
        co co2 = this.a(r2, n2);
        if (co2 != null && co2.bP() instanceof y) {
            y y2 = (y)co2.bP();
            T t2 = this.dA(n2);
            ((d)t2).a(this.bXh.Nk());
            ((d)t2).a(r2, f2, f3, f4);
            if (g.eoT.aDA()) {
                t2 = this.a(r2, co2, n2, t2);
            }
            this.a(t2, n2);
            boolean bl2 = this.dB(n2);
            if (!a.aoT() || !ae.a(co2, bl2 ? 2 : 1, null)) {
                if (g.epa.aDA()) {
                    this.bXh.a(this.a((c)r2, co2, bl2 ? 2 : 1, null));
                } else {
                    this.bXh.a(this.a(y2, bl2));
                }
            }
            if (g.epa.aDA()) {
                if (l.a(y2, co2)) {
                    int n3 = y2.az(co2);
                    float f9 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                    float f10 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                    float f11 = (float)(n3 & 0xFF) / 255.0f;
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    GlStateManager.e(1.0f * f9, 1.0f * f10, 1.0f * f11, 1.0f);
                    ((d)t2).a(r2, f2, f3, f5, f6, f7, f8);
                    if (!a.aoT() || !ae.a(co2, bl2 ? 2 : 1, "overlay")) {
                        this.bXh.a(this.a((c)r2, co2, bl2 ? 2 : 1, "overlay"));
                    }
                }
                Objects.requireNonNull(this);
                Objects.requireNonNull(this);
                Objects.requireNonNull(this);
                Objects.requireNonNull(this);
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                ((d)t2).a(r2, f2, f3, f5, f6, f7, f8);
                if (!(this.bXm || !co2.aeo() || a.aoT() && ae.a(r2, co2, t2, f2, f3, f4, f5, f6, f7, f8))) {
                    this.a(r2, t2, f2, f3, f4, f5, f6, f7, f8);
                }
                return;
            }
            switch (y2.adN()) {
                case cVL: {
                    int n4 = y2.az(co2);
                    float f12 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                    float f13 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                    float f14 = (float)(n4 & 0xFF) / 255.0f;
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    GlStateManager.e(1.0f * f12, 1.0f * f13, 1.0f * f14, 1.0f);
                    ((d)t2).a(r2, f2, f3, f5, f6, f7, f8);
                    if (!a.aoT() || !ae.a(co2, bl2 ? 2 : 1, "overlay")) {
                        this.bXh.a(this.a(y2, bl2, "overlay"));
                    }
                }
                case cVM: 
                case cVN: 
                case cVO: 
                case cVP: {
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    Objects.requireNonNull(this);
                    GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                    ((d)t2).a(r2, f2, f3, f5, f6, f7, f8);
                }
            }
            if (!(RendererLivingEntity.bXc || this.bXm || !co2.aer() || a.aoT() && ae.a(r2, co2, t2, f2, f3, f4, f5, f6, f7, f8))) {
                this.a(r2, t2, f2, f3, f4, f5, f6, f7, f8);
            }
        }
    }

    public co a(r r2, int n2) {
        return r2.eH(n2 - 1);
    }

    public T dA(int n2) {
        return this.dB(n2) ? this.bXf : this.bXg;
    }

    private boolean dB(int n2) {
        return n2 == 2;
    }

    private void a(r r2, T t2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!a.aoG() || !ah.eye) {
            float f9 = (float)r2.aRg + f4;
            this.bXh.a(bXe);
            if (a.aoG()) {
                aj.aHi();
            }
            GlStateManager.tQ();
            GlStateManager.cJ(514);
            GlStateManager.an(false);
            float f10 = 0.5f;
            GlStateManager.e(0.5f, 0.5f, 0.5f, 1.0f);
            for (int i2 = 0; i2 < 2; ++i2) {
                GlStateManager.JA();
                GlStateManager.P(768, 1);
                float f11 = 0.76f;
                GlStateManager.e(0.38f, 0.19f, 0.608f, 1.0f);
                GlStateManager.cR(5890);
                GlStateManager.JU();
                float f12 = 0.33333334f;
                GlStateManager.i(0.33333334f, 0.33333334f, 0.33333334f);
                GlStateManager.d(30.0f - (float)i2 * 60.0f, 0.0f, 0.0f, 1.0f);
                GlStateManager.j(0.0f, f9 * (0.001f + (float)i2 * 0.003f) * 20.0f, 0.0f);
                GlStateManager.cR(5888);
                ((d)t2).a(r2, f2, f3, f5, f6, f7, f8);
            }
            GlStateManager.cR(5890);
            GlStateManager.JU();
            GlStateManager.cR(5888);
            GlStateManager.Jz();
            GlStateManager.an(true);
            GlStateManager.cJ(515);
            GlStateManager.tR();
            if (a.aoG()) {
                aj.aHj();
            }
        }
    }

    private cm a(y y2, boolean bl2) {
        return this.a(y2, bl2, null);
    }

    private cm a(y y2, boolean bl2, String string) {
        String string2 = String.format("textures/models/armor/%s_layer_%d%s.png", y2.adN().getName(), bl2 ? 2 : 1, string == null ? "" : String.format("_%s", string));
        cm cm2 = bXn.get(string2);
        if (cm2 == null) {
            cm2 = new cm(string2);
            bXn.put(string2, cm2);
        }
        return cm2;
    }

    protected abstract void Nl();

    protected abstract void a(T var1, int var2);

    protected T a(r r2, co co2, int n2, T t2) {
        return t2;
    }

    public cm a(c c2, co co2, int n2, String string) {
        y y2 = (y)co2.bP();
        String string2 = y2.adN().getName();
        String string3 = "minecraft";
        int n3 = string2.indexOf(58);
        if (n3 != -1) {
            string3 = string2.substring(0, n3);
            string2 = string2.substring(n3 + 1);
        }
        String string4 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", string3, string2, this.dB(n2) ? 2 : 1, string == null ? "" : String.format("_%s", string));
        cm cm2 = bXn.get(string4 = g.f(g.epa, c2, co2, string4, n2, string));
        if (cm2 == null) {
            cm2 = new cm(string4);
            bXn.put(string4, cm2);
        }
        return cm2;
    }
}

