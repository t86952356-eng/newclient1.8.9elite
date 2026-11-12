/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class ae
extends d {
    public ag bzg = new ag(this, 0, 0);
    public ag bzh;
    public ag bzp;
    public ag bzq;
    public ag bzr;
    public ag bzs;
    protected float bBi = 8.0f;
    protected float bBj = 4.0f;

    public ae(int n2, float f2) {
        this.bzg.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f2);
        this.bzg.g(0.0f, 18 - n2, -6.0f);
        this.bzh = new ag(this, 28, 8);
        this.bzh.a(-5.0f, -10.0f, -7.0f, 10, 16, 8, f2);
        this.bzh.g(0.0f, 17 - n2, 2.0f);
        this.bzp = new ag(this, 0, 16);
        this.bzp.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.bzp.g(-3.0f, 24 - n2, 7.0f);
        this.bzq = new ag(this, 0, 16);
        this.bzq.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.bzq.g(3.0f, 24 - n2, 7.0f);
        this.bzr = new ag(this, 0, 16);
        this.bzr.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.bzr.g(-3.0f, 24 - n2, -5.0f);
        this.bzs = new ag(this, 0, 16);
        this.bzs.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.bzs.g(3.0f, 24 - n2, -5.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.JV();
            GlStateManager.j(0.0f, this.bBi * f7, this.bBj * f7);
            this.bzg.aa(f7);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
            this.bzh.aa(f7);
            this.bzp.aa(f7);
            this.bzq.aa(f7);
            this.bzr.aa(f7);
            this.bzs.aa(f7);
            GlStateManager.JW();
        } else {
            this.bzg.aa(f7);
            this.bzh.aa(f7);
            this.bzp.aa(f7);
            this.bzq.aa(f7);
            this.bzr.aa(f7);
            this.bzs.aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        float f8 = 57.295776f;
        this.bzg.bBF = f6 / 57.295776f;
        this.bzg.bBG = f5 / 57.295776f;
        this.bzh.bBF = 1.5707964f;
        this.bzp.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
        this.bzq.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.bzr.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.bzs.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
    }
}

