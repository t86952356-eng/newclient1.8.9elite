/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;
import net.minecraft.util.bt;

public class l
extends d {
    public ag bzg;
    public ag bzh;
    public ag bzi;
    public ag bzj;
    public ag bzk;
    public ag bzl;
    public ag bzm;
    public ag bzn;

    public l() {
        int n2 = 16;
        this.bzg = new ag(this, 0, 0);
        this.bzg.a(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.bzg.g(0.0f, 15.0f, -4.0f);
        this.bzm = new ag(this, 14, 0);
        this.bzm.a(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.bzm.g(0.0f, 15.0f, -4.0f);
        this.bzn = new ag(this, 14, 4);
        this.bzn.a(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.bzn.g(0.0f, 15.0f, -4.0f);
        this.bzh = new ag(this, 0, 9);
        this.bzh.a(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.bzh.g(0.0f, 16.0f, 0.0f);
        this.bzi = new ag(this, 26, 0);
        this.bzi.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.bzi.g(-2.0f, 19.0f, 1.0f);
        this.bzj = new ag(this, 26, 0);
        this.bzj.a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.bzj.g(1.0f, 19.0f, 1.0f);
        this.bzk = new ag(this, 24, 13);
        this.bzk.a(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.bzk.g(-4.0f, 13.0f, 0.0f);
        this.bzl = new ag(this, 24, 13);
        this.bzl.a(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.bzl.g(4.0f, 13.0f, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, c2);
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.JV();
            GlStateManager.j(0.0f, 5.0f * f7, 2.0f * f7);
            this.bzg.aa(f7);
            this.bzm.aa(f7);
            this.bzn.aa(f7);
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
            this.bzh.aa(f7);
            this.bzi.aa(f7);
            this.bzj.aa(f7);
            this.bzk.aa(f7);
            this.bzl.aa(f7);
            GlStateManager.JW();
        } else {
            this.bzg.aa(f7);
            this.bzm.aa(f7);
            this.bzn.aa(f7);
            this.bzh.aa(f7);
            this.bzi.aa(f7);
            this.bzj.aa(f7);
            this.bzk.aa(f7);
            this.bzl.aa(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        this.bzg.bBF = f6 / 57.295776f;
        this.bzg.bBG = f5 / 57.295776f;
        this.bzm.bBF = this.bzg.bBF;
        this.bzm.bBG = this.bzg.bBG;
        this.bzn.bBF = this.bzg.bBF;
        this.bzn.bBG = this.bzg.bBG;
        this.bzh.bBF = 1.5707964f;
        this.bzi.bBF = bt.bB(f2 * 0.6662f) * 1.4f * f3;
        this.bzj.bBF = bt.bB(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.bzk.bBH = f4;
        this.bzl.bBH = -f4;
    }
}

