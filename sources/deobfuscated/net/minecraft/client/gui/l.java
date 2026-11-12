/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cl;
import net.minecraft.client.gui.k;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;

class l
extends cl {
    public int blC;
    final /* synthetic */ k blD;

    public l(k k2) {
        this.blD = k2;
        super(k.aER, k2.width, k2.height, 43, k2.height - 60, 24);
        this.blC = -1;
    }

    private void a(int n2, int n3, co co2) {
        this.r(n2 + 1, n3 + 1);
        GlStateManager.JS();
        if (co2 != null && co2.bP() != null) {
            RenderHelper.Lh();
            this.blD.itemRender.a(co2, (double)(n2 + 2), (double)(n3 + 2));
            RenderHelper.Lf();
        }
        GlStateManager.JT();
    }

    private void r(int n2, int n3) {
        this.b(n2, n3, 0, 0);
    }

    private void b(int n2, int n3, int n4, int n5) {
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
        return this.blD.blu.ayl().size();
    }

    @Override
    protected void elementClicked(int n2, boolean bl2, int n3, int n4) {
        this.blC = n2;
        this.blD.Ec();
    }

    @Override
    protected boolean isSelected(int n2) {
        return n2 == this.blC;
    }

    @Override
    protected void drawBackground() {
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        String string;
        net.minecraft.world.gen.k k2 = this.blD.blu.ayl().get(this.blD.blu.ayl().size() - n2 - 1);
        IBlockState iBlockState = k2.ayp();
        Block block = iBlockState.df();
        d d2 = d.I(block);
        co co2 = block != Blocks.cLc && d2 != null ? new co(d2, 1, block.c(iBlockState)) : null;
        String string2 = string = co2 == null ? "Air" : d2.at(co2);
        if (d2 == null) {
            if (block != Blocks.cLl && block != Blocks.cLk) {
                if (block == Blocks.cLn || block == Blocks.cLm) {
                    d2 = Items.cQC;
                }
            } else {
                d2 = Items.cQB;
            }
            if (d2 != null) {
                co2 = new co(d2, 1, block.c(iBlockState));
                string = block.xA();
            }
        }
        this.a(n3, n4, co2);
        this.blD.fontRendererObj.a(string, (double)(n3 + 18 + 5), (double)(n4 + 3), 0xFFFFFF);
        String string3 = n2 == 0 ? I18n.a("createWorld.customize.flat.layer.top", k2.ayo()) : (n2 == this.blD.blu.ayl().size() - 1 ? I18n.a("createWorld.customize.flat.layer.bottom", k2.ayo()) : I18n.a("createWorld.customize.flat.layer", k2.ayo()));
        this.blD.fontRendererObj.a(string3, (double)(n3 + 2 + 213 - this.blD.fontRendererObj.bQ(string3)), (double)(n4 + 3), 0xFFFFFF);
    }

    @Override
    protected int getScrollBarX() {
        return this.width - 70;
    }
}

