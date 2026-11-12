/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.n;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerCreeperCharge;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class RenderCreeper
extends RenderLiving<d> {
    private static final cm bUB = new cm("textures/entity/creeper/creeper.png");

    public RenderCreeper(RenderManager renderManager) {
        super(renderManager, new n(), 0.5f);
        this.a(new LayerCreeperCharge(this));
    }

    @Override
    protected void a(d d2, float f2) {
        float f3 = d2.bf(f2);
        float f4 = 1.0f + bt.bx(f3 * 100.0f) * f3 * 0.01f;
        f3 = bt.I(f3, 0.0f, 1.0f);
        f3 *= f3;
        f3 *= f3;
        float f5 = (1.0f + f3 * 0.4f) * f4;
        float f6 = (1.0f + f3 * 0.1f) / f4;
        GlStateManager.i(f5, f6, f5);
    }

    protected int a(d d2, float f2, float f3) {
        float f4 = d2.bf(f3);
        if ((int)(f4 * 10.0f) % 2 == 0) {
            return 0;
        }
        int n2 = (int)(f4 * 0.2f * 255.0f);
        n2 = bt.F(n2, 0, 255);
        return n2 << 24 | 0xFFFFFF;
    }

    protected cm a(d d2) {
        return bUB;
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((d)r2, f2);
    }

    @Override
    protected /* synthetic */ int b(r r2, float f2, float f3) {
        return this.a((d)r2, f2, f3);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((d)c2);
    }
}

