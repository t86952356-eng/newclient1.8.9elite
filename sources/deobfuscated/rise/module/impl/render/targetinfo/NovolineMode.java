/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.targetinfo;

import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ahj;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.bf;
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
import rise.module.impl.render.TargetInfo;

public final class NovolineMode
extends Mode<TargetInfo> {
    private TargetInfo avJ;
    private final afj avK = new afj(afk.aHk, 500L);
    private final afj avL = new afj(afk.aHl, 300L);
    private c avM = null;
    private double avN = 0.0;
    @EventLink
    private final Listener<Render2DEvent> avO = render2DEvent -> {
        boolean bl2;
        if (this.avJ == null) {
            this.avJ = this.e(TargetInfo.class);
        }
        c c2 = this.avJ.by;
        boolean bl3 = bl2 = !this.avJ.aqz || this.avJ.rG.T(1000L);
        if (c2 == null || bl2) {
            this.avK.aX();
            this.avL.aX();
            this.avM = null;
            return;
        }
        double d2 = this.avJ.aqy.x;
        double d3 = this.avJ.aqy.y;
        a a2 = (a)c2;
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        double d4 = Math.min(!this.avJ.aqz ? 0.0 : ahj.a(f2, 1), (double)a2.getMaxHealth());
        double d5 = a2.getMaxHealth();
        double d6 = d4 / d5 * 100.0;
        String string = c2.xU();
        String string2 = bf.c(string, string);
        double d7 = NovolineMode.aER.fontRendererObj.bQ(string2);
        double d8 = 74.0;
        double d9 = d8 + d7;
        if (this.avM != c2) {
            this.avL.aX();
            this.avL.T(this.avN);
            this.avL.Q(d9);
            this.avM = c2;
        } else {
            this.avL.Q(d9);
        }
        double d10 = this.avL.sV();
        double d11 = 42.0;
        ait.d(d2, d3, d10, d11, new Color(40, 40, 40, 255));
        NovolineMode.aER.fontRendererObj.b(string2, d2 + 44.0, d3 + 10.0, Color.WHITE.getRGB());
        double d12 = 26.0 + d7;
        ait.d(d2 + 44.0, d3 + 22.0, d12, 11.0, new Color(21, 21, 21, 150));
        double d13 = d12 * (d4 / d5);
        this.avK.Q(d13);
        double d14 = this.avK.sV();
        ait.d(d2 + 44.0, d3 + 22.0, d14, 11.0, ais.a(this.rP().rR(), 0.5f));
        double d15 = d13;
        ait.d(d2 + 44.0, d3 + 22.0, d15, 11.0, this.rP().rQ());
        String string3 = String.format("%.1f%%", d6);
        double d16 = NovolineMode.aER.fontRendererObj.bQ(string3);
        NovolineMode.aER.fontRendererObj.b(string3, d2 + 44.0 + d12 / 2.0 - d16 / 2.0, d3 + 24.5, Color.WHITE.getRGB());
        if (this.nV()) {
            this.b(gg.kT).c(() -> {
                ait.d(d2 + 44.0, d3 + 22.0, d15, 11.0, this.rP().rQ());
                ait.d(d2 + 44.0, d3 + 22.0, d14, 11.0, ais.a(this.rP().rR(), 0.5f));
            });
        }
        if (c2 instanceof a) {
            this.a(a2, d2 + 1.0, d3 + 1.0, 40.0);
        }
        this.avN = d10;
    };

    public NovolineMode(String string, TargetInfo targetInfo) {
        super(string, targetInfo);
    }

    private void a(a a2, double d2, double d3, double d4) {
        boolean bl2;
        if (this.avJ == null) {
            this.avJ = this.e(TargetInfo.class);
        }
        c c2 = this.avJ.by;
        boolean bl3 = bl2 = !this.avJ.aqz || this.avJ.rG.T(1000L);
        if (c2 == null || bl2) {
            return;
        }
        GlStateManager.tQ();
        GlStateManager.P(770, 771);
        GlStateManager.e(516, 0.0f);
        GlStateManager.JN();
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f2 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        cm cm2 = this.avJ.aqz && f2 > 0.0f ? a2.Dd() : RenderSkeleton.NA();
        aER.Bq().a(cm2);
        b.drawScaledCustomSizeModalRect((int)d2, (int)d3, 8.0f, 8.0f, 8.0f, 8.0f, (int)d4, (int)d4, 64.0f, 64.0f);
        b.drawScaledCustomSizeModalRect((int)d2, (int)d3, 40.0f, 8.0f, 8.0f, 8.0f, (int)d4, (int)d4, 64.0f, 64.0f);
        GlStateManager.tR();
    }

    private Color nU() {
        return this.rP().rQ();
    }

    private boolean nV() {
        return true;
    }
}

