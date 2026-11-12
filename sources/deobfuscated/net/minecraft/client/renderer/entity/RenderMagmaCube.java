/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.z;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderMagmaCube
extends RenderLiving<net.minecraft.entity.monster.z> {
    private static final cm bVv = new cm("textures/entity/slime/magmacube.png");

    public RenderMagmaCube(RenderManager renderManager) {
        super(renderManager, new z(), 0.25f);
    }

    protected cm a(net.minecraft.entity.monster.z z2) {
        return bVv;
    }

    @Override
    protected void a(net.minecraft.entity.monster.z z2, float f2) {
        int n2 = z2.ZJ();
        float f3 = (z2.cEX + (z2.cEW - z2.cEX) * f2) / ((float)n2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        float f5 = n2;
        GlStateManager.i(f4 * f5, 1.0f / f4 * f5, f4 * f5);
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((net.minecraft.entity.monster.z)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.monster.z)c2);
    }
}

