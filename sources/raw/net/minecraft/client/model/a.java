/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;

public class a
extends b {
    public ag byh;
    public ag byi;
    public ag byj;
    public ag byk;

    public a() {
        this(0.0f);
    }

    public a(float f2) {
        super(f2, 64, 64);
        this.byA = new ag(this, 0, 0);
        this.byA.a(-1.0f, -7.0f, -1.0f, 2, 7, 2, f2);
        this.byA.g(0.0f, 0.0f, 0.0f);
        this.byC = new ag(this, 0, 26);
        this.byC.a(-6.0f, 0.0f, -1.5f, 12, 3, 3, f2);
        this.byC.g(0.0f, 0.0f, 0.0f);
        this.byD = new ag(this, 24, 0);
        this.byD.a(-2.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.byD.g(-5.0f, 2.0f, 0.0f);
        this.byE = new ag(this, 32, 16);
        this.byE.bBK = true;
        this.byE.a(0.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.byE.g(5.0f, 2.0f, 0.0f);
        this.byF = new ag(this, 8, 0);
        this.byF.a(-1.0f, 0.0f, -1.0f, 2, 11, 2, f2);
        this.byF.g(-1.9f, 12.0f, 0.0f);
        this.byG = new ag(this, 40, 16);
        this.byG.bBK = true;
        this.byG.a(-1.0f, 0.0f, -1.0f, 2, 11, 2, f2);
        this.byG.g(1.9f, 12.0f, 0.0f);
        this.byh = new ag(this, 16, 0);
        this.byh.a(-3.0f, 3.0f, -1.0f, 2, 7, 2, f2);
        this.byh.g(0.0f, 0.0f, 0.0f);
        this.byh.bBL = true;
        this.byi = new ag(this, 48, 16);
        this.byi.a(1.0f, 3.0f, -1.0f, 2, 7, 2, f2);
        this.byi.g(0.0f, 0.0f, 0.0f);
        this.byj = new ag(this, 0, 48);
        this.byj.a(-4.0f, 10.0f, -1.0f, 8, 2, 2, f2);
        this.byj.g(0.0f, 0.0f, 0.0f);
        this.byk = new ag(this, 0, 32);
        this.byk.a(-6.0f, 11.0f, -6.0f, 12, 1, 12, f2);
        this.byk.g(0.0f, 12.0f, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        if (c2 instanceof net.minecraft.entity.item.a) {
            net.minecraft.entity.item.a a2 = (net.minecraft.entity.item.a)c2;
            this.byE.bBL = a2.XR();
            this.byD.bBL = a2.XR();
            this.byk.bBL = !a2.XS();
            this.byG.g(1.9f, 12.0f, 0.0f);
            this.byF.g(-1.9f, 12.0f, 0.0f);
            this.byh.bBF = (float)Math.PI / 180 * a2.XV().getX();
            this.byh.bBG = (float)Math.PI / 180 * a2.XV().getY();
            this.byh.bBH = (float)Math.PI / 180 * a2.XV().getZ();
            this.byi.bBF = (float)Math.PI / 180 * a2.XV().getX();
            this.byi.bBG = (float)Math.PI / 180 * a2.XV().getY();
            this.byi.bBH = (float)Math.PI / 180 * a2.XV().getZ();
            this.byj.bBF = (float)Math.PI / 180 * a2.XV().getX();
            this.byj.bBG = (float)Math.PI / 180 * a2.XV().getY();
            this.byj.bBH = (float)Math.PI / 180 * a2.XV().getZ();
            float f8 = (a2.XY().getX() + a2.XZ().getX()) / 2.0f;
            float f9 = (a2.XY().getY() + a2.XZ().getY()) / 2.0f;
            float f10 = (a2.XY().getZ() + a2.XZ().getZ()) / 2.0f;
            this.byk.bBF = 0.0f;
            this.byk.bBG = (float)Math.PI / 180 * -c2.pl;
            this.byk.bBH = 0.0f;
        }
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(c2, f2, f3, f4, f5, f6, f7);
        GlStateManager.JV();
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
            this.byh.aa(f7);
            this.byi.aa(f7);
            this.byj.aa(f7);
            this.byk.aa(f7);
        } else {
            if (c2.isSneaking()) {
                GlStateManager.j(0.0f, 0.2f, 0.0f);
            }
            this.byh.aa(f7);
            this.byi.aa(f7);
            this.byj.aa(f7);
            this.byk.aa(f7);
        }
        GlStateManager.JW();
    }

    @Override
    public void X(float f2) {
        boolean bl2 = this.byD.bBL;
        this.byD.bBL = true;
        super.X(f2);
        this.byD.bBL = bl2;
    }
}

