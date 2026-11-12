/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.d;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.o;
import net.minecraft.util.cm;

public class y
extends i {
    private static final cm bnr = new cm("textures/gui/container/hopper.png");
    private final ab bns;
    private final ab bnt;

    public y(g g2, ab ab2) {
        super(new o(g2, ab2, d.AZ().bgK));
        this.bns = g2;
        this.bnt = ab2;
        this.allowUserInput = false;
        this.bwh = 133;
    }

    @Override
    protected void s(int n2, int n3) {
        this.fontRendererObj.a(this.bnt.xW().arq(), 8.0, 6.0, 0x404040);
        this.fontRendererObj.a(this.bns.xW().arq(), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bnr);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
    }
}

