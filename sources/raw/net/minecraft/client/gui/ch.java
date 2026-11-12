/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.cl;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.realms.u;
import net.minecraft.util.bt;

public class ch
extends cl {
    private final u bsP;

    public ch(u u2, int n2, int n3, int n4, int n5, int n6) {
        super(d.AZ(), n2, n3, n4, n5, n6);
        this.bsP = u2;
    }

    @Override
    protected int getSize() {
        return this.bsP.getItemCount();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        this.bsP.selectItem(n2, bl2, n3, n4);
    }

    @Override
    protected boolean isSelected(int n2) {
        return this.bsP.isSelectedItem(n2);
    }

    @Override
    protected void drawBackground() {
        this.bsP.renderBackground();
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bsP.renderItem(n2, n3, n4, n5, n6, n7);
    }

    public int getWidth() {
        return this.width;
    }

    public int cM() {
        return this.mouseY;
    }

    public int cL() {
        return this.mouseX;
    }

    @Override
    protected int getContentHeight() {
        return this.bsP.getMaxPosition();
    }

    @Override
    protected int getScrollBarX() {
        return this.bsP.getScrollbarPosition();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        if (this.field_178041_q) {
            this.mouseX = n2;
            this.mouseY = n3;
            this.drawBackground();
            int n4 = this.getScrollBarX();
            int n5 = n4 + 6;
            this.bindAmountScrolled();
            GlStateManager.JA();
            GlStateManager.JG();
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            int n6 = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
            int n7 = this.top + 4 - (int)this.amountScrolled;
            if (this.hasListHeader) {
                this.drawListHeader(n6, n7, tessellator);
            }
            this.drawSelectionBox(n6, n7, n2, n3);
            GlStateManager.JD();
            int n8 = 4;
            this.overlayBackground(0, this.top, 255, 255);
            this.overlayBackground(this.bottom, this.height, 255, 255);
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 0, 1);
            GlStateManager.Jy();
            GlStateManager.cP(7425);
            GlStateManager.JO();
            int n9 = this.func_148135_f();
            if (n9 > 0) {
                int n10 = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
                int n11 = (int)this.amountScrolled * (this.bottom - this.top - (n10 = bt.F(n10, 32, this.bottom - this.top - 8))) / n9 + this.top;
                if (n11 < this.top) {
                    n11 = this.top;
                }
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                worldRenderer.F(n4, this.bottom, 0.0).r(0.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n5, this.bottom, 0.0).r(1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n5, this.top, 0.0).r(1.0, 0.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n4, this.top, 0.0).r(0.0, 0.0).s(0, 0, 0, 255).Lx();
                tessellator.pZ();
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                worldRenderer.F(n4, n11 + n10, 0.0).r(0.0, 1.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n5, n11 + n10, 0.0).r(1.0, 1.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n5, n11, 0.0).r(1.0, 0.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n4, n11, 0.0).r(0.0, 0.0).s(128, 128, 128, 255).Lx();
                tessellator.pZ();
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                worldRenderer.F(n4, n11 + n10 - 1, 0.0).r(0.0, 1.0).s(192, 192, 192, 255).Lx();
                worldRenderer.F(n5 - 1, n11 + n10 - 1, 0.0).r(1.0, 1.0).s(192, 192, 192, 255).Lx();
                worldRenderer.F(n5 - 1, n11, 0.0).r(1.0, 0.0).s(192, 192, 192, 255).Lx();
                worldRenderer.F(n4, n11, 0.0).r(0.0, 0.0).s(192, 192, 192, 255).Lx();
                tessellator.pZ();
            }
            this.func_148142_b(n2, n3);
            GlStateManager.JN();
            GlStateManager.cP(7424);
            GlStateManager.tL();
            GlStateManager.tR();
        }
    }
}

