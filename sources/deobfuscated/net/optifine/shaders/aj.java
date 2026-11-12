/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 */
package net.optifine.shaders;

import java.nio.IntBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.src.a;
import net.minecraft.tileentity.v;
import net.minecraft.util.av;
import net.minecraft.util.cm;
import net.optifine.reflect.g;
import net.optifine.shaders.ah;
import net.optifine.shaders.c;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class aj {
    private static final cm eFp = new cm("textures/entity/end_portal.png");

    public static void a(ICamera iCamera, double d2, double d3, double d4) {
        iCamera.setPosition(d2, d3, d4);
    }

    public static void a(RenderGlobal renderGlobal, net.minecraft.entity.c c2, double d2, ICamera iCamera, int n2, boolean bl2) {
        renderGlobal.a(c2, d2, iCamera, n2, bl2);
    }

    public static void aGU() {
        if (ah.eya) {
            ah.ezh = true;
            ah.e(ah.eCf);
        }
    }

    public static void aGV() {
        if (ah.eya) {
            ah.e(ah.eCf);
        }
    }

    public static void aGW() {
        if (ah.eya) {
            ah.e(ah.eCf);
        }
    }

    public static void aGX() {
        if (ah.eya) {
            ah.e(ah.eCb);
        }
    }

    public static void aGY() {
        if (ah.eya) {
            if (ah.eBK >= 2) {
                GlStateManager.cN(33995);
                ah.iQ("pre copy depth");
                GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)ah.exY, (int)ah.exZ);
                ah.iQ("copy depth");
                GlStateManager.cN(33984);
            }
            ah.e(ah.eCw);
        }
    }

    public static void aGZ() {
        if (ah.eya) {
            ah.e(ah.eCb);
        }
    }

    public static void a(EntityRenderer entityRenderer, float f2, int n2) {
        if (!ah.eye) {
            boolean bl2 = ah.aGF();
            boolean bl3 = ah.aGG();
            if (!bl2 || !bl3) {
                ah.aGm();
                ah.cQ(false);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ah.k(bl2, bl3);
                entityRenderer.a(f2, n2, true, false, false);
                ah.aGt();
                ah.l(!bl2, !bl3);
                ah.k(false, false);
            }
        }
    }

    public static void b(EntityRenderer entityRenderer, float f2, int n2) {
        if (!ah.eye && !ah.aGH()) {
            ah.aGm();
            GlStateManager.tQ();
            ah.cQ(true);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ah.k(ah.aGK(), ah.aGL());
            entityRenderer.a(f2, n2, true, false, true);
            ah.aGt();
            ah.l(true, true);
            ah.k(false, false);
        }
    }

    public static void a(ItemRenderer itemRenderer, float f2, boolean bl2) {
        ah.cR(true);
        GlStateManager.an(true);
        if (bl2) {
            GlStateManager.cJ(519);
            GL11.glPushMatrix();
            IntBuffer intBuffer = ah.eCI;
            ah.c(ah.eFd);
            ah.eym = true;
            itemRenderer.ay(f2);
            ah.eym = false;
            ah.c(intBuffer);
            GL11.glPopMatrix();
        }
        GlStateManager.cJ(515);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        itemRenderer.ay(f2);
        ah.cR(false);
    }

    public static void c(EntityRenderer entityRenderer, float f2, int n2) {
        if (!ah.eye) {
            ah.aGu();
            entityRenderer.a(f2, n2, false, true, false);
            ah.aGv();
        }
    }

    public static void aHa() {
        if (ah.eya) {
            ah.e(ah.eCj);
            if (ah.eCj.getId() == ah.eCf.getId()) {
                ah.c(ah.eFe);
                GlStateManager.an(false);
            }
        }
    }

    public static void aHb() {
        if (ah.eya) {
            GlStateManager.an(true);
            ah.e(ah.eCb);
        }
    }

    public static void a(EntityRenderer entityRenderer, int n2, float f2, long l2) {
        if (ah.eBM > 0 && --ah.eBA <= 0) {
            Minecraft minecraft = Minecraft.getMinecraft();
            minecraft.bhw.fa("shadow pass");
            RenderGlobal renderGlobal = minecraft.bgG;
            ah.eye = true;
            ah.eBA = ah.eBq;
            ah.eBB = minecraft.aIY.chP;
            minecraft.aIY.chP = 1;
            ah.iQ("pre shadow");
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            minecraft.bhw.fa("shadow clear");
            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)ah.eBQ);
            ah.iQ("shadow bind sfb");
            minecraft.bhw.fa("shadow camera");
            entityRenderer.b(f2, 2);
            ah.cj(f2);
            ah.iQ("shadow camera");
            ah.e(ah.eBW);
            GL20.glDrawBuffers((IntBuffer)ah.eFc);
            ah.iQ("shadow drawbuffers");
            GL11.glReadBuffer((int)0);
            ah.iQ("shadow readbuffer");
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)ah.eFa.get(0), (int)0);
            if (ah.eBL != 0) {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)ah.eEZ.get(0), (int)0);
            }
            ah.iP("shadow fb");
            GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glClear((int)(ah.eBL != 0 ? 16640 : 256));
            ah.iQ("shadow clear");
            minecraft.bhw.fa("shadow frustum");
            ClippingHelper clippingHelper = c.Ni();
            minecraft.bhw.fa("shadow culling");
            Frustum frustum = new Frustum(clippingHelper);
            net.minecraft.entity.c c2 = minecraft.BC();
            double d2 = c2.csh + (c2.gW - c2.csh) * (double)f2;
            double d3 = c2.csi + (c2.gX - c2.csi) * (double)f2;
            double d4 = c2.csj + (c2.gY - c2.csj) * (double)f2;
            frustum.setPosition(d2, d3, d4);
            GlStateManager.cP(7425);
            GlStateManager.JE();
            GlStateManager.cJ(515);
            GlStateManager.an(true);
            GlStateManager.a(true, true, true, true);
            GlStateManager.JI();
            minecraft.bhw.fa("shadow prepareterrain");
            minecraft.Bq().a(TextureMap.bZE);
            minecraft.bhw.fa("shadow setupterrain");
            int n3 = 0;
            n3 = entityRenderer.asz;
            entityRenderer.asz = n3 + 1;
            renderGlobal.a(c2, f2, frustum, n3, minecraft.bgK.CZ());
            minecraft.bhw.fa("shadow updatechunks");
            minecraft.bhw.fa("shadow terrain");
            GlStateManager.cR(5888);
            GlStateManager.JV();
            GlStateManager.Jy();
            renderGlobal.a(av.dxV, (double)f2, 2, c2);
            ah.iQ("shadow terrain solid");
            GlStateManager.tL();
            renderGlobal.a(av.dxW, (double)f2, 2, c2);
            ah.iQ("shadow terrain cutoutmipped");
            minecraft.Bq().k(TextureMap.bZE).f(false, false);
            renderGlobal.a(av.dxX, (double)f2, 2, c2);
            ah.iQ("shadow terrain cutout");
            minecraft.Bq().k(TextureMap.bZE).NI();
            GlStateManager.cP(7424);
            GlStateManager.e(516, 0.1f);
            GlStateManager.cR(5888);
            GlStateManager.JW();
            GlStateManager.JV();
            minecraft.bhw.fa("shadow entities");
            if (g.epp.aDA()) {
                g.a(g.epp, 0);
            }
            renderGlobal.a(c2, frustum, f2);
            ah.iQ("shadow entities");
            GlStateManager.cR(5888);
            GlStateManager.JW();
            GlStateManager.an(true);
            GlStateManager.tR();
            GlStateManager.JH();
            GlStateManager.h(770, 771, 1, 0);
            GlStateManager.e(516, 0.1f);
            if (ah.eBM >= 2) {
                GlStateManager.cN(33989);
                ah.iQ("pre copy shadow depth");
                GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)ah.eBs, (int)ah.eBt);
                ah.iQ("copy shadow depth");
                GlStateManager.cN(33984);
            }
            GlStateManager.tR();
            GlStateManager.an(true);
            minecraft.Bq().a(TextureMap.bZE);
            GlStateManager.cP(7425);
            ah.iQ("shadow pre-translucent");
            GL20.glDrawBuffers((IntBuffer)ah.eFc);
            ah.iQ("shadow drawbuffers pre-translucent");
            ah.iP("shadow pre-translucent");
            if (ah.aFl()) {
                minecraft.bhw.fa("shadow translucent");
                renderGlobal.a(av.dxY, (double)f2, 2, c2);
                ah.iQ("shadow translucent");
            }
            if (g.epp.aDA()) {
                RenderHelper.Lg();
                g.g(g.epp, 1);
                renderGlobal.a(c2, frustum, f2);
                g.g(g.epp, -1);
                RenderHelper.Lf();
                ah.iQ("shadow entities 1");
            }
            GlStateManager.cP(7424);
            GlStateManager.an(true);
            GlStateManager.JH();
            GlStateManager.tR();
            GL11.glFlush();
            ah.iQ("shadow flush");
            ah.eye = false;
            minecraft.aIY.chP = ah.eBB;
            minecraft.bhw.fa("shadow postprocess");
            if (ah.exU) {
                if (ah.eBM >= 1) {
                    if (ah.eCO[0]) {
                        GlStateManager.cN(33988);
                        GlStateManager.ap(ah.eFa.get(0));
                        GL30.glGenerateMipmap((int)3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(ah.eCP[0] ? 9984 : 9987));
                    }
                    if (ah.eBM >= 2 && ah.eCO[1]) {
                        GlStateManager.cN(33989);
                        GlStateManager.ap(ah.eFa.get(1));
                        GL30.glGenerateMipmap((int)3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(ah.eCP[1] ? 9984 : 9987));
                    }
                    GlStateManager.cN(33984);
                }
                if (ah.eBL >= 1) {
                    if (ah.eCQ[0]) {
                        GlStateManager.cN(33997);
                        GlStateManager.ap(ah.eEZ.get(0));
                        GL30.glGenerateMipmap((int)3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(ah.eCR[0] ? 9984 : 9987));
                    }
                    if (ah.eBL >= 2 && ah.eCQ[1]) {
                        GlStateManager.cN(33998);
                        GlStateManager.ap(ah.eEZ.get(1));
                        GL30.glGenerateMipmap((int)3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(ah.eCR[1] ? 9984 : 9987));
                    }
                    GlStateManager.cN(33984);
                }
            }
            ah.iQ("shadow postprocess");
            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)ah.eBP);
            GL11.glViewport((int)0, (int)0, (int)ah.exY, (int)ah.exZ);
            ah.eCI = null;
            minecraft.Bq().a(TextureMap.bZE);
            ah.e(ah.eCf);
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            ah.iQ("shadow end");
        }
    }

    public static void m(av av2) {
        if (ah.l(av2)) {
            GlStateManager.JI();
        }
        if (OpenGlHelper.Kv()) {
            GL11.glEnableClientState((int)32885);
            GL20.glEnableVertexAttribArray((int)ah.ezj);
            GL20.glEnableVertexAttribArray((int)ah.ezk);
            GL20.glEnableVertexAttribArray((int)ah.ezi);
        }
    }

    public static void n(av av2) {
        if (OpenGlHelper.Kv()) {
            GL11.glDisableClientState((int)32885);
            GL20.glDisableVertexAttribArray((int)ah.ezj);
            GL20.glDisableVertexAttribArray((int)ah.ezk);
            GL20.glDisableVertexAttribArray((int)ah.ezi);
        }
        if (ah.l(av2)) {
            GlStateManager.JH();
        }
    }

    public static void aHc() {
        int n2 = 14;
        GL11.glVertexPointer((int)3, (int)5126, (int)56, (long)0L);
        GL11.glColorPointer((int)4, (int)5121, (int)56, (long)12L);
        GL11.glTexCoordPointer((int)2, (int)5126, (int)56, (long)16L);
        OpenGlHelper.df(OpenGlHelper.bMJ);
        GL11.glTexCoordPointer((int)2, (int)5122, (int)56, (long)24L);
        OpenGlHelper.df(OpenGlHelper.bMI);
        GL11.glNormalPointer((int)5120, (int)56, (long)28L);
        GL20.glVertexAttribPointer((int)ah.ezj, (int)2, (int)5126, (boolean)false, (int)56, (long)32L);
        GL20.glVertexAttribPointer((int)ah.ezk, (int)4, (int)5122, (boolean)false, (int)56, (long)40L);
        GL20.glVertexAttribPointer((int)ah.ezi, (int)3, (int)5122, (boolean)false, (int)56, (long)48L);
    }

    public static void aHd() {
        ah.e(ah.eCl);
    }

    public static void aHe() {
    }

    public static void aHf() {
    }

    public static void aHg() {
    }

    public static void aHh() {
        GlStateManager.tR();
    }

    public static void aHi() {
        ah.e(ah.eCp);
    }

    public static void aHj() {
        if (ah.eya) {
            if (ah.aGN() && ah.aGJ()) {
                ah.e(ah.eCr);
            } else {
                ah.e(ah.eCn);
            }
        } else {
            ah.e(ah.eBV);
        }
    }

    public static boolean a(v v2, double d2, double d3, double d4, float f2, int n2, float f3) {
        if (!ah.eye && ah.eCE.getId() == 0) {
            return false;
        }
        GlStateManager.JA();
        a.Bq().a(eFp);
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbv);
        float f4 = 0.5f;
        float f5 = 0.075f;
        float f6 = 0.15f;
        float f7 = 0.2f;
        float f8 = 0.0f;
        float f9 = 0.2f;
        float f10 = (float)(System.currentTimeMillis() % 100000L) / 100000.0f;
        int n3 = 240;
        worldRenderer.F(d2, d3 + (double)f3, d4 + 1.0).g(0.075f, 0.15f, 0.2f, 1.0f).r(0.0f + f10, 0.0f + f10).aa(240, 240).Lx();
        worldRenderer.F(d2 + 1.0, d3 + (double)f3, d4 + 1.0).g(0.075f, 0.15f, 0.2f, 1.0f).r(0.0f + f10, 0.2f + f10).aa(240, 240).Lx();
        worldRenderer.F(d2 + 1.0, d3 + (double)f3, d4).g(0.075f, 0.15f, 0.2f, 1.0f).r(0.2f + f10, 0.2f + f10).aa(240, 240).Lx();
        worldRenderer.F(d2, d3 + (double)f3, d4).g(0.075f, 0.15f, 0.2f, 1.0f).r(0.2f + f10, 0.0f + f10).aa(240, 240).Lx();
        tessellator.pZ();
        GlStateManager.Jz();
        return true;
    }
}

