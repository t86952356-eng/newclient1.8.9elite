/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.at;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderWither;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.boss.d;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class LayerWitherAura
implements LayerRenderer<d> {
    private static final cm bXY = new cm("textures/entity/wither/wither_armor.png");
    private final RenderWither bXZ;
    private final at bYa = new at(0.5f);

    public LayerWitherAura(RenderWither renderWither) {
        this.bXZ = renderWither;
    }

    public void a(d d2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (d2.XK()) {
            GlStateManager.an(!d2.isInvisible());
            this.bXZ.a(bXY);
            GlStateManager.cR(5890);
            GlStateManager.JU();
            float f9 = (float)d2.aRg + f4;
            float f10 = bt.bB(f9 * 0.02f) * 3.0f;
            float f11 = f9 * 0.01f;
            GlStateManager.j(f10, f11, 0.0f);
            GlStateManager.cR(5888);
            GlStateManager.tQ();
            float f12 = 0.5f;
            GlStateManager.e(0.5f, 0.5f, 0.5f, 1.0f);
            GlStateManager.JA();
            GlStateManager.P(1, 1);
            this.bYa.a(d2, f2, f3, f4);
            this.bYa.a(this.bXZ.Nk());
            this.bYa.a(d2, f2, f3, f5, f6, f7, f8);
            GlStateManager.cR(5890);
            GlStateManager.JU();
            GlStateManager.cR(5888);
            GlStateManager.Jz();
            GlStateManager.tR();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((d)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

