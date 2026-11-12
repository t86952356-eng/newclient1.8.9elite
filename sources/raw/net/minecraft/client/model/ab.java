/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.j;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class ab
extends d {
    ag bAR;
    ag bAS;
    ag bAT;
    ag bAU;
    ag bAV;
    ag bAW;
    ag bAX;
    ag bAY;
    int bAZ = 1;

    public ab() {
        this.f("head.main", 0, 0);
        this.f("head.nose", 0, 24);
        this.f("head.ear1", 0, 10);
        this.f("head.ear2", 6, 10);
        this.bAX = new ag(this, "head");
        this.bAX.a("main", -2.5f, -2.0f, -3.0f, 5, 4, 5);
        this.bAX.a("nose", -1.5f, 0.0f, -4.0f, 3, 2, 2);
        this.bAX.a("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2);
        this.bAX.a("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2);
        this.bAX.g(0.0f, 15.0f, -9.0f);
        this.bAY = new ag(this, 20, 0);
        this.bAY.a(-2.0f, 3.0f, -8.0f, 4, 16, 6, 0.0f);
        this.bAY.g(0.0f, 12.0f, -10.0f);
        this.bAV = new ag(this, 0, 15);
        this.bAV.a(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.bAV.bBF = 0.9f;
        this.bAV.g(0.0f, 15.0f, 8.0f);
        this.bAW = new ag(this, 4, 15);
        this.bAW.a(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.bAW.g(0.0f, 20.0f, 14.0f);
        this.bAR = new ag(this, 8, 13);
        this.bAR.a(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.bAR.g(1.1f, 18.0f, 5.0f);
        this.bAS = new ag(this, 8, 13);
        this.bAS.a(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.bAS.g(-1.1f, 18.0f, 5.0f);
        this.bAT = new ag(this, 40, 0);
        this.bAT.a(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.bAT.g(1.2f, 13.8f, -5.0f);
        this.bAU = new ag(this, 40, 0);
        this.bAU.a(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.bAU.g(-1.2f, 13.8f, -5.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.JV();
            GlStateManager.i(0.75f, 0.75f, 0.75f);
            GlStateManager.j(0.0f, 10.0f * f7, 4.0f * f7);
            this.bAX.aa(f7);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
            this.bAY.aa(f7);
            this.bAR.aa(f7);
            this.bAS.aa(f7);
            this.bAT.aa(f7);
            this.bAU.aa(f7);
            this.bAV.aa(f7);
            this.bAW.aa(f7);
            GlStateManager.JW();
        } else {
            this.bAX.aa(f7);
            this.bAY.aa(f7);
            this.bAV.aa(f7);
            this.bAW.aa(f7);
            this.bAR.aa(f7);
            this.bAS.aa(f7);
            this.bAT.aa(f7);
            this.bAU.aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        this.bAX.bBF = f6 / 57.295776f;
        this.bAX.bBG = f5 / 57.295776f;
        if (this.bAZ != 3) {
            this.bAY.bBF = 1.5707964f;
            if (this.bAZ == 2) {
                this.bAR.bBF = bt.bB(f2 * 0.6662f) * 1.0f * f3;
                this.bAS.bBF = bt.bB(f2 * 0.6662f + 0.3f) * 1.0f * f3;
                this.bAT.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI + 0.3f) * 1.0f * f3;
                this.bAU.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.0f * f3;
                this.bAW.bBF = 1.7278761f + 0.31415927f * bt.bB(f2) * f3;
            } else {
                this.bAR.bBF = bt.bB(f2 * 0.6662f) * 1.0f * f3;
                this.bAS.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.0f * f3;
                this.bAT.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.0f * f3;
                this.bAU.bBF = bt.bB(f2 * 0.6662f) * 1.0f * f3;
                this.bAW.bBF = this.bAZ == 1 ? 1.7278761f + 0.7853982f * bt.bB(f2) * f3 : 1.7278761f + 0.47123894f * bt.bB(f2) * f3;
            }
        }
    }

    @Override
    public void a(r r2, float f2, float f3, float f4) {
        j j2 = (j)r2;
        this.bAY.bBD = 12.0f;
        this.bAY.bBE = -10.0f;
        this.bAX.bBD = 15.0f;
        this.bAX.bBE = -9.0f;
        this.bAV.bBD = 15.0f;
        this.bAV.bBE = 8.0f;
        this.bAW.bBD = 20.0f;
        this.bAW.bBE = 14.0f;
        this.bAU.bBD = 13.8f;
        this.bAT.bBD = 13.8f;
        this.bAU.bBE = -5.0f;
        this.bAT.bBE = -5.0f;
        this.bAS.bBD = 18.0f;
        this.bAR.bBD = 18.0f;
        this.bAS.bBE = 5.0f;
        this.bAR.bBE = 5.0f;
        this.bAV.bBF = 0.9f;
        if (j2.isSneaking()) {
            this.bAY.bBD += 1.0f;
            this.bAX.bBD += 2.0f;
            this.bAV.bBD += 1.0f;
            this.bAW.bBD += -4.0f;
            this.bAW.bBE += 2.0f;
            this.bAV.bBF = 1.5707964f;
            this.bAW.bBF = 1.5707964f;
            this.bAZ = 0;
        } else if (j2.isSprinting()) {
            this.bAW.bBD = this.bAV.bBD;
            this.bAW.bBE += 2.0f;
            this.bAV.bBF = 1.5707964f;
            this.bAW.bBF = 1.5707964f;
            this.bAZ = 2;
        } else if (j2.abm()) {
            this.bAY.bBF = 0.7853982f;
            this.bAY.bBD += -4.0f;
            this.bAY.bBE += 5.0f;
            this.bAX.bBD += -3.3f;
            this.bAX.bBE += 1.0f;
            this.bAV.bBD += 8.0f;
            this.bAV.bBE += -2.0f;
            this.bAW.bBD += 2.0f;
            this.bAW.bBE += -0.8f;
            this.bAV.bBF = 1.7278761f;
            this.bAW.bBF = 2.670354f;
            this.bAU.bBF = -0.15707964f;
            this.bAT.bBF = -0.15707964f;
            this.bAU.bBD = 15.8f;
            this.bAT.bBD = 15.8f;
            this.bAU.bBE = -7.0f;
            this.bAT.bBE = -7.0f;
            this.bAS.bBF = -1.5707964f;
            this.bAR.bBF = -1.5707964f;
            this.bAS.bBD = 21.0f;
            this.bAR.bBD = 21.0f;
            this.bAS.bBE = 1.0f;
            this.bAR.bBE = 1.0f;
            this.bAZ = 3;
        } else {
            this.bAZ = 1;
        }
    }
}

