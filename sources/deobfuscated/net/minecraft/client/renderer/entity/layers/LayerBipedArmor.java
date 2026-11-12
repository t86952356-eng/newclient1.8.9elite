/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.f;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;

public class LayerBipedArmor
extends LayerArmorBase<f> {
    public LayerBipedArmor(RendererLivingEntity<?> rendererLivingEntity) {
        super(rendererLivingEntity);
    }

    @Override
    protected void Nl() {
        this.bXf = new f(0.5f);
        this.bXg = new f(1.0f);
    }

    @Override
    protected void a(f f2, int n2) {
        this.a(f2);
        switch (n2) {
            case 1: {
                f2.byF.bBL = true;
                f2.byG.bBL = true;
                break;
            }
            case 2: {
                f2.byC.bBL = true;
                f2.byF.bBL = true;
                f2.byG.bBL = true;
                break;
            }
            case 3: {
                f2.byC.bBL = true;
                f2.byD.bBL = true;
                f2.byE.bBL = true;
                break;
            }
            case 4: {
                f2.byA.bBL = true;
                f2.byB.bBL = true;
            }
        }
    }

    protected void a(f f2) {
        f2.ak(false);
    }
}

