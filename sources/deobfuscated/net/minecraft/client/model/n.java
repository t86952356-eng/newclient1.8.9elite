/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class n
extends d {
    public ag bzg;
    public ag bzo;
    public ag bzh;
    public ag bzp;
    public ag bzq;
    public ag bzr;
    public ag bzs;

    public n() {
        this(0.0f);
    }

    public n(float f2) {
        int n2 = 6;
        this.bzg = new ag(this, 0, 0);
        this.bzg.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2);
        this.bzg.g(0.0f, 6.0f, 0.0f);
        this.bzo = new ag(this, 32, 0);
        this.bzo.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 + 0.5f);
        this.bzo.g(0.0f, 6.0f, 0.0f);
        this.bzh = new ag(this, 16, 16);
        this.bzh.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.bzh.g(0.0f, 6.0f, 0.0f);
        this.bzp = new ag(this, 0, 16);
        this.bzp.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.bzp.g(-2.0f, 18.0f, 4.0f);
        this.bzq = new ag(this, 0, 16);
        this.bzq.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.bzq.g(2.0f, 18.0f, 4.0f);
        this.bzr = new ag(this, 0, 16);
        this.bzr.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.bzr.g(-2.0f, 18.0f, -4.0f);
        this.bzs = new ag(this, 0, 16);
        this.bzs.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.bzs.g(2.0f, 18.0f, -4.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        this.bzg.aa(f7);
        this.bzh.aa(f7);
        this.bzp.aa(f7);
        this.bzq.aa(f7);
        this.bzr.aa(f7);
        this.bzs.aa(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        this.bzg.bBG = f5 / 57.295776f;
        this.bzg.bBF = f6 / 57.295776f;
        this.bzp.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
        this.bzq.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.bzr.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.bzs.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
    }
}

