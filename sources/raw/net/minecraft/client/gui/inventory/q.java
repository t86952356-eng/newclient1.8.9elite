/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.d;
import net.minecraft.client.gui.achievement.b;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.inventory.j;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

public class q
extends InventoryEffectRenderer {
    private float bxd;
    private float bxe;

    public q(a a2) {
        super(a2.cHX);
        this.allowUserInput = true;
    }

    @Override
    public void updateScreen() {
        if (q.aER.bgu.Hx()) {
            aER.a(new j(q.aER.bgK));
        }
        this.GE();
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        if (q.aER.bgu.Hx()) {
            aER.a(new j(q.aER.bgK));
        } else {
            super.initGui();
        }
    }

    @Override
    protected void s(int n2, int n3) {
        this.fontRendererObj.a(I18n.a("container.crafting", new Object[0]), 86.0, 16.0, 0x404040);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        super.drawScreen(n2, n3, f2);
        this.bxd = n2;
        this.bxe = n3;
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bwf);
        int n4 = this.bwj;
        int n5 = this.bwk;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
        q.a(n4 + 51, n5 + 75, 30, (float)(n4 + 51) - this.bxd, (float)(n5 + 75 - 50) - this.bxe, q.aER.bgK);
    }

    public static void a(int n2, int n3, int n4, float f2, float f3, r r2) {
        GlStateManager.JB();
        GlStateManager.JV();
        GlStateManager.j(n2, n3, 50.0f);
        GlStateManager.i(-n4, n4, n4);
        GlStateManager.d(180.0f, 0.0f, 0.0f, 1.0f);
        float f4 = r2.cuF;
        float f5 = r2.pl;
        float f6 = r2.pm;
        float f7 = r2.cuH;
        float f8 = r2.pn;
        GlStateManager.d(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.Lg();
        GlStateManager.d(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(-((float)Math.atan(f3 / 40.0f)) * 20.0f, 1.0f, 0.0f, 0.0f);
        r2.cuF = (float)Math.atan(f2 / 40.0f) * 20.0f;
        r2.pl = (float)Math.atan(f2 / 40.0f) * 40.0f;
        r2.pm = -((float)Math.atan(f3 / 40.0f)) * 20.0f;
        r2.pn = r2.pl;
        r2.cuH = r2.pl;
        GlStateManager.j(0.0f, 0.0f, 0.0f);
        RenderManager renderManager = d.AZ().BF();
        renderManager.aC(180.0f);
        renderManager.as(false);
        renderManager.e(r2, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        renderManager.as(true);
        r2.cuF = f4;
        r2.pl = f5;
        r2.pm = f6;
        r2.cuH = f7;
        r2.pn = f8;
        GlStateManager.JW();
        RenderHelper.Lf();
        GlStateManager.JT();
        GlStateManager.cN(OpenGlHelper.bMJ);
        GlStateManager.JO();
        GlStateManager.cN(OpenGlHelper.bMI);
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 0) {
            aER.a(new b(this, q.aER.bgK.Dx()));
        }
        if (c2.id == 1) {
            aER.a(new net.minecraft.client.gui.achievement.c(this, q.aER.bgK.Dx()));
        }
    }
}

