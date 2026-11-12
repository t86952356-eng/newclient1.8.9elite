/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ao;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSnowmanHead;
import net.minecraft.entity.c;
import net.minecraft.util.cm;

public class RenderSnowMan
extends RenderLiving<net.minecraft.entity.monster.ao> {
    private static final cm bWl = new cm("textures/entity/snowman.png");

    public RenderSnowMan(RenderManager renderManager) {
        super(renderManager, new ao(), 0.5f);
        this.a(new LayerSnowmanHead(this));
    }

    protected cm a(net.minecraft.entity.monster.ao ao2) {
        return bWl;
    }

    public ao NB() {
        return (ao)super.Nk();
    }

    @Override
    public /* synthetic */ d Nk() {
        return this.NB();
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((net.minecraft.entity.monster.ao)c2);
    }
}

