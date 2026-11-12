/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.y;
import net.minecraft.util.b;
import net.minecraft.util.cm;
import net.minecraft.world.w;

public class m
extends i {
    private static final cm bwU = new cm("textures/gui/container/crafting_table.png");

    public m(g g2, w w2) {
        this(g2, w2, b.dtN);
    }

    public m(g g2, w w2, b b2) {
        super(new y(g2, w2, b2));
    }

    @Override
    protected void s(int n2, int n3) {
        this.fontRendererObj.a(I18n.a("container.crafting", new Object[0]), 28.0, 6.0, 0x404040);
        this.fontRendererObj.a(I18n.a("container.inventory", new Object[0]), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bwU);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
    }
}

