/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.model.d;
import net.minecraft.client.model.p;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderEnderCrystal
extends Render<net.minecraft.entity.item.c> {
    private static final cm cag = new cm("textures/entity/endercrystal/endercrystal.png");
    private final d cah = new p(0.0f, true);

    public RenderEnderCrystal(RenderManager renderManager) {
        super(renderManager);
        this.bUm = 0.5f;
    }

    @Override
    public void a(net.minecraft.entity.item.c c2, double d2, double d3, double d4, float f2, float f3) {
        float f4 = (float)c2.cCe + f3;
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        this.a(cag);
        float f5 = bt.bx(f4 * 0.2f) / 2.0f + 0.5f;
        f5 = f5 * f5 + f5;
        this.cah.a(c2, 0.0f, f4 * 3.0f, f5 * 0.2f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.JW();
        super.a(c2, d2, d3, d4, f2, f3);
    }

    protected cm a(net.minecraft.entity.item.c c2) {
        return cag;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.item.c)c2);
    }
}

