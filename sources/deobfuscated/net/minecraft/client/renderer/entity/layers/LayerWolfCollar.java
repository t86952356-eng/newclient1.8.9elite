/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.ai;
import net.minecraft.entity.passive.u;
import net.minecraft.entity.r;
import net.minecraft.item.b;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.s;

public class LayerWolfCollar
implements LayerRenderer<ai> {
    private static final cm bYb = new cm("textures/entity/wolf/wolf_collar.png");
    private final RenderWolf bYc;

    public LayerWolfCollar(RenderWolf renderWolf) {
        this.bYc = renderWolf;
    }

    public void a(ai ai2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (ai2.abl() && !ai2.isInvisible()) {
            this.bYc.a(bYb);
            b b2 = b.fS(ai2.abD().yc());
            float[] fArray = u.a(b2);
            if (a.aow()) {
                fArray = s.a(b2, fArray);
            }
            GlStateManager.k(fArray[0], fArray[1], fArray[2]);
            this.bYc.Nk().a(ai2, f2, f3, f5, f6, f7, f8);
        }
    }

    @Override
    public boolean NH() {
        return true;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((ai)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

