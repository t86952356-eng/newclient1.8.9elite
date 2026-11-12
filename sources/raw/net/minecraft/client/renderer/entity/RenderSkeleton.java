/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.al;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSkeleton$1;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ah;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderSkeleton
extends RenderBiped<ah> {
    private static final cm bWi = new cm("textures/entity/skeleton/skeleton.png");
    private static final cm bWj = new cm("textures/entity/skeleton/wither_skeleton.png");

    public RenderSkeleton(RenderManager renderManager) {
        super(renderManager, new al(), 0.5f);
        this.a(new LayerHeldItem(this));
        this.a(new RenderSkeleton$1(this, this));
    }

    @Override
    protected void a(ah ah2, float f2) {
        if (ah2.ZI() == 1) {
            GlStateManager.i(1.2f, 1.2f, 1.2f);
        }
    }

    @Override
    public void Nr() {
        GlStateManager.j(0.09375f, 0.1875f, 0.0f);
    }

    @Override
    protected cm a(ah ah2) {
        return ah2.ZI() == 1 ? bWj : bWi;
    }

    public static cm NA() {
        return bWi;
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((ah)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((ah)c2);
    }
}

