/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.ArmorStandRenderer$1;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.c;
import net.minecraft.entity.item.a;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class ArmorStandRenderer
extends RendererLivingEntity<a> {
    public static final cm bUj = new cm("textures/entity/armorstand/wood.png");

    public ArmorStandRenderer(RenderManager renderManager) {
        super(renderManager, new net.minecraft.client.model.a(), 0.0f);
        ArmorStandRenderer$1 armorStandRenderer$1 = new ArmorStandRenderer$1(this, this);
        this.a(armorStandRenderer$1);
        this.a(new LayerHeldItem(this));
        this.a(new LayerCustomHead(this.Nj().byA));
    }

    protected cm a(a a2) {
        return bUj;
    }

    public net.minecraft.client.model.a Nj() {
        return (net.minecraft.client.model.a)super.Nk();
    }

    protected void a(a a2, float f2, float f3, float f4) {
        GlStateManager.d(180.0f - f3, 0.0f, 1.0f, 0.0f);
    }

    @Override
    protected boolean b(a a2) {
        return a2.Uo();
    }

    @Override
    protected /* synthetic */ boolean F(r r2) {
        return this.b((a)r2);
    }

    @Override
    protected /* synthetic */ void b(r r2, float f2, float f3, float f4) {
        this.a((a)r2, f2, f3, f4);
    }

    @Override
    public /* synthetic */ d Nk() {
        return this.Nj();
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((a)c2);
    }

    @Override
    protected /* synthetic */ boolean M(c c2) {
        return this.b((a)c2);
    }
}

