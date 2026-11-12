/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class ao
extends d {
    public ag bzh;
    public ag bCq;
    public ag bzg;
    public ag bCr;
    public ag bCs;

    public ao() {
        float f2 = 4.0f;
        float f3 = 0.0f;
        this.bzg = new ag(this, 0, 0).D(64, 64);
        this.bzg.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.5f);
        this.bzg.g(0.0f, 4.0f, 0.0f);
        this.bCr = new ag(this, 32, 0).D(64, 64);
        this.bCr.a(-1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        this.bCr.g(0.0f, 6.0f, 0.0f);
        this.bCs = new ag(this, 32, 0).D(64, 64);
        this.bCs.a(-1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        this.bCs.g(0.0f, 6.0f, 0.0f);
        this.bzh = new ag(this, 0, 16).D(64, 64);
        this.bzh.a(-5.0f, -10.0f, -5.0f, 10, 10, 10, -0.5f);
        this.bzh.g(0.0f, 13.0f, 0.0f);
        this.bCq = new ag(this, 0, 36).D(64, 64);
        this.bCq.a(-6.0f, -12.0f, -6.0f, 12, 12, 12, -0.5f);
        this.bCq.g(0.0f, 24.0f, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        this.bzg.bBG = f5 / 57.295776f;
        this.bzg.bBF = f6 / 57.295776f;
        this.bzh.bBG = f5 / 57.295776f * 0.25f;
        float f8 = bt.bx(this.bzh.bBG);
        float f9 = bt.bB(this.bzh.bBG);
        this.bCr.bBH = 1.0f;
        this.bCs.bBH = -1.0f;
        this.bCr.bBG = 0.0f + this.bzh.bBG;
        this.bCs.bBG = (float)Math.PI + this.bzh.bBG;
        this.bCr.bBC = f9 * 5.0f;
        this.bCr.bBE = -f8 * 5.0f;
        this.bCs.bBC = -f9 * 5.0f;
        this.bCs.bBE = f8 * 5.0f;
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bzh.aa(f7);
        this.bCq.aa(f7);
        this.bzg.aa(f7);
        this.bCr.aa(f7);
        this.bCs.aa(f7);
    }
}

