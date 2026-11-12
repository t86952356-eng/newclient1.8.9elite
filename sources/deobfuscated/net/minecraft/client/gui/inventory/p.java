/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.n;
import net.minecraft.tileentity.y;
import net.minecraft.util.cm;

public class p
extends i {
    private static final cm bxa = new cm("textures/gui/container/furnace.png");
    private final g bxb;
    private final ab bxc;

    public p(g g2, ab ab2) {
        super(new n(g2, ab2));
        this.bxb = g2;
        this.bxc = ab2;
    }

    @Override
    protected void s(int n2, int n3) {
        String string = this.bxc.xW().arq();
        this.fontRendererObj.a(string, (double)(this.bwg / 2 - this.fontRendererObj.bQ(string) / 2), 6.0, 0x404040);
        this.fontRendererObj.a(this.bxb.xW().arq(), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        int n4;
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bxa);
        int n5 = (this.width - this.bwg) / 2;
        int n6 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n5, n6, 0, 0, this.bwg, this.bwh);
        if (y.e(this.bxc)) {
            n4 = this.ch(13);
            this.drawTexturedModalRect((float)(n5 + 56), n6 + 36 + 12 - n4, 176, 12 - n4, 14, n4 + 1);
        }
        n4 = this.cg(24);
        this.drawTexturedModalRect((float)(n5 + 79), n6 + 34, 176, 14, n4 + 1, 16);
    }

    private int cg(int n2) {
        int n3 = this.bxc.cx(2);
        int n4 = this.bxc.cx(3);
        return n4 != 0 && n3 != 0 ? n3 * n2 / n4 : 0;
    }

    private int ch(int n2) {
        int n3 = this.bxc.cx(1);
        if (n3 == 0) {
            n3 = 200;
        }
        return this.bxc.cx(0) * n2 / n3;
    }
}

