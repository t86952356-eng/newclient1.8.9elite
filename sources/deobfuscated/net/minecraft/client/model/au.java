/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class au
extends d {
    public ag bCR;
    public ag bCS;
    public ag bCT;
    public ag bCU;
    public ag bCV;
    public ag bCW;
    ag bCX;
    ag bCY;

    public au() {
        float f2 = 0.0f;
        float f3 = 13.5f;
        this.bCR = new ag(this, 0, 0);
        this.bCR.a(-3.0f, -3.0f, -2.0f, 6, 6, 4, 0.0f);
        this.bCR.g(-1.0f, 13.5f, -7.0f);
        this.bCS = new ag(this, 18, 14);
        this.bCS.a(-4.0f, -2.0f, -3.0f, 6, 9, 6, 0.0f);
        this.bCS.g(0.0f, 14.0f, 2.0f);
        this.bCY = new ag(this, 21, 0);
        this.bCY.a(-4.0f, -3.0f, -3.0f, 8, 6, 7, 0.0f);
        this.bCY.g(-1.0f, 14.0f, 2.0f);
        this.bCT = new ag(this, 0, 18);
        this.bCT.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.bCT.g(-2.5f, 16.0f, 7.0f);
        this.bCU = new ag(this, 0, 18);
        this.bCU.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.bCU.g(0.5f, 16.0f, 7.0f);
        this.bCV = new ag(this, 0, 18);
        this.bCV.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.bCV.g(-2.5f, 16.0f, -4.0f);
        this.bCW = new ag(this, 0, 18);
        this.bCW.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.bCW.g(0.5f, 16.0f, -4.0f);
        this.bCX = new ag(this, 9, 18);
        this.bCX.a(-1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.bCX.g(-1.0f, 12.0f, 8.0f);
        this.bCR.C(16, 14).a(-3.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.bCR.C(16, 14).a(1.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.bCR.C(0, 10).a(-1.5f, 0.0f, -5.0f, 3, 3, 4, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(c2, f2, f3, f4, f5, f6, f7);
        this.a(f2, f3, f4, f5, f6, f7, c2);
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.JV();
            GlStateManager.j(0.0f, 5.0f * f7, 2.0f * f7);
            this.bCR.ab(f7);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
            this.bCS.aa(f7);
            this.bCT.aa(f7);
            this.bCU.aa(f7);
            this.bCV.aa(f7);
            this.bCW.aa(f7);
            this.bCX.ab(f7);
            this.bCY.aa(f7);
            GlStateManager.JW();
        } else {
            this.bCR.ab(f7);
            this.bCS.aa(f7);
            this.bCT.aa(f7);
            this.bCU.aa(f7);
            this.bCV.aa(f7);
            this.bCW.aa(f7);
            this.bCX.ab(f7);
            this.bCY.aa(f7);
        }
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        ai ai2 = (ai)r2;
        this.bCX.bBG = ai2.ZF() ? 0.0f : bt.bB(f2 * 0.6662f) * 1.4f * f3;
        if (ai2.abm()) {
            this.bCY.g(-1.0f, 16.0f, -3.0f);
            this.bCY.bBF = 1.2566371f;
            this.bCY.bBG = 0.0f;
            this.bCS.g(0.0f, 18.0f, 0.0f);
            this.bCS.bBF = 0.7853982f;
            this.bCX.g(-1.0f, 21.0f, 6.0f);
            this.bCT.g(-2.5f, 22.0f, 2.0f);
            this.bCT.bBF = 4.712389f;
            this.bCU.g(0.5f, 22.0f, 2.0f);
            this.bCU.bBF = 4.712389f;
            this.bCV.bBF = 5.811947f;
            this.bCV.g(-2.49f, 17.0f, -4.0f);
            this.bCW.bBF = 5.811947f;
            this.bCW.g(0.51f, 17.0f, -4.0f);
        } else {
            this.bCS.g(0.0f, 14.0f, 2.0f);
            this.bCS.bBF = 1.5707964f;
            this.bCY.g(-1.0f, 14.0f, -3.0f);
            this.bCY.bBF = this.bCS.bBF;
            this.bCX.g(-1.0f, 12.0f, 8.0f);
            this.bCT.g(-2.5f, 16.0f, 7.0f);
            this.bCU.g(0.5f, 16.0f, 7.0f);
            this.bCV.g(-2.5f, 16.0f, -4.0f);
            this.bCW.g(0.5f, 16.0f, -4.0f);
            this.bCT.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
            this.bCU.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.bCV.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.bCW.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
        }
        this.bCR.bBH = ai2.br(f4) + ai2.v(f4, 0.0f);
        this.bCY.bBH = ai2.v(f4, -0.08f);
        this.bCS.bBH = ai2.v(f4, -0.16f);
        this.bCX.bBH = ai2.v(f4, -0.2f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCR.bBF = f6 / 57.295776f;
        this.bCR.bBG = f5 / 57.295776f;
        this.bCX.bBF = f4;
    }
}

