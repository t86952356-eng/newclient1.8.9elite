/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import hackclient.rise.a;
import hackclient.rise.ff;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.c;

public class ad
extends f {
    public ag bBa;
    public ag bBb;
    public ag bBc;
    public ag bBd;
    public ag bBe;
    private final ag bBf;
    private final ag bBg;
    private final boolean bBh;

    public ad(float f2, boolean bl2) {
        super(f2, 0.0f, 64, 64);
        this.bBh = bl2;
        this.bBg = new ag(this, 24, 0);
        this.bBg.a(-3.0f, -6.0f, -1.0f, 6, 6, 1, f2);
        this.bBf = new ag(this, 0, 0);
        this.bBf.D(64, 32);
        this.bBf.a(-5.0f, 0.0f, -1.0f, 10, 16, 1, f2);
        if (bl2) {
            this.byE = new ag(this, 32, 48);
            this.byE.a(-1.0f, -2.0f, -2.0f, 3, 12, 4, f2);
            this.byE.g(5.0f, 2.5f, 0.0f);
            this.byD = new ag(this, 40, 16);
            this.byD.a(-2.0f, -2.0f, -2.0f, 3, 12, 4, f2);
            this.byD.g(-5.0f, 2.5f, 0.0f);
            this.bBa = new ag(this, 48, 48);
            this.bBa.a(-1.0f, -2.0f, -2.0f, 3, 12, 4, f2 + 0.25f);
            this.bBa.g(5.0f, 2.5f, 0.0f);
            this.bBb = new ag(this, 40, 32);
            this.bBb.a(-2.0f, -2.0f, -2.0f, 3, 12, 4, f2 + 0.25f);
            this.bBb.g(-5.0f, 2.5f, 10.0f);
        } else {
            this.byE = new ag(this, 32, 48);
            this.byE.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
            this.byE.g(5.0f, 2.0f, 0.0f);
            this.bBa = new ag(this, 48, 48);
            this.bBa.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
            this.bBa.g(5.0f, 2.0f, 0.0f);
            this.bBb = new ag(this, 40, 32);
            this.bBb.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
            this.bBb.g(-5.0f, 2.0f, 10.0f);
        }
        this.byG = new ag(this, 16, 48);
        this.byG.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.byG.g(1.9f, 12.0f, 0.0f);
        this.bBc = new ag(this, 0, 48);
        this.bBc.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
        this.bBc.g(1.9f, 12.0f, 0.0f);
        this.bBd = new ag(this, 0, 32);
        this.bBd.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
        this.bBd.g(-1.9f, 12.0f, 0.0f);
        this.bBe = new ag(this, 16, 32);
        this.bBe.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2 + 0.25f);
        this.bBe.g(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(c2, f2, f3, f4, f5, f6, f7);
        GlStateManager.JV();
        if (this.byp) {
            float f8 = 2.0f;
            GlStateManager.i(0.5f, 0.5f, 0.5f);
            GlStateManager.j(0.0f, 24.0f * f7, 0.0f);
        } else if (c2.isSneaking()) {
            GlStateManager.j(0.0f, 0.2f, 0.0f);
        }
        GlStateManager.JW();
    }

    public void Y(float f2) {
        ad.a(this.byA, this.bBg);
        this.bBg.bBC = 0.0f;
        this.bBg.bBD = 0.0f;
        this.bBg.aa(f2);
    }

    public void Z(float f2) {
        this.bBf.aa(f2);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        super.a(f2, f3, f4, f5, f6, f7, c2);
        ad.a(this.byG, this.bBc);
        ad.a(this.byF, this.bBd);
        ad.a(this.byE, this.bBa);
        ad.a(this.byD, this.bBb);
        ad.a(this.byC, this.bBe);
        if (c2 instanceof net.minecraft.entity.player.a) {
            a.a.e().d(new ff((net.minecraft.entity.player.a)c2, this));
        }
    }

    public void Hb() {
        this.byD.aa(0.0625f);
        this.bBb.aa(0.0625f);
    }

    public void Hc() {
        this.byE.aa(0.0625f);
        this.bBa.aa(0.0625f);
    }

    @Override
    public void ak(boolean bl2) {
        super.ak(bl2);
        this.bBa.bBL = bl2;
        this.bBb.bBL = bl2;
        this.bBc.bBL = bl2;
        this.bBd.bBL = bl2;
        this.bBe.bBL = bl2;
        this.bBf.bBL = bl2;
        this.bBg.bBL = bl2;
    }

    @Override
    public void X(float f2) {
        if (this.bBh) {
            this.byD.bBC += 1.0f;
            this.byD.ac(f2);
            this.byD.bBC -= 1.0f;
        } else {
            this.byD.ac(f2);
        }
    }
}

