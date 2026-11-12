/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.model.h;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.item.b;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderBoat
extends Render<b> {
    private static final cm bUw = new cm("textures/entity/boat.png");
    protected d bUx = new h();

    public RenderBoat(RenderManager renderManager) {
        super(renderManager);
        this.bUm = 0.5f;
    }

    @Override
    public void a(b b2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        GlStateManager.j((float)d2, (float)d3 + 0.25f, (float)d4);
        GlStateManager.d(180.0f - f2, 0.0f, 1.0f, 0.0f);
        float f4 = (float)b2.Yb() - f3;
        float f5 = b2.Ya() - f3;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f4 > 0.0f) {
            GlStateManager.d(bt.bx(f4) * f4 * f5 / 10.0f * (float)b2.Yc(), 1.0f, 0.0f, 0.0f);
        }
        float f6 = 0.75f;
        GlStateManager.i(0.75f, 0.75f, 0.75f);
        GlStateManager.i(1.3333334f, 1.3333334f, 1.3333334f);
        this.N(b2);
        GlStateManager.i(-1.0f, -1.0f, 1.0f);
        this.bUx.a(b2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.JW();
        super.a(b2, d2, d3, d4, f2, f3);
    }

    protected cm a(b b2) {
        return bUw;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((b)c2);
    }
}

