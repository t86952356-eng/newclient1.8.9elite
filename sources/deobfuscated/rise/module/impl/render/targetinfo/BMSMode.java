/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.targetinfo;

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

public class BMSMode
extends Mode<TargetInfo> {
    private final agf auP = gb.ks.a(22, gd.kE);
    private final agf auQ = gb.ks.a(22, gd.kE);
    private TargetInfo auR;
    private int auS = 4;
    private int auT = 4;
    private int auU = 4;
    private afj auV = new afj(afk.aHt, 500L);
    private afj auW = new afj(afk.aHk, 500L);
    @EventLink
    public final Listener<Render2DEvent> auXX = render2DEvent -> {
        c c2;
        if (this.auR == null) {
            this.auR = this.e(TargetInfo.class);
        }
        if ((c2 = this.auR.by) == null) {
            return;
        }
        boolean bl2 = !this.auR.aqz || this.auR.rG.T(1000L);
        this.auV.h(bl2 ? 400L : 850L);
        this.auV.a(bl2 ? afk.aHu : afk.aHt);
        this.auV.Q(bl2 ? 0.0 : 1.0);
        if (this.auV.sV() <= 0.0) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        a a2 = (a)c2;
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        double d4 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        double d5 = Math.max(0, 100);
        this.auW.Q(d4 / (double)a2.getMaxHealth() * d5);
        this.auW.a(afk.aHh);
        this.auW.h(250L);
        double d6 = this.auW.sV();
        double d7 = (a2.cus == 0 ? 0.0f : (float)a2.cus - BMSMode.aER.bgC.bWY) * 0.0f;
        int n2 = 32;
        double d8 = d4 / (double)a2.getMaxHealth() * 100.0;
        double d9 = Math.round(d8);
        double d10 = d7 / 2.0;
        double d11 = (double)(this.auS + n2 + this.auS) + d5 + (double)this.auU + (double)this.auS;
        double d12 = n2 + this.auS * 2;
        this.auR.aqw.n(new Vector2d(d11, d12));
        double d13 = this.auV.sV();
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            this.rP();
            Color color = ady.sa();
            Color color2 = this.rP().rQ();
            ait.a(d2, d3, d11 - 4.0, d12, 6.0, color, color, true);
            this.auQ.b(string2, d2 - 28.0 + (double)n2 + (double)this.auT + (double)this.auP.bQ(ahg.cf("ui.targethud.name")) + 3.0, d3 + (double)this.auS + (double)this.auU, Color.white.getRGB());
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            ait.e(ais.a(Color.RED, Color.WHITE, d7 / 9.0));
            ait.a(3, d2 + (double)this.auS + d10, d3 + (double)this.auS + d10, (double)n2 - d7, (double)n2 - d7, 20.0, 5.0);
            this.a(a2, d2 + (double)this.auS + d10, d3 + (double)this.auS + d10, (double)n2 - d7);
            ait.c(d2 + (double)this.auS + (double)n2 + (double)this.auT, d3 + (double)this.auS + (double)n2 - (double)this.auU - 10.0, d5, 12.0, 2.0, Color.darkGray.darker());
            ait.a(d2 + (double)this.auS + (double)n2 + (double)this.auT, d3 + (double)this.auS + (double)n2 - (double)this.auU - 10.0, d6, 12.0, 2.0, ais.d(color2, 100), ais.d(color2, 100), false);
            this.auP.c(d9 + "%", d2 + (double)this.auS + (double)n2 + (double)this.auT + d5 + (double)this.auU - 50.0, d3 + (double)this.auS + (double)n2 - (double)this.auU - 8.0, Color.WHITE.getRGB());
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            ait.c(d2, d3, d11 - 4.5, d12, 6.0, Color.BLACK);
            GlStateManager.JW();
        });
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d11 / 2.0) * (1.0 - d13), (d3 + d12 / 2.0) * (1.0 - d13), 0.0);
            GlStateManager.B(d13, d13, 0.0);
            boolean bl2 = false;
            Color color = this.rP().rU();
            Color color2 = this.rP().rU();
            ait.a(d2 + 0.5, d3, d11 - 4.5, d12, 7.0, color, color2, true);
            GlStateManager.JW();
        });
    };
    @EventLink
    public final Listener<TickEvent> auY = tickEvent -> {
        if (this.auR == null) {
            return;
        }
        c c2 = this.auR.by;
        if (c2 == null || this.auV.sV() <= 0.0) {
            return;
        }
        double d2 = (((a)c2).cus == 0 ? 0.0f : (float)((a)c2).cus - BMSMode.aER.bgC.bWY) * 0.0f;
        if (d2 > 0.0) {
            int n2 = 0;
            while ((double)n2 < d2 * Math.random() / 2.0) {
                ch.a(new aiw(new Vector2f((float)(this.auR.aqy.x + 20.0), (float)(this.auR.aqy.y + 20.0)), new Vector2f((float)(Math.random() - 0.5) * 1.7f, (float)(Math.random() - 0.5) * 1.7f)));
                ++n2;
            }
        }
    };

    public BMSMode(String string, TargetInfo targetInfo) {
        super(string, targetInfo);
    }

    private void a(a a2, double d2, double d3, double d4) {
        aiv.vZ();
        aiv.wa();
        this.rP();
        ait.c(d2, d3, d4, d4, 3.0, ady.sa());
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
    }
}

