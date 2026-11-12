/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.bu;
import net.minecraft.client.gui.bv;
import net.minecraft.client.gui.cl;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.cm;

class bw
extends cl {
    public int brS;
    final /* synthetic */ bu brT;

    public bw(bu bu2) {
        this.brT = bu2;
        super(bu.aER, bu2.width, bu2.height, 80, bu2.height - 32, 38);
        this.brS = -1;
    }

    @Override
    protected int getSize() {
        return bu.brH.size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        this.brS = n2;
        this.brT.FF();
        this.brT.brK.bX(bu.brH.get((int)this.brT.brI.brS).brR.toString());
    }

    @Override
    protected boolean isSelected(int n2) {
        return n2 == this.brS;
    }

    @Override
    protected void drawBackground() {
    }

    private void a(int n2, int n3, cm cm2) {
        int n4 = n2 + 5;
        this.brT.drawHorizontalLine(n4 - 1, n4 + 32, n3 - 1, -2039584);
        this.brT.drawHorizontalLine(n4 - 1, n4 + 32, n3 + 32, -6250336);
        this.brT.drawVerticalLine(n4 - 1, n3 - 1, n3 + 32, -2039584);
        this.brT.drawVerticalLine(n4 + 32, n3 - 1, n3 + 32, -6250336);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.Bq().a(cm2);
        int n5 = 32;
        int n6 = 32;
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        worldRenderer.a(7, DefaultVertexFormats.cbG);
        worldRenderer.F(n4 + 0, n3 + 32, 0.0).r(0.0, 1.0).Lx();
        worldRenderer.F(n4 + 32, n3 + 32, 0.0).r(1.0, 1.0).Lx();
        worldRenderer.F(n4 + 32, n3 + 0, 0.0).r(1.0, 0.0).Lx();
        worldRenderer.F(n4 + 0, n3 + 0, 0.0).r(0.0, 0.0).Lx();
        tessellator.pZ();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        bv bv2 = bu.brH.get(n2);
        this.a(n3, n4, bv2.brQ);
        this.brT.fontRendererObj.a(bv2.brP, (double)(n3 + 32 + 10), (double)(n4 + 14), 0xFFFFFF);
    }
}

