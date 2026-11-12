/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.entity;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.model.av;
import net.minecraft.client.model.aw;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie$1;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.layers.LayerVillagerArmor;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class RenderZombie
extends RenderBiped<au> {
    private static final cm bWD = new cm("textures/entity/zombie/zombie.png");
    private static final cm bWE = new cm("textures/entity/zombie/zombie_villager.png");
    private final f bWF;
    private final aw bWG;
    private final List<LayerRenderer<au>> bWH;
    private final List<LayerRenderer<au>> bWI;

    public RenderZombie(RenderManager renderManager) {
        super(renderManager, new av(), 0.5f, 1.0f);
        LayerRenderer layerRenderer = (LayerRenderer)this.bWO.get(0);
        this.bWF = this.bUt;
        this.bWG = new aw();
        this.a(new LayerHeldItem(this));
        RenderZombie$1 renderZombie$1 = new RenderZombie$1(this, this);
        this.a(renderZombie$1);
        this.bWI = Lists.newArrayList((Iterable)this.bWO);
        if (layerRenderer instanceof LayerCustomHead) {
            this.b(layerRenderer);
            this.a(new LayerCustomHead(this.bWG.byA));
        }
        this.b(renderZombie$1);
        this.a(new LayerVillagerArmor(this));
        this.bWH = Lists.newArrayList((Iterable)this.bWO);
    }

    @Override
    public void a(au au2, double d2, double d3, double d4, float f2, float f3) {
        this.b(au2);
        super.a(au2, d2, d3, d4, f2, f3);
    }

    @Override
    protected cm a(au au2) {
        return au2.ZO() ? bWE : bWD;
    }

    private void b(au au2) {
        if (au2.ZO()) {
            this.bWL = this.bWG;
            this.bWO = this.bWH;
        } else {
            this.bWL = this.bWF;
            this.bWO = this.bWI;
        }
        this.bUt = (f)this.bWL;
    }

    protected void a(au au2, float f2, float f3, float f4) {
        if (au2.ZP()) {
            f3 += (float)(Math.cos((double)au2.aRg * 3.25) * Math.PI * 0.25);
        }
        super.b(au2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ void b(r r2, float f2, float f3, float f4) {
        this.a((au)r2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ cm L(c c2) {
        return this.a((au)c2);
    }
}

