/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class i
extends d {
    public ag byN = new ag(this).C(0, 0).a(-6.0f, -5.0f, 0.0f, 6, 10, 0);
    public ag byO = new ag(this).C(16, 0).a(0.0f, -5.0f, 0.0f, 6, 10, 0);
    public ag byP = new ag(this).C(0, 10).a(0.0f, -4.0f, -0.99f, 5, 8, 1);
    public ag byQ = new ag(this).C(12, 10).a(0.0f, -4.0f, -0.01f, 5, 8, 1);
    public ag byR = new ag(this).C(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
    public ag byS = new ag(this).C(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
    public ag byT = new ag(this).C(12, 0).a(-1.0f, -5.0f, 0.0f, 2, 10, 0);

    public i() {
        this.byN.g(0.0f, 0.0f, -1.0f);
        this.byO.g(0.0f, 0.0f, 1.0f);
        this.byT.bBG = 1.5707964f;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.byN.aa(f7);
        this.byO.aa(f7);
        this.byT.aa(f7);
        this.byP.aa(f7);
        this.byQ.aa(f7);
        this.byR.aa(f7);
        this.byS.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        float f8 = (bt.bx(f2 * 0.02f) * 0.1f + 1.25f) * f5;
        this.byN.bBG = (float)Math.PI + f8;
        this.byO.bBG = -f8;
        this.byP.bBG = f8;
        this.byQ.bBG = -f8;
        this.byR.bBG = f8 - f8 * 2.0f * f3;
        this.byS.bBG = f8 - f8 * 2.0f * f4;
        this.byP.bBC = bt.bx(f8);
        this.byQ.bBC = bt.bx(f8);
        this.byR.bBC = bt.bx(f8);
        this.byS.bBC = bt.bx(f8);
    }
}

