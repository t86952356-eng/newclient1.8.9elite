/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.util.cm;

public class n
extends i {
    private static final cm bwV = new cm("textures/gui/container/dispenser.png");
    private final g bwW;
    public ab bwX;

    public n(g g2, ab ab2) {
        super(new net.minecraft.inventory.i(g2, ab2));
        this.bwW = g2;
        this.bwX = ab2;
    }

    @Override
    protected void s(int n2, int n3) {
        String string = this.bwX.xW().arq();
        this.fontRendererObj.a(string, (double)(this.bwg / 2 - this.fontRendererObj.bQ(string) / 2), 6.0, 0x404040);
        this.fontRendererObj.a(this.bwW.xW().arq(), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bwV);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
    }
}

