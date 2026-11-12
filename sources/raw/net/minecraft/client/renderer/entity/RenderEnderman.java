/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.r;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerEndermanEyes;
import net.minecraft.client.renderer.entity.layers.LayerHeldBlock;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.e;
import net.minecraft.util.cm;

public class RenderEnderman
extends RenderLiving<e> {
    private static final cm bUG = new cm("textures/entity/enderman/enderman.png");
    private final r bUH;
    private final Random bUI = new Random();

    public RenderEnderman(RenderManager renderManager) {
        super(renderManager, new r(0.0f), 0.5f);
        this.bUH = (r)this.bWL;
        this.a(new LayerEndermanEyes(this));
        this.a(new LayerHeldBlock(this));
    }

    @Override
    public void a(e e2, double d2, double d3, double d4, float f2, float f3) {
        this.bUH.bzM = e2.Zh().df().xb() != Material.beo;
        this.bUH.bzN = e2.Zi();
        if (e2.Zi()) {
            double d5 = 0.02;
            d2 += this.bUI.nextGaussian() * 0.02;
            d4 += this.bUI.nextGaussian() * 0.02;
        }
        super.a(e2, d2, d3, d4, f2, f3);
    }

    protected cm a(e e2) {
        return bUG;
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((e)c2);
    }
}

