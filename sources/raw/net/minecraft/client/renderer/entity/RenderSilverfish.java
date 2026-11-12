/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ak;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.ae;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderSilverfish
extends RenderLiving<ae> {
    private static final cm bWh = new cm("textures/entity/silverfish.png");

    public RenderSilverfish(RenderManager renderManager) {
        super(renderManager, new ak(), 0.3f);
    }

    protected float a(ae ae2) {
        return 180.0f;
    }

    protected cm b(ae ae2) {
        return bWh;
    }

    @Override
    protected /* synthetic */ float G(r r2) {
        return this.a((ae)r2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.b((ae)c2);
    }
}

