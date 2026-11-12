/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cl;
import net.minecraft.client.gui.u;
import net.minecraft.client.gui.v;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.co;
import net.minecraft.item.d;

class w
extends cl {
    public int bno;
    final /* synthetic */ u bnp;

    public w(u u2) {
        this.bnp = u2;
        super(u.aER, u2.width, u2.height, 80, u2.height - 37, 24);
        this.bno = -1;
    }

    private void a(int n2, int n3, d d2, int n4) {
        this.t(n2 + 1, n3 + 1);
        GlStateManager.JS();
        RenderHelper.Lh();
        this.bnp.itemRender.a(new co(d2, 1, n4), (double)(n2 + 2), (double)(n3 + 2));
        RenderHelper.Lf();
        GlStateManager.JT();
    }

    private void t(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    private void c(int n2, int n3, int n4, int n5) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.Bq().a(b.statIcons);
        float f2 = 0.0078125f;
        int n6 = 18;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(n2, n3 + 18, b.zLevel).r((float)n4 * 0.0078125f, (float)(n5 + 18) * 0.0078125f).Lx();
        worldRenderer.F(n2 + 18, n3 + 18, b.zLevel).r((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).Lx();
        worldRenderer.F(n2 + 18, n3, b.zLevel).r((float)(n4 + 18) * 0.0078125f, (float)n5 * 0.0078125f).Lx();
        worldRenderer.F(n2, n3, b.zLevel).r((float)n4 * 0.0078125f, (float)n5 * 0.0078125f).Lx();
        tessellator.pZ();
    }

    @Override
    protected int getSize() {
        return u.bnc.size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        this.bno = n2;
        this.bnp.Es();
        this.bnp.bnj.bX(u.bnc.get((int)this.bnp.bnh.bno).bnn);
    }

    @Override
    protected boolean isSelected(int n2) {
        return n2 == this.bno;
    }

    @Override
    protected void drawBackground() {
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        v v2 = u.bnc.get(n2);
        this.a(n3, n4, v2.bnk, v2.bnl);
        this.bnp.fontRendererObj.a(v2.bnm, (double)(n3 + 18 + 5), (double)(n4 + 6), 0xFFFFFF);
    }
}

