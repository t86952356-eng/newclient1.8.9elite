/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.entity;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import hackclient.rise.fn;
import hackclient.rise.fx;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.model.ap;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.f;
import net.minecraft.entity.r;
import net.minecraft.scoreboard.h;
import net.minecraft.scoreboard.l;
import net.minecraft.scoreboard.m;
import net.minecraft.src.a;
import net.minecraft.util.an;
import net.minecraft.util.bt;
import net.optifine.aq;
import net.optifine.entity.model.c;
import net.optifine.reflect.g;
import net.optifine.shaders.ah;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public abstract class RendererLivingEntity<T extends r>
extends Render<T> {
    private static final Logger bWJ = LogManager.getLogger();
    private static final DynamicTexture bWK = new DynamicTexture(16, 16);
    public net.minecraft.client.model.d bWL;
    protected FloatBuffer bWM = GLAllocation.cG(4);
    private static FloatBuffer bWN = GLAllocation.cG(4);
    protected List<LayerRenderer<T>> bWO = Lists.newArrayList();
    protected boolean bVJ = false;
    public static float bWP = 64.0f;
    public static float bWQ = 32.0f;
    public r bWR;
    public float bWS;
    public float bWT;
    public float bWU;
    public float bWV;
    public float bWW;
    public float bWX;
    public float bWY;
    private boolean bWZ;
    private boolean bXa;
    public static final boolean bXb = Boolean.getBoolean("animate.model.living");
    public static boolean bXc = false;

    public RendererLivingEntity(RenderManager renderManager, net.minecraft.client.model.d d2, float f2) {
        super(renderManager);
        this.bWL = d2;
        this.bUm = f2;
        this.bWZ = this.bWL instanceof ap;
    }

    public static boolean f(Color color) {
        GlStateManager.cN(OpenGlHelper.bMI);
        GlStateManager.JN();
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMO);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)7681);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.JN();
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)OpenGlHelper.bMN);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMP);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMU, (int)OpenGlHelper.bMP);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMX, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)7681);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        bWN.position(0);
        float f2 = (float)color.getRed() / 255.0f;
        float f3 = (float)color.getGreen() / 255.0f;
        float f4 = (float)color.getBlue() / 255.0f;
        bWN.put(f2);
        bWN.put(f3);
        bWN.put(f4);
        bWN.put(1.0f);
        if (a.aoG()) {
            ah.o(f2, f3, f4, 1.0f);
        }
        bWN.flip();
        GL11.glTexEnv((int)8960, (int)8705, (FloatBuffer)bWN);
        GlStateManager.cN(OpenGlHelper.bMK);
        GlStateManager.JN();
        GlStateManager.ap(bWK.Ll());
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMJ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)7681);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GlStateManager.cN(OpenGlHelper.bMI);
        return true;
    }

    public static void ND() {
        GlStateManager.cN(OpenGlHelper.bMI);
        GlStateManager.JN();
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMO);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNa, (int)OpenGlHelper.bMO);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNd, (int)770);
        GlStateManager.cN(OpenGlHelper.bMJ);
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)5890);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)5890);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.cN(OpenGlHelper.bMK);
        GlStateManager.JO();
        GlStateManager.ap(0);
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)5890);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)5890);
        GlStateManager.cN(OpenGlHelper.bMI);
        if (a.aoG()) {
            ah.o(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public <V extends r, U extends LayerRenderer<V>> boolean a(U u2) {
        return this.bWO.add(u2);
    }

    protected <V extends r, U extends LayerRenderer<V>> boolean b(U u2) {
        return this.bWO.remove(u2);
    }

    public net.minecraft.client.model.d Nk() {
        return this.bWL;
    }

    protected float p(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    public void Nr() {
    }

    @Override
    public void a(T t2, double d2, double d3, double d4, float f2, float f3) {
        if (!g.eqJ.aDA() || !g.a(g.eqJ, t2, this, d2, d3, d4)) {
            if (bXb) {
                ((r)t2).cuy = 1.0f;
            }
            GlStateManager.JV();
            GlStateManager.JI();
            this.bWL.km = this.f(t2, f3);
            this.bWL.byo = ((net.minecraft.entity.c)t2).isRiding();
            if (g.eoB.aDA()) {
                this.bWL.byo = ((net.minecraft.entity.c)t2).isRiding() && ((r)t2).crC != null && g.b((Object)((r)t2).crC, g.eoB, new Object[0]);
            }
            this.bWL.byp = ((r)t2).Uz();
            try {
                float f4;
                float f5 = this.p(((r)t2).cuG, ((r)t2).cuF, f3);
                float f6 = this.p(((r)t2).cuH, ((r)t2).pn, f3);
                float f7 = f6 - f5;
                if (this.bWL.byo && ((r)t2).crC instanceof r) {
                    r r2 = (r)((r)t2).crC;
                    f5 = this.p(r2.cuG, r2.cuF, f3);
                    f7 = f6 - f5;
                    f4 = bt.bN(f7);
                    if (f4 < -85.0f) {
                        f4 = -85.0f;
                    }
                    if (f4 >= 85.0f) {
                        f4 = 85.0f;
                    }
                    f5 = f6 - f4;
                    if (f4 * f4 > 2500.0f) {
                        f5 += f4 * 0.2f;
                    }
                    f7 = f6 - f5;
                }
                float f8 = ((r)t2).crO + (((r)t2).pm - ((r)t2).crO) * f3;
                this.a(t2, d2, d3, d4);
                f4 = this.d(t2, f3);
                this.b(t2, f4, f5, f3);
                GlStateManager.JS();
                GlStateManager.i(-1.0f, -1.0f, 1.0f);
                this.c(t2, f3);
                float f9 = 0.0625f;
                GlStateManager.j(0.0f, -1.5078125f, 0.0f);
                float f10 = ((r)t2).cux + (((r)t2).cuy - ((r)t2).cux) * f3;
                float f11 = ((r)t2).cuz - ((r)t2).cuy * (1.0f - f3);
                if (((r)t2).Uz()) {
                    f11 *= 3.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                GlStateManager.tL();
                this.bWL.a((r)t2, f11, f10, f3);
                this.bWL.a(f11, f10, f4, f7, f8, 0.0625f, (net.minecraft.entity.c)t2);
                if (c.bd()) {
                    this.bWR = t2;
                    this.bWS = f11;
                    this.bWT = f10;
                    this.bWU = f4;
                    this.bWV = f7;
                    this.bWW = f8;
                    this.bWX = 0.0625f;
                    this.bWY = f3;
                }
                if (this.bVJ) {
                    boolean bl2 = this.H(t2);
                    this.a(t2, f11, f10, f4, f7, f8, 0.0625f, f3);
                    if (bl2) {
                        this.NE();
                    }
                } else {
                    boolean bl3;
                    boolean bl4 = bl3 = ((r)t2).fX && this.e(t2, f3);
                    if (aq.bd()) {
                        aq.aBm();
                    }
                    if (this.bWZ) {
                        GlStateManager.JV();
                    }
                    this.a(t2, f11, f10, f4, f7, f8, 0.0625f, f3);
                    if (this.bWZ) {
                        GlStateManager.JW();
                    }
                    if (aq.bd()) {
                        if (aq.aBn()) {
                            this.bWZ = true;
                            aq.aBo();
                            GlStateManager.JV();
                            this.a(t2, f11, f10, f4, f7, f8, 0.0625f, f3);
                            GlStateManager.JW();
                            aq.aBp();
                        }
                        aq.aBq();
                    }
                    fn fn2 = new fn(false);
                    hackclient.rise.a.a.e().d(fn2);
                    boolean bl5 = fn2.dw();
                    if (bl3 && !bl5) {
                        this.NF();
                    }
                    GlStateManager.an(true);
                    if (bl3 && bl5) {
                        this.NF();
                    }
                }
                if (c.bd()) {
                    this.bWR = null;
                }
                GlStateManager.JT();
            }
            catch (Exception exception) {
                bWJ.error("Couldn't render entity", (Throwable)exception);
            }
            GlStateManager.cN(OpenGlHelper.bMJ);
            GlStateManager.JN();
            GlStateManager.cN(OpenGlHelper.bMI);
            GlStateManager.JH();
            GlStateManager.JW();
            if (!this.bVJ) {
                super.a(t2, d2, d3, d4, f2, f3);
            }
            if (g.eqL.aDA()) {
                g.a(g.eqL, t2, this, d2, d3, d4);
            }
        }
    }

    protected boolean H(T t2) {
        String string;
        h h2;
        int n2 = 0xFFFFFF;
        if (t2 instanceof net.minecraft.entity.player.a && (h2 = (h)((r)t2).Vw()) != null && (string = agg.bT(h2.aks())).length() >= 2) {
            n2 = this.Nn().f(string.charAt(1));
        }
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        GlStateManager.JA();
        GlStateManager.cN(OpenGlHelper.bMI);
        GlStateManager.e(f2, f3, f4, 1.0f);
        GlStateManager.JO();
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.JO();
        GlStateManager.cN(OpenGlHelper.bMI);
        return true;
    }

    protected void NE() {
        GlStateManager.Jz();
        GlStateManager.cN(OpenGlHelper.bMI);
        GlStateManager.JN();
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.JN();
        GlStateManager.cN(OpenGlHelper.bMI);
    }

    protected void a(T t2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        boolean bl2;
        boolean bl3 = !((net.minecraft.entity.c)t2).isInvisible();
        boolean bl4 = bl2 = !bl3 && !((net.minecraft.entity.c)t2).p(d.AZ().bgK);
        if (bl3 || bl2) {
            if (bl2) {
                GlStateManager.JV();
                GlStateManager.e(1.0f, 1.0f, 1.0f, 0.15f);
                GlStateManager.an(false);
                GlStateManager.tQ();
                GlStateManager.P(770, 771);
                GlStateManager.e(516, 0.003921569f);
            }
            if (!this.N(t2)) {
                return;
            }
            GL11.glDisable((int)3008);
            fx fx2 = new fx((r)t2, () -> this.bWL.a((net.minecraft.entity.c)t2, f2, f3, f4, f5, f6, f7), () -> this.b(t2, f2, f3, f8, f4, f5, f6, f7));
            GL11.glEnable((int)3008);
            hackclient.rise.a.a.e().d(fx2);
            fx2.dI().run();
            fx2.dJ().run();
            if (bl2) {
                GlStateManager.tR();
                GlStateManager.e(516, 0.1f);
                GlStateManager.JW();
                GlStateManager.an(true);
            }
        }
    }

    protected boolean e(T t2, float f2) {
        return this.a(t2, f2, true);
    }

    protected boolean a(T t2, float f2, boolean bl2) {
        boolean bl3;
        if (bXc) {
            return false;
        }
        float f3 = ((net.minecraft.entity.c)t2).ag(f2);
        int n2 = this.b(t2, f3, f2);
        boolean bl4 = (n2 >> 24 & 0xFF) > 0;
        boolean bl5 = bl3 = ((r)t2).cus > 0 || ((r)t2).cuv > 0;
        if (!bl4 && !bl3) {
            return false;
        }
        if (!bl4 && !bl2) {
            return false;
        }
        GlStateManager.cN(OpenGlHelper.bMI);
        GlStateManager.JN();
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMO);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)7681);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.JN();
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)OpenGlHelper.bMN);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMP);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMU, (int)OpenGlHelper.bMP);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMX, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)7681);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        this.bWM.position(0);
        if (bl3) {
            this.bWM.put(1.0f);
            this.bWM.put(0.0f);
            this.bWM.put(0.0f);
            this.bWM.put(0.3f);
            if (a.aoG()) {
                ah.o(1.0f, 0.0f, 0.0f, 0.3f);
            }
        } else {
            float f4 = (float)(n2 >> 24 & 0xFF) / 255.0f;
            float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f7 = (float)(n2 & 0xFF) / 255.0f;
            this.bWM.put(f5);
            this.bWM.put(f6);
            this.bWM.put(f7);
            this.bWM.put(1.0f - f4);
            if (a.aoG()) {
                ah.o(f5, f6, f7, 1.0f - f4);
            }
        }
        this.bWM.flip();
        GL11.glTexEnv((int)8960, (int)8705, (FloatBuffer)this.bWM);
        GlStateManager.cN(OpenGlHelper.bMK);
        GlStateManager.JN();
        GlStateManager.ap(bWK.Ll());
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMJ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)7681);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GlStateManager.cN(OpenGlHelper.bMI);
        return true;
    }

    protected void NF() {
        if (bXc) {
            return;
        }
        GlStateManager.cN(OpenGlHelper.bMI);
        GlStateManager.JN();
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMO);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)OpenGlHelper.bMI);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNa, (int)OpenGlHelper.bMO);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNd, (int)770);
        GlStateManager.cN(OpenGlHelper.bMJ);
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)5890);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)5890);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.cN(OpenGlHelper.bMK);
        GlStateManager.JO();
        GlStateManager.ap(0);
        GL11.glTexEnvi((int)8960, (int)8704, (int)OpenGlHelper.bMM);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMR, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMV, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMW, (int)768);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMS, (int)5890);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMT, (int)OpenGlHelper.bMQ);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMY, (int)8448);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bNc, (int)770);
        GL11.glTexEnvi((int)8960, (int)OpenGlHelper.bMZ, (int)5890);
        GlStateManager.cN(OpenGlHelper.bMI);
        if (a.aoG()) {
            ah.o(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override
    protected void a(T t2, double d2, double d3, double d4) {
        GlStateManager.j((float)d2, (float)d3, (float)d4);
    }

    protected void b(T t2, float f2, float f3, float f4) {
        GlStateManager.d(180.0f - f3, 0.0f, 1.0f, 0.0f);
        if (((r)t2).cuv > 0) {
            float f5 = ((float)((r)t2).cuv + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f5 = bt.bK(f5)) > 1.0f) {
                f5 = 1.0f;
            }
            GlStateManager.d(f5 * this.G(t2), 0.0f, 0.0f, 1.0f);
        } else {
            String string = an.ge(((net.minecraft.entity.c)t2).xU());
            if (string != null && (string.equals("Dinnerbone") || string.equals("Grumm")) && (!(t2 instanceof net.minecraft.entity.player.a) || ((net.minecraft.entity.player.a)t2).c(f.cJq))) {
                GlStateManager.j(0.0f, ((r)t2).height + 0.1f, 0.0f);
                GlStateManager.d(180.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }

    protected float f(T t2, float f2) {
        return ((r)t2).ba(f2);
    }

    protected float d(T t2, float f2) {
        return (float)((r)t2).aRg + f2;
    }

    protected void b(T t2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        for (LayerRenderer<T> layerRenderer : this.bWO) {
            boolean bl2;
            boolean bl3 = bl2 = ((r)t2).fX && this.a(t2, f4, layerRenderer.NH());
            if (aq.bd()) {
                aq.aBm();
            }
            if (this.bXa) {
                GlStateManager.JV();
            }
            layerRenderer.d(t2, f2, f3, f4, f5, f6, f7, f8);
            if (this.bXa) {
                GlStateManager.JW();
            }
            if (aq.bd()) {
                if (aq.aBn()) {
                    this.bXa = true;
                    aq.aBo();
                    GlStateManager.JV();
                    layerRenderer.d(t2, f2, f3, f4, f5, f6, f7, f8);
                    GlStateManager.JW();
                    aq.aBp();
                }
                aq.aBq();
            }
            if (!bl2) continue;
            this.NF();
        }
    }

    protected float G(T t2) {
        return 90.0f;
    }

    protected int b(T t2, float f2, float f3) {
        return 0;
    }

    protected void c(T t2, float f2) {
    }

    public void b(T t2, double d2, double d3, double d4) {
        if (!g.eqN.aDA() || !g.a(g.eqN, t2, this, d2, d3, d4)) {
            if (this.F(t2) && this.bUl.bVD != null) {
                float f2;
                double d5 = ((net.minecraft.entity.c)t2).T(this.bUl.bVD);
                float f3 = f2 = ((net.minecraft.entity.c)t2).isSneaking() ? bWQ : bWP;
                if (d5 < (double)(f2 * f2)) {
                    String string = ((net.minecraft.entity.c)t2).xW().getFormattedText();
                    float f4 = 0.02666667f;
                    GlStateManager.e(516, 0.1f);
                    if (((net.minecraft.entity.c)t2).isSneaking()) {
                        agg agg2 = this.Nn();
                        GlStateManager.JV();
                        GlStateManager.j((float)d2, (float)d3 + ((r)t2).height + 0.5f - (((r)t2).Uz() ? ((r)t2).height / 2.0f : 0.0f), (float)d4);
                        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                        GlStateManager.d(-this.bUl.bVE, 0.0f, 1.0f, 0.0f);
                        GlStateManager.d(this.bUl.bVF, 1.0f, 0.0f, 0.0f);
                        GlStateManager.i(-0.02666667f, -0.02666667f, 0.02666667f);
                        GlStateManager.j(0.0f, 9.374999f, 0.0f);
                        GlStateManager.JA();
                        GlStateManager.an(false);
                        GlStateManager.tQ();
                        GlStateManager.JO();
                        GlStateManager.h(770, 771, 1, 0);
                        int n2 = agg2.bQ(string) / 2;
                        Tessellator tessellator = Tessellator.Li();
                        WorldRenderer worldRenderer = tessellator.Lj();
                        worldRenderer.a(7, DefaultVertexFormats.cbF);
                        worldRenderer.F(-n2 - 1, -1.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                        worldRenderer.F(-n2 - 1, 8.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                        worldRenderer.F(n2 + 1, 8.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                        worldRenderer.F(n2 + 1, -1.0, 0.0).g(0.0f, 0.0f, 0.0f, 0.25f).Lx();
                        tessellator.pZ();
                        GlStateManager.JN();
                        GlStateManager.an(true);
                        agg2.a(string, (double)(-agg2.bQ(string) / 2), 0.0, 0x20FFFFFF);
                        GlStateManager.Jz();
                        GlStateManager.tR();
                        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManager.JW();
                    } else {
                        this.a(t2, d2, d3 - (((r)t2).Uz() ? (double)(((r)t2).height / 2.0f) : 0.0), d4, string, 0.02666667f, d5);
                    }
                }
            }
            if (g.eqP.aDA()) {
                g.a(g.eqP, t2, this, d2, d3, d4);
            }
        }
    }

    protected boolean F(T t2) {
        net.minecraft.client.entity.c c2 = d.AZ().bgK;
        if (t2 instanceof net.minecraft.entity.player.a && t2 != c2) {
            l l2 = ((r)t2).Vw();
            l l3 = c2.Vw();
            if (l2 != null) {
                m m2 = l2.akw();
                switch (m2) {
                    case dkm: {
                        return true;
                    }
                    case dkn: {
                        return false;
                    }
                    case dko: {
                        return l3 == null || l2.b(l3);
                    }
                    case dkp: {
                        return l3 == null || !l2.b(l3);
                    }
                }
                return true;
            }
        }
        return d.AV() && t2 != this.bUl.bVD && !((net.minecraft.entity.c)t2).p(c2) && ((r)t2).crA == null;
    }

    public void au(boolean bl2) {
        this.bVJ = bl2;
    }

    public List<LayerRenderer<T>> NG() {
        return this.bWO;
    }

    @Override
    protected /* synthetic */ boolean M(net.minecraft.entity.c c2) {
        return this.F((r)c2);
    }

    @Override
    public /* synthetic */ void a(net.minecraft.entity.c c2, double d2, double d3, double d4) {
        this.b((r)c2, d2, d3, d4);
    }

    static {
        int[] nArray = bWK.NM();
        for (int i2 = 0; i2 < 256; ++i2) {
            nArray[i2] = -1;
        }
        bWK.NL();
    }
}

