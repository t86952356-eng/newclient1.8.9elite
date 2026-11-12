/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
package net.minecraft.client.renderer;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.renderer.GlStateManager$AlphaState;
import net.minecraft.client.renderer.GlStateManager$BlendState;
import net.minecraft.client.renderer.GlStateManager$BooleanState;
import net.minecraft.client.renderer.GlStateManager$ClearState;
import net.minecraft.client.renderer.GlStateManager$Color;
import net.minecraft.client.renderer.GlStateManager$ColorLogicState;
import net.minecraft.client.renderer.GlStateManager$ColorMask;
import net.minecraft.client.renderer.GlStateManager$ColorMaterialState;
import net.minecraft.client.renderer.GlStateManager$CullState;
import net.minecraft.client.renderer.GlStateManager$DepthState;
import net.minecraft.client.renderer.GlStateManager$FogState;
import net.minecraft.client.renderer.GlStateManager$PolygonOffsetState;
import net.minecraft.client.renderer.GlStateManager$TexGen;
import net.minecraft.client.renderer.GlStateManager$TexGenCoord;
import net.minecraft.client.renderer.GlStateManager$TexGenState;
import net.minecraft.client.renderer.GlStateManager$TextureState;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.src.a;
import net.optifine.bi;
import net.optifine.render.e;
import net.optifine.render.f;
import net.optifine.shaders.ah;
import net.optifine.util.x;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class GlStateManager {
    private static final GlStateManager$AlphaState bKy;
    private static final GlStateManager$BooleanState bKz;
    private static final GlStateManager$BooleanState[] bKA;
    private static final GlStateManager$ColorMaterialState bKB;
    private static final GlStateManager$BlendState bKC;
    private static final GlStateManager$DepthState bKD;
    private static final GlStateManager$FogState bKE;
    private static final GlStateManager$CullState bKF;
    private static final GlStateManager$PolygonOffsetState bKG;
    private static final GlStateManager$ColorLogicState bKH;
    private static final GlStateManager$TexGenState bKI;
    private static final GlStateManager$ClearState bKJ;
    private static final GlStateManager$BooleanState bKK;
    private static int bKL;
    private static final GlStateManager$TextureState[] bKM;
    private static int bKN;
    private static final GlStateManager$BooleanState bKO;
    private static final GlStateManager$ColorMask bKP;
    private static final GlStateManager$Color bKQ;
    public static boolean bKR;
    private static final x bKS;
    private static final e bKT;
    private static final x bKU;
    private static final f bKV;
    private static boolean bKW;
    public static boolean bKX;
    private static boolean bKY;

    public static void Jw() {
        GL11.glPushAttrib((int)8256);
    }

    public static void Jx() {
        GL11.glPopAttrib();
    }

    public static void Jy() {
        if (bKS.IH()) {
            bKT.Kf();
        } else {
            GlStateManager.bKy.bKZ.Kf();
        }
    }

    public static void tL() {
        if (bKS.IH()) {
            bKT.Kg();
        } else {
            GlStateManager.bKy.bKZ.Kg();
        }
    }

    public static void e(int n2, float f2) {
        if (bKS.IH()) {
            bKT.j(n2, f2);
        } else if (n2 != GlStateManager.bKy.bLa || f2 != GlStateManager.bKy.bLb) {
            GlStateManager.bKy.bLa = n2;
            GlStateManager.bKy.bLb = f2;
            GL11.glAlphaFunc((int)n2, (float)f2);
        }
    }

    public static void Jz() {
        bKz.Kg();
    }

    public static void JA() {
        bKz.Kf();
    }

    public static void cH(int n2) {
        bKA[n2].Kg();
    }

    public static void cI(int n2) {
        bKA[n2].Kf();
    }

    public static void JB() {
        GlStateManager.bKB.bLs.Kg();
    }

    public static void JC() {
        GlStateManager.bKB.bLs.Kf();
    }

    public static void O(int n2, int n3) {
        if (n2 != GlStateManager.bKB.bLt || n3 != GlStateManager.bKB.bLu) {
            GlStateManager.bKB.bLt = n2;
            GlStateManager.bKB.bLu = n3;
            GL11.glColorMaterial((int)n2, (int)n3);
        }
    }

    public static void JD() {
        GlStateManager.bKD.bLw.Kf();
    }

    public static void JE() {
        GlStateManager.bKD.bLw.Kg();
    }

    public static void cJ(int n2) {
        if (n2 != GlStateManager.bKD.bLy) {
            GlStateManager.bKD.bLy = n2;
            GL11.glDepthFunc((int)n2);
        }
    }

    public static void an(boolean bl2) {
        if (bl2 != GlStateManager.bKD.bLx) {
            GlStateManager.bKD.bLx = bl2;
            GL11.glDepthMask((boolean)bl2);
        }
    }

    public static void tR() {
        if (bKU.IH()) {
            bKV.Kf();
        } else {
            if (bKX) {
                bKY = false;
            }
            GlStateManager.bKC.bLc.Kf();
        }
    }

    public static void tQ() {
        if (bKU.IH()) {
            bKV.Kg();
        } else {
            if (bKX) {
                bKY = true;
            }
            GlStateManager.bKC.bLc.Kg();
        }
    }

    public static void P(int n2, int n3) {
        if (bKU.IH()) {
            bKV.bI(n2, n3);
        } else {
            if (bKX) {
                OpenGlHelper.p(n2, n3, 1, 771);
                return;
            }
            if (n2 != GlStateManager.bKC.bLd || n3 != GlStateManager.bKC.bLe || n2 != GlStateManager.bKC.bLf || n3 != GlStateManager.bKC.bLg) {
                GlStateManager.bKC.bLd = n2;
                GlStateManager.bKC.bLe = n3;
                GlStateManager.bKC.bLf = n2;
                GlStateManager.bKC.bLg = n3;
                if (a.aoG()) {
                    ah.eBg.N(n2, n3, n2, n3);
                }
                GL11.glBlendFunc((int)n2, (int)n3);
            }
        }
    }

    public static void h(int n2, int n3, int n4, int n5) {
        if (bKU.IH()) {
            bKV.J(n2, n3, n4, n5);
        } else {
            if (bKX && n5 != 771) {
                OpenGlHelper.p(n2, n3, 1, 771);
                return;
            }
            if (n2 != GlStateManager.bKC.bLd || n3 != GlStateManager.bKC.bLe || n4 != GlStateManager.bKC.bLf || n5 != GlStateManager.bKC.bLg) {
                GlStateManager.bKC.bLd = n2;
                GlStateManager.bKC.bLe = n3;
                GlStateManager.bKC.bLf = n4;
                GlStateManager.bKC.bLg = n5;
                if (a.aoG()) {
                    ah.eBg.N(n2, n3, n4, n5);
                }
                OpenGlHelper.p(n2, n3, n4, n5);
            }
        }
    }

    public static void JF() {
        GlStateManager.bKE.bLz.Kg();
    }

    public static void JG() {
        GlStateManager.bKE.bLz.Kf();
    }

    public static void cK(int n2) {
        if (n2 != GlStateManager.bKE.bLu) {
            GlStateManager.bKE.bLu = n2;
            GL11.glFogi((int)2917, (int)n2);
            if (a.aoG()) {
                ah.jX(n2);
            }
        }
    }

    public static void at(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 != GlStateManager.bKE.bLA) {
            GlStateManager.bKE.bLA = f2;
            GL11.glFogf((int)2914, (float)f2);
            if (a.aoG()) {
                ah.at(f2);
            }
        }
    }

    public static void au(float f2) {
        if (f2 != GlStateManager.bKE.bLB) {
            GlStateManager.bKE.bLB = f2;
            GL11.glFogf((int)2915, (float)f2);
        }
    }

    public static void av(float f2) {
        if (f2 != GlStateManager.bKE.bLC) {
            GlStateManager.bKE.bLC = f2;
            GL11.glFogf((int)2916, (float)f2);
        }
    }

    public static void JH() {
        GlStateManager.bKF.bLv.Kg();
    }

    public static void JI() {
        GlStateManager.bKF.bLv.Kf();
    }

    public static void cL(int n2) {
        if (n2 != GlStateManager.bKF.bLu) {
            GlStateManager.bKF.bLu = n2;
            GL11.glCullFace((int)n2);
        }
    }

    public static void JJ() {
        GlStateManager.bKG.bLD.Kg();
    }

    public static void JK() {
        GlStateManager.bKG.bLD.Kf();
    }

    public static void k(float f2, float f3) {
        if (f2 != GlStateManager.bKG.bLF || f3 != GlStateManager.bKG.bLG) {
            GlStateManager.bKG.bLF = f2;
            GlStateManager.bKG.bLG = f3;
            GL11.glPolygonOffset((float)f2, (float)f3);
        }
    }

    public static void JL() {
        GlStateManager.bKH.bLm.Kg();
    }

    public static void JM() {
        GlStateManager.bKH.bLm.Kf();
    }

    public static void cM(int n2) {
        if (n2 != GlStateManager.bKH.bLn) {
            GlStateManager.bKH.bLn = n2;
            GL11.glLogicOp((int)n2);
        }
    }

    public static void a(GlStateManager$TexGen glStateManager$TexGen) {
        GlStateManager.c((GlStateManager$TexGen)glStateManager$TexGen).bLP.Kg();
    }

    public static void b(GlStateManager$TexGen glStateManager$TexGen) {
        GlStateManager.c((GlStateManager$TexGen)glStateManager$TexGen).bLP.Kf();
    }

    public static void a(GlStateManager$TexGen glStateManager$TexGen, int n2) {
        GlStateManager$TexGenCoord glStateManager$TexGenCoord = GlStateManager.c(glStateManager$TexGen);
        if (n2 != glStateManager$TexGenCoord.bLR) {
            glStateManager$TexGenCoord.bLR = n2;
            GL11.glTexGeni((int)glStateManager$TexGenCoord.bLQ, (int)9472, (int)n2);
        }
    }

    public static void a(GlStateManager$TexGen glStateManager$TexGen, int n2, FloatBuffer floatBuffer) {
        GL11.glTexGen((int)GlStateManager.c((GlStateManager$TexGen)glStateManager$TexGen).bLQ, (int)n2, (FloatBuffer)floatBuffer);
    }

    private static GlStateManager$TexGenCoord c(GlStateManager$TexGen glStateManager$TexGen) {
        switch (glStateManager$TexGen.ordinal()) {
            case 0: {
                return GlStateManager.bKI.bLS;
            }
            case 1: {
                return GlStateManager.bKI.bLT;
            }
            case 2: {
                return GlStateManager.bKI.bLU;
            }
            case 3: {
                return GlStateManager.bKI.bLV;
            }
        }
        return GlStateManager.bKI.bLS;
    }

    public static void cN(int n2) {
        if (bKL != n2 - OpenGlHelper.bMI) {
            bKL = n2 - OpenGlHelper.bMI;
            OpenGlHelper.cN(n2);
        }
    }

    public static void JN() {
        GlStateManager.bKM[GlStateManager.bKL].bLW.Kg();
    }

    public static void JO() {
        GlStateManager.bKM[GlStateManager.bKL].bLW.Kf();
    }

    public static int JP() {
        return GL11.glGenTextures();
    }

    public static void cO(int n2) {
        if (n2 != 0) {
            GL11.glDeleteTextures((int)n2);
            for (GlStateManager$TextureState glStateManager$TextureState : bKM) {
                if (glStateManager$TextureState.bLX != n2) continue;
                glStateManager$TextureState.bLX = 0;
            }
        }
    }

    public static void ap(int n2) {
        if (n2 != GlStateManager.bKM[GlStateManager.bKL].bLX) {
            GlStateManager.bKM[GlStateManager.bKL].bLX = n2;
            GL11.glBindTexture((int)3553, (int)n2);
            if (bi.bd()) {
                bi.jp(n2);
            }
        }
    }

    public static void JQ() {
        bKK.Kg();
    }

    public static void JR() {
        bKK.Kf();
    }

    public static void cP(int n2) {
        if (n2 != bKN) {
            bKN = n2;
            GL11.glShadeModel((int)n2);
        }
    }

    public static void JS() {
        bKO.Kg();
    }

    public static void JT() {
        bKO.Kf();
    }

    public static void i(int n2, int n3, int n4, int n5) {
        GL11.glViewport((int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        if (bl2 != GlStateManager.bKP.bLo || bl3 != GlStateManager.bKP.bLp || bl4 != GlStateManager.bKP.bLq || bl5 != GlStateManager.bKP.bLr) {
            GlStateManager.bKP.bLo = bl2;
            GlStateManager.bKP.bLp = bl3;
            GlStateManager.bKP.bLq = bl4;
            GlStateManager.bKP.bLr = bl5;
            GL11.glColorMask((boolean)bl2, (boolean)bl3, (boolean)bl4, (boolean)bl5);
        }
    }

    public static void ak(double d2) {
        if (d2 != GlStateManager.bKJ.bLj) {
            GlStateManager.bKJ.bLj = d2;
            GL11.glClearDepth((double)d2);
        }
    }

    public static void c(float f2, float f3, float f4, float f5) {
        if (f2 != GlStateManager.bKJ.bLk.aIP || f3 != GlStateManager.bKJ.bLk.aIR || f4 != GlStateManager.bKJ.bLk.aIQ || f5 != GlStateManager.bKJ.bLk.apt) {
            GlStateManager.bKJ.bLk.aIP = f2;
            GlStateManager.bKJ.bLk.aIR = f3;
            GlStateManager.bKJ.bLk.aIQ = f4;
            GlStateManager.bKJ.bLk.apt = f5;
            GL11.glClearColor((float)f2, (float)f3, (float)f4, (float)f5);
        }
    }

    public static void cQ(int n2) {
        if (bKR) {
            GL11.glClear((int)n2);
        }
    }

    public static void cR(int n2) {
        GL11.glMatrixMode((int)n2);
    }

    public static void JU() {
        GL11.glLoadIdentity();
    }

    public static void JV() {
        GL11.glPushMatrix();
    }

    public static void JW() {
        GL11.glPopMatrix();
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        GL11.glGetFloat((int)n2, (FloatBuffer)floatBuffer);
    }

    public static void e(double d2, double d3, double d4, double d5, double d6, double d7) {
        GL11.glOrtho((double)d2, (double)d3, (double)d4, (double)d5, (double)d6, (double)d7);
    }

    public static void d(float f2, float f3, float f4, float f5) {
        GL11.glRotatef((float)f2, (float)f3, (float)f4, (float)f5);
    }

    public static void i(float f2, float f3, float f4) {
        GL11.glScalef((float)f2, (float)f3, (float)f4);
    }

    public static void B(double d2, double d3, double d4) {
        GL11.glScaled((double)d2, (double)d3, (double)d4);
    }

    public static void j(float f2, float f3, float f4) {
        GL11.glTranslatef((float)f2, (float)f3, (float)f4);
    }

    public static void C(double d2, double d3, double d4) {
        GL11.glTranslated((double)d2, (double)d3, (double)d4);
    }

    public static void a(FloatBuffer floatBuffer) {
        GL11.glMultMatrix((FloatBuffer)floatBuffer);
    }

    public static void e(float f2, float f3, float f4, float f5) {
        if (bKX && !bKY && f5 < 1.0f) {
            GlStateManager.e(f2, f3, f4, 1.0f);
            return;
        }
        if (f2 != GlStateManager.bKQ.aIP || f3 != GlStateManager.bKQ.aIR || f4 != GlStateManager.bKQ.aIQ || f5 != GlStateManager.bKQ.apt) {
            GlStateManager.bKQ.aIP = f2;
            GlStateManager.bKQ.aIR = f3;
            GlStateManager.bKQ.aIQ = f4;
            GlStateManager.bKQ.apt = f5;
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f5);
        }
    }

    public static void k(float f2, float f3, float f4) {
        GlStateManager.e(f2, f3, f4, 1.0f);
    }

    public static void JX() {
        GlStateManager.bKQ.apt = -1.0f;
        GlStateManager.bKQ.aIQ = -1.0f;
        GlStateManager.bKQ.aIR = -1.0f;
        GlStateManager.bKQ.aIP = -1.0f;
    }

    public static void j(int n2, int n3, int n4, int n5) {
        GL11.glVertexPointer((int)n2, (int)n3, (int)n4, (long)n5);
    }

    public static void cS(int n2) {
        GL11.glDisableClientState((int)n2);
    }

    public static void cT(int n2) {
        GL11.glEnableClientState((int)n2);
    }

    public static void r(int n2, int n3, int n4) {
        int n5;
        GL11.glDrawArrays((int)n2, (int)n3, (int)n4);
        if (a.aoG() && !bKW && (n5 = ah.eCE.aEH()) > 1) {
            for (int i2 = 1; i2 < n5; ++i2) {
                ah.eBh.km(i2);
                GL11.glDrawArrays((int)n2, (int)n3, (int)n4);
            }
            ah.eBh.km(0);
        }
    }

    public static void cU(int n2) {
        int n3;
        GL11.glCallList((int)n2);
        if (a.aoG() && !bKW && (n3 = ah.eCE.aEH()) > 1) {
            for (int i2 = 1; i2 < n3; ++i2) {
                ah.eBh.km(i2);
                GL11.glCallList((int)n2);
            }
            ah.eBh.km(0);
        }
    }

    public static void a(IntBuffer intBuffer) {
        int n2;
        GL11.glCallLists((IntBuffer)intBuffer);
        if (a.aoG() && !bKW && (n2 = ah.eCE.aEH()) > 1) {
            for (int i2 = 1; i2 < n2; ++i2) {
                ah.eBh.km(i2);
                GL11.glCallLists((IntBuffer)intBuffer);
            }
            ah.eBh.km(0);
        }
    }

    public static void JY() {
        GL11.glEndList();
        bKW = false;
    }

    public static int JZ() {
        return GL11.glGetError();
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        GL11.glTexImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (IntBuffer)intBuffer);
    }

    public static void s(int n2, int n3, int n4) {
        GL11.glTexParameteri((int)n2, (int)n3, (int)n4);
    }

    public static int t(int n2, int n3, int n4) {
        return GL11.glGetTexLevelParameteri((int)n2, (int)n3, (int)n4);
    }

    public static int Ka() {
        return OpenGlHelper.bMI + bKL;
    }

    public static void Kb() {
        GL11.glBindTexture((int)3553, (int)GlStateManager.bKM[GlStateManager.bKL].bLX);
    }

    public static int Kc() {
        return GlStateManager.bKM[GlStateManager.bKL].bLX;
    }

    public static void b(IntBuffer intBuffer) {
        intBuffer.rewind();
        while (intBuffer.position() < intBuffer.limit()) {
            int n2 = intBuffer.get();
            GlStateManager.cO(n2);
        }
        intBuffer.rewind();
    }

    public static void a(e e2) {
        if (!bKS.IH()) {
            GlStateManager.b(bKT);
            GlStateManager.c(e2);
            bKS.aJm();
        }
    }

    public static void Kd() {
        if (bKS.aJn()) {
            GlStateManager.c(bKT);
        }
    }

    public static void b(e e2) {
        if (bKS.IH()) {
            e2.d(bKT);
        } else {
            e2.a(GlStateManager.bKy.bKZ.bLi, GlStateManager.bKy.bLa, GlStateManager.bKy.bLb);
        }
    }

    public static void c(e e2) {
        if (bKS.IH()) {
            bKT.d(e2);
        } else {
            GlStateManager.bKy.bKZ.ao(e2.isEnabled());
            GlStateManager.e(e2.aDO(), e2.aDP());
        }
    }

    public static void a(f f2) {
        if (!bKU.IH()) {
            GlStateManager.b(bKV);
            GlStateManager.c(f2);
            bKU.aJm();
        }
    }

    public static void Ke() {
        if (bKU.aJn()) {
            GlStateManager.c(bKV);
        }
    }

    public static void b(f f2) {
        if (bKU.IH()) {
            f2.d(bKV);
        } else {
            f2.a(GlStateManager.bKC.bLc.bLi, GlStateManager.bKC.bLd, GlStateManager.bKC.bLe, GlStateManager.bKC.bLf, GlStateManager.bKC.bLg);
        }
    }

    public static void c(f f2) {
        if (bKU.IH()) {
            bKV.d(f2);
        } else {
            GlStateManager.bKC.bLc.ao(f2.isEnabled());
            if (!f2.aDU()) {
                GlStateManager.P(f2.aDQ(), f2.aDR());
            } else {
                GlStateManager.h(f2.aDQ(), f2.aDR(), f2.aDS(), f2.aDT());
            }
        }
    }

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        int n3;
        GL14.glMultiDrawArrays((int)n2, (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
        if (a.aoG() && !bKW && (n3 = ah.eCE.aEH()) > 1) {
            for (int i2 = 1; i2 < n3; ++i2) {
                ah.eBh.km(i2);
                GL14.glMultiDrawArrays((int)n2, (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
            }
            ah.eBh.km(0);
        }
    }

    static {
        int n2;
        bKy = new GlStateManager$AlphaState();
        bKz = new GlStateManager$BooleanState(2896);
        bKA = new GlStateManager$BooleanState[8];
        bKB = new GlStateManager$ColorMaterialState();
        bKC = new GlStateManager$BlendState();
        bKD = new GlStateManager$DepthState();
        bKE = new GlStateManager$FogState();
        bKF = new GlStateManager$CullState();
        bKG = new GlStateManager$PolygonOffsetState();
        bKH = new GlStateManager$ColorLogicState();
        bKI = new GlStateManager$TexGenState();
        bKJ = new GlStateManager$ClearState();
        bKK = new GlStateManager$BooleanState(2977);
        bKL = 0;
        bKM = new GlStateManager$TextureState[32];
        bKN = 7425;
        bKO = new GlStateManager$BooleanState(32826);
        bKP = new GlStateManager$ColorMask();
        bKQ = new GlStateManager$Color();
        bKR = true;
        bKS = new x();
        bKT = new e();
        bKU = new x();
        bKV = new f();
        bKW = false;
        bKX = false;
        bKY = false;
        for (n2 = 0; n2 < 8; ++n2) {
            GlStateManager.bKA[n2] = new GlStateManager$BooleanState(16384 + n2);
        }
        for (n2 = 0; n2 < bKM.length; ++n2) {
            GlStateManager.bKM[n2] = new GlStateManager$TextureState();
        }
    }
}

