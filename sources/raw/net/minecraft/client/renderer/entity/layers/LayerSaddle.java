/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.ac;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.k;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class LayerSaddle
implements LayerRenderer<k> {
    private static final cm bXN = new cm("textures/entity/pig/pig_saddle.png");
    private final RenderPig bXO;
    private final ac bXP = new ac(0.5f);

    public LayerSaddle(RenderPig renderPig) {
        this.bXO = renderPig;
    }

    public void a(k k2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (k2.aaQ()) {
            this.bXO.a(bXN);
            this.bXP.a(this.bXO.Nk());
            this.bXP.a(k2, f2, f3, f5, f6, f7, f8);
        }
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((k)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

