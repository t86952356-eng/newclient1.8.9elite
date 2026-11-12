/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class u
extends d {
    private final ag bzT;
    private final ag bzU;
    private final ag bzV;
    private final ag bzW;
    private final ag bzX;
    private final ag bzY;
    private final ag bzZ;
    private final ag bAa;
    private final ag bAb;
    private final ag bAc;
    private final ag bAd;
    private final ag bAe;
    private final ag bAf;
    private final ag bAg;
    private final ag bAh;
    private final ag bAi;
    private final ag bAj;
    private final ag bAk;
    private final ag bAl;
    private final ag bAm;
    private final ag bAn;
    private final ag bAo;
    private final ag bAp;
    private final ag bAq;
    private final ag bAr;
    private final ag bAs;
    private final ag bAt;
    private final ag bAu;
    private final ag bAv;
    private final ag bAw;
    private final ag bAx;
    private final ag bAy;
    private final ag bAz;
    private final ag bAA;
    private final ag bAB;
    private final ag bAC;
    private final ag bAD;
    private final ag bAE;
    private final ag bAF;

    public u() {
        this.bys = 128;
        this.byt = 128;
        this.bAd = new ag(this, 0, 34);
        this.bAd.a(-5.0f, -8.0f, -19.0f, 10, 10, 24);
        this.bAd.g(0.0f, 11.0f, 9.0f);
        this.bAe = new ag(this, 44, 0);
        this.bAe.a(-1.0f, -1.0f, 0.0f, 2, 2, 3);
        this.bAe.g(0.0f, 3.0f, 14.0f);
        this.a(this.bAe, -1.134464f, 0.0f, 0.0f);
        this.bAf = new ag(this, 38, 7);
        this.bAf.a(-1.5f, -2.0f, 3.0f, 3, 4, 7);
        this.bAf.g(0.0f, 3.0f, 14.0f);
        this.a(this.bAf, -1.134464f, 0.0f, 0.0f);
        this.bAg = new ag(this, 24, 3);
        this.bAg.a(-1.5f, -4.5f, 9.0f, 3, 4, 7);
        this.bAg.g(0.0f, 3.0f, 14.0f);
        this.a(this.bAg, -1.40215f, 0.0f, 0.0f);
        this.bAh = new ag(this, 78, 29);
        this.bAh.a(-2.5f, -2.0f, -2.5f, 4, 9, 5);
        this.bAh.g(4.0f, 9.0f, 11.0f);
        this.bAi = new ag(this, 78, 43);
        this.bAi.a(-2.0f, 0.0f, -1.5f, 3, 5, 3);
        this.bAi.g(4.0f, 16.0f, 11.0f);
        this.bAj = new ag(this, 78, 51);
        this.bAj.a(-2.5f, 5.1f, -2.0f, 4, 3, 4);
        this.bAj.g(4.0f, 16.0f, 11.0f);
        this.bAk = new ag(this, 96, 29);
        this.bAk.a(-1.5f, -2.0f, -2.5f, 4, 9, 5);
        this.bAk.g(-4.0f, 9.0f, 11.0f);
        this.bAl = new ag(this, 96, 43);
        this.bAl.a(-1.0f, 0.0f, -1.5f, 3, 5, 3);
        this.bAl.g(-4.0f, 16.0f, 11.0f);
        this.bAm = new ag(this, 96, 51);
        this.bAm.a(-1.5f, 5.1f, -2.0f, 4, 3, 4);
        this.bAm.g(-4.0f, 16.0f, 11.0f);
        this.bAn = new ag(this, 44, 29);
        this.bAn.a(-1.9f, -1.0f, -2.1f, 3, 8, 4);
        this.bAn.g(4.0f, 9.0f, -8.0f);
        this.bAo = new ag(this, 44, 41);
        this.bAo.a(-1.9f, 0.0f, -1.6f, 3, 5, 3);
        this.bAo.g(4.0f, 16.0f, -8.0f);
        this.bAp = new ag(this, 44, 51);
        this.bAp.a(-2.4f, 5.1f, -2.1f, 4, 3, 4);
        this.bAp.g(4.0f, 16.0f, -8.0f);
        this.bAq = new ag(this, 60, 29);
        this.bAq.a(-1.1f, -1.0f, -2.1f, 3, 8, 4);
        this.bAq.g(-4.0f, 9.0f, -8.0f);
        this.bAr = new ag(this, 60, 41);
        this.bAr.a(-1.1f, 0.0f, -1.6f, 3, 5, 3);
        this.bAr.g(-4.0f, 16.0f, -8.0f);
        this.bAs = new ag(this, 60, 51);
        this.bAs.a(-1.6f, 5.1f, -2.1f, 4, 3, 4);
        this.bAs.g(-4.0f, 16.0f, -8.0f);
        this.bzT = new ag(this, 0, 0);
        this.bzT.a(-2.5f, -10.0f, -1.5f, 5, 5, 7);
        this.bzT.g(0.0f, 4.0f, -10.0f);
        this.a(this.bzT, 0.5235988f, 0.0f, 0.0f);
        this.bzU = new ag(this, 24, 18);
        this.bzU.a(-2.0f, -10.0f, -7.0f, 4, 3, 6);
        this.bzU.g(0.0f, 3.95f, -10.0f);
        this.a(this.bzU, 0.5235988f, 0.0f, 0.0f);
        this.bzV = new ag(this, 24, 27);
        this.bzV.a(-2.0f, -7.0f, -6.5f, 4, 2, 5);
        this.bzV.g(0.0f, 4.0f, -10.0f);
        this.a(this.bzV, 0.5235988f, 0.0f, 0.0f);
        this.bzT.a(this.bzU);
        this.bzT.a(this.bzV);
        this.bzW = new ag(this, 0, 0);
        this.bzW.a(0.45f, -12.0f, 4.0f, 2, 3, 1);
        this.bzW.g(0.0f, 4.0f, -10.0f);
        this.a(this.bzW, 0.5235988f, 0.0f, 0.0f);
        this.bzX = new ag(this, 0, 0);
        this.bzX.a(-2.45f, -12.0f, 4.0f, 2, 3, 1);
        this.bzX.g(0.0f, 4.0f, -10.0f);
        this.a(this.bzX, 0.5235988f, 0.0f, 0.0f);
        this.bzY = new ag(this, 0, 12);
        this.bzY.a(-2.0f, -16.0f, 4.0f, 2, 7, 1);
        this.bzY.g(0.0f, 4.0f, -10.0f);
        this.a(this.bzY, 0.5235988f, 0.0f, 0.2617994f);
        this.bzZ = new ag(this, 0, 12);
        this.bzZ.a(0.0f, -16.0f, 4.0f, 2, 7, 1);
        this.bzZ.g(0.0f, 4.0f, -10.0f);
        this.a(this.bzZ, 0.5235988f, 0.0f, -0.2617994f);
        this.bAa = new ag(this, 0, 12);
        this.bAa.a(-2.05f, -9.8f, -2.0f, 4, 14, 8);
        this.bAa.g(0.0f, 4.0f, -10.0f);
        this.a(this.bAa, 0.5235988f, 0.0f, 0.0f);
        this.bAt = new ag(this, 0, 34);
        this.bAt.a(-3.0f, 0.0f, 0.0f, 8, 8, 3);
        this.bAt.g(-7.5f, 3.0f, 10.0f);
        this.a(this.bAt, 0.0f, 1.5707964f, 0.0f);
        this.bAu = new ag(this, 0, 47);
        this.bAu.a(-3.0f, 0.0f, 0.0f, 8, 8, 3);
        this.bAu.g(4.5f, 3.0f, 10.0f);
        this.a(this.bAu, 0.0f, 1.5707964f, 0.0f);
        this.bAv = new ag(this, 80, 0);
        this.bAv.a(-5.0f, 0.0f, -3.0f, 10, 1, 8);
        this.bAv.g(0.0f, 2.0f, 2.0f);
        this.bAw = new ag(this, 106, 9);
        this.bAw.a(-1.5f, -1.0f, -3.0f, 3, 1, 2);
        this.bAw.g(0.0f, 2.0f, 2.0f);
        this.bAx = new ag(this, 80, 9);
        this.bAx.a(-4.0f, -1.0f, 3.0f, 8, 1, 2);
        this.bAx.g(0.0f, 2.0f, 2.0f);
        this.bAz = new ag(this, 74, 0);
        this.bAz.a(-0.5f, 6.0f, -1.0f, 1, 2, 2);
        this.bAz.g(5.0f, 3.0f, 2.0f);
        this.bAy = new ag(this, 70, 0);
        this.bAy.a(-0.5f, 0.0f, -0.5f, 1, 6, 1);
        this.bAy.g(5.0f, 3.0f, 2.0f);
        this.bAB = new ag(this, 74, 4);
        this.bAB.a(-0.5f, 6.0f, -1.0f, 1, 2, 2);
        this.bAB.g(-5.0f, 3.0f, 2.0f);
        this.bAA = new ag(this, 80, 0);
        this.bAA.a(-0.5f, 0.0f, -0.5f, 1, 6, 1);
        this.bAA.g(-5.0f, 3.0f, 2.0f);
        this.bAC = new ag(this, 74, 13);
        this.bAC.a(1.5f, -8.0f, -4.0f, 1, 2, 2);
        this.bAC.g(0.0f, 4.0f, -10.0f);
        this.a(this.bAC, 0.5235988f, 0.0f, 0.0f);
        this.bAD = new ag(this, 74, 13);
        this.bAD.a(-2.5f, -8.0f, -4.0f, 1, 2, 2);
        this.bAD.g(0.0f, 4.0f, -10.0f);
        this.a(this.bAD, 0.5235988f, 0.0f, 0.0f);
        this.bAE = new ag(this, 44, 10);
        this.bAE.a(2.6f, -6.0f, -6.0f, 0, 3, 16);
        this.bAE.g(0.0f, 4.0f, -10.0f);
        this.bAF = new ag(this, 44, 5);
        this.bAF.a(-2.6f, -6.0f, -6.0f, 0, 3, 16);
        this.bAF.g(0.0f, 4.0f, -10.0f);
        this.bAc = new ag(this, 58, 0);
        this.bAc.a(-1.0f, -11.5f, 5.0f, 2, 16, 4);
        this.bAc.g(0.0f, 4.0f, -10.0f);
        this.a(this.bAc, 0.5235988f, 0.0f, 0.0f);
        this.bAb = new ag(this, 80, 12);
        this.bAb.a(-2.5f, -10.1f, -7.0f, 5, 5, 12, 0.2f);
        this.bAb.g(0.0f, 4.0f, -10.0f);
        this.a(this.bAb, 0.5235988f, 0.0f, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean bl2;
        f f8 = (f)c2;
        int n2 = f8.ZX();
        float f9 = f8.bk(0.0f);
        boolean bl3 = f8.ZZ();
        boolean bl4 = bl3 && f8.aas();
        boolean bl5 = bl3 && f8.aae();
        boolean bl6 = n2 == 1 || n2 == 2;
        float f10 = f8.aac();
        boolean bl7 = bl2 = f8.crA != null;
        if (bl4) {
            this.bAb.aa(f7);
            this.bAv.aa(f7);
            this.bAw.aa(f7);
            this.bAx.aa(f7);
            this.bAy.aa(f7);
            this.bAz.aa(f7);
            this.bAA.aa(f7);
            this.bAB.aa(f7);
            this.bAC.aa(f7);
            this.bAD.aa(f7);
            if (bl2) {
                this.bAE.aa(f7);
                this.bAF.aa(f7);
            }
        }
        if (!bl3) {
            GlStateManager.JV();
            GlStateManager.i(f10, 0.5f + f10 * 0.5f, f10);
            GlStateManager.j(0.0f, 0.95f * (1.0f - f10), 0.0f);
        }
        this.bAh.aa(f7);
        this.bAi.aa(f7);
        this.bAj.aa(f7);
        this.bAk.aa(f7);
        this.bAl.aa(f7);
        this.bAm.aa(f7);
        this.bAn.aa(f7);
        this.bAo.aa(f7);
        this.bAp.aa(f7);
        this.bAq.aa(f7);
        this.bAr.aa(f7);
        this.bAs.aa(f7);
        if (!bl3) {
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(f10, f10, f10);
            GlStateManager.j(0.0f, 1.35f * (1.0f - f10), 0.0f);
        }
        this.bAd.aa(f7);
        this.bAe.aa(f7);
        this.bAf.aa(f7);
        this.bAg.aa(f7);
        this.bAa.aa(f7);
        this.bAc.aa(f7);
        if (!bl3) {
            GlStateManager.JW();
            GlStateManager.JV();
            float f11 = 0.5f + f10 * f10 * 0.5f;
            GlStateManager.i(f11, f11, f11);
            if (f9 <= 0.0f) {
                GlStateManager.j(0.0f, 1.35f * (1.0f - f10), 0.0f);
            } else {
                GlStateManager.j(0.0f, 0.9f * (1.0f - f10) * f9 + 1.35f * (1.0f - f10) * (1.0f - f9), 0.15f * (1.0f - f10) * f9);
            }
        }
        if (bl6) {
            this.bzY.aa(f7);
            this.bzZ.aa(f7);
        } else {
            this.bzW.aa(f7);
            this.bzX.aa(f7);
        }
        this.bzT.aa(f7);
        if (!bl3) {
            GlStateManager.JW();
        }
        if (bl5) {
            this.bAt.aa(f7);
            this.bAu.aa(f7);
        }
    }

    private void a(ag ag2, float f2, float f3, float f4) {
        ag2.bBF = f2;
        ag2.bBG = f3;
        ag2.bBH = f4;
    }

    private float f(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        super.a(r2, f2, f3, f4);
        float f5 = this.f(r2.cuG, r2.cuF, f4);
        float f6 = this.f(r2.cuH, r2.pn, f4);
        float f7 = r2.crO + (r2.pm - r2.crO) * f4;
        float f8 = f6 - f5;
        float f9 = f7 / 57.295776f;
        if (f8 > 20.0f) {
            f8 = 20.0f;
        }
        if (f8 < -20.0f) {
            f8 = -20.0f;
        }
        if (f3 > 0.2f) {
            f9 += bt.bB(f2 * 0.4f) * 0.15f * f3;
        }
        f f10 = (f)r2;
        float f11 = f10.bk(f4);
        float f12 = f10.bl(f4);
        float f13 = 1.0f - f12;
        float f14 = f10.bm(f4);
        boolean bl2 = f10.cFW != 0;
        boolean bl3 = f10.aas();
        boolean bl4 = f10.crA != null;
        float f15 = (float)r2.aRg + f4;
        float f16 = bt.bB(f2 * 0.6662f + (float)Math.PI);
        float f17 = f16 * 0.8f * f3;
        this.bzT.bBD = 4.0f;
        this.bzT.bBE = -10.0f;
        this.bAe.bBD = 3.0f;
        this.bAf.bBE = 14.0f;
        this.bAu.bBD = 3.0f;
        this.bAu.bBE = 10.0f;
        this.bAd.bBF = 0.0f;
        this.bzT.bBF = 0.5235988f + f9;
        this.bzT.bBG = f8 / 57.295776f;
        this.bzT.bBF = f12 * (0.2617994f + f9) + f11 * 2.18166f + (1.0f - Math.max(f12, f11)) * this.bzT.bBF;
        this.bzT.bBG = f12 * f8 / 57.295776f + (1.0f - Math.max(f12, f11)) * this.bzT.bBG;
        this.bzT.bBD = f12 * -6.0f + f11 * 11.0f + (1.0f - Math.max(f12, f11)) * this.bzT.bBD;
        this.bzT.bBE = f12 * -1.0f + f11 * -10.0f + (1.0f - Math.max(f12, f11)) * this.bzT.bBE;
        this.bAe.bBD = f12 * 9.0f + f13 * this.bAe.bBD;
        this.bAf.bBE = f12 * 18.0f + f13 * this.bAf.bBE;
        this.bAu.bBD = f12 * 5.5f + f13 * this.bAu.bBD;
        this.bAu.bBE = f12 * 15.0f + f13 * this.bAu.bBE;
        this.bAd.bBF = f12 * -45.0f / 57.295776f + f13 * this.bAd.bBF;
        this.bzW.bBD = this.bzT.bBD;
        this.bzX.bBD = this.bzT.bBD;
        this.bzY.bBD = this.bzT.bBD;
        this.bzZ.bBD = this.bzT.bBD;
        this.bAa.bBD = this.bzT.bBD;
        this.bzU.bBD = 0.02f;
        this.bzV.bBD = 0.0f;
        this.bAc.bBD = this.bzT.bBD;
        this.bzW.bBE = this.bzT.bBE;
        this.bzX.bBE = this.bzT.bBE;
        this.bzY.bBE = this.bzT.bBE;
        this.bzZ.bBE = this.bzT.bBE;
        this.bAa.bBE = this.bzT.bBE;
        this.bzU.bBE = 0.02f - f14 * 1.0f;
        this.bzV.bBE = 0.0f + f14 * 1.0f;
        this.bAc.bBE = this.bzT.bBE;
        this.bzW.bBF = this.bzT.bBF;
        this.bzX.bBF = this.bzT.bBF;
        this.bzY.bBF = this.bzT.bBF;
        this.bzZ.bBF = this.bzT.bBF;
        this.bAa.bBF = this.bzT.bBF;
        this.bzU.bBF = 0.0f - 0.09424778f * f14;
        this.bzV.bBF = 0.0f + 0.15707964f * f14;
        this.bAc.bBF = this.bzT.bBF;
        this.bzW.bBG = this.bzT.bBG;
        this.bzX.bBG = this.bzT.bBG;
        this.bzY.bBG = this.bzT.bBG;
        this.bzZ.bBG = this.bzT.bBG;
        this.bAa.bBG = this.bzT.bBG;
        this.bzU.bBG = 0.0f;
        this.bzV.bBG = 0.0f;
        this.bAc.bBG = this.bzT.bBG;
        this.bAt.bBF = f17 / 5.0f;
        this.bAu.bBF = -f17 / 5.0f;
        float f18 = 1.5707964f;
        float f19 = 4.712389f;
        float f20 = -1.0471976f;
        float f21 = 0.2617994f * f12;
        float f22 = bt.bB(f15 * 0.6f + (float)Math.PI);
        this.bAn.bBD = -2.0f * f12 + 9.0f * f13;
        this.bAn.bBE = -2.0f * f12 + -8.0f * f13;
        this.bAq.bBD = this.bAn.bBD;
        this.bAq.bBE = this.bAn.bBE;
        this.bAi.bBD = this.bAh.bBD + bt.bx(1.5707964f + f21 + f13 * -f16 * 0.5f * f3) * 7.0f;
        this.bAi.bBE = this.bAh.bBE + bt.bB(4.712389f + f21 + f13 * -f16 * 0.5f * f3) * 7.0f;
        this.bAl.bBD = this.bAk.bBD + bt.bx(1.5707964f + f21 + f13 * f16 * 0.5f * f3) * 7.0f;
        this.bAl.bBE = this.bAk.bBE + bt.bB(4.712389f + f21 + f13 * f16 * 0.5f * f3) * 7.0f;
        float f23 = (-1.0471976f + f22) * f12 + f17 * f13;
        float f24 = (-1.0471976f + -f22) * f12 + -f17 * f13;
        this.bAo.bBD = this.bAn.bBD + bt.bx(1.5707964f + f23) * 7.0f;
        this.bAo.bBE = this.bAn.bBE + bt.bB(4.712389f + f23) * 7.0f;
        this.bAr.bBD = this.bAq.bBD + bt.bx(1.5707964f + f24) * 7.0f;
        this.bAr.bBE = this.bAq.bBE + bt.bB(4.712389f + f24) * 7.0f;
        this.bAh.bBF = f21 + -f16 * 0.5f * f3 * f13;
        this.bAj.bBF = this.bAi.bBF = -0.08726646f * f12 + (-f16 * 0.5f * f3 - Math.max(0.0f, f16 * 0.5f * f3)) * f13;
        this.bAk.bBF = f21 + f16 * 0.5f * f3 * f13;
        this.bAm.bBF = this.bAl.bBF = -0.08726646f * f12 + (f16 * 0.5f * f3 - Math.max(0.0f, -f16 * 0.5f * f3)) * f13;
        this.bAn.bBF = f23;
        this.bAp.bBF = this.bAo.bBF = (this.bAn.bBF + (float)Math.PI * Math.max(0.0f, 0.2f + f22 * 0.2f)) * f12 + (f17 + Math.max(0.0f, f16 * 0.5f * f3)) * f13;
        this.bAq.bBF = f24;
        this.bAs.bBF = this.bAr.bBF = (this.bAq.bBF + (float)Math.PI * Math.max(0.0f, 0.2f - f22 * 0.2f)) * f12 + (-f17 + Math.max(0.0f, -f16 * 0.5f * f3)) * f13;
        this.bAj.bBD = this.bAi.bBD;
        this.bAj.bBE = this.bAi.bBE;
        this.bAm.bBD = this.bAl.bBD;
        this.bAm.bBE = this.bAl.bBE;
        this.bAp.bBD = this.bAo.bBD;
        this.bAp.bBE = this.bAo.bBE;
        this.bAs.bBD = this.bAr.bBD;
        this.bAs.bBE = this.bAr.bBE;
        if (bl3) {
            this.bAv.bBD = f12 * 0.5f + f13 * 2.0f;
            this.bAv.bBE = f12 * 11.0f + f13 * 2.0f;
            this.bAw.bBD = this.bAv.bBD;
            this.bAx.bBD = this.bAv.bBD;
            this.bAy.bBD = this.bAv.bBD;
            this.bAA.bBD = this.bAv.bBD;
            this.bAz.bBD = this.bAv.bBD;
            this.bAB.bBD = this.bAv.bBD;
            this.bAt.bBD = this.bAu.bBD;
            this.bAw.bBE = this.bAv.bBE;
            this.bAx.bBE = this.bAv.bBE;
            this.bAy.bBE = this.bAv.bBE;
            this.bAA.bBE = this.bAv.bBE;
            this.bAz.bBE = this.bAv.bBE;
            this.bAB.bBE = this.bAv.bBE;
            this.bAt.bBE = this.bAu.bBE;
            this.bAv.bBF = this.bAd.bBF;
            this.bAw.bBF = this.bAd.bBF;
            this.bAx.bBF = this.bAd.bBF;
            this.bAE.bBD = this.bzT.bBD;
            this.bAF.bBD = this.bzT.bBD;
            this.bAb.bBD = this.bzT.bBD;
            this.bAC.bBD = this.bzT.bBD;
            this.bAD.bBD = this.bzT.bBD;
            this.bAE.bBE = this.bzT.bBE;
            this.bAF.bBE = this.bzT.bBE;
            this.bAb.bBE = this.bzT.bBE;
            this.bAC.bBE = this.bzT.bBE;
            this.bAD.bBE = this.bzT.bBE;
            this.bAE.bBF = f9;
            this.bAF.bBF = f9;
            this.bAb.bBF = this.bzT.bBF;
            this.bAC.bBF = this.bzT.bBF;
            this.bAD.bBF = this.bzT.bBF;
            this.bAb.bBG = this.bzT.bBG;
            this.bAC.bBG = this.bzT.bBG;
            this.bAE.bBG = this.bzT.bBG;
            this.bAD.bBG = this.bzT.bBG;
            this.bAF.bBG = this.bzT.bBG;
            if (bl4) {
                this.bAy.bBF = -1.0471976f;
                this.bAz.bBF = -1.0471976f;
                this.bAA.bBF = -1.0471976f;
                this.bAB.bBF = -1.0471976f;
                this.bAy.bBH = 0.0f;
                this.bAz.bBH = 0.0f;
                this.bAA.bBH = 0.0f;
                this.bAB.bBH = 0.0f;
            } else {
                this.bAy.bBF = f17 / 3.0f;
                this.bAz.bBF = f17 / 3.0f;
                this.bAA.bBF = f17 / 3.0f;
                this.bAB.bBF = f17 / 3.0f;
                this.bAy.bBH = f17 / 5.0f;
                this.bAz.bBH = f17 / 5.0f;
                this.bAA.bBH = -f17 / 5.0f;
                this.bAB.bBH = -f17 / 5.0f;
            }
        }
        if ((f18 = -1.3089f + f3 * 1.5f) > 0.0f) {
            f18 = 0.0f;
        }
        if (bl2) {
            this.bAe.bBG = bt.bB(f15 * 0.7f);
            f18 = 0.0f;
        } else {
            this.bAe.bBG = 0.0f;
        }
        this.bAf.bBG = this.bAe.bBG;
        this.bAg.bBG = this.bAe.bBG;
        this.bAf.bBD = this.bAe.bBD;
        this.bAg.bBD = this.bAe.bBD;
        this.bAf.bBE = this.bAe.bBE;
        this.bAg.bBE = this.bAe.bBE;
        this.bAe.bBF = f18;
        this.bAf.bBF = f18;
        this.bAg.bBF = -0.2618f + f18;
    }
}

