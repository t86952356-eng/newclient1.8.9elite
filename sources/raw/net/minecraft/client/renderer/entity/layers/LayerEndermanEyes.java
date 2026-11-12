/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.monster.e;
import net.minecraft.entity.r;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.shaders.ah;

public class LayerEndermanEyes
implements LayerRenderer<e> {
    private static final cm bXD = new cm("textures/entity/enderman/enderman_eyes.png");
    private final RenderEnderman bXE;

    public LayerEndermanEyes(RenderEnderman renderEnderman) {
        this.bXE = renderEnderman;
    }

    public void a(e e2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.bXE.a(bXD);
        GlStateManager.tQ();
        GlStateManager.Jy();
        GlStateManager.P(1, 1);
        GlStateManager.JA();
        GlStateManager.an(!e2.isInvisible());
        int n2 = 61680;
        int n3 = 61680;
        boolean bl2 = false;
        OpenGlHelper.a(OpenGlHelper.bMJ, 61680.0f, 0.0f);
        GlStateManager.Jz();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        if (a.aoG()) {
            ah.aGa();
        }
        a.anR().bPe = true;
        this.bXE.Nk().a(e2, f2, f3, f5, f6, f7, f8);
        a.anR().bPe = false;
        if (a.aoG()) {
            ah.aGb();
        }
        this.bXE.a(e2, f4);
        GlStateManager.an(true);
        GlStateManager.tR();
        GlStateManager.tL();
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((e)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

