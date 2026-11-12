/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class ar
extends d {
    public ag bCG;
    public ag bCH;
    public ag bCI;
    public ag bCJ;
    public ag bCK;
    public ag bCL;

    public ar(float f2) {
        this(f2, 0.0f, 64, 64);
    }

    public ar(float f2, float f3, int n2, int n3) {
        this.bCG = new ag(this).D(n2, n3);
        this.bCG.g(0.0f, 0.0f + f3, 0.0f);
        this.bCG.C(0, 0).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, f2);
        this.bCL = new ag(this).D(n2, n3);
        this.bCL.g(0.0f, f3 - 2.0f, 0.0f);
        this.bCL.C(24, 0).a(-1.0f, -1.0f, -6.0f, 2, 4, 2, f2);
        this.bCG.a(this.bCL);
        this.bCH = new ag(this).D(n2, n3);
        this.bCH.g(0.0f, 0.0f + f3, 0.0f);
        this.bCH.C(16, 20).a(-4.0f, 0.0f, -3.0f, 8, 12, 6, f2);
        this.bCH.C(0, 38).a(-4.0f, 0.0f, -3.0f, 8, 18, 6, f2 + 0.5f);
        this.bCI = new ag(this).D(n2, n3);
        this.bCI.g(0.0f, 0.0f + f3 + 2.0f, 0.0f);
        this.bCI.C(44, 22).a(-8.0f, -2.0f, -2.0f, 4, 8, 4, f2);
        this.bCI.C(44, 22).a(4.0f, -2.0f, -2.0f, 4, 8, 4, f2);
        this.bCI.C(40, 38).a(-4.0f, 2.0f, -2.0f, 8, 4, 4, f2);
        this.bCJ = new ag(this, 0, 22).D(n2, n3);
        this.bCJ.g(-2.0f, 12.0f + f3, 0.0f);
        this.bCJ.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.bCK = new ag(this, 0, 22).D(n2, n3);
        this.bCK.bBK = true;
        this.bCK.g(2.0f, 12.0f + f3, 0.0f);
        this.bCK.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bCG.aa(f7);
        this.bCH.aa(f7);
        this.bCJ.aa(f7);
        this.bCK.aa(f7);
        this.bCI.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        this.bCG.bBG = f5 / 57.295776f;
        this.bCG.bBF = f6 / 57.295776f;
        this.bCI.bBD = 3.0f;
        this.bCI.bBE = -1.0f;
        this.bCI.bBF = -0.75f;
        this.bCJ.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3 * 0.5f;
        this.bCK.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3 * 0.5f;
        this.bCJ.bBG = 0.0f;
        this.bCK.bBG = 0.0f;
    }
}

