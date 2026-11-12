/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.ab;
import net.minecraft.util.cm;

public class h
extends i {
    private static final cm bwb = new cm("textures/gui/container/generic_54.png");
    private final ab bwc;
    private final ab bwd;
    private final int bwe;

    public h(ab ab2, ab ab3) {
        super(new net.minecraft.inventory.h(ab2, ab3, Minecraft.getMinecraft().bgK));
        this.bwc = ab2;
        this.bwd = ab3;
        this.allowUserInput = false;
        int n2 = 222;
        int n3 = 114;
        this.bwe = ab3.YI() / 9;
        this.bwh = 114 + this.bwe * 18;
    }

    @Override
    protected void s(int n2, int n3) {
        this.fontRendererObj.a(this.bwd.xW().arq(), 8.0, 6.0, 0x404040);
        this.fontRendererObj.a(this.bwc.xW().arq(), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        aER.Bq().a(bwb);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwe * 18 + 17);
        this.drawTexturedModalRect((float)n4, n5 + this.bwe * 18 + 17, 0, 126, this.bwg, 96);
    }
}

