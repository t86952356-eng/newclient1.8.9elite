/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.tileentity;

import hackclient.rise.agg;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.d;
import net.minecraft.util.cm;
import net.minecraft.world.w;
import net.optifine.entity.model.g;

public abstract class TileEntitySpecialRenderer<T extends d>
implements g {
    protected static final cm[] cbs = new cm[]{new cm("textures/blocks/destroy_stage_0.png"), new cm("textures/blocks/destroy_stage_1.png"), new cm("textures/blocks/destroy_stage_2.png"), new cm("textures/blocks/destroy_stage_3.png"), new cm("textures/blocks/destroy_stage_4.png"), new cm("textures/blocks/destroy_stage_5.png"), new cm("textures/blocks/destroy_stage_6.png"), new cm("textures/blocks/destroy_stage_7.png"), new cm("textures/blocks/destroy_stage_8.png"), new cm("textures/blocks/destroy_stage_9.png")};
    protected TileEntityRendererDispatcher cbt;
    private Class cbu = null;
    private cm bUp = null;

    public abstract void b(T var1, double var2, double var4, double var6, float var8, int var9);

    public abstract void a(T var1, double var2, double var4, double var6, float var8, int var9);

    protected void a(cm cm2) {
        TextureManager textureManager = this.cbt.aIK;
        if (textureManager != null) {
            textureManager.a(cm2);
        }
    }

    protected w de() {
        return this.cbt.baU;
    }

    public void a(TileEntityRendererDispatcher tileEntityRendererDispatcher) {
        this.cbt = tileEntityRendererDispatcher;
    }

    public agg EA() {
        return this.cbt.EA();
    }

    public boolean OE() {
        return false;
    }

    public void a(T t2, double d2, double d3, double d4, float f2, int n2, WorldRenderer worldRenderer) {
    }

    @Override
    public Class Np() {
        return this.cbu;
    }

    @Override
    public void f(Class clazz) {
        this.cbu = clazz;
    }

    @Override
    public cm Nq() {
        return this.bUp;
    }

    @Override
    public void i(cm cm2) {
        this.bUp = cm2;
    }
}

