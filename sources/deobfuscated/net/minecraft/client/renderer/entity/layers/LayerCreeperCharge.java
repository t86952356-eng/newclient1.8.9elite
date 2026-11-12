/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.n;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.d;
import net.minecraft.entity.r;
import net.minecraft.util.cm;

public class LayerCreeperCharge
implements LayerRenderer<d> {
    private static final cm bXw = new cm("textures/entity/creeper/creeper_armor.png");
    private final RenderCreeper bXx;
    private final n bXy = new n(2.0f);

    public LayerCreeperCharge(RenderCreeper renderCreeper) {
        this.bXx = renderCreeper;
    }

    public void a(d d2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (d2.Zb()) {
            boolean bl2 = d2.isInvisible();
            GlStateManager.an(!bl2);
            this.bXx.a(bXw);
            GlStateManager.cR(5890);
            GlStateManager.JU();
            float f9 = (float)d2.aRg + f4;
            GlStateManager.j(f9 * 0.01f, f9 * 0.01f, 0.0f);
            GlStateManager.cR(5888);
            GlStateManager.tQ();
            float f10 = 0.5f;
            GlStateManager.e(0.5f, 0.5f, 0.5f, 1.0f);
            GlStateManager.JA();
            GlStateManager.P(1, 1);
            this.bXy.a(this.bXx.Nk());
            this.bXy.a(d2, f2, f3, f5, f6, f7, f8);
            GlStateManager.cR(5890);
            GlStateManager.JU();
            GlStateManager.cR(5888);
            GlStateManager.Jz();
            GlStateManager.tR();
            GlStateManager.an(bl2);
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

