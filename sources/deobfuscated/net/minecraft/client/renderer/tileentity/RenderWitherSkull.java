/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.model.am;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.projectile.j;
import net.minecraft.util.cm;

public class RenderWitherSkull
extends Render<j> {
    private static final cm cao = new cm("textures/entity/wither/wither_invulnerable.png");
    private static final cm cap = new cm("textures/entity/wither/wither.png");
    private final am caq = new am();

    public RenderWitherSkull(RenderManager renderManager) {
        super(renderManager);
    }

    private float q(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    @Override
    public void a(j j2, double d2, double d3, double d4, float f2, float f3) {
        GlStateManager.JV();
        GlStateManager.JI();
        float f4 = this.q(j2.crM, j2.pl, f3);
        float f5 = j2.crO + (j2.pm - j2.crO) * f3;
        GlStateManager.j((float)d2, (float)d3, (float)d4);
        float f6 = 0.0625f;
        GlStateManager.JS();
        GlStateManager.i(-1.0f, -1.0f, 1.0f);
        GlStateManager.tL();
        this.N(j2);
        this.caq.a(j2, 0.0f, 0.0f, 0.0f, f4, f5, 0.0625f);
        GlStateManager.JW();
        super.a(j2, d2, d3, d4, f2, f3);
    }

    protected cm a(j j2) {
        return j2.isInvulnerable() ? cao : cap;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((j)c2);
    }
}

