/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.r;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.shaders.ah;

public class LayerSpiderEyes
implements LayerRenderer<ap> {
    private static final cm bXW = new cm("textures/entity/spider_eyes.png");
    private final RenderSpider bXX;

    public LayerSpiderEyes(RenderSpider renderSpider) {
        this.bXX = renderSpider;
    }

    public void a(ap ap2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.bXX.a(bXW);
        GlStateManager.tQ();
        GlStateManager.Jy();
        GlStateManager.P(1, 1);
        GlStateManager.an(!ap2.isInvisible());
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        if (a.aoG()) {
            ah.aGa();
        }
        a.anR().bPe = true;
        this.bXX.Nk().a(ap2, f2, f3, f5, f6, f7, f8);
        a.anR().bPe = false;
        if (a.aoG()) {
            ah.aGb();
        }
        n2 = ap2.af(f4);
        n3 = n2 % 65536;
        n4 = n2 / 65536;
        OpenGlHelper.a(OpenGlHelper.bMJ, (float)n3 / 1.0f, (float)n4 / 1.0f);
        this.bXX.a(ap2, f4);
        GlStateManager.tR();
        GlStateManager.tL();
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((ap)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

