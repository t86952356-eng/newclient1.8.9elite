/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.boss.b;
import net.minecraft.entity.c;
import net.minecraft.entity.r;

public class o
extends d {
    private final ag bzt;
    private final ag bzu;
    private final ag bzv;
    private final ag bzw;
    private final ag bzx;
    private final ag bzy;
    private final ag bzz;
    private final ag bzA;
    private final ag bzB;
    private final ag bzC;
    private final ag bzD;
    private final ag bzE;
    private float jZ;

    public o(float f2) {
        this.bys = 256;
        this.byt = 256;
        this.f("body.body", 0, 0);
        this.f("wing.skin", -56, 88);
        this.f("wingtip.skin", -56, 144);
        this.f("rearleg.main", 0, 0);
        this.f("rearfoot.main", 112, 0);
        this.f("rearlegtip.main", 196, 0);
        this.f("head.upperhead", 112, 30);
        this.f("wing.bone", 112, 88);
        this.f("head.upperlip", 176, 44);
        this.f("jaw.jaw", 176, 65);
        this.f("frontleg.main", 112, 104);
        this.f("wingtip.bone", 112, 136);
        this.f("frontfoot.main", 144, 104);
        this.f("neck.box", 192, 104);
        this.f("frontlegtip.main", 226, 138);
        this.f("body.scale", 220, 53);
        this.f("head.scale", 0, 0);
        this.f("neck.scale", 48, 0);
        this.f("head.nostril", 112, 0);
        float f3 = -16.0f;
        this.bzt = new ag(this, "head");
        this.bzt.a("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16);
        this.bzt.a("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16);
        this.bzt.bBK = true;
        this.bzt.a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6);
        this.bzt.a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4);
        this.bzt.bBK = false;
        this.bzt.a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6);
        this.bzt.a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4);
        this.bzv = new ag(this, "jaw");
        this.bzv.g(0.0f, 4.0f, -8.0f);
        this.bzv.a("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.bzt.a(this.bzv);
        this.bzu = new ag(this, "neck");
        this.bzu.a("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
        this.bzu.a("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
        this.bzw = new ag(this, "body");
        this.bzw.g(0.0f, 4.0f, 8.0f);
        this.bzw.a("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
        this.bzw.a("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
        this.bzw.a("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
        this.bzw.a("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
        this.bzD = new ag(this, "wing");
        this.bzD.g(-12.0f, 5.0f, 2.0f);
        this.bzD.a("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.bzD.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.bzE = new ag(this, "wingtip");
        this.bzE.g(-56.0f, 0.0f, 0.0f);
        this.bzE.a("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.bzE.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.bzD.a(this.bzE);
        this.bzy = new ag(this, "frontleg");
        this.bzy.g(-12.0f, 20.0f, 2.0f);
        this.bzy.a("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
        this.bzA = new ag(this, "frontlegtip");
        this.bzA.g(0.0f, 20.0f, -1.0f);
        this.bzA.a("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
        this.bzy.a(this.bzA);
        this.bzC = new ag(this, "frontfoot");
        this.bzC.g(0.0f, 23.0f, 0.0f);
        this.bzC.a("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
        this.bzA.a(this.bzC);
        this.bzx = new ag(this, "rearleg");
        this.bzx.g(-16.0f, 16.0f, 42.0f);
        this.bzx.a("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
        this.bzz = new ag(this, "rearlegtip");
        this.bzz.g(0.0f, 32.0f, -4.0f);
        this.bzz.a("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
        this.bzx.a(this.bzz);
        this.bzB = new ag(this, "rearfoot");
        this.bzB.g(0.0f, 31.0f, 4.0f);
        this.bzB.a("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
        this.bzz.a(this.bzB);
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        this.jZ = f4;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        GlStateManager.JV();
        b b2 = (b)c2;
        float f9 = b2.cBk + (b2.cBl - b2.cBk) * this.jZ;
        this.bzv.bBF = (float)(Math.sin(f9 * (float)Math.PI * 2.0f) + 1.0) * 0.2f;
        float f10 = (float)(Math.sin(f9 * (float)Math.PI * 2.0f - 1.0f) + 1.0);
        f10 = (f10 * f10 * 1.0f + f10 * 2.0f) * 0.05f;
        GlStateManager.j(0.0f, f10 - 2.0f, -3.0f);
        GlStateManager.d(f10 * 2.0f, 1.0f, 0.0f, 0.0f);
        float f11 = -30.0f;
        float f12 = 0.0f;
        float f13 = 1.5f;
        double[] dArray = b2.g(6, this.jZ);
        float f14 = this.aj(b2.g(5, this.jZ)[0] - b2.g(10, this.jZ)[0]);
        float f15 = this.aj(b2.g(5, this.jZ)[0] + (double)(f14 / 2.0f));
        f11 += 2.0f;
        float f16 = f9 * (float)Math.PI * 2.0f;
        f11 = 20.0f;
        float f17 = -12.0f;
        for (int i2 = 0; i2 < 5; ++i2) {
            double[] dArray2 = b2.g(5 - i2, this.jZ);
            f8 = (float)Math.cos((float)i2 * 0.45f + f16) * 0.15f;
            this.bzu.bBG = this.aj(dArray2[0] - dArray[0]) * (float)Math.PI / 180.0f * 1.5f;
            this.bzu.bBF = f8 + (float)(dArray2[1] - dArray[1]) * (float)Math.PI / 180.0f * 1.5f * 5.0f;
            this.bzu.bBH = -this.aj(dArray2[0] - (double)f15) * (float)Math.PI / 180.0f * 1.5f;
            this.bzu.bBD = f11;
            this.bzu.bBE = f17;
            this.bzu.bBC = f12;
            f11 = (float)((double)f11 + Math.sin(this.bzu.bBF) * 10.0);
            f17 = (float)((double)f17 - Math.cos(this.bzu.bBG) * Math.cos(this.bzu.bBF) * 10.0);
            f12 = (float)((double)f12 - Math.sin(this.bzu.bBG) * Math.cos(this.bzu.bBF) * 10.0);
            this.bzu.aa(f7);
        }
        this.bzt.bBD = f11;
        this.bzt.bBE = f17;
        this.bzt.bBC = f12;
        double[] dArray3 = b2.g(0, this.jZ);
        this.bzt.bBG = this.aj(dArray3[0] - dArray[0]) * (float)Math.PI / 180.0f * 1.0f;
        this.bzt.bBH = -this.aj(dArray3[0] - (double)f15) * (float)Math.PI / 180.0f * 1.0f;
        this.bzt.aa(f7);
        GlStateManager.JV();
        GlStateManager.j(0.0f, 1.0f, 0.0f);
        GlStateManager.d(-f14 * 1.5f * 1.0f, 0.0f, 0.0f, 1.0f);
        GlStateManager.j(0.0f, -1.0f, 0.0f);
        this.bzw.bBH = 0.0f;
        this.bzw.aa(f7);
        for (int i3 = 0; i3 < 2; ++i3) {
            GlStateManager.JH();
            f8 = f9 * (float)Math.PI * 2.0f;
            this.bzD.bBF = 0.125f - (float)Math.cos(f8) * 0.2f;
            this.bzD.bBG = 0.25f;
            this.bzD.bBH = (float)(Math.sin(f8) + 0.125) * 0.8f;
            this.bzE.bBH = -((float)(Math.sin(f8 + 2.0f) + 0.5)) * 0.75f;
            this.bzx.bBF = 1.0f + f10 * 0.1f;
            this.bzz.bBF = 0.5f + f10 * 0.1f;
            this.bzB.bBF = 0.75f + f10 * 0.1f;
            this.bzy.bBF = 1.3f + f10 * 0.1f;
            this.bzA.bBF = -0.5f - f10 * 0.1f;
            this.bzC.bBF = 0.75f + f10 * 0.1f;
            this.bzD.aa(f7);
            this.bzy.aa(f7);
            this.bzx.aa(f7);
            GlStateManager.i(-1.0f, 1.0f, 1.0f);
            if (i3 != 0) continue;
            GlStateManager.cL(1028);
        }
        GlStateManager.JW();
        GlStateManager.cL(1029);
        GlStateManager.JI();
        float f18 = -((float)Math.sin(f9 * (float)Math.PI * 2.0f)) * 0.0f;
        f16 = f9 * (float)Math.PI * 2.0f;
        f11 = 10.0f;
        f17 = 60.0f;
        f12 = 0.0f;
        dArray = b2.g(11, this.jZ);
        for (int i4 = 0; i4 < 12; ++i4) {
            dArray3 = b2.g(12 + i4, this.jZ);
            f18 = (float)((double)f18 + Math.sin((float)i4 * 0.45f + f16) * (double)0.05f);
            this.bzu.bBG = (this.aj(dArray3[0] - dArray[0]) * 1.5f + 180.0f) * (float)Math.PI / 180.0f;
            this.bzu.bBF = f18 + (float)(dArray3[1] - dArray[1]) * (float)Math.PI / 180.0f * 1.5f * 5.0f;
            this.bzu.bBH = this.aj(dArray3[0] - (double)f15) * (float)Math.PI / 180.0f * 1.5f;
            this.bzu.bBD = f11;
            this.bzu.bBE = f17;
            this.bzu.bBC = f12;
            f11 = (float)((double)f11 + Math.sin(this.bzu.bBF) * 10.0);
            f17 = (float)((double)f17 - Math.cos(this.bzu.bBG) * Math.cos(this.bzu.bBF) * 10.0);
            f12 = (float)((double)f12 - Math.sin(this.bzu.bBG) * Math.cos(this.bzu.bBF) * 10.0);
            this.bzu.aa(f7);
        }
        GlStateManager.JW();
    }

    private float aj(double d2) {
        while (d2 >= 180.0) {
            d2 -= 360.0;
        }
        while (d2 < -180.0) {
            d2 += 360.0;
        }
        return (float)d2;
    }
}

