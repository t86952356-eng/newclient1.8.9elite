/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.optifine;

import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.z;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.a;
import net.minecraft.profiler.d;
import net.optifine.av;
import org.lwjgl.opengl.GL11;

public class au {
    private static net.minecraft.client.d P;
    private static a aIY;
    private static d ecK;
    public static boolean dj;
    public static av ecL;
    public static av ecM;
    public static av ecN;
    public static av ecO;
    public static av ecP;
    public static av ecQ;
    public static av ecR;
    private static final long[] ecS;
    private static final long[] ecT;
    private static final long[] ecU;
    private static final long[] ecV;
    private static final long[] ecW;
    private static final long[] ecX;
    private static final long[] ecY;
    private static final long[] ecZ;
    private static final boolean[] eda;
    private static int edb;
    private static long edc;
    private static long edd;
    private static long ede;
    private static long edf;
    private static long edg;
    private static long edh;
    private static long edi;
    private static long edj;
    private static int edk;

    public static boolean aBx() {
        long l2 = System.currentTimeMillis();
        long l3 = au.aBy();
        boolean bl2 = false;
        if (l3 < edh) {
            double d2 = (double)edj / 1000000.0;
            double d3 = (double)edi / 1000.0;
            int n2 = (int)(d2 / d3);
            if (n2 > 0) {
                edk = n2;
            }
            ede = l2;
            edf = l3;
            edi = 0L;
            edj = 0L;
            bl2 = true;
        } else {
            edi = l2 - ede;
            edj = l3 - edf;
        }
        edg = l2;
        edh = l3;
        return bl2;
    }

    private static long aBy() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static void aBz() {
        if (P == null) {
            P = net.minecraft.client.d.AZ();
            aIY = au.P.aIY;
            ecK = au.P.bhw;
        }
        if (au.aIY.bJS && (au.aIY.civ || au.aIY.chR)) {
            dj = true;
            long l2 = System.nanoTime();
            if (edc == -1L) {
                edc = l2;
            } else {
                int n2 = edb & ecS.length - 1;
                ++edb;
                boolean bl2 = au.aBx();
                au.ecS[n2] = l2 - edc - edd;
                au.ecT[n2] = au.ecL.edm;
                au.ecU[n2] = au.ecM.edm;
                au.ecV[n2] = au.ecN.edm;
                au.ecW[n2] = au.ecO.edm;
                au.ecX[n2] = au.ecP.edm;
                au.ecY[n2] = au.ecQ.edm;
                au.ecZ[n2] = au.ecR.edm;
                au.eda[n2] = bl2;
                ecL.aX();
                ecM.aX();
                ecP.aX();
                ecO.aX();
                ecN.aX();
                ecQ.aX();
                ecR.aX();
                edc = System.nanoTime();
            }
        } else {
            dj = false;
            edc = -1L;
        }
    }

    public static void l(cz cz2) {
        if (aIY != null && (au.aIY.civ || au.aIY.chR)) {
            float f2;
            int n2;
            int n3;
            long l2 = System.nanoTime();
            GlStateManager.cQ(256);
            GlStateManager.cR(5889);
            GlStateManager.JV();
            GlStateManager.JB();
            GlStateManager.JU();
            GlStateManager.e(0.0, au.P.bgz, au.P.bgA, 0.0, 1000.0, 3000.0);
            GlStateManager.cR(5888);
            GlStateManager.JV();
            GlStateManager.JU();
            GlStateManager.j(0.0f, 0.0f, -2000.0f);
            GL11.glLineWidth((float)1.0f);
            GlStateManager.JO();
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            worldRenderer.a(1, DefaultVertexFormats.cbF);
            for (n3 = 0; n3 < ecS.length; ++n3) {
                n2 = (n3 - edb & ecS.length - 1) * 100 / ecS.length;
                n2 += 155;
                f2 = au.P.bgA;
                long l3 = 0L;
                if (eda[n3]) {
                    au.a(n3, ecS[n3], n2, n2 / 2, 0, f2, worldRenderer);
                    continue;
                }
                au.a(n3, ecS[n3], n2, n2, n2, f2, worldRenderer);
                f2 -= (float)au.a(n3, ecZ[n3], n2 / 2, n2 / 2, n2 / 2, f2, worldRenderer);
                f2 -= (float)au.a(n3, ecY[n3], 0, n2, 0, f2, worldRenderer);
                f2 -= (float)au.a(n3, ecX[n3], n2, n2, 0, f2, worldRenderer);
                f2 -= (float)au.a(n3, ecW[n3], n2, 0, 0, f2, worldRenderer);
                f2 -= (float)au.a(n3, ecV[n3], n2, 0, n2, f2, worldRenderer);
                f2 -= (float)au.a(n3, ecU[n3], 0, 0, n2, f2, worldRenderer);
                float f3 = f2 - (float)au.a(n3, ecT[n3], 0, n2, n2, f2, worldRenderer);
            }
            au.a(0, ecS.length, 33333333L, 196, 196, 196, au.P.bgA, worldRenderer);
            au.a(0, ecS.length, 16666666L, 196, 196, 196, au.P.bgA, worldRenderer);
            tessellator.pZ();
            GlStateManager.JN();
            n3 = au.P.bgA - 80;
            n2 = au.P.bgA - 160;
            au.P.fontRendererObj.a("30", 2.0, (double)(n2 + 1), -8947849);
            au.P.fontRendererObj.a("30", 1.0, (double)n2, -3881788);
            au.P.fontRendererObj.a("60", 2.0, (double)(n3 + 1), -8947849);
            au.P.fontRendererObj.a("60", 1.0, (double)n3, -3881788);
            GlStateManager.cR(5889);
            GlStateManager.JW();
            GlStateManager.cR(5888);
            GlStateManager.JW();
            GlStateManager.JN();
            f2 = 1.0f - (float)((double)(System.currentTimeMillis() - ede) / 1000.0);
            f2 = net.minecraft.src.a.F(f2, 0.0f, 1.0f);
            int n4 = (int)(170.0f + f2 * 85.0f);
            int n5 = (int)(100.0f + f2 * 55.0f);
            int n6 = (int)(10.0f + f2 * 10.0f);
            int n7 = n4 << 16 | n5 << 8 | n6;
            int n8 = 512 / cz2.getScaleFactor() + 2;
            int n9 = au.P.bgA / cz2.getScaleFactor() - 8;
            z z2 = au.P.bha;
            z.drawRect(n8 - 1, n9 - 1, n8 + 50, n9 + 10, -1605349296);
            au.P.fontRendererObj.a(" " + edk + " MB/s", (double)n8, (double)n9, n7);
            edd = System.nanoTime() - l2;
        }
    }

    private static long a(int n2, long l2, int n3, int n4, int n5, float f2, WorldRenderer worldRenderer) {
        long l3 = l2 / 200000L;
        if (l3 < 3L) {
            return 0L;
        }
        worldRenderer.F((float)n2 + 0.5f, f2 - (float)l3 + 0.5f, 0.0).s(n3, n4, n5, 255).Lx();
        worldRenderer.F((float)n2 + 0.5f, f2 + 0.5f, 0.0).s(n3, n4, n5, 255).Lx();
        return l3;
    }

    private static long a(int n2, int n3, long l2, int n4, int n5, int n6, float f2, WorldRenderer worldRenderer) {
        long l3 = l2 / 200000L;
        if (l3 < 3L) {
            return 0L;
        }
        worldRenderer.F((float)n2 + 0.5f, f2 - (float)l3 + 0.5f, 0.0).s(n4, n5, n6, 255).Lx();
        worldRenderer.F((float)n3 + 0.5f, f2 - (float)l3 + 0.5f, 0.0).s(n4, n5, n6, 255).Lx();
        return l3;
    }

    public static boolean bd() {
        return dj;
    }

    static {
        dj = false;
        ecL = new av();
        ecM = new av();
        ecN = new av();
        ecO = new av();
        ecP = new av();
        ecQ = new av();
        ecR = new av();
        ecS = new long[512];
        ecT = new long[512];
        ecU = new long[512];
        ecV = new long[512];
        ecW = new long[512];
        ecX = new long[512];
        ecY = new long[512];
        ecZ = new long[512];
        eda = new boolean[512];
        edb = 0;
        edc = -1L;
        edd = 0L;
        ede = System.currentTimeMillis();
        edf = au.aBy();
        edg = ede;
        edh = edf;
        edi = 1L;
        edj = 0L;
        edk = 0;
    }
}

