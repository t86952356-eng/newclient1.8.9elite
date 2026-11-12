/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class f
extends d {
    public ag byA;
    public ag byB;
    public ag byC;
    public ag byD;
    public ag byE;
    public ag byF;
    public ag byG;
    public int byH;
    public int kc;
    public boolean byI;
    public boolean byJ;

    public f() {
        this(0.0f);
    }

    public f(float f2) {
        this(f2, 0.0f, 64, 32);
    }

    public f(float f2, float f3, int n2, int n3) {
        this.bys = n2;
        this.byt = n3;
        this.byA = new ag(this, 0, 0);
        this.byA.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2);
        this.byA.g(0.0f, 0.0f + f3, 0.0f);
        this.byB = new ag(this, 32, 0);
        this.byB.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 + 0.5f);
        this.byB.g(0.0f, 0.0f + f3, 0.0f);
        this.byC = new ag(this, 16, 16);
        this.byC.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.byC.g(0.0f, 0.0f + f3, 0.0f);
        this.byD = new ag(this, 40, 16);
        this.byD.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.byD.g(-5.0f, 2.0f + f3, 0.0f);
        this.byE = new ag(this, 40, 16);
        this.byE.bBK = true;
        this.byE.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.byE.g(5.0f, 2.0f + f3, 0.0f);
        this.byF = new ag(this, 0, 16);
        this.byF.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.byF.g(-1.9f, 12.0f + f3, 0.0f);
        this.byG = new ag(this, 0, 16);
        this.byG.bBK = true;
        this.byG.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.byG.g(1.9f, 12.0f + f3, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        GlStateManager.JV();
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.i(0.75f, 0.75f, 0.75f);
            GlStateManager.j(0.0f, 16.0f * f7, 0.0f);
            this.byA.aa(f7);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
        } else {
            if (c2.isSneaking()) {
                GlStateManager.j(0.0f, 0.2f, 0.0f);
            }
            this.byA.aa(f7);
        }
        this.byC.aa(f7);
        this.byD.aa(f7);
        this.byE.aa(f7);
        this.byF.aa(f7);
        this.byG.aa(f7);
        this.byB.aa(f7);
        GlStateManager.JW();
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        float f8;
        float f9;
        this.byA.bBG = f5 / 57.295776f;
        this.byA.bBF = f6 / 57.295776f;
        net.minecraft.client.entity.c c3 = Minecraft.getMinecraft().bgK;
        if (c2 == c3) {
            this.byA.bBF = (c3.bkw + (c3.po - c3.bkw) * Minecraft.getMinecraft().bgC.bWY) / 57.295776f;
        }
        this.byD.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 2.0f * f3 * 0.5f;
        this.byE.bBF = bt.bB(f2 * 0.6662f) * 2.0f * f3 * 0.5f;
        this.byE.bBH = 0.0f;
        this.byF.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
        this.byG.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.byF.bBG = 0.0f;
        this.byG.bBG = 0.0f;
        if (this.byo) {
            this.byD.bBF += -0.62831855f;
            this.byE.bBF += -0.62831855f;
            this.byF.bBF = -1.2566371f;
            this.byG.bBF = -1.2566371f;
            this.byF.bBG = 0.31415927f;
            this.byG.bBG = -0.31415927f;
        }
        if (this.byH != 0) {
            this.byE.bBF = this.byE.bBF * 0.5f - 0.31415927f * (float)this.byH;
        }
        this.byD.bBG = 0.0f;
        this.byD.bBH = 0.0f;
        switch (this.kc) {
            default: {
                break;
            }
            case 1: {
                this.byD.bBF = this.byD.bBF * 0.5f - 0.31415927f * (float)this.kc;
                break;
            }
            case 3: {
                this.byD.bBF = this.byD.bBF * 0.5f - 0.31415927f * (float)this.kc;
            }
        }
        this.byE.bBG = 0.0f;
        if (this.km > -9990.0f) {
            f9 = this.km;
            this.byC.bBG = bt.bx(bt.bK(f9) * (float)Math.PI * 2.0f) * 0.2f;
            this.byD.bBE = bt.bx(this.byC.bBG) * 5.0f;
            this.byD.bBC = -bt.bB(this.byC.bBG) * 5.0f;
            this.byE.bBE = -bt.bx(this.byC.bBG) * 5.0f;
            this.byE.bBC = bt.bB(this.byC.bBG) * 5.0f;
            this.byD.bBG += this.byC.bBG;
            this.byE.bBG += this.byC.bBG;
            this.byE.bBF += this.byC.bBG;
            f9 = 1.0f - this.km;
            f9 *= f9;
            f9 *= f9;
            f9 = 1.0f - f9;
            f8 = bt.bx(f9 * (float)Math.PI);
            float f10 = bt.bx(this.km * (float)Math.PI) * -(this.byA.bBF - 0.7f) * 0.75f;
            this.byD.bBF = (float)((double)this.byD.bBF - ((double)f8 * 1.2 + (double)f10));
            this.byD.bBG += this.byC.bBG * 2.0f;
            this.byD.bBH += bt.bx(this.km * (float)Math.PI) * -0.4f;
        }
        if (this.byI) {
            this.byC.bBF = 0.5f;
            this.byD.bBF += 0.4f;
            this.byE.bBF += 0.4f;
            this.byF.bBE = 4.0f;
            this.byG.bBE = 4.0f;
            this.byF.bBD = 9.0f;
            this.byG.bBD = 9.0f;
            this.byA.bBD = 1.0f;
        } else {
            this.byC.bBF = 0.0f;
            this.byF.bBE = 0.1f;
            this.byG.bBE = 0.1f;
            this.byF.bBD = 12.0f;
            this.byG.bBD = 12.0f;
            this.byA.bBD = 0.0f;
        }
        this.byD.bBH += bt.bB(f4 * 0.09f) * 0.05f + 0.05f;
        this.byE.bBH -= bt.bB(f4 * 0.09f) * 0.05f + 0.05f;
        this.byD.bBF += bt.bx(f4 * 0.067f) * 0.05f;
        this.byE.bBF -= bt.bx(f4 * 0.067f) * 0.05f;
        if (this.byJ) {
            f9 = 0.0f;
            f8 = 0.0f;
            this.byD.bBH = 0.0f;
            this.byE.bBH = 0.0f;
            this.byD.bBG = -0.1f + this.byA.bBG;
            this.byE.bBG = 0.1f + this.byA.bBG + 0.4f;
            this.byD.bBF = -1.5707964f + this.byA.bBF;
            this.byE.bBF = -1.5707964f + this.byA.bBF;
            this.byD.bBF -= 0.0f;
            this.byE.bBF -= 0.0f;
            this.byD.bBH += bt.bB(f4 * 0.09f) * 0.05f + 0.05f;
            this.byE.bBH -= bt.bB(f4 * 0.09f) * 0.05f + 0.05f;
            this.byD.bBF += bt.bx(f4 * 0.067f) * 0.05f;
            this.byE.bBF -= bt.bx(f4 * 0.067f) * 0.05f;
        }
        f.a(this.byA, this.byB);
    }

    @Override
    public void a(d d2) {
        super.a(d2);
        if (d2 instanceof f) {
            f f2 = (f)d2;
            this.byH = f2.byH;
            this.kc = f2.kc;
            this.byI = f2.byI;
            this.byJ = f2.byJ;
        }
    }

    public void ak(boolean bl2) {
        this.byA.bBL = bl2;
        this.byB.bBL = bl2;
        this.byC.bBL = bl2;
        this.byD.bBL = bl2;
        this.byE.bBL = bl2;
        this.byF.bBL = bl2;
        this.byG.bBL = bl2;
    }

    public void X(float f2) {
        this.byD.ac(f2);
    }
}

