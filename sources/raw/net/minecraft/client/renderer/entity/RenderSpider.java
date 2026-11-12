/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSpiderEyes;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderSpider<T extends ap>
extends RenderLiving<T> {
    private static final cm bWo = new cm("textures/entity/spider/spider.png");

    public RenderSpider(RenderManager renderManager) {
        super(renderManager, new net.minecraft.client.model.ap(), 1.0f);
        this.a(new LayerSpiderEyes(this));
    }

    protected float b(T t2) {
        return 180.0f;
    }

    protected cm a(T t2) {
        return bWo;
    }

    @Override
    protected /* synthetic */ float G(r r2) {
        return this.b((ap)r2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((ap)c2);
    }
}

