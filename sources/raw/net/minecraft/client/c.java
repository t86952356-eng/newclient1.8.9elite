/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;

import net.minecraft.client.d;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.a;
import net.minecraft.util.be;
import net.minecraft.util.bz;
import net.optifine.ah;
import net.optifine.ai;
import net.optifine.reflect.g;

public class c
implements be {
    private String jc = "";
    private final d bgd;
    private String bge = "";
    private long bgf = d.Bj();
    private boolean bgg;
    private final cz bgh;
    private final a bgi;

    public c(d d2) {
        this.bgd = d2;
        this.bgh = new cz(d2);
        this.bgi = new a(d2.bgz, d2.bgA, false);
        this.bgi.ec(9728);
    }

    @Override
    public void cu(String string) {
        this.bgg = false;
        this.cw(string);
    }

    @Override
    public void cv(String string) {
        this.bgg = true;
        this.cw(string);
    }

    private void cw(String string) {
        this.bge = string;
        if (!this.bgd.bhP) {
            if (!this.bgg) {
                throw new bz();
            }
        } else {
            GlStateManager.cQ(256);
            GlStateManager.cR(5889);
            GlStateManager.JU();
            if (OpenGlHelper.Ky()) {
                int n2 = this.bgh.getScaleFactor();
                GlStateManager.e(0.0, this.bgh.getScaledWidth() * n2, this.bgh.getScaledHeight() * n2, 0.0, 100.0, 300.0);
            } else {
                cz cz2 = new cz(this.bgd);
                GlStateManager.e(0.0, cz2.Gq(), cz2.Gr(), 0.0, 100.0, 300.0);
            }
            GlStateManager.cR(5888);
            GlStateManager.JU();
            GlStateManager.j(0.0f, 0.0f, -200.0f);
        }
    }

    @Override
    public void cx(String string) {
        if (!this.bgd.bhP) {
            if (!this.bgg) {
                throw new bz();
            }
        } else {
            this.bgf = 0L;
            this.jc = string;
            this.bv(-1);
            this.bgf = 0L;
        }
    }

    @Override
    public void bv(int n2) {
        if (!this.bgd.bhP) {
            if (!this.bgg) {
                throw new bz();
            }
        } else {
            long l2 = d.Bj();
            if (l2 - this.bgf >= 100L) {
                Object object;
                this.bgf = l2;
                cz cz2 = new cz(this.bgd);
                int n3 = cz2.getScaleFactor();
                int n4 = cz2.getScaledWidth();
                int n5 = cz2.getScaledHeight();
                if (OpenGlHelper.Ky()) {
                    this.bgi.Rp();
                } else {
                    GlStateManager.cQ(256);
                }
                this.bgi.az(false);
                GlStateManager.cR(5889);
                GlStateManager.JU();
                GlStateManager.e(0.0, cz2.Gq(), cz2.Gr(), 0.0, 100.0, 300.0);
                GlStateManager.cR(5888);
                GlStateManager.JU();
                GlStateManager.j(0.0f, 0.0f, -200.0f);
                if (!OpenGlHelper.Ky()) {
                    GlStateManager.cQ(16640);
                }
                boolean bl2 = true;
                if (g.enS.aDA() && (object = g.g(g.enR, new Object[0])) != null) {
                    boolean bl3 = bl2 = !g.b(object, g.enS, cz2);
                }
                if (bl2) {
                    object = Tessellator.Li();
                    WorldRenderer worldRenderer = ((Tessellator)object).Lj();
                    ah ah2 = ai.aAQ();
                    if (ah2 != null) {
                        ah2.bE(cz2.getScaledWidth(), cz2.getScaledHeight());
                    } else {
                        this.bgd.Bq().a(b.optionsBackground);
                        float f2 = 32.0f;
                        worldRenderer.a(7, DefaultVertexFormats.cbI);
                        worldRenderer.F(0.0, n5, 0.0).r(0.0, (float)n5 / 32.0f).s(64, 64, 64, 255).Lx();
                        worldRenderer.F(n4, n5, 0.0).r((float)n4 / 32.0f, (float)n5 / 32.0f).s(64, 64, 64, 255).Lx();
                        worldRenderer.F(n4, 0.0, 0.0).r((float)n4 / 32.0f, 0.0).s(64, 64, 64, 255).Lx();
                        worldRenderer.F(0.0, 0.0, 0.0).r(0.0, 0.0).s(64, 64, 64, 255).Lx();
                        ((Tessellator)object).pZ();
                    }
                    if (n2 >= 0) {
                        int n6 = 100;
                        int n7 = 2;
                        int n8 = n4 / 2 - 50;
                        int n9 = n5 / 2 + 16;
                        GlStateManager.JO();
                        worldRenderer.a(7, DefaultVertexFormats.cbF);
                        worldRenderer.F(n8, n9, 0.0).s(128, 128, 128, 255).Lx();
                        worldRenderer.F(n8, n9 + 2, 0.0).s(128, 128, 128, 255).Lx();
                        worldRenderer.F(n8 + 100, n9 + 2, 0.0).s(128, 128, 128, 255).Lx();
                        worldRenderer.F(n8 + 100, n9, 0.0).s(128, 128, 128, 255).Lx();
                        worldRenderer.F(n8, n9, 0.0).s(128, 255, 128, 255).Lx();
                        worldRenderer.F(n8, n9 + 2, 0.0).s(128, 255, 128, 255).Lx();
                        worldRenderer.F(n8 + n2, n9 + 2, 0.0).s(128, 255, 128, 255).Lx();
                        worldRenderer.F(n8 + n2, n9, 0.0).s(128, 255, 128, 255).Lx();
                        ((Tessellator)object).pZ();
                        GlStateManager.JN();
                    }
                    GlStateManager.tQ();
                    GlStateManager.h(770, 771, 1, 0);
                    this.bgd.fontRendererObj.b(this.bge, (n4 - this.bgd.fontRendererObj.bQ(this.bge)) / 2, n5 / 2 - 4 - 16, 0xFFFFFF);
                    this.bgd.fontRendererObj.b(this.jc, (n4 - this.bgd.fontRendererObj.bQ(this.jc)) / 2, n5 / 2 - 4 + 8, 0xFFFFFF);
                }
                this.bgi.Ro();
                if (OpenGlHelper.Ky()) {
                    this.bgi.ak(n4 * n3, n5 * n3);
                }
                this.bgd.AE();
                try {
                    Thread.yield();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    @Override
    public void Ao() {
    }
}

