/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.c;
import net.minecraft.world.biome.j;
import net.minecraft.world.w;
import net.optifine.config.a;
import net.optifine.config.k;
import net.optifine.config.o;
import net.optifine.render.b;
import net.optifine.util.ae;
import net.optifine.util.ai;
import net.optifine.util.ak;

public class am {
    public String dXU = null;
    private int ebG = -1;
    private int ebH = -1;
    private int ebI = -1;
    private int ebJ = -1;
    private int eaz = 1;
    private boolean ebK = false;
    private float cGM = 1.0f;
    private float[] ebL = ebV;
    private o ebM = null;
    private int ebN = 8;
    private boolean ebO = true;
    private boolean ebP = false;
    private boolean ebQ = false;
    public j[] dEV = null;
    public o dVP = null;
    private float ebR = 1.0f;
    private ai ebS = null;
    public int ebT = -1;
    private w ebU = null;
    public static final float[] ebV = new float[]{1.0f, 0.0f, 0.0f};
    private static final String ebW = "clear";
    private static final String ebX = "rain";
    private static final String ebY = "thunder";

    public am(Properties properties, String string) {
        a a2 = new a("CustomSky");
        this.dXU = properties.getProperty("source", string);
        this.ebG = this.hG(properties.getProperty("startFadeIn"));
        this.ebH = this.hG(properties.getProperty("endFadeIn"));
        this.ebI = this.hG(properties.getProperty("startFadeOut"));
        this.ebJ = this.hG(properties.getProperty("endFadeOut"));
        this.eaz = b.iy(properties.getProperty("blend"));
        this.ebK = this.p(properties.getProperty("rotate"), true);
        this.cGM = this.b(properties.getProperty("speed"), 1.0f);
        this.ebL = this.a(properties.getProperty("axis"), ebV);
        this.ebM = a2.hx(properties.getProperty("days"));
        this.ebN = a2.x(properties.getProperty("daysLoop"), 8);
        List<String> list = this.hF(properties.getProperty("weather", ebW));
        this.ebO = list.contains(ebW);
        this.ebP = list.contains(ebX);
        this.ebQ = list.contains(ebY);
        this.dEV = a2.hM(properties.getProperty("biomes"));
        this.dVP = a2.hx(properties.getProperty("heights"));
        this.ebR = this.b(properties.getProperty("transition"), 1.0f);
    }

    private List<String> hF(String string) {
        List<String> list = Arrays.asList(ebW, ebX, ebY);
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (!list.contains(string2)) {
                net.minecraft.src.a.warn("Unknown weather: " + string2);
                continue;
            }
            arrayList.add(string2);
        }
        return arrayList;
    }

    private int hG(String string) {
        if (string == null) {
            return -1;
        }
        String[] stringArray = net.minecraft.src.a.V(string, ":");
        if (stringArray.length != 2) {
            net.minecraft.src.a.warn("Invalid time: " + string);
            return -1;
        }
        String string2 = stringArray[0];
        String string3 = stringArray[1];
        int n2 = net.minecraft.src.a.x(string2, -1);
        int n3 = net.minecraft.src.a.x(string3, -1);
        if (n2 >= 0 && n2 <= 23 && n3 >= 0 && n3 <= 59) {
            if ((n2 -= 6) < 0) {
                n2 += 24;
            }
            int n4 = n2 * 1000 + (int)((double)n3 / 60.0 * 1000.0);
            return n4;
        }
        net.minecraft.src.a.warn("Invalid time: " + string);
        return -1;
    }

    private boolean p(String string, boolean bl2) {
        if (string == null) {
            return bl2;
        }
        if (string.equalsIgnoreCase("true")) {
            return true;
        }
        if (string.equalsIgnoreCase("false")) {
            return false;
        }
        net.minecraft.src.a.warn("Unknown boolean: " + string);
        return bl2;
    }

    private float b(String string, float f2) {
        if (string == null) {
            return f2;
        }
        float f3 = net.minecraft.src.a.b(string, Float.MIN_VALUE);
        if (f3 == Float.MIN_VALUE) {
            net.minecraft.src.a.warn("Invalid value: " + string);
            return f2;
        }
        return f3;
    }

    private float[] a(String string, float[] fArray) {
        if (string == null) {
            return fArray;
        }
        String[] stringArray = net.minecraft.src.a.V(string, " ");
        if (stringArray.length != 3) {
            net.minecraft.src.a.warn("Invalid axis: " + string);
            return fArray;
        }
        float[] fArray2 = new float[3];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            fArray2[i2] = net.minecraft.src.a.b(stringArray[i2], Float.MIN_VALUE);
            if (fArray2[i2] == Float.MIN_VALUE) {
                net.minecraft.src.a.warn("Invalid axis: " + string);
                return fArray;
            }
            if (!(fArray2[i2] < -1.0f) && !(fArray2[i2] > 1.0f)) continue;
            net.minecraft.src.a.warn("Invalid axis values: " + string);
            return fArray;
        }
        float f2 = fArray2[0];
        float f3 = fArray2[1];
        float f4 = fArray2[2];
        if (f2 * f2 + f3 * f3 + f4 * f4 < 1.0E-5f) {
            net.minecraft.src.a.warn("Invalid axis values: " + string);
            return fArray;
        }
        float[] fArray3 = new float[]{f4, f3, -f2};
        return fArray3;
    }

    public boolean gY(String string) {
        if (this.dXU == null) {
            net.minecraft.src.a.warn("No source texture: " + string);
            return false;
        }
        this.dXU = ak.M(this.dXU, ak.kf(string));
        if (this.ebG >= 0 && this.ebH >= 0 && this.ebJ >= 0) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6 = this.jf(this.ebH - this.ebG);
            if (this.ebI < 0) {
                this.ebI = this.jf(this.ebJ - n6);
                if (this.aj(this.ebI, this.ebG, this.ebH)) {
                    this.ebI = this.ebH;
                }
            }
            if ((n5 = n6 + (n4 = this.jf(this.ebI - this.ebH)) + (n3 = this.jf(this.ebJ - this.ebI)) + (n2 = this.jf(this.ebG - this.ebJ))) != 24000) {
                net.minecraft.src.a.warn("Invalid fadeIn/fadeOut times, sum is not 24h: " + n5);
                return false;
            }
            if (this.cGM < 0.0f) {
                net.minecraft.src.a.warn("Invalid speed: " + this.cGM);
                return false;
            }
            if (this.ebN <= 0) {
                net.minecraft.src.a.warn("Invalid daysLoop: " + this.ebN);
                return false;
            }
            return true;
        }
        net.minecraft.src.a.warn("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
        return false;
    }

    private int jf(int n2) {
        while (n2 >= 24000) {
            n2 -= 24000;
        }
        while (n2 < 0) {
            n2 += 24000;
        }
        return n2;
    }

    public void a(w w2, int n2, float f2, float f3, float f4) {
        float f5 = this.s(w2);
        float f6 = this.C(f3, f4);
        float f7 = this.jg(n2);
        float f8 = f5 * f6 * f7;
        if ((f8 = net.minecraft.src.a.F(f8, 0.0f, 1.0f)) >= 1.0E-4f) {
            GlStateManager.ap(this.ebT);
            b.i(this.eaz, f8);
            GlStateManager.JV();
            if (this.ebK) {
                float f9 = 0.0f;
                if (this.cGM != (float)Math.round(this.cGM)) {
                    long l2 = (w2.getWorldTime() + 18000L) / 24000L;
                    double d2 = this.cGM % 1.0f;
                    double d3 = (double)l2 * d2;
                    f9 = (float)(d3 % 1.0);
                }
                GlStateManager.d(360.0f * (f9 + f2 * this.cGM), this.ebL[0], this.ebL[1], this.ebL[2]);
            }
            Tessellator tessellator = Tessellator.Li();
            GlStateManager.d(90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(-90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 4);
            GlStateManager.JV();
            GlStateManager.d(90.0f, 1.0f, 0.0f, 0.0f);
            this.a(tessellator, 1);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.d(-90.0f, 1.0f, 0.0f, 0.0f);
            this.a(tessellator, 0);
            GlStateManager.JW();
            GlStateManager.d(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 5);
            GlStateManager.d(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 2);
            GlStateManager.d(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 3);
            GlStateManager.JW();
        }
    }

    private float s(w w2) {
        if (this.dEV == null && this.dVP == null) {
            return 1.0f;
        }
        float f2 = this.t(w2);
        if (this.ebS == null) {
            this.ebS = new ai(f2, this.ebR);
        }
        f2 = this.ebS.cr(f2);
        return f2;
    }

    private float t(w w2) {
        c c2 = Minecraft.getMinecraft().BC();
        if (c2 == null) {
            return 0.0f;
        }
        net.minecraft.util.b b2 = c2.yl();
        if (this.dEV != null) {
            j j2 = w2.aF(b2);
            if (j2 == null) {
                return 0.0f;
            }
            if (!k.a(j2, this.dEV)) {
                return 0.0f;
            }
        }
        return this.dVP != null && !this.dVP.jt(b2.wu()) ? 0.0f : 1.0f;
    }

    private float C(float f2, float f3) {
        float f4 = 1.0f - f2;
        float f5 = f2 - f3;
        float f6 = 0.0f;
        if (this.ebO) {
            f6 += f4;
        }
        if (this.ebP) {
            f6 += f5;
        }
        if (this.ebQ) {
            f6 += f3;
        }
        f6 = ae.F(f6, 0.0f, 1.0f);
        return f6;
    }

    private float jg(int n2) {
        if (this.aj(n2, this.ebG, this.ebH)) {
            int n3 = this.jf(this.ebH - this.ebG);
            int n4 = this.jf(n2 - this.ebG);
            return (float)n4 / (float)n3;
        }
        if (this.aj(n2, this.ebH, this.ebI)) {
            return 1.0f;
        }
        if (this.aj(n2, this.ebI, this.ebJ)) {
            int n5 = this.jf(this.ebJ - this.ebI);
            int n6 = this.jf(n2 - this.ebI);
            return 1.0f - (float)n6 / (float)n5;
        }
        return 0.0f;
    }

    private void a(Tessellator tessellator, int n2) {
        WorldRenderer worldRenderer = tessellator.Lj();
        double d2 = (double)(n2 % 3) / 3.0;
        double d3 = (double)(n2 / 3) / 2.0;
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(-100.0, -100.0, -100.0).r(d2, d3).Lx();
        worldRenderer.F(-100.0, -100.0, 100.0).r(d2, d3 + 0.5).Lx();
        worldRenderer.F(100.0, -100.0, 100.0).r(d2 + 0.3333333333333333, d3 + 0.5).Lx();
        worldRenderer.F(100.0, -100.0, -100.0).r(d2 + 0.3333333333333333, d3).Lx();
        tessellator.pZ();
    }

    public boolean b(w w2, int n2) {
        if (w2 != this.ebU) {
            this.ebU = w2;
            this.ebS = null;
        }
        if (this.aj(n2, this.ebJ, this.ebG)) {
            return false;
        }
        if (this.ebM != null) {
            long l2;
            long l3 = w2.getWorldTime();
            for (l2 = l3 - (long)this.ebG; l2 < 0L; l2 += (long)(24000 * this.ebN)) {
            }
            int n3 = (int)(l2 / 24000L);
            int n4 = n3 % this.ebN;
            return this.ebM.jt(n4);
        }
        return true;
    }

    private boolean aj(int n2, int n3, int n4) {
        return n3 <= n4 ? n2 >= n3 && n2 <= n4 : n2 >= n3 || n2 <= n4;
    }

    public String toString() {
        return this.dXU + ", " + this.ebG + "-" + this.ebH + " " + this.ebI + "-" + this.ebJ;
    }
}

