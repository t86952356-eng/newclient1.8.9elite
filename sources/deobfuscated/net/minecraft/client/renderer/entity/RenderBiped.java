/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.util.cm;

public class RenderBiped<T extends p>
extends RenderLiving<T> {
    private static final cm bUs = new cm("textures/entity/steve.png");
    protected f bUt;
    protected float bUu;

    public RenderBiped(RenderManager renderManager, f f2, float f3) {
        this(renderManager, f2, f3, 1.0f);
        this.a(new LayerHeldItem(this));
    }

    public RenderBiped(RenderManager renderManager, f f2, float f3, float f4) {
        super(renderManager, f2, f3);
        this.bUt = f2;
        this.bUu = f4;
        this.a(new LayerCustomHead(f2.byA));
    }

    protected cm a(T t2) {
        return bUs;
    }

    @Override
    public void Nr() {
        GlStateManager.j(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((p)c2);
    }
}

