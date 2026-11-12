/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.ahj;
import hackclient.rise.ait;
import hackclient.rise.akn;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.co;
import net.minecraft.util.cm;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.KillAura;
import rise.module.impl.render.Interface;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.hotbar.name"}, description="module.render.hotbar.description", category=Category.RENDER, autoEnabled=true, allowDisable=false)
public class HotBar
extends Module {
    private final akn aou = new akn("", this, new Vector2d(200.0, 200.0), false, true);
    private static final cm aov = new cm("textures/gui/widgets.png");
    private final a aow = new a();
    private float aox;
    private float aoy = 0.0f;
    private Interface amO;
    private KillAura gj;
    public final BooleanValue aoz = new BooleanValue("Show XP Bar", (Module)this, (Boolean)true);
    private final agf aoA = gb.ks.a(18, gd.kF);
    @EventLink
    public final Listener<Render2DEvent> aoB = render2DEvent -> {
        double d2;
        if (!(aER.BC() instanceof net.minecraft.entity.player.a)) {
            return;
        }
        cz cz2 = render2DEvent.dx();
        net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)aER.BC();
        this.aou.aqy = new Vector2d((int)((float)cz2.getScaledWidth() / 2.0f - 92.0f), (double)((float)(cz2.getScaledHeight() - 21) - Client.a.k().rP().qt()) - 17.5);
        this.aou.aHP = new Vector2d(182.0, 40.0);
        if (this.amO == null) {
            this.amO = this.e(Interface.class);
        }
        String string = ((Mode)this.amO.md().wD()).getName();
        int n2 = cz2.getScaledWidth() / 2;
        this.aox = ahj.e(this.aox, n2 - 92 + a2.cHV.cJE * 20, 0.03f * (float)this.aow.aKM());
        this.aow.aX();
        if ("Rise".equals(string)) {
            d2 = this.amO != null ? this.amO.lU() : 9.0;
            this.b(gg.kU).c(() -> ait.c(this.aou.aqy.x + 1.0, this.aou.aqy.y + 18.0, this.aou.aHP.x - 0.0, this.aou.aHP.y - 18.0, d2, Color.BLACK));
        }
        if (((Boolean)this.aoz.wD()).booleanValue() && a2.cIw > 0.0f && "Rise".equals(string)) {
            d2 = this.amO != null ? Math.min(this.amO.lU(), 2.0) : 2.0;
            this.b(gg.kU).c(() -> ait.c(this.aou.aqy.x + 1.0, this.aou.aqy.y + 14.0, this.aou.aHP.x - 0.0, 3.0, d2, Color.BLACK));
        }
        this.b(gg.kV, 1).c(() -> {
            GlStateManager.JS();
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 1, 0);
            RenderHelper.Lh();
            if (((Boolean)this.aoz.wD()).booleanValue() && a2.cIw > 0.0f) {
                this.a(cz2, a2);
            }
            Client.a.k().rP();
            this.a(ady.sa());
            if ("Rise".equals(string)) {
                double d2 = this.aox + 1.0f;
                double d3 = cz2.getScaledHeight() - 26;
                this.rP();
                ait.c(d2, d3, 22.0, 22.0, 8.0, ady.sa());
            } else if ("Traditional".equals(string)) {
                aER.Bq().a(aov);
                GlStateManager.tL();
                ait.e(Color.WHITE);
                HotBar.aER.bha.drawTexturedModalRect(this.aox + 1.0f, (int)(this.aou.aqy.y + 17.0), 0, 22, 24, 24);
            }
            for (int i2 = 0; i2 < 9; ++i2) {
                int n2 = cz2.getScaledWidth() / 2 - 90 + i2 * 20 + 2;
                int n3 = cz2.getScaledHeight() - 16 - 3 - 4;
                this.a(i2, n2, n3, render2DEvent.getPartialTicks(), a2);
            }
            RenderHelper.Lf();
            GlStateManager.JT();
            GlStateManager.tR();
        });
        if ("Rise".equals(string)) {
            this.b(gg.kT).c(this::lL);
        }
        if ("Rise".equals(string) && ((Boolean)this.aoz.wD()).booleanValue() && a2.cIu > 0) {
            this.b(gg.kV, 1).c(() -> {
                String string = String.valueOf(a2.cIu);
                float f2 = this.aoA.bQ(string);
                float f3 = ((float)cz2.getScaledWidth() - f2) / 2.0f;
                float f4 = (float)(this.aou.aqy.y - (double)this.aoA.tF() + 17.0);
                GlStateManager.tQ();
                this.aoA.b(string, f3, f4, Color.WHITE.getRGB());
                GlStateManager.tR();
            });
            this.b(gg.kT).c(() -> {
                String string = String.valueOf(a2.cIu);
                float f2 = this.aoA.bQ(string);
                float f3 = ((float)cz2.getScaledWidth() - f2) / 2.0f;
                float f4 = (float)(this.aou.aqy.y - (double)this.aoA.tF() + 17.0);
                GlStateManager.tQ();
                this.aoA.b(string, f3, f4, this.rP().rT().getRGB());
                GlStateManager.tR();
            });
        }
    };

    private void a(cz cz2, net.minecraft.entity.player.a a2) {
        String string;
        switch (string = ((Mode)this.amO.md().wD()).getName()) {
            case "Rise": {
                float f2 = a2.cIw;
                if (f2 <= 0.0f) {
                    return;
                }
                this.aoy = ahj.e(this.aoy, f2, 0.1f);
                double d2 = this.aou.aqy.x + 1.0;
                double d3 = this.aou.aqy.y + 14.4;
                double d4 = this.aou.aHP.x - 1.0;
                double d5 = d4 * (double)this.aoy;
                double d6 = 3.0;
                double d7 = this.amO != null ? Math.min(this.amO.lU(), 2.0) : 2.0;
                this.rP();
                ait.c(d2, d3, d4, d6, d7, ady.sa());
                ait.c(d2, d3, d5, d6, d7, this.rP().rT());
                break;
            }
            case "Traditional": {
                if (!((Boolean)this.aoz.wD()).booleanValue()) {
                    return;
                }
                float f3 = a2.cIw;
                if (f3 <= 0.0f) {
                    return;
                }
                int n2 = 182;
                int n3 = (int)(f3 * 182.0f);
                int n4 = cz2.getScaledWidth() / 2 - 91;
                float f4 = (float)cz2.getScaledHeight() - 28.5f;
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                aER.Bq().a(b.icons);
                HotBar.aER.bha.drawTexturedModalRect((float)n4, f4, 0, 64, 182, 5);
                HotBar.aER.bha.drawTexturedModalRect((float)n4, f4, 0, 69, n3, 5);
                String string2 = String.valueOf(a2.cIu);
                int n5 = HotBar.aER.fontRendererObj.bQ(string2);
                int n6 = cz2.getScaledWidth() / 2 - n5 / 2;
                float f5 = f4 - 5.0f;
                HotBar.aER.fontRendererObj.b(string2, n6, f5, 0x7FFF1F);
                break;
            }
        }
    }

    private void a(Color color) {
        String string;
        switch (string = ((Mode)this.amO.md().wD()).getName()) {
            case "Rise": {
                double d2 = this.amO != null ? this.amO.lU() : 9.0;
                ait.c(this.aou.aqy.x + 1.0, this.aou.aqy.y + 18.0, this.aou.aHP.x - 0.0, this.aou.aHP.y - 18.0, d2, color);
                break;
            }
            case "Traditional": {
                ait.e(Color.WHITE);
                aER.Bq().a(aov);
                GlStateManager.tL();
                HotBar.aER.bha.drawTexturedModalRect((float)(this.aou.aqy.x + 1.0), (int)(this.aou.aqy.y + 18.0), 0, 0, 182, 22);
            }
        }
    }

    private void lL() {
        double d2 = this.amO != null ? this.amO.lU() + 1.0 : 10.0;
        ait.c(this.aou.aqy.x + 1.0, this.aou.aqy.y + 18.0, this.aou.aHP.x - 0.0, this.aou.aHP.y - 18.0, d2, this.rP().rU());
    }

    private void a(int n2, int n3, int n4, float f2, net.minecraft.entity.player.a a2) {
        if (this.gj == null) {
            this.gj = this.e(KillAura.class);
        }
        if (this.gj != null && this.gj.p(n2)) {
            return;
        }
        co co2 = a2.cHV.cJC[n2];
        if (co2 == null) {
            return;
        }
        RenderItem renderItem = aER.BG();
        float f3 = (float)co2.cXc - f2;
        if (f3 > 0.0f) {
            GlStateManager.JV();
            float f4 = 1.0f + f3 / 5.0f;
            GlStateManager.j(n3 + 8, n4 + 12, 0.0f);
            GlStateManager.i(1.0f / f4, (f4 + 1.0f) / 2.0f, 1.0f);
            GlStateManager.j(-(n3 + 8), -(n4 + 12), 0.0f);
        }
        renderItem.b(co2, n3, n4);
        if (f3 > 0.0f) {
            GlStateManager.JW();
        }
        renderItem.a(HotBar.aER.fontRendererObj, co2, n3, n4);
    }
}

