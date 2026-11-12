/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class e
extends d {
    private final ag byu;
    private final ag byv;
    private final ag byw;
    private final ag byx;
    private final ag byy;
    private final ag byz;

    public e() {
        this.bys = 64;
        this.byt = 64;
        this.byu = new ag(this, 0, 0);
        this.byu.a(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        ag ag2 = new ag(this, 24, 0);
        ag2.a(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.byu.a(ag2);
        ag ag3 = new ag(this, 24, 0);
        ag3.bBK = true;
        ag3.a(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.byu.a(ag3);
        this.byv = new ag(this, 0, 16);
        this.byv.a(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.byv.C(0, 34).a(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.byw = new ag(this, 42, 0);
        this.byw.a(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.byy = new ag(this, 24, 16);
        this.byy.g(-12.0f, 1.0f, 1.5f);
        this.byy.a(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.byx = new ag(this, 42, 0);
        this.byx.bBK = true;
        this.byx.a(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.byz = new ag(this, 24, 16);
        this.byz.bBK = true;
        this.byz.g(12.0f, 1.0f, 1.5f);
        this.byz.a(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.byv.a(this.byw);
        this.byv.a(this.byx);
        this.byw.a(this.byy);
        this.byx.a(this.byz);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.byu.aa(f7);
        this.byv.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        if (((net.minecraft.entity.passive.c)c2).ZV()) {
            float f8 = 57.295776f;
            this.byu.bBF = f6 / 57.295776f;
            this.byu.bBG = (float)Math.PI - f5 / 57.295776f;
            this.byu.bBH = (float)Math.PI;
            this.byu.g(0.0f, -2.0f, 0.0f);
            this.byw.g(-3.0f, 0.0f, 3.0f);
            this.byx.g(3.0f, 0.0f, 3.0f);
            this.byv.bBF = (float)Math.PI;
            this.byw.bBF = -0.15707964f;
            this.byw.bBG = -1.2566371f;
            this.byy.bBG = -1.7278761f;
            this.byx.bBF = this.byw.bBF;
            this.byx.bBG = -this.byw.bBG;
            this.byz.bBG = -this.byy.bBG;
        } else {
            float f9 = 57.295776f;
            this.byu.bBF = f6 / 57.295776f;
            this.byu.bBG = f5 / 57.295776f;
            this.byu.bBH = 0.0f;
            this.byu.g(0.0f, 0.0f, 0.0f);
            this.byw.g(0.0f, 0.0f, 0.0f);
            this.byx.g(0.0f, 0.0f, 0.0f);
            this.byv.bBF = 0.7853982f + bt.bB(f4 * 0.1f) * 0.15f;
            this.byv.bBG = 0.0f;
            this.byw.bBG = bt.bB(f4 * 1.3f) * (float)Math.PI * 0.25f;
            this.byx.bBG = -this.byw.bBG;
            this.byy.bBG = this.byw.bBG * 0.5f;
            this.byz.bBG = -this.byw.bBG * 0.5f;
        }
    }
}

