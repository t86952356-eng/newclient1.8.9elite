/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiv;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.bf;
import hackclient.rise.ch;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.to;
import hackclient.rise.xi;
import hackclient.rise.xz;
import java.awt.Color;
import net.minecraft.client.entity.a;
import net.minecraft.client.gui.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.entity.c;
import net.minecraft.util.cm;

public class aaf
extends akg<xz> {
    private final agf avC = gb.ks.a(18, gd.kE);
    private xz auR;
    private final int avD = 6;
    private final int avE = 7;
    private final int avF = 4;
    private final afj avG = new afj(afk.aHt, 500L);
    private final afj avH = new afj(afk.aHk, 500L);
    @dm
    public final dk<fs> avI = fs2 -> {
        if (this.auR == null) {
            this.auR = this.e(xz.class);
        }
        this.b(gg.kT).c(ch::ci);
        this.b(gg.kV, 1).c(ch::cj);
        c c2 = this.auR.by;
        if (c2 == null) {
            return;
        }
        boolean bl2 = !this.auR.aqz || this.auR.rG.T(1000L);
        this.avG.h(bl2 ? 400L : 850L);
        this.avG.a(bl2 ? afk.aHu : afk.aHt);
        this.avG.Q(bl2 ? 0.0 : 1.0);
        if (this.avG.sV() <= 0.0) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        a a2 = (a)c2;
        to to2 = this.e(to.class);
        float f2 = to2 != null && to2.isEnabled() ? to.B(a2) : a2.getHealth();
        double d4 = this.avC.bQ(string2);
        double d5 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        double d6 = Math.max(d4 + 15.0, 70.0);
        this.avH.Q(d5 / (double)a2.getMaxHealth() * d6);
        this.avH.a(afk.aHh);
        this.avH.h(250L);
        double d7 = this.avH.sV();
        double d8 = (double)(a2.cus == 0 ? 0.0f : (float)a2.cus - aaf.aER.bgC.bWY) * 0.5;
        int n2 = 35;
        double d9 = d8 / 2.0;
        double d10 = (double)(6 + n2 + 6) + d6 + 4.0 + 6.0;
        double d11 = n2 + 12;
        this.auR.aqw.n(new aka(d10, d11));
        double d12 = this.avG.sV();
        this.b(gg.kV).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            this.rP();
            Color color = ady.sa();
            this.rP();
            Color color2 = ady.sa();
            Color color3 = this.rP().rQ();
            Color color4 = this.rP().rR();
            if (!((Boolean)this.e(xi.class).aoL.wD()).booleanValue()) {
                ait.c(d2, d3, d10 - 3.5, d11 - 5.0, 8.0, color);
            }
            ait.a(d2, d3, d10 - 3.5, d11 - 5.0, 8.0, 0.5, ais.d(this.rP().rQ(), 200), ais.d(this.rP().rR(), 200));
            GlStateManager.JV();
            this.avC.b(string2, d2 + 6.0 + (double)n2 + 7.0 - 2.5, d3 + 6.0 + 4.0 + 1.0, Color.WHITE.hashCode());
            this.avC.c(String.valueOf(Math.round(f2)), d2 + (double)n2 + d6 + 4.5, d3 + 6.0 + 4.0 + 1.0, color4.hashCode());
            GlStateManager.JW();
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            double d9 = d2 + 6.0 + (double)n2 + 7.0 - 2.5;
            double d10 = d3 + 6.0 + (double)n2 - 4.0 - 10.0;
            this.rP();
            Color color5 = ady.sa();
            this.rP();
            Color color6 = ais.d(color5, (int)((float)ady.sa().getAlpha() / 1.7f));
            this.rP();
            ait.a(d9, d10, d6, 6.0, 3.0, color6, ady.sa(), true);
            ait.a(d2 + 6.0 + (double)n2 + 7.0 - 2.5, d3 + 6.0 + (double)n2 - 4.0 - 10.0, d7, 6.0, 3.0, color4, color3, false);
            GlStateManager.JW();
        });
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            ait.e(ais.a(Color.RED, Color.WHITE, d8 / 9.0));
            ait.a(3, d2 + 6.0 + d9 - 2.5, d3 + 6.0 + d9 - 2.5, (double)n2 - d8, (double)n2 - d8, 20.0, this.rP().pB() * 2);
            this.a(a2, d2 + 6.0 + d9 - 2.5, d3 + 6.0 + d9 - 2.5, (double)n2 - d8);
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            ait.c(d2, d3, d10 - 3.5, d11 - 5.0, 8.0, Color.BLACK);
            GlStateManager.JW();
        });
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            ait.a(d2, d3, d10 - 3.5, d11 - 5.0, 7.0, 3.0, this.rP().rQ(), this.rP().rR());
            GlStateManager.JW();
        });
    };

    public aaf(String string, xz xz2) {
        super(string, xz2);
    }

    private void a(a a2, double d2, double d3, double d4) {
        aiv.vZ();
        aiv.wa();
        double d5 = this.rP().pB() * 2;
        this.rP();
        ait.c(d2, d3, d4, d4, d5, ady.sa());
        aiv.aD(1);
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        GlStateManager.e(516, 0.0f);
        GlStateManager.JN();
        to to2 = this.e(to.class);
        float f2 = to2 != null && to2.isEnabled() ? to.B(a2) : a2.getHealth();
        cm cm2 = this.auR.aqz && f2 > 0.0f ? a2.Dd() : RenderSkeleton.NA();
        aER.Bq().a(cm2);
        b.drawScaledCustomSizeModalRect(d2, d3, 4.0f, 4.0f, 4.0f, 4.0f, d4, d4, 32.0f, 32.0f);
        GlStateManager.tR();
        aiv.wb();
        float f3 = 0.5f;
        ait.a(d2 - (double)f3, d3 - (double)f3, d4 + (double)(f3 * 2.0f), d4 + (double)(f3 * 2.0f), (double)(this.rP().pB() * 2), 0.5, ais.d(Color.BLACK, 40));
    }
}

