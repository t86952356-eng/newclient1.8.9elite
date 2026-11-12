/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderDragon;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.boss.b;
import net.minecraft.entity.r;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.shaders.ah;

public class LayerEnderDragonEyes
implements LayerRenderer<b> {
    private static final cm bXB = new cm("textures/entity/enderdragon/dragon_eyes.png");
    private final RenderDragon bXC;

    public LayerEnderDragonEyes(RenderDragon renderDragon) {
        this.bXC = renderDragon;
    }

    public void a(b b2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.bXC.a(bXB);
        GlStateManager.tQ();
        GlStateManager.Jy();
        GlStateManager.P(1, 1);
        GlStateManager.JA();
        GlStateManager.cJ(514);
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
        this.bXC.Nk().a(b2, f2, f3, f5, f6, f7, f8);
        a.anR().bPe = false;
        if (a.aoG()) {
            ah.aGb();
        }
        this.bXC.a(b2, f4);
        GlStateManager.tR();
        GlStateManager.tL();
        GlStateManager.cJ(515);
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((b)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

