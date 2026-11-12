/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.targetinfo;

import hackclient.rise.aab;
import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ahg;
import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiv;
import hackclient.rise.aiw;
import hackclient.rise.bf;
import hackclient.rise.ch;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.entity.a;
import net.minecraft.client.gui.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.entity.c;
import net.minecraft.util.cm;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.player.HealthBypass;
import rise.module.impl.render.TargetInfo;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;

public class CreidaModernMode
extends Mode<TargetInfo> {
    private final BooleanValue auZ = new BooleanValue("Particles", (Mode<?>)this, (Boolean)true);
    private final agf ava = gb.ks.a(22, gd.kE);
    private final agf avb = gb.ks.a(22, gd.kF);
    private final ModeValue avc = new aab(this, "Background Mode", this);
    private TargetInfo auR;
    private final int avd = 10;
    private final int ave = 6;
    private final int avf = 4;
    private final afj avg = new afj(afk.aHt, 500L);
    private final afj avh = new afj(afk.aHk, 500L);
    private final afj avi = new afj(afk.aHc, 300L);
    @EventLink
    public final Listener<Render2DEvent> avj = render2DEvent -> {
        if (this.auR == null) {
            this.auR = this.e(TargetInfo.class);
        }
        this.b(gg.kT).c(ch::ci);
        this.b(gg.kV, 1).c(ch::cj);
        c c2 = this.auR.by;
        if (c2 == null) {
            return;
        }
        boolean bl2 = !this.auR.aqz || this.auR.rG.T(1000L);
        this.avg.h(bl2 ? 400L : 850L);
        this.avg.a(bl2 ? afk.aHu : afk.aHt);
        this.avg.Q(bl2 ? 0.0 : 1.0);
        if (this.avg.sV() <= 0.0) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        a a2 = (a)c2;
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        double d4 = this.avb.bQ(string2);
        double d5 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        double d6 = this.avb.bQ(String.valueOf(d5));
        double d7 = Math.max(d4 + 35.0 - d6, 75.0);
        this.avh.Q(d5 / (double)a2.getMaxHealth() * d7);
        this.avh.a(afk.aHh);
        this.avh.h(250L);
        double d8 = this.avh.sV();
        double d9 = (double)(a2.cus == 0 ? 0.0f : (float)a2.cus - CreidaModernMode.aER.bgC.bWY) * 0.5;
        int n2 = 32;
        this.avi.Q(d9 / 2.0);
        double d10 = this.avi.sV();
        double d11 = (double)(10 + n2 + 10) + d7 + 4.0 + d6 + 10.0;
        double d12 = n2 + 10;
        this.auR.aqw.n(new Vector2d(d11, d12));
        double d13 = this.avg.sV();
        this.b(gg.kV).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            this.rP();
            Color color = ady.sa();
            this.rP();
            Color color2 = ady.sa();
            Color color3 = this.rP().rQ();
            Color color4 = this.rP().rR();
            if (((Mode)this.avc.wD()).getName().equals("Tint")) {
                Color color5 = this.rP().j(new Vector2d(d2, d3));
                Color color6 = this.rP().j(new Vector2d(d2, d3 + d12));
                color = new Color(color5.getRed() / 5, color5.getGreen() / 5, color5.getBlue() / 5, 128);
                color2 = new Color(color6.getRed() / 5, color6.getGreen() / 5, color6.getBlue() / 5, 128);
            } else if (((Mode)this.avc.wD()).getName().equals("Solid")) {
                Color color7 = this.rP().rQ();
                Color color8 = this.rP().rR();
                color = new Color(color7.getRed(), color7.getGreen(), color7.getBlue(), 128);
                color2 = new Color(color8.getRed(), color8.getGreen(), color8.getBlue(), 128);
                color3 = new Color(255, 255, 255);
                color4 = new Color(164, 164, 164);
            }
            ait.a(d2 + 3.0, d3 + 5.0, d11 - 1.0, d12, 11.0, color, color2, true);
            this.ava.b(ahg.cf("ui.targethud.name"), d2 + 10.0 + (double)n2 + 6.0, d3 + 10.0 + 4.0 + 2.0, Color.WHITE.hashCode());
            this.avb.b(string2, d2 + 10.0 + (double)n2 + 6.0 + (double)this.ava.bQ(ahg.cf("ui.targethud.name")) + 3.0, d3 + 10.0 + 4.0 + 2.5, color3.hashCode());
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            double d10 = d2 + 10.0 + (double)n2 + 6.0;
            double d11 = d3 + 10.0 + (double)n2 - 4.0 - 7.0;
            this.rP();
            Color color9 = ady.sa();
            this.rP();
            Color color10 = ais.d(color9, (int)((float)ady.sa().getAlpha() / 1.7f));
            this.rP();
            ait.a(d10, d11, d7, 6.5, 3.5, color10, ady.sa(), true);
            ait.b(d2 + 10.0 + (double)n2 + 6.0, d3 + 10.0 + (double)n2 - 4.0 - 7.0, d8, 6.5, 3.5, color4, color3, false);
            this.avb.b(String.valueOf(d5), d2 + 10.0 + (double)n2 + 6.0 + d7 + 4.0, d3 + 10.0 + (double)n2 - 4.0 - 8.0, color3.hashCode());
            GlStateManager.JW();
        });
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            ait.e(ais.a(Color.RED, Color.WHITE, d9 / 9.0));
            ait.a(3, d2 + 10.0 + d10, d3 + 10.0 + d10, (double)n2 - d9, (double)n2 - d9, 20.0, this.rP().pB() * 2);
            this.avi.Q(d9 / 2.0);
            double d9 = this.avi.sV() == 0.0 ? 1.0 : this.avi.sV();
            System.out.println(this.avi.sV());
            this.a(a2, d2 + 10.0 + d9 / 2.0, d3 + 10.0 + d9 / 2.0, (double)n2 - d9 / 2.0);
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            ait.c(d2 + 3.0, d3 + 5.0, d11 - 1.0, d12, 11.0, Color.BLACK);
            GlStateManager.JW();
        });
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            ait.c(d2 + 3.5, d3 + 5.5, d11 - 2.0, d12 - 1.0, 12.0, this.rP().rU());
            Color color = this.rP().rQ();
            Color color2 = this.rP().rR();
            ait.b(d2 + 10.0 + (double)n2 + 6.0, d3 + 10.0 + (double)n2 - 4.0 - 7.0, d8, 6.0, 3.0, ais.d(color2, 255), ais.d(color, 255), false);
            GlStateManager.JW();
        });
    };
    @EventLink
    public final Listener<TickEvent> avk = tickEvent -> {
        if (this.auR == null) {
            return;
        }
        c c2 = this.auR.by;
        if (c2 == null || this.avg.sV() <= 0.0 || !((Boolean)this.auZ.wD()).booleanValue()) {
            return;
        }
        double d2 = (double)(((a)c2).cus == 0 ? 0.0f : (float)((a)c2).cus - CreidaModernMode.aER.bgC.bWY) * 0.5;
        if (d2 > 0.0) {
            int n2 = 0;
            while ((double)n2 < d2 * Math.random() / 2.0) {
                ch.a(new aiw(new Vector2f((float)(this.auR.aqy.x + 20.0), (float)(this.auR.aqy.y + 20.0)), new Vector2f((float)(Math.random() - 0.5) * 1.7f, (float)(Math.random() - 0.5) * 1.7f)));
                ++n2;
            }
        }
    };

    public CreidaModernMode(String string, TargetInfo targetInfo) {
        super(string, targetInfo);
    }

    private void a(a a2, double d2, double d3, double d4) {
        aiv.vZ();
        aiv.wa();
        this.rP();
        ait.c(d2, d3, d4, d4, 7.0, ady.sa());
        aiv.aD(1);
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        GlStateManager.e(516, 0.0f);
        GlStateManager.JN();
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        cm cm2 = this.auR.aqz && f2 > 0.0f ? a2.Dd() : RenderSkeleton.NA();
        aER.Bq().a(cm2);
        b.drawScaledCustomSizeModalRect(d2, d3, 4.0f, 4.0f, 4.0f, 4.0f, d4, d4, 32.0f, 32.0f);
        GlStateManager.tR();
        aiv.wb();
        float f3 = 0.5f;
        ait.a(d2 - (double)f3, d3 - (double)f3, d4 + (double)(f3 * 2.0f), d4 + (double)(f3 * 2.0f), (double)(this.rP().pB() * 2), 0.5, ais.d(Color.BLACK, 40));
    }
}

