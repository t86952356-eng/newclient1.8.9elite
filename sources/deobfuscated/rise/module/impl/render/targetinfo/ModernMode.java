/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.targetinfo;

import hackclient.rise.aae;
import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
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
import net.minecraft.client.gui.b;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.l;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.cq;
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

public class ModernMode
extends Mode<TargetInfo> {
    private final BooleanValue avm = new BooleanValue("Particles", (Mode<?>)this, (Boolean)true);
    private final agf avn = gb.ks.a(22, gd.kE);
    private final agf avo = gb.ks.a(22, gd.kF);
    private final ModeValue avp = new aae(this, "Background Mode", this);
    private static final float avq = 0.01f;
    private static final float avr = 0.8f;
    private static final int avs = 256;
    private long avt = 0L;
    private float avu = 0.0f;
    private TargetInfo auR;
    private final int avv = 8;
    private final int avw = 7;
    private final int avx = 4;
    private final afj avy = new afj(afk.aHt, 500L);
    private final afj avz = new afj(afk.aHk, 500L);
    @EventLink
    public final Listener<Render2DEvent> avA = render2DEvent -> {
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
        this.avy.h(bl2 ? 400L : 850L);
        this.avy.a(bl2 ? afk.aHu : afk.aHt);
        this.avy.Q(bl2 ? 0.0 : 1.0);
        if (this.avy.sV() <= 0.0) {
            return;
        }
        String string = c2.xU();
        String string2 = bf.c(string, string);
        float f2 = this.nS();
        String string3 = f2 > 0.0f ? "Winning:" : "Losing:";
        double d2 = this.auR.aqy.x;
        double d3 = this.auR.aqy.y;
        double d4 = this.avo.bQ(string2);
        double d5 = this.avn.bQ(string3);
        net.minecraft.client.entity.a a2 = (net.minecraft.client.entity.a)c2;
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f3 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        double d6 = Math.min(!this.auR.aqz ? 0.0 : ahj.a(f3, 1), (double)a2.getMaxHealth());
        double d7 = this.avo.bQ(String.valueOf(d6));
        double d8 = Math.max(d5 + d4 + 35.0 - d7, 65.0);
        this.avz.Q(d6 / (double)a2.getMaxHealth() * d8);
        this.avz.a(afk.aHh);
        this.avz.h(250L);
        double d9 = this.avz.sV();
        double d10 = (double)(a2.cus == 0 ? 0.0f : (float)a2.cus - ModernMode.aER.bgC.bWY) * 0.5;
        int n2 = 32;
        double d11 = d10 / 2.0;
        double d12 = (double)(8 + n2 + 8) + d8 + 4.0 + d7 + 8.0;
        double d13 = n2 + 16;
        this.auR.aqw.n(new Vector2d(d12, d13));
        double d14 = this.avy.sV();
        this.b(gg.kV).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d12 / 2.0) * (1.0 - d14), (d3 + d13 / 2.0) * (1.0 - d14), 0.0);
            GlStateManager.B(d14, d14, 0.0);
            Color color = ady.sa();
            Color color2 = ady.sa();
            Color color3 = this.rP().rQ();
            Color color4 = this.rP().rR();
            if (((Mode)this.avp.wD()).getName().equals("Tint")) {
                Color color5 = this.rP().j(new Vector2d(d2, d3));
                Color color6 = this.rP().j(new Vector2d(d2, d3 + d13));
                color = new Color(color5.getRed() / 5, color5.getGreen() / 5, color5.getBlue() / 5, 128);
                color2 = new Color(color6.getRed() / 5, color6.getGreen() / 5, color6.getBlue() / 5, 128);
            } else if (((Mode)this.avp.wD()).getName().equals("Solid")) {
                Color color7 = this.rP().rQ();
                Color color8 = this.rP().rR();
                color = new Color(color7.getRed(), color7.getGreen(), color7.getBlue(), 128);
                color2 = new Color(color8.getRed(), color8.getGreen(), color8.getBlue(), 128);
                color3 = new Color(255, 255, 255);
                color4 = new Color(164, 164, 164);
            }
            ait.a(d2, d3, d12 - 1.0, d13, 16.0, color, color2, true);
            this.avn.b(string3, d2 + 8.0 + (double)n2 + 7.0, d3 + 8.0 + 4.0 + 2.0, Color.WHITE.hashCode());
            this.avo.b(string2, d2 + 8.0 + (double)n2 + 7.0 + d5 + 3.0, d3 + 8.0 + 4.0 + 2.5, color3.hashCode());
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.C((d2 + d12 / 2.0) * (1.0 - d14), (d3 + d13 / 2.0) * (1.0 - d14), 0.0);
            GlStateManager.B(d14, d14, 0.0);
            double d11 = d2 + 8.0 + (double)n2 + 7.0;
            double d12 = d3 + 8.0 + (double)n2 - 4.0 - 7.0;
            Color color9 = ais.d(ady.sa(), (int)((float)ady.sa().getAlpha() / 1.7f));
            this.rP();
            ait.a(d11, d12, d8, 6.0, 3.0, color9, ady.sa(), true);
            ait.a(d2 + 8.0 + (double)n2 + 7.0, d3 + 8.0 + (double)n2 - 4.0 - 7.0, d9, 6.0, 3.0, color4, color3, true);
            this.avo.b(String.valueOf(d6), d2 + 8.0 + (double)n2 + 7.0 + d8 + 4.0, d3 + 8.0 + (double)n2 - 4.0 - 8.0, color3.hashCode());
            GlStateManager.JW();
        });
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d12 / 2.0) * (1.0 - d14), (d3 + d13 / 2.0) * (1.0 - d14), 0.0);
            GlStateManager.B(d14, d14, 0.0);
            ait.e(ais.a(Color.RED, Color.WHITE, d10 / 9.0));
            ait.a(3, d2 + 8.0 + d11, d3 + 8.0 + d11, (double)n2 - d10, (double)n2 - d10, 20.0, this.rP().pB() * 2);
            this.a((net.minecraft.client.entity.a)c2, d2 + 8.0 + d11, d3 + 8.0 + d11, (double)n2 - d10);
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d12 / 2.0) * (1.0 - d14), (d3 + d13 / 2.0) * (1.0 - d14), 0.0);
            GlStateManager.B(d14, d14, 0.0);
            ait.c(d2, d3, d12 - 1.0, d13, 16.0, Color.BLACK);
            GlStateManager.JW();
        });
        this.b(gg.kT).c(() -> {
            GlStateManager.JV();
            GlStateManager.C((d2 + d12 / 2.0) * (1.0 - d14), (d3 + d13 / 2.0) * (1.0 - d14), 0.0);
            GlStateManager.B(d14, d14, 0.0);
            ait.c(d2 + 0.5, d3 + 0.5, d12 - 2.0, d13 - 1.0, 17.0, this.rP().rU());
            GlStateManager.JW();
        });
    };
    @EventLink
    public final Listener<TickEvent> avB = tickEvent -> {
        if (this.auR == null) {
            return;
        }
        c c2 = this.auR.by;
        if (c2 == null || this.avy.sV() <= 0.0 || !((Boolean)this.avm.wD()).booleanValue()) {
            return;
        }
        double d2 = (double)(((net.minecraft.client.entity.a)c2).cus == 0 ? 0.0f : (float)((net.minecraft.client.entity.a)c2).cus - ModernMode.aER.bgC.bWY) * 0.5;
        if (d2 > 0.0) {
            int n2 = 0;
            while ((double)n2 < d2 * Math.random() / 2.0) {
                ch.a(new aiw(new Vector2f((float)(this.auR.aqy.x + 20.0), (float)(this.auR.aqy.y + 20.0)), new Vector2f((float)(Math.random() - 0.5) * 1.7f, (float)(Math.random() - 0.5) * 1.7f)));
                ++n2;
            }
        }
    };

    public ModernMode(String string, TargetInfo targetInfo) {
        super(string, targetInfo);
    }

    private float a(co co2, c c2, c c3) {
        int n2;
        Object object;
        float f2 = 1.0f;
        if (co2 != null) {
            object = co2.bP();
            if (object instanceof cp) {
                f2 = ((cp)object).cXl;
            } else if (object instanceof cq) {
                f2 = ((cq)object).cXo;
            }
            n2 = l.d(a.cqg.cqw, co2);
            if (n2 > 0) {
                f2 += (float)n2 * 1.25f;
            }
        }
        if (c2 instanceof r) {
            object = (r)c2;
            int n3 = n2 = ((r)object).b(net.minecraft.potion.a.dgA) != null ? ((r)object).b(net.minecraft.potion.a.dgA).ajf() + 1 : 0;
            if (n2 > 0) {
                f2 += (float)n2 * 3.0f;
            }
        }
        if (c3 instanceof r) {
            int n4;
            object = (r)c3;
            float f3 = ((r)object).VQ();
            float f4 = Math.min(f3 * 0.04f, 0.8f);
            f2 *= 1.0f - f4;
            int n5 = this.C((r)object);
            int n6 = Math.min(20, (int)Math.ceil((float)Math.min(25, n5) * 0.75f));
            if (n6 > 0) {
                f2 *= 1.0f - (float)n6 * 0.04f;
            }
            int n7 = n4 = ((r)object).b(net.minecraft.potion.a.dgG) != null ? ((r)object).b(net.minecraft.potion.a.dgG).ajf() + 1 : 0;
            if (n4 > 0) {
                float f5 = Math.min((float)n4 * 0.2f, 0.8f);
                f2 *= 1.0f - f5;
            }
        }
        if (!Float.isFinite(f2)) {
            f2 = 1.0f;
        }
        return Math.max(0.01f, f2);
    }

    private int C(r r2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n3;
            co co2 = r2.eH(i2);
            int n4 = n3 = co2 != null ? l.d(a.cpX.cqw, co2) : 0;
            if (n3 <= 0) continue;
            n2 += this.T(n3);
        }
        return n2;
    }

    private int T(int n2) {
        float f2 = (float)(6 + n2 * n2) * 0.75f / 3.0f;
        return (int)Math.floor(f2);
    }

    private float nS() {
        long l2 = System.currentTimeMillis();
        if (l2 - this.avt > 200L) {
            this.avu = this.nT();
            this.avt = l2;
        }
        return this.avu;
    }

    private float nT() {
        int n2;
        c c2 = this.auR.by;
        if (!(c2 instanceof net.minecraft.client.entity.a)) {
            return 0.0f;
        }
        float f2 = Math.max(0.1f, ModernMode.aER.bgK.getHealth());
        net.minecraft.client.entity.a a2 = (net.minecraft.client.entity.a)c2;
        HealthBypass healthBypass = this.e(HealthBypass.class);
        float f3 = healthBypass != null && healthBypass.isEnabled() ? HealthBypass.B(a2) : a2.getHealth();
        float f4 = Math.max(0.1f, f3);
        float f5 = this.a(ModernMode.aER.bgK.Vk(), ModernMode.aER.bgK, c2);
        float f6 = this.a(((net.minecraft.client.entity.a)c2).Vk(), c2, ModernMode.aER.bgK);
        if (f5 <= 0.01f && f6 <= 0.01f) {
            return 0.0f;
        }
        for (n2 = 0; f2 > 0.0f && f4 > 0.0f && n2 < 256; f4 -= f5, f2 -= f6, ++n2) {
        }
        if (n2 >= 256) {
            return f5 - f6;
        }
        return f2 - f4;
    }

    private void a(net.minecraft.client.entity.a a2, double d2, double d3, double d4) {
        aiv.vZ();
        aiv.wa();
        ait.c(d2, d3, d4, d4, this.rP().pB() * 2, ady.sa());
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

