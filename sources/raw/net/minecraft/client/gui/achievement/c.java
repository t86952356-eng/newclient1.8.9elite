/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.achievement;

import hackclient.rise.agg;
import net.minecraft.client.d;
import net.minecraft.client.gui.achievement.e;
import net.minecraft.client.gui.achievement.g;
import net.minecraft.client.gui.achievement.h;
import net.minecraft.client.gui.achievement.j;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cl;
import net.minecraft.client.gui.cw;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.co;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.z;
import net.minecraft.stats.m;

public class c
extends bp
implements cw {
    protected bp bln;
    protected String blo = "Select world";
    private g bvm;
    private h bvn;
    private e bvo;
    private j bvp;
    private final m bvq;
    private cl bvr;
    private static final d bvs = d.AZ();
    private boolean bvt = true;

    public c(bp bp2, m m2) {
        this.bln = bp2;
        this.bvq = m2;
    }

    @Override
    public void initGui() {
        this.blo = I18n.a("gui.stats", new Object[0]);
        this.bvt = true;
        bvs.AU().u(new z(aa.dbQ));
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        if (this.bvr != null) {
            this.bvr.handleMouseInput();
        }
    }

    public void GB() {
        this.bvm = new g(this, bvs);
        this.bvm.registerScrollButtons(1, 1);
        this.bvn = new h(this, bvs);
        this.bvn.registerScrollButtons(1, 1);
        this.bvo = new e(this, bvs);
        this.bvo.registerScrollButtons(1, 1);
        this.bvp = new j(this, bvs);
        this.bvp.registerScrollButtons(1, 1);
    }

    public void EM() {
        this.buttonList.add(new net.minecraft.client.gui.c(0, this.width / 2 + 4, this.height - 28, 150, 20, I18n.a("gui.done", new Object[0])));
        this.buttonList.add(new net.minecraft.client.gui.c(1, this.width / 2 - 160, this.height - 52, 80, 20, I18n.a("stat.generalButton", new Object[0])));
        net.minecraft.client.gui.c c2 = new net.minecraft.client.gui.c(2, this.width / 2 - 80, this.height - 52, 80, 20, I18n.a("stat.blocksButton", new Object[0]));
        this.buttonList.add(c2);
        net.minecraft.client.gui.c c3 = new net.minecraft.client.gui.c(3, this.width / 2, this.height - 52, 80, 20, I18n.a("stat.itemsButton", new Object[0]));
        this.buttonList.add(c3);
        net.minecraft.client.gui.c c4 = new net.minecraft.client.gui.c(4, this.width / 2 + 80, this.height - 52, 80, 20, I18n.a("stat.mobsButton", new Object[0]));
        this.buttonList.add(c4);
        if (this.bvo.getSize() == 0) {
            c2.enabled = false;
        }
        if (this.bvn.getSize() == 0) {
            c3.enabled = false;
        }
        if (this.bvp.getSize() == 0) {
            c4.enabled = false;
        }
    }

    @Override
    protected void actionPerformed(net.minecraft.client.gui.c c2) {
        if (c2.enabled) {
            if (c2.id == 0) {
                bvs.a(this.bln);
            } else if (c2.id == 1) {
                this.bvr = this.bvm;
            } else if (c2.id == 3) {
                this.bvr = this.bvn;
            } else if (c2.id == 2) {
                this.bvr = this.bvo;
            } else if (c2.id == 4) {
                this.bvr = this.bvp;
            } else {
                this.bvr.actionPerformed(c2);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        if (this.bvt) {
            this.drawDefaultBackground();
            this.drawCenteredString(this.fontRendererObj, I18n.a("multiplayer.downloadingStats", new Object[0]), this.width / 2, this.height / 2, 0xFFFFFF);
            this.drawCenteredString(this.fontRendererObj, btV[(int)(d.Bj() / 150L % (long)btV.length)], this.width / 2, this.height / 2 + agg.aIF * 2, 0xFFFFFF);
        } else {
            this.bvr.drawScreen(n2, n3, f2);
            this.drawCenteredString(this.fontRendererObj, this.blo, this.width / 2, 20, 0xFFFFFF);
            super.drawScreen(n2, n3, f2);
        }
    }

    @Override
    public void Gn() {
        if (this.bvt) {
            this.GB();
            this.EM();
            this.bvr = this.bvm;
            this.bvt = false;
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return !this.bvt;
    }

    private void a(int n2, int n3, net.minecraft.item.d d2) {
        this.A(n2 + 1, n3 + 1);
        GlStateManager.JS();
        RenderHelper.Lh();
        this.itemRender.a(new co(d2, 1, 0), (double)(n2 + 2), (double)(n3 + 2));
        RenderHelper.Lf();
        GlStateManager.JT();
    }

    private void A(int n2, int n3) {
        this.f(n2, n3, 0, 0);
    }

    private void f(int n2, int n3, int n4, int n5) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        bvs.Bq().a(statIcons);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(n2 + 0, n3 + 18, zLevel).r((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).Lx();
        worldRenderer.F(n2 + 18, n3 + 18, zLevel).r((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).Lx();
        worldRenderer.F(n2 + 18, n3 + 0, zLevel).r((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).Lx();
        worldRenderer.F(n2 + 0, n3 + 0, zLevel).r((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).Lx();
        tessellator.pZ();
    }

    static /* synthetic */ agg a(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg b(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg c(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg d(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg e(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ void a(c c2, int n2, int n3, int n4, int n5, int n6, int n7) {
        c2.drawGradientRect(n2, n3, n4, n5, n6, n7);
    }

    static /* synthetic */ agg f(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg g(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ void b(c c2, int n2, int n3, int n4, int n5, int n6, int n7) {
        c2.drawGradientRect(n2, n3, n4, n5, n6, n7);
    }

    static /* synthetic */ agg h(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg i(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg j(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg k(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg l(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg m(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg n(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg o(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg p(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg q(c c2) {
        return c2.fontRendererObj;
    }

    static /* synthetic */ agg r(c c2) {
        return c2.fontRendererObj;
    }
}

