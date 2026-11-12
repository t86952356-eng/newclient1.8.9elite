/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.l;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class af
extends d {
    ag bBk;
    ag bBl;
    ag bBm;
    ag bBn;
    ag bBo;
    ag bBp;
    ag bBq;
    ag bBr;
    ag bBs;
    ag bBt;
    ag bBu;
    ag bBv;
    private float bBw = 0.0f;
    private final float bBx = 0.0f;

    public af() {
        this.f("head.main", 0, 0);
        this.f("head.nose", 0, 24);
        this.f("head.ear1", 0, 10);
        this.f("head.ear2", 6, 10);
        this.bBk = new ag(this, 26, 24);
        this.bBk.a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.bBk.g(3.0f, 17.5f, 3.7f);
        this.bBk.bBK = true;
        this.b(this.bBk, 0.0f, 0.0f, 0.0f);
        this.bBl = new ag(this, 8, 24);
        this.bBl.a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.bBl.g(-3.0f, 17.5f, 3.7f);
        this.bBl.bBK = true;
        this.b(this.bBl, 0.0f, 0.0f, 0.0f);
        this.bBm = new ag(this, 30, 15);
        this.bBm.a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.bBm.g(3.0f, 17.5f, 3.7f);
        this.bBm.bBK = true;
        this.b(this.bBm, -0.34906584f, 0.0f, 0.0f);
        this.bBn = new ag(this, 16, 15);
        this.bBn.a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.bBn.g(-3.0f, 17.5f, 3.7f);
        this.bBn.bBK = true;
        this.b(this.bBn, -0.34906584f, 0.0f, 0.0f);
        this.bBo = new ag(this, 0, 0);
        this.bBo.a(-3.0f, -2.0f, -10.0f, 6, 5, 10);
        this.bBo.g(0.0f, 19.0f, 8.0f);
        this.bBo.bBK = true;
        this.b(this.bBo, -0.34906584f, 0.0f, 0.0f);
        this.bBp = new ag(this, 8, 15);
        this.bBp.a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.bBp.g(3.0f, 17.0f, -1.0f);
        this.bBp.bBK = true;
        this.b(this.bBp, -0.17453292f, 0.0f, 0.0f);
        this.bBq = new ag(this, 0, 15);
        this.bBq.a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.bBq.g(-3.0f, 17.0f, -1.0f);
        this.bBq.bBK = true;
        this.b(this.bBq, -0.17453292f, 0.0f, 0.0f);
        this.bBr = new ag(this, 32, 0);
        this.bBr.a(-2.5f, -4.0f, -5.0f, 5, 4, 5);
        this.bBr.g(0.0f, 16.0f, -1.0f);
        this.bBr.bBK = true;
        this.b(this.bBr, 0.0f, 0.0f, 0.0f);
        this.bBs = new ag(this, 52, 0);
        this.bBs.a(-2.5f, -9.0f, -1.0f, 2, 5, 1);
        this.bBs.g(0.0f, 16.0f, -1.0f);
        this.bBs.bBK = true;
        this.b(this.bBs, 0.0f, -0.2617994f, 0.0f);
        this.bBt = new ag(this, 58, 0);
        this.bBt.a(0.5f, -9.0f, -1.0f, 2, 5, 1);
        this.bBt.g(0.0f, 16.0f, -1.0f);
        this.bBt.bBK = true;
        this.b(this.bBt, 0.0f, 0.2617994f, 0.0f);
        this.bBu = new ag(this, 52, 6);
        this.bBu.a(-1.5f, -1.5f, 0.0f, 3, 3, 2);
        this.bBu.g(0.0f, 20.0f, 7.0f);
        this.bBu.bBK = true;
        this.b(this.bBu, -0.3490659f, 0.0f, 0.0f);
        this.bBv = new ag(this, 32, 9);
        this.bBv.a(-0.5f, -2.5f, -5.5f, 1, 1, 1);
        this.bBv.g(0.0f, 16.0f, -1.0f);
        this.bBv.bBK = true;
        this.b(this.bBv, 0.0f, 0.0f, 0.0f);
    }

    private void b(ag ag2, float f2, float f3, float f4) {
        ag2.bBF = f2;
        ag2.bBG = f3;
        ag2.bBH = f4;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.JV();
            GlStateManager.j(0.0f, 5.0f * f7, 2.0f * f7);
            this.bBr.aa(f7);
            this.bBt.aa(f7);
            this.bBs.aa(f7);
            this.bBv.aa(f7);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
            this.bBk.aa(f7);
            this.bBl.aa(f7);
            this.bBm.aa(f7);
            this.bBn.aa(f7);
            this.bBo.aa(f7);
            this.bBp.aa(f7);
            this.bBq.aa(f7);
            this.bBu.aa(f7);
            GlStateManager.JW();
        } else {
            this.bBk.aa(f7);
            this.bBl.aa(f7);
            this.bBm.aa(f7);
            this.bBn.aa(f7);
            this.bBo.aa(f7);
            this.bBp.aa(f7);
            this.bBq.aa(f7);
            this.bBr.aa(f7);
            this.bBs.aa(f7);
            this.bBt.aa(f7);
            this.bBu.aa(f7);
            this.bBv.aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        float f8 = f4 - (float)c2.aRg;
        l l2 = (l)c2;
        this.bBs.bBF = this.bBt.bBF = f6 * ((float)Math.PI / 180);
        this.bBr.bBF = this.bBt.bBF;
        this.bBv.bBF = this.bBt.bBF;
        this.bBv.bBG = this.bBr.bBG = f5 * ((float)Math.PI / 180);
        this.bBs.bBG = this.bBv.bBG - 0.2617994f;
        this.bBt.bBG = this.bBv.bBG + 0.2617994f;
        this.bBw = bt.bx(l2.bn(f8) * (float)Math.PI);
        this.bBm.bBF = this.bBn.bBF = (this.bBw * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.bBk.bBF = this.bBl.bBF = this.bBw * 50.0f * ((float)Math.PI / 180);
        this.bBp.bBF = this.bBq.bBF = (this.bBw * -40.0f - 11.0f) * ((float)Math.PI / 180);
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
    }
}

