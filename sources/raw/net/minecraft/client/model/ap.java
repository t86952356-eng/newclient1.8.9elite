/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class ap
extends d {
    public ag bCt;
    public ag bCu;
    public ag bCv;
    public ag bCw;
    public ag bCx;
    public ag bCy;
    public ag bCz;
    public ag bCA;
    public ag bCB;
    public ag bCC;
    public ag bCD;

    public ap() {
        float f2 = 0.0f;
        int n2 = 15;
        this.bCt = new ag(this, 32, 4);
        this.bCt.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, 0.0f);
        this.bCt.g(0.0f, 15.0f, -3.0f);
        this.bCu = new ag(this, 0, 0);
        this.bCu.a(-3.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.bCu.g(0.0f, 15.0f, 0.0f);
        this.bCv = new ag(this, 0, 12);
        this.bCv.a(-5.0f, -4.0f, -6.0f, 10, 8, 12, 0.0f);
        this.bCv.g(0.0f, 15.0f, 9.0f);
        this.bCw = new ag(this, 18, 0);
        this.bCw.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCw.g(-4.0f, 15.0f, 2.0f);
        this.bCx = new ag(this, 18, 0);
        this.bCx.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCx.g(4.0f, 15.0f, 2.0f);
        this.bCy = new ag(this, 18, 0);
        this.bCy.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCy.g(-4.0f, 15.0f, 1.0f);
        this.bCz = new ag(this, 18, 0);
        this.bCz.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCz.g(4.0f, 15.0f, 1.0f);
        this.bCA = new ag(this, 18, 0);
        this.bCA.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCA.g(-4.0f, 15.0f, 0.0f);
        this.bCB = new ag(this, 18, 0);
        this.bCB.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCB.g(4.0f, 15.0f, 0.0f);
        this.bCC = new ag(this, 18, 0);
        this.bCC.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCC.g(-4.0f, 15.0f, -1.0f);
        this.bCD = new ag(this, 18, 0);
        this.bCD.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.bCD.g(4.0f, 15.0f, -1.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCt.aa(f7);
        this.bCu.aa(f7);
        this.bCv.aa(f7);
        this.bCw.aa(f7);
        this.bCx.aa(f7);
        this.bCy.aa(f7);
        this.bCz.aa(f7);
        this.bCA.aa(f7);
        this.bCB.aa(f7);
        this.bCC.aa(f7);
        this.bCD.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        this.bCt.bBG = f5 / 57.295776f;
        this.bCt.bBF = f6 / 57.295776f;
        float f8 = 0.7853982f;
        this.bCw.bBH = -0.7853982f;
        this.bCx.bBH = 0.7853982f;
        this.bCy.bBH = -0.58119464f;
        this.bCz.bBH = 0.58119464f;
        this.bCA.bBH = -0.58119464f;
        this.bCB.bBH = 0.58119464f;
        this.bCC.bBH = -0.7853982f;
        this.bCD.bBH = 0.7853982f;
        float f9 = -0.0f;
        float f10 = 0.3926991f;
        this.bCw.bBG = 0.7853982f;
        this.bCx.bBG = -0.7853982f;
        this.bCy.bBG = 0.3926991f;
        this.bCz.bBG = -0.3926991f;
        this.bCA.bBG = -0.3926991f;
        this.bCB.bBG = 0.3926991f;
        this.bCC.bBG = -0.7853982f;
        this.bCD.bBG = 0.7853982f;
        float f11 = -(bt.bB(f2 * 0.6662f * 2.0f + 0.0f) * 0.4f) * f3;
        float f12 = -(bt.bB(f2 * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f3;
        float f13 = -(bt.bB(f2 * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f3;
        float f14 = -(bt.bB(f2 * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f3;
        float f15 = Math.abs(bt.bx(f2 * 0.6662f + 0.0f) * 0.4f) * f3;
        float f16 = Math.abs(bt.bx(f2 * 0.6662f + (float)Math.PI) * 0.4f) * f3;
        float f17 = Math.abs(bt.bx(f2 * 0.6662f + 1.5707964f) * 0.4f) * f3;
        float f18 = Math.abs(bt.bx(f2 * 0.6662f + 4.712389f) * 0.4f) * f3;
        this.bCw.bBG += f11;
        this.bCx.bBG += -f11;
        this.bCy.bBG += f12;
        this.bCz.bBG += -f12;
        this.bCA.bBG += f13;
        this.bCB.bBG += -f13;
        this.bCC.bBG += f14;
        this.bCD.bBG += -f14;
        this.bCw.bBH += f15;
        this.bCx.bBH += -f15;
        this.bCy.bBH += f16;
        this.bCz.bBH += -f16;
        this.bCA.bBH += f17;
        this.bCB.bBH += -f17;
        this.bCC.bBH += f18;
        this.bCD.bBH += -f18;
    }
}

