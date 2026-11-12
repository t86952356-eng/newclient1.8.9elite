/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.ar;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class as
extends ar {
    public boolean bCM;
    private final ag bCN = new ag(this).D(64, 128);
    private final ag bCO;

    public as(float f2) {
        super(f2, 0.0f, 64, 128);
        this.bCN.g(0.0f, -2.0f, 0.0f);
        this.bCN.C(0, 0).a(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.bCL.a(this.bCN);
        this.bCO = new ag(this).D(64, 128);
        this.bCO.g(-5.0f, -10.03125f, -5.0f);
        this.bCO.C(0, 64).a(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.bCG.a(this.bCO);
        ag ag2 = new ag(this).D(64, 128);
        ag2.g(1.75f, -4.0f, 2.0f);
        ag2.C(0, 76).a(0.0f, 0.0f, 0.0f, 7, 4, 7);
        ag2.bBF = -0.05235988f;
        ag2.bBH = 0.02617994f;
        this.bCO.a(ag2);
        ag ag3 = new ag(this).D(64, 128);
        ag3.g(1.75f, -4.0f, 2.0f);
        ag3.C(0, 87).a(0.0f, 0.0f, 0.0f, 4, 4, 4);
        ag3.bBF = -0.10471976f;
        ag3.bBH = 0.05235988f;
        ag2.a(ag3);
        ag ag4 = new ag(this).D(64, 128);
        ag4.g(1.75f, -2.0f, 2.0f);
        ag4.C(0, 95).a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        ag4.bBF = -0.20943952f;
        ag4.bBH = 0.10471976f;
        ag3.a(ag4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCL.bBT = 0.0f;
        this.bCL.bBS = 0.0f;
        this.bCL.bBR = 0.0f;
        float f8 = 0.01f * (float)(c2.getEntityId() % 10);
        this.bCL.bBF = bt.bx((float)c2.aRg * f8) * 4.5f * (float)Math.PI / 180.0f;
        this.bCL.bBG = 0.0f;
        this.bCL.bBH = bt.bB((float)c2.aRg * f8) * 2.5f * (float)Math.PI / 180.0f;
        if (this.bCM) {
            this.bCL.bBF = -0.9f;
            this.bCL.bBT = -0.09375f;
            this.bCL.bBS = 0.1875f;
        }
    }
}

