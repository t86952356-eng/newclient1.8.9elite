/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.targetinfo;

import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiv;
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
import rise.module.Mode;
import rise.module.impl.player.HealthBypass;
import rise.module.impl.render.Interface;
import rise.module.impl.render.TargetInfo;
import rise.util.math.Vector2d;

public class GodlyMode
extends Mode<TargetInfo> {
    private final agf avP = gb.ks.a(18, gd.kG);
    private TargetInfo auR;
    private final int avQ = 6;
    private final int avR = 7;
    private final int avS = 4;
    private final afj avT = new afj(afk.aHt, 500L);
    private final afj avU = new afj(afk.aHk, 500L);
    @EventLink
    public final Listener<Render2DEvent> avV = render2DEvent -> {
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
        this.avT.h(bl2 ? 400L : 850L);
        this.avT.a(bl2 ? afk.aHu : afk.aHt);
        this.avT.Q(bl2 ? 0.0 : 1.0);
        if (this.avT.sV() <= 0.0) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        a a2 = (a)c2;
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        double d4 = this.avP.bQ(string2);
        double d5 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        double d6 = Math.max(d4 + 15.0, 70.0);
        this.avU.Q(d5 / (double)a2.getMaxHealth() * d6);
        this.avU.a(afk.aHh);
        this.avU.h(250L);
        double d7 = this.avU.sV();
        double d8 = (double)(a2.cus == 0 ? 0.0f : (float)a2.cus - GodlyMode.aER.bgC.bWY) * 0.5;
        int n2 = 32;
        double d9 = d8 / 2.0;
        double d10 = (double)(6 + n2 + 6) + d6 + 4.0 + 6.0;
        double d11 = n2 + 12;
        this.auR.aqw.n(new Vector2d(d10, d11));
        double d12 = this.avT.sV();
        this.b(gg.kV).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            Color color = this.rP().rQ();
            Color color2 = this.rP().rR();
            if (!((Boolean)this.e(Interface.class).aoL.wD()).booleanValue()) {
                this.rP();
                ait.c(d2, d3, d10 - 3.5, d11 - 4.0, 8.0, ady.sa());
            }
            this.rP();
            ait.c(d2, d3, d10 - 3.5, d11 - 4.0, 8.0, ady.sa());
            String string2 = String.valueOf(Math.round(f2));
            GlStateManager.JV();
            this.avP.b(string2, d2 + 6.0 + (double)n2 + 7.0 - 2.5, d3 + 6.0 + 4.0 - 2.0, color.hashCode());
            this.avP.b(string2, d2 + (double)n2 + (double)GodlyMode.aER.fontRendererObj.bQ("\u2764\ufe0f") + 2.0, d3 + 6.0 + 4.0 + 8.0, -1);
            GodlyMode.aER.fontRendererObj.b("\u00a74\u2764", d2 + (double)n2 + 11.0, d3 + 6.0 + 4.0 + 7.5, -1);
            GlStateManager.JW();
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            double d9 = d2 + 6.0 + (double)n2 + 7.0 - 2.5;
            double d10 = d3 + 6.0 + (double)n2 - 4.0 - 6.0;
            this.rP();
            Color color3 = ady.sa();
            this.rP();
            Color color4 = ais.d(color3, (int)((float)ady.sa().getAlpha() / 1.7f));
            this.rP();
            ait.a(d9, d10, d6, 6.0, 3.0, color4, ady.sa(), true);
            ait.a(d2 + 6.0 + (double)n2 + 7.0 - 2.5, d3 + 6.0 + (double)n2 - 4.0 - 6.0, d7, 6.0, 3.0, color2, color, false);
            GlStateManager.JW();
        });
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            ait.e(ais.a(Color.RED, Color.WHITE, d8 / 9.0));
            ait.a(3, d2 + 6.0 + d9 - 2.0, d3 + 6.0 + d9 - 2.0, (double)n2 - d8, (double)n2 - d8, 20.0, this.rP().pB() * 2);
            this.a(a2, d2 + 6.0 + d9 - 2.0, d3 + 6.0 + d9 - 2.0, (double)n2 - d8);
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            ait.c(d2, d3, d10 - 3.5, d11 - 4.0, 8.0, Color.BLACK);
            GlStateManager.JW();
        });
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d10 / 2.0) * (1.0 - d12), (d3 + d11 / 2.0) * (1.0 - d12), 0.0);
            GlStateManager.B(d12, d12, 0.0);
            GlStateManager.JW();
        });
    };

    public GodlyMode(String string, TargetInfo targetInfo) {
        super(string, targetInfo);
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

