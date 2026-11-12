/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import hackclient.rise.a;
import hackclient.rise.agg;
import hackclient.rise.akg;
import hackclient.rise.fq;
import hackclient.rise.go;
import net.minecraft.client.model.ad;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerArrow;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerDeadmau5Head;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.c;
import net.minecraft.entity.player.f;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;
import net.minecraft.util.cm;

public class RenderPlayer
extends RendererLivingEntity<net.minecraft.client.entity.a> {
    private final boolean bVX;

    public RenderPlayer(RenderManager renderManager) {
        this(renderManager, false);
    }

    public RenderPlayer(RenderManager renderManager, boolean bl2) {
        super(renderManager, new ad(0.0f, bl2), 0.5f);
        this.bVX = bl2;
        this.a(new LayerBipedArmor(this));
        this.a(new LayerHeldItem(this));
        this.a(new LayerArrow(this));
        this.a(new LayerDeadmau5Head(this));
        this.a(new LayerCape(this));
        this.a(new LayerCustomHead(this.Nz().byA));
    }

    public ad Nz() {
        return (ad)super.Nk();
    }

    @Override
    public void a(net.minecraft.client.entity.a a2, double d2, double d3, double d4, float f2, float f3) {
        if (!a2.Dt() || this.bUl.bVD == a2) {
            double d5 = d3;
            if (a2.isSneaking() && !(a2 instanceof net.minecraft.client.entity.c)) {
                d5 = d3 - 0.125;
            }
            this.c(a2);
            super.a(a2, d2, d5, d4, f2, f3);
        }
    }

    private void c(net.minecraft.client.entity.a a2) {
        ad ad2 = this.Nz();
        if (a2.CZ()) {
            ad2.ak(false);
            ad2.byA.bBL = true;
            ad2.byB.bBL = true;
        } else {
            co co2 = a2.cHV.acE();
            ad2.ak(true);
            ad2.byB.bBL = a2.c(f.cJw);
            ad2.bBe.bBL = a2.c(f.cJr);
            ad2.bBc.bBL = a2.c(f.cJu);
            ad2.bBd.bBL = a2.c(f.cJv);
            ad2.bBa.bBL = a2.c(f.cJs);
            ad2.bBb.bBL = a2.c(f.cJt);
            ad2.byH = 0;
            ad2.byJ = false;
            ad2.byI = a2.isSneaking();
            if (co2 == null) {
                ad2.kc = 0;
            } else {
                boolean bl2;
                ad2.kc = 1;
                boolean bl3 = bl2 = a2 instanceof net.minecraft.client.entity.c && a.a.g().c(go.class).isEnabled() && !((akg)a.a.g().c(go.class).lV.wD()).getName().equals("None") && a.a.g().c(go.class).jE != null && a.a.g().c(go.class).eX();
                if (bl2 || a2.abG() > 0) {
                    net.minecraft.item.a a3 = co2.aei();
                    if (a3 == net.minecraft.item.a.cUz) {
                        ad2.kc = 3;
                    } else if (a3 == net.minecraft.item.a.cUA) {
                        ad2.byJ = true;
                    }
                }
            }
            if (a2 instanceof net.minecraft.client.entity.c) {
                fq fq2 = new fq(co2, ad2.kc);
                a.a.e().d(fq2);
                ad2.kc = fq2.dz();
            }
        }
    }

    protected cm d(net.minecraft.client.entity.a a2) {
        return a2.Dd();
    }

    @Override
    public void Nr() {
        GlStateManager.j(0.0f, 0.1875f, 0.0f);
    }

    protected void b(net.minecraft.client.entity.a a2, float f2) {
        float f3 = 0.9375f;
        GlStateManager.i(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    protected void a(net.minecraft.client.entity.a a2, double d2, double d3, double d4, String string, float f2, double d5) {
        i i2;
        g g2;
        if (d5 < 100.0 && (g2 = (i2 = a2.acc()).gY(2)) != null) {
            net.minecraft.scoreboard.d d6 = i2.b(a2.xU(), g2);
            this.a(a2, d6.akm() + " " + g2.getDisplayName(), d2, d3, d4);
            this.Nn();
            d3 += (double)((float)agg.aIF * 1.15f * f2);
        }
        super.a(a2, d2, d3, d4, string, f2, d5);
    }

    public void e(net.minecraft.client.entity.a a2) {
        float f2 = 1.0f;
        GlStateManager.k(1.0f, 1.0f, 1.0f);
        ad ad2 = this.Nz();
        this.c(a2);
        ad2.km = 0.0f;
        ad2.byI = false;
        ad2.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, a2);
        ad2.Hb();
    }

    public void f(net.minecraft.client.entity.a a2) {
        float f2 = 1.0f;
        GlStateManager.k(1.0f, 1.0f, 1.0f);
        ad ad2 = this.Nz();
        this.c(a2);
        ad2.byI = false;
        ad2.km = 0.0f;
        ad2.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, a2);
        ad2.Hc();
    }

    @Override
    protected void b(net.minecraft.client.entity.a a2, double d2, double d3, double d4) {
        if (a2.TS() && a2.Wg()) {
            super.a(a2, d2 + (double)a2.cIn, d3 + (double)a2.cIo, d4 + (double)a2.cIp);
        } else {
            super.a(a2, d2, d3, d4);
        }
    }

    @Override
    protected void b(net.minecraft.client.entity.a a2, float f2, float f3, float f4) {
        if (a2.TS() && a2.Wg()) {
            GlStateManager.d(a2.abR(), 0.0f, 1.0f, 0.0f);
            GlStateManager.d(this.G(a2), 0.0f, 0.0f, 1.0f);
            GlStateManager.d(270.0f, 0.0f, 1.0f, 0.0f);
        } else {
            super.b(a2, f2, f3, f4);
        }
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.b((net.minecraft.client.entity.a)r2, f2);
    }

    @Override
    protected /* synthetic */ void a(r r2, double d2, double d3, double d4) {
        this.b((net.minecraft.client.entity.a)r2, d2, d3, d4);
    }

    @Override
    public /* synthetic */ d Nk() {
        return this.Nz();
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.d((net.minecraft.client.entity.a)c2);
    }
}

