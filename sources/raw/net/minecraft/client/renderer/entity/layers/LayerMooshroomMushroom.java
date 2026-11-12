/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.d;
import net.minecraft.client.model.ae;
import net.minecraft.client.model.ag;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderMooshroom;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.passive.i;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.src.a;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class LayerMooshroomMushroom
implements LayerRenderer<i> {
    private final RenderMooshroom bXJ;
    private final ag bXK;
    private static final cm bXL = new cm("textures/entity/cow/mushroom_red.png");
    private static boolean bXM = false;

    public static void jA() {
        bXM = a.F(bXL);
    }

    public LayerMooshroomMushroom(RenderMooshroom renderMooshroom) {
        this.bXJ = renderMooshroom;
        this.bXK = new ag(this.bXJ.bWL);
        this.bXK.D(16, 16);
        this.bXK.bBC = -6.0f;
        this.bXK.bBE = -8.0f;
        this.bXK.bBG = bt.dyT / 4.0f;
        int[][] nArrayArray = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
        this.bXK.a(nArrayArray, 0.0f, 0.0f, 10.0f, 20.0f, 16.0f, 0.0f, 0.0f);
        int[][] nArrayArray2 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
        this.bXK.a(nArrayArray2, 10.0f, 0.0f, 0.0f, 0.0f, 16.0f, 20.0f, 0.0f);
    }

    public void a(i i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!i2.Uz() && !i2.isInvisible()) {
            BlockRendererDispatcher blockRendererDispatcher = d.AZ().BE();
            if (bXM) {
                this.bXJ.a(bXL);
            } else {
                this.bXJ.a(TextureMap.bZE);
            }
            GlStateManager.JH();
            GlStateManager.cL(1028);
            GlStateManager.JV();
            GlStateManager.i(1.0f, -1.0f, 1.0f);
            GlStateManager.j(0.2f, 0.35f, 0.5f);
            GlStateManager.d(42.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.JV();
            GlStateManager.j(-0.5f, -0.5f, 0.5f);
            if (bXM) {
                this.bXK.aa(0.0625f);
            } else {
                blockRendererDispatcher.a(Blocks.cLS.xM(), 1.0f);
            }
            GlStateManager.JW();
            GlStateManager.JV();
            GlStateManager.j(0.1f, 0.0f, -0.6f);
            GlStateManager.d(42.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(-0.5f, -0.5f, 0.5f);
            if (bXM) {
                this.bXK.aa(0.0625f);
            } else {
                blockRendererDispatcher.a(Blocks.cLS.xM(), 1.0f);
            }
            GlStateManager.JW();
            GlStateManager.JW();
            GlStateManager.JV();
            ((ae)this.bXJ.Nk()).bzg.ac(0.0625f);
            GlStateManager.i(1.0f, -1.0f, 1.0f);
            GlStateManager.j(0.0f, 0.7f, -0.2f);
            GlStateManager.d(12.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.j(-0.5f, -0.5f, 0.5f);
            if (bXM) {
                this.bXK.aa(0.0625f);
            } else {
                blockRendererDispatcher.a(Blocks.cLS.xM(), 1.0f);
            }
            GlStateManager.JW();
            GlStateManager.cL(1029);
            GlStateManager.JI();
        }
    }

    @Override
    public boolean NH() {
        return true;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((i)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

