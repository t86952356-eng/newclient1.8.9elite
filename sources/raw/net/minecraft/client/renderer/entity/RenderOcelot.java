/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.j;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderOcelot
extends RenderLiving<j> {
    private static final cm bVQ = new cm("textures/entity/cat/black.png");
    private static final cm bVR = new cm("textures/entity/cat/ocelot.png");
    private static final cm bVS = new cm("textures/entity/cat/red.png");
    private static final cm bVT = new cm("textures/entity/cat/siamese.png");

    public RenderOcelot(RenderManager renderManager, d d2, float f2) {
        super(renderManager, d2, f2);
    }

    protected cm a(j j2) {
        switch (j2.aaO()) {
            default: {
                return bVR;
            }
            case 1: {
                return bVQ;
            }
            case 2: {
                return bVS;
            }
            case 3: 
        }
        return bVT;
    }

    @Override
    protected void a(j j2, float f2) {
        super.c(j2, f2);
        if (j2.abl()) {
            GlStateManager.i(0.8f, 0.8f, 0.8f);
        }
    }

    @Override
    protected /* synthetic */ void c(r r2, float f2) {
        this.a((j)r2, f2);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((j)c2);
    }
}

