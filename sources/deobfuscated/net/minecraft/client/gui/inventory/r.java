/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.passive.f;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.p;
import net.minecraft.util.cm;

public class r
extends i {
    private static final cm bxf = new cm("textures/gui/container/horse.png");
    private static final Minecraft bxg = Minecraft.getMinecraft();
    private final ab bxh;
    private final ab bxi;
    private final f bxj;
    private float bxk;
    private float bxl;

    public r(ab ab2, ab ab3, f f2) {
        super(new p(ab2, ab3, f2, Minecraft.getMinecraft().bgK));
        this.bxh = ab2;
        this.bxi = ab3;
        this.bxj = f2;
        this.allowUserInput = false;
    }

    @Override
    protected void s(int n2, int n3) {
        this.fontRendererObj.a(this.bxi.xW().arq(), 8.0, 6.0, 0x404040);
        this.fontRendererObj.a(this.bxh.xW().arq(), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    protected void b(float f2, int n2, int n3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        bxg.Bq().a(bxf);
        int n4 = (this.width - this.bwg) / 2;
        int n5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)n4, n5, 0, 0, this.bwg, this.bwh);
        if (this.bxj.aae()) {
            this.drawTexturedModalRect((float)(n4 + 79), n5 + 17, 0, this.bwh, 90, 54);
        }
        if (this.bxj.aaB()) {
            this.drawTexturedModalRect((float)(n4 + 7), n5 + 35, 0, this.bwh + 54, 18, 18);
        }
        q.a(n4 + 51, n5 + 60, 17, (float)(n4 + 51) - this.bxk, (float)(n5 + 75 - 50) - this.bxl, this.bxj);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.bxk = n2;
        this.bxl = n3;
        super.drawScreen(n2, n3, f2);
    }
}

